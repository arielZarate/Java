package com.springsecurity.register_login.register_login.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springsecurity.register_login.register_login.entity.User;
import com.springsecurity.register_login.register_login.services.UserService;


@RestController
@RequestMapping("/auth")
public class UserController {
    

    @Autowired
    private UserService userService;


    // Método para registrar un nuevo usuario
    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody User user) {
        try {
            userService.registerUser(user.getEmail(), user.getPassword(), user.getRole());
            return ResponseEntity.ok("Usuario registrado exitosamente");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }



    // Método para iniciar sesión
    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody User user) {
        try {

            System.out.println("la password ingresada es :" + user.getPassword()+ "\n***********************");
         User  userFound=   userService.loginUser(user.getEmail(), user.getPassword());
            return ResponseEntity.ok("Inicio de sesión exitoso \n"+ userFound);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    
}
