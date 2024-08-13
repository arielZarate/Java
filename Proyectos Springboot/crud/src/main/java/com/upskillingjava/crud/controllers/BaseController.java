package com.upskillingjava.crud.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/api")
public  class BaseController {


    @GetMapping("/")
    public String welcome() {
        return "Welcome to the CRUD de upskillingJava ";
    }
}



