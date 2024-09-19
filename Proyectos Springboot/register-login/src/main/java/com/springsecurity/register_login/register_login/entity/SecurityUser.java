package com.springsecurity.register_login.register_login.entity;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class SecurityUser implements UserDetails {

    private User user;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return  Collections.singletonList(new SimpleGrantedAuthority(user.getRole().getDescription()));
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getEmail();
    }

    /*
     * Clase SecurityUser:
     * Esta clase implementa la interfaz UserDetails de Spring Security.
     * La interfaz UserDetails es utilizada por Spring Security para obtener
     * la información necesaria de un usuario y realizar la autenticación.
     * Esta clase actúa como un wrapper (envoltura) para tu entidad User.
     * Al implementar UserDetails, el sistema de autenticación de Spring puede
     * utilizar la clase SecurityUser para obtener el nombre de usuario, la
     * contraseña
     * y los roles del usuario que Spring necesita para hacer el proceso de
     * autenticación y autorización.
     */




    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
