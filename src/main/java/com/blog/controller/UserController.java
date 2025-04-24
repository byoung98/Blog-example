package com.blog.demo;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatusCode;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.blog.demo.service.UserService;
import com.blog.demo.model.User;
import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/users")
public class UserController {
@Autowired
private UserService userService;

    @PostMapping("/user")
    public ResponseEntity <String> newUser(@Valid @RequestBody User user){ 
        userService.createUser(user);
        return new ResponseEntity <String>("Created",HttpStatusCode.valueOf(201));
    }

    @PostMapping("/update/user")
    public User updateUser(Integer userID){
        return userService.updateUserByID(userID);
    }


    //work on deleting a user using parameter(postman).. validate via the database
    @DeleteMapping("/deleteUser")
    public ResponseEntity<String> deleteUser(@RequestParam Integer userID){

         //if the user is found and delete
         if(userService.deleteUserById(userID) == true){   
          return new ResponseEntity<>("User Deleted",HttpStatusCode.valueOf(201));
          }
          else{
              return new ResponseEntity<>("Cannot find User",HttpStatusCode.valueOf(404));
          }  
      }
    

    /* Get request at (routename) that returns a user that receives a name 
    and that uses the userservice method find username function */

    @GetMapping("/findUserById")
    public User findUserByID(Integer userID){
        return userService.findUserByID(userID);
    }


}//Service
