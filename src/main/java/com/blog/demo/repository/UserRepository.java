package com.blog.demo.repository;

import com.blog.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
   
    User findByUserID(Integer userID);

}

