package com.arielZarate.springSecurityJwt.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.arielZarate.springSecurityJwt.config.JwtTokenUtil;
import com.arielZarate.springSecurityJwt.entity.Role;
import com.arielZarate.springSecurityJwt.entity.User;
import com.arielZarate.springSecurityJwt.repository.UserRepository;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    public User registerUser(String email, String password, Role role) {

        // Verificar si el rol es válido
        if (role == null) {
            throw new IllegalArgumentException("El rol no puede ser nulo");
        }

        // Verificar si el usuario ya existe
        if (userRepository.findByEmail(email).isPresent()) {
            // System.out.println("El usuario ya esta registrado");
            throw new IllegalArgumentException("El email ya está registrado");
        }

        try {
            // Crear un nuevo usuario con la contraseña encriptada
            User user = new User();
            user.setEmail(email);
            user.setPassword(passwordEncoder.encode(password)); // Encriptar la contraseña
            user.setRole(role);

            User savedUser = userRepository.save(user);
            // System.out.println("Usuario guardado: " + savedUser);
            return savedUser;

        } catch (Exception e) {
            System.out.println("Error de register \n" + e.getMessage());
            throw new Error("Error para crear usuario");

        }

    }

    // login

    public Map<String, Object> loginUser(String email, String password) {
 
        try {
        // Verificar si el usuario ya está autenticado
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.isAuthenticated()
                && !authentication.getPrincipal().equals("anonymousUser")) {
            throw new IllegalArgumentException("El usuario ya está logueado");
        }

        // Usar AuthenticationManager para autenticar al usuario
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(email,
                password);

            Authentication authResult = authenticationManager.authenticate(authenticationToken);
            // Almacenar el resultado de la autenticación en el contexto de seguridad
            SecurityContextHolder.getContext().setAuthentication(authResult);

            // Obtener el usuario autenticado para saber su rol
            User authenticatedUser = userRepository.findByEmail(email)
                    .orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado con el email: " + email));

            // ===========================================================================

            // Generar el token JWT
            String token = jwtTokenUtil.generateToken(authenticatedUser.getEmail(), authenticatedUser.getRole().name());
             //System.out.println("Token generado: " + token);

           
            // Retornar más detalles junto con el token
            // cada hashMap tieene clave:string ,valor :object
            Map<String, Object> response = new HashMap<>();
            // response.put("token", token);
            response.put("email", authenticatedUser.getEmail());
            response.put("role", authenticatedUser.getRole().name());
            response.put("Bearer",token);
              return response;
          
        } catch (Exception e) {
            throw new BadCredentialsException("Credenciales invalidas");
        }

    }
}
