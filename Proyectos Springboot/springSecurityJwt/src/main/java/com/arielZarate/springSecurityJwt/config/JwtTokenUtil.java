package com.arielZarate.springSecurityJwt.config;


import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.SecretKey;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;



@Component
public class JwtTokenUtil implements Serializable {
    
    private final String SECRET_KEY = "bmVhcmVycmFpbmZvcndhcmRmYWNpbmdzdW5saWdodHNob3dhbnl0aGluZ2RvemVuZGk="; // Cambia esto por una clave más segura
    private final long EXPIRATION_TIME = 1000 * 60 * 60; // 1 hora en milisegundos

    // Generar el token JWT
    public String generateToken(String email, String role) {
        Map<String, Object> claims = new HashMap<>();
        claims.put("role", role);
        return createToken(claims, email);
    }

    // Crear el token JWT con los claims y el sujeto
    private String createToken(Map<String, Object> claims, String email) {
        return Jwts.builder()
                .claims(claims)
                .subject(email)
                .issuedAt(new Date(System.currentTimeMillis()))
                .expiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(getSignInKey(),Jwts.SIG.HS256)
                .compact();
    }



    //metodo agregado 
        private SecretKey getSignInKey() {
        byte[] keyBytes = Decoders.BASE64.decode(SECRET_KEY);
        return Keys.hmacShaKeyFor(keyBytes);
    }

    // Validar el token JWT
    public boolean validateToken(String token, String email) {
        final String username = extractEmail(token);
        return (username.equals(email) && !isTokenExpired(token));
    }

    // Extraer el nombre de email del token
    public String extractEmail(String token) {
        return extractAllClaims(token).getSubject();
    }

    // Verificar si el token ha expirado
    private boolean isTokenExpired(String token) {
        return extractAllClaims(token).getExpiration().before(new Date());
    }

    // Extraer todos los claims del token
    private Claims extractAllClaims(String token) {
        return Jwts.parser()
                .verifyWith(getSignInKey())
                .build()
                .parseSignedClaims(token)
                .getPayload();
    }
}
