package com.blog.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.blog.demo.service.UserService;
import com.blog.demo.model.User;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
@Autowired
private UserService userService;

    @PostMapping("/user")
    public User newUser(User user){ 
        return userService.createUser(user);   
    }

    @PostMapping("/update/user")
    public User updateUser(User userID){
        return userService.updateUserByID(userID);
    }

    @DeleteMapping("/deleteUser")
    public User deleteUser(User userID){
        return userService.deleteUserById(userID);
    }

    @GetMapping
    public User findUserName(User name){
        return userService.findUserName(name);
    }

    @GetMapping
    public User findUserById(User userID){
        return userService.findByUserID(userID);
    }


}//Service
