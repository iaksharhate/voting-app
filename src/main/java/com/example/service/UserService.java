package com.example.service;

import com.example.dto.Login;
import com.example.dto.User;
import com.example.repositary.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public User registerUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public String userLogin(Login login) {
        User user = userRepository.findByUserNameAndPassword(login.getUserName(), login.getPassword());
        System.out.println(user);
        if (user != null){
            return "Login Successful for User!!!";
        }else {
            return "Login Fail for User!!!";
        }
    }
}
