package com.example.repositary;

import com.example.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Query(value = "select * from users where user_name = :userName AND password = :password", nativeQuery = true)
    User findByUserNameAndPassword(String userName, String password);
}
