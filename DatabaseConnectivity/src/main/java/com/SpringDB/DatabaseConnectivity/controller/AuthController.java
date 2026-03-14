package com.SpringDB.DatabaseConnectivity.controller;

import com.SpringDB.DatabaseConnectivity.model.LoginRequest;
import com.SpringDB.DatabaseConnectivity.security.jwt.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {

        if(request.getUsername().equals("admin") && request.getPassword().equals("admin123")) {

            return jwtUtil.generateToken(request.getUsername());
        }

        return "Invalid Credentials";
    }
}