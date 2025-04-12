package com.blog.demo.repository;

import com.blog.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
   
    User findByName(String name); // Custom query method

    User findByUserID(Integer userID);

    User getUserByID(Integer userID);

    User createUser(String name);

    User deleteUserById(Integer userID);
}

