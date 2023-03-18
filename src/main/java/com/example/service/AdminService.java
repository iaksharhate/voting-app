package com.example.service;

import com.example.dto.Admin;
import com.example.repositary.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService implements IAdminService{

    @Autowired
    AdminRepository adminRepository;


    @Override
    public Admin registerAdmin(Admin admin) {
        return adminRepository.save(admin);
    }
}
