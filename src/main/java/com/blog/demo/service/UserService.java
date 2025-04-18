package com.blog.demo.service;
import com.blog.demo.model.User;
import com.blog.demo.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;//dependency injection

   
    public User findUserByID(Integer UserId){
       return userRepository.findByUserID(UserId);
    }

    public User createUser(User user){
        //add the properties to create the user
        return userRepository.save(user);
    }

    public void deleteUserById(Integer UserId){
        //find the user
        User user = userRepository.findByUserID(UserId);

        //delete user from database
        userRepository.delete(user);
    }

    public User updateUserByID(Integer UserId){
        //find the user
        User user = userRepository.findByUserID(UserId);

        //modify attributes of the user
        user.setName("");
        user.setEmail("");
        user.setFirstname("");
        user.setLastName("");
        user.setUserName("");
        
        return userRepository.save(user);
    }


}//Service
