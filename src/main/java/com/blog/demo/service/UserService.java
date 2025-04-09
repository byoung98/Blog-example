package com.blog.demo.service;
import com.blog.demo.model.User;
import com.blog.demo.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserService {
 //   @Autowired
   // private UserRepository userRepository;


    public String getUserByID(Integer UserId){
    /*
    - find the users ID
    - return the username 
    */
        return "";
    }

    public User createUser(User user){
    /*
    input: a user profile(email, full name)

    actions: create an instance of a user

    output: return a new user - userId
    */
        return null;
    }
//delete user
//update user


}
