package com.springsecurity.register_login.register_login.security;



import java.util.Date;

import javax.crypto.SecretKey;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;



@Component
public class JWTUtil {
    private final String secretKey = "mysecretkeymysecretkeymysecretkeymysecretkey"; // Cambia esto a una clave segura

 private SecretKey getSigningKey() {
        return Keys.hmacShaKeyFor(secretKey.getBytes());
    }

  
    public String generateToken(String email) {
        return Jwts.builder()
               .setSubject(email)
              .setIssuedAt(new Date())
             .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60)) // 1 hora
             .signWith(getSigningKey(),SignatureAlgorithm.HS256)
             .compact();
    }

    public String extractUsername(String token) {
        return parseClaims(token).getSubject();
    }

    public boolean validateToken(String token, org.springframework.security.core.userdetails.UserDetails userDetails) {
        final String username = extractUsername(token);
        return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
    }

    private Claims parseClaims(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(secretKey.getBytes())
                .build()
                .parseClaimsJws(token)
                .getBody();
    }

    private boolean isTokenExpired(String token) {
        return parseClaims(token).getExpiration().before( new Date() );
    }


}
