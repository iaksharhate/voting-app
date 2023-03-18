package com.example.controller;

import com.example.dto.Login;
import com.example.dto.Response;
import com.example.dto.User;
import com.example.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("/register")
    public ResponseEntity<Response> addUserData(@RequestBody User user) {
        User newUser = userService.registerUser(user);
        Response response = new Response("User registered successfully", newUser);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/userLogin")
    public ResponseEntity<Response> userLogin(Login login) {
        Response response = new Response("Login Successful",userService.userLogin(login));
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
