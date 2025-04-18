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
    public User updateUser(Integer userID){
        return userService.updateUserByID(userID);
    }

    @DeleteMapping("/deleteUser")
    public void deleteUser(Integer userID){
        userService.deleteUserById(userID);
        
    }

  
    /* Get request at (routename) that returns a user that receives a name 
    and that uses the userservice method find username function */

    @GetMapping("/findUserById")
    public User findUserByID(Integer userID){
        return userService.findUserByID(userID);
    }


}//Service
