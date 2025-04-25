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
        //validate if user exists
        if(userRepository.existsById(UserId)){
            return userRepository.findByUserID(UserId);
        }
            else
        {
           return null;
        }
    }

    public User createUser(User user){
        //add the properties to create the user
        return userRepository.save(user);
    }

    public boolean deleteUserById(Integer UserId){
       User user = userRepository.findByUserID(UserId);

        //if user does exist - return true
        if(userRepository.existsById(UserId)){
            userRepository.delete(user);
            return true;
        }
        //if user does not exist - retrn false
            return false;        
    }

    public User updateUserByID(Integer UserId, User updatedUser){
        //find the user 
        User currentUser = userRepository.findByUserID(UserId);
        
        //check if user exists
        if(currentUser!= null){
    
        //modify attributes of the user
        currentUser.setName(updatedUser.getName());
        currentUser.setEmail(updatedUser.getEmail());
        currentUser.setFirstname(updatedUser.getFirstName());
        currentUser.setLastName(updatedUser.getLastName());
        currentUser.setUserName(updatedUser.getUsername());

        //save changes in database
       return updatedUser = userRepository.save(currentUser);
        }
        return null; //user not found
    }
}//Service
