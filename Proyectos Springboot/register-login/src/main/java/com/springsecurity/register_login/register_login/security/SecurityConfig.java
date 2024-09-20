package com.springsecurity.register_login.register_login.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import lombok.RequiredArgsConstructor;


@Configuration
@EnableWebSecurity
@EnableMethodSecurity  //sino tiene esto  no anda los roles OJO
@RequiredArgsConstructor
public class SecurityConfig  {



   


   @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
        .csrf(csrf -> csrf
        .ignoringRequestMatchers("/public/**", "/auth/**", "/protected/**") // Excluir rutas específicas de CSRF
    )
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/auth/register", "/auth/login" ).permitAll() // Permitir acceso a /register y /login sin autenticación
                .requestMatchers("/public/**").permitAll() // Permitir acceso pulic a cualquiera
                .requestMatchers("/protected/dashboard").hasAuthority("ROLE_ADMIN") // Solo ADMIN puede acceder a /dashboard
                .anyRequest().authenticated() // Todas las demás rutas requieren autenticación
            );
        
        return http.build(); // Construir y devolver el SecurityFilterChain
    }




//este metodo encripta la password de la bd

 @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

 // Bean para el AuthenticationManager, requerido en casos donde quieras autenticar manualmente
 /*  @Bean
   public AuthenticationManager authenticationManager(AuthenticationConfiguration authConfig) throws Exception {
       return authConfig.getAuthenticationManager();
   } */


    
}

