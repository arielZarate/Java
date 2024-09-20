package com.springsecurity.register_login.register_login.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.springsecurity.register_login.register_login.entity.Role;
import com.springsecurity.register_login.register_login.entity.SecurityUser;
import com.springsecurity.register_login.register_login.entity.User;
import com.springsecurity.register_login.register_login.repository.UserRepository;

/*
 Servicio UserDetailsService Personalizado
Implementa la interfaz UserDetailsService para cargar los detalles del usuario 
desde la base de datos:
 
 */

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;


     @Autowired
    private PasswordEncoder passwordEncoder; // Utilizar el BCryptPasswordEncoder


   

    // estye metodo viene de la implementacion
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        try {
           
           Optional<User> optUser=  userRepository.findByEmail(email);
            if (optUser.isEmpty()) {
                throw new UsernameNotFoundException("User not found with Email :" + email);
            }
            else{
                  /**
             * 
             * return new org.springframework.security.core.userdetails.User(
             * user.getEmail(),
             * user.getPassword(),
             * Collections.singleton(new SimpleGrantedAuthority(user.getRole().name()))
             * );
             */

            User user=optUser.get(); 
            return new SecurityUser(user);

            }

          
        } catch (Exception e) {
            throw new Error(e.getMessage());
        }

    }



    public User registerUser(String email, String password, Role role) {
        // Verificar si el usuario ya existe
        if (userRepository.findByEmail(email).isPresent()) {
            throw new IllegalArgumentException("El email ya está registrado");
        }
        
        // Crear un nuevo usuario con la contraseña encriptada
        User user = new User();
        user.setEmail(email);
        user.setPassword(passwordEncoder.encode(password)); // Encriptar la contraseña
        user.setRole(role);
        
        // Guardar el usuario en la base de datos
        return userRepository.save(user);
    }


    public User loginUser(String email, String password) {
        Optional<User> optionalUser = userRepository.findByEmail(email);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();

      
            System.out.println("El usuario logueado es:" + user);
            System.out.println("el role es  "+ user.getRole().name());

            // Verificar la contraseña
            if (passwordEncoder.matches(password, user.getPassword())) {
       
                return user; // Retorna el usuario si la contraseña es correcta
            } else {
                throw new IllegalArgumentException("Contraseña incorrecta");
            }
        } else {
            throw new UsernameNotFoundException("Usuario no encontrado con el email: " + email);
        }
    }
    



}
