package com.arielZarate.springSecurityJwt.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {



@GetMapping("/public")
 public ResponseEntity<?> EndpointPublic(){
return ResponseEntity.status(HttpStatus.OK).body("Welcome a home");  
 }
  
 


@GetMapping("/auth/admin")
public ResponseEntity<?> EndpointAdmin(){
return ResponseEntity.status(HttpStatus.OK).body("Welcome al dashboard");  
}
}
