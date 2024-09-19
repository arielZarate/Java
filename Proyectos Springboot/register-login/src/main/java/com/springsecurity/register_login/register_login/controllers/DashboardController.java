package com.springsecurity.register_login.register_login.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/dashboard")
public class DashboardController {



    @GetMapping
   // @PreAuthorize("hasAuthority('ADMIN')")
/**    public ResponseEntity<String> getDashboard() {
        return ResponseEntity.ok("Bienvenido al Dashboard!");
    } */

    public String Admin(){
        return "bievendido al dashboard";
    }
    
}
