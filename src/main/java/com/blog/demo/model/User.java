package com.blog.demo.model;

import javax.annotation.processing.Generated;
import jakarta.validation.constraints.NotBlank;
import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private Integer userID; 
    private String userName;
    @NotBlank(message = "Firstname cannot be blank")
    private String firstName; 
    private String lastName;
    private String email;
    private String name;
    
   public User(){}

   public String getName(){
    return name;
   }

   public void setName(String name){
    this.name = name;
   }

   
   public String getFirstName(){
     return firstName;
    }

    public void setFirstname(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getUsername(){
        return userName;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public Integer getUserID(){
        return userID;
    }

    public void setUserID(Integer userID){
        this.userID = userID;
    }

}

