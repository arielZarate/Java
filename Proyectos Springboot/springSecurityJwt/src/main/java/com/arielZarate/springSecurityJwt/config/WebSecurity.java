package com.arielZarate.springSecurityJwt.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.arielZarate.springSecurityJwt.entity.Role;
import com.arielZarate.springSecurityJwt.services.UserDetailServiceImpl;

import lombok.AllArgsConstructor;

@Configuration
@EnableWebSecurity
@AllArgsConstructor
@EnableMethodSecurity
public class WebSecurity {

        @Autowired
        private UserDetailServiceImpl userDetailServiceImpl;

        // Inyectar PasswordEncoder
        @Autowired
        private PasswordEncoder passwordEncoder;

        @Autowired
        private JwtAuthFilter jwtAuthFilter;

        @Bean
        public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

                http
                                .csrf(csrf -> csrf.disable())
                                .authorizeHttpRequests(auth -> auth
                                                .requestMatchers("/auth/register").permitAll()
                                                .requestMatchers("/auth/login").permitAll()
                                                .requestMatchers("/public/**").permitAll()
                                                .requestMatchers("/home/**")
                                                .hasAnyAuthority(Role.ROLE_USER.name(), Role.ROLE_ADMIN.name())
                                                .requestMatchers("/dashboard/**").hasAuthority(Role.ROLE_ADMIN.name())
                                                .anyRequest().authenticated()

                                )

                                // .httpBasic(Customizer.withDefaults())
                                .sessionManagement(session -> session
                                                .sessionCreationPolicy(SessionCreationPolicy.STATELESS));
                // Añadir el filtro de JWT antes del filtro de autenticación de Spring
                http.addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class); // de que
                // estás
                // usando
                // sesiones

                return http.build();

        }

        // Configuración del AuthenticationManager para usar UserDetailService y
        // PasswordEncoder
        @Bean
        public AuthenticationManager authenticationManager(HttpSecurity http) throws Exception {
                AuthenticationManagerBuilder authenticationManagerBuilder = http
                                .getSharedObject(AuthenticationManagerBuilder.class);

                authenticationManagerBuilder
                                .userDetailsService(userDetailServiceImpl)
                                .passwordEncoder(passwordEncoder);

                return authenticationManagerBuilder.build();

        }

}

/*
 * .formLogin(form -> form
 * .loginPage("/login") // Configura tu página de inicio de sesión
 * .permitAll()) // Permitir acceso a todos a la página de inicio de sesión
 * .logout(logout -> logout
 * .logoutUrl("/logout") // URL para cerrar sesión
 * .logoutSuccessUrl("/login?logout=true") // Redirige aquí después de cerrar
 * sesión
 * .invalidateHttpSession(true) // Invalida la sesión HTTP
 * .deleteCookies("JSESSIONID") // Opcional: elimina la cookie de sesión
 * );
 */