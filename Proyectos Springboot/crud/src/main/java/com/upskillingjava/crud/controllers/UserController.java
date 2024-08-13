package com.upskillingjava.crud.controllers;



import com.upskillingjava.crud.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.upskillingjava.crud.models.User;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping
    public ResponseEntity<List<User>> getAllUser(){
        List<User> users =userService.findAll();

        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        Optional<User> user = userService.findById(id);

        if (user.isPresent()) {
            return ResponseEntity.ok(user.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }


   @PostMapping
   public ResponseEntity<User> createUser(@RequestBody User user)
   {
       // Crea un nuevo usuario y devuelve con código de estado 201 Created
       User createdUser= userService.create(user);
       return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
   }

   @PutMapping("/{id}")
   public ResponseEntity<User> updateUser(@PathVariable Long id , @RequestBody User user ){

       try {
           User updatedUser = userService.update(id, user);
           return ResponseEntity.ok(updatedUser);
       } catch (RuntimeException e) {
           return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
       }

   }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {

        try {
            userService.delete(id);
            return ResponseEntity.ok("User with ID " + id + " was successfully deleted.");
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }

    }
}

