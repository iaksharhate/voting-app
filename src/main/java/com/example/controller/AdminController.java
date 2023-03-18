package com.example.controller;

import com.example.dto.Admin;
import com.example.dto.Response;
import com.example.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Autowired
    AdminService adminService;

    @PostMapping("/registerAdmin")
    public ResponseEntity<Response> addAdminData(@RequestBody Admin admin) {
        Admin newAdmin = adminService.registerAdmin(admin);
        Response response = new Response("Admin registered successfully", newAdmin);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
