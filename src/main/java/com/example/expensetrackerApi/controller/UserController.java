package com.example.expensetrackerApi.controller;
import com.example.expensetrackerApi.Entity.User;
import com.example.expensetrackerApi.Service.userService;
import com.example.expensetrackerApi.modal.UserModalClass;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    public userService userservice;
    @PostMapping("/register")
    public ResponseEntity<User> createuser(@Valid @RequestBody UserModalClass user)
    {
        return new ResponseEntity<User>(userservice.createuser(user), HttpStatus.CREATED);

    }
    @GetMapping("/users/{id}")
    public  ResponseEntity<User> get(@PathVariable Long id){
        return new ResponseEntity<User>(userservice.read(id),HttpStatus.OK);
    }
}
