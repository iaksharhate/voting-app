package com.example.service;

import com.example.dto.Login;
import com.example.dto.User;

public interface IUserService {

    User registerUser(User user);

    String userLogin(Login login);
}
