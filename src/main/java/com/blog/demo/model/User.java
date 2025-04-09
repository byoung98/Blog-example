package com.blog.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    private Integer userID; 
    private String userName;
    private String firstName; 
    private String lastName;
    private String email;
    private String name;
    
   public User(String firstName){

        this.userID = 0;
        this.userName = "";
        this.firstName = firstName;
        this.lastName = "";
        this.email = "";
        this.name = "";
        
//determine props of the user
//create getter/setters
//create a model for a post
//stretch goal - how to wire this in spring boot
   }

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

