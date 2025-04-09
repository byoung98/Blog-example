package com.blog.demo.model;
import java.time.LocalDateTime;

public class Post {
private String comment; 
private String user; //author
private String subject;
private LocalDateTime createdAt; 

Post(){
    this.comment = "";
    this.user = "";
    this.subject = ""; 
    this.createdAt = LocalDateTime.now();
    }


public String getComment(){
    return comment; 
}

public void setComment(String comment){
    this.comment = comment;
}

public String getUser(){
    return user;
}

public void setUser(String user){
    this.user = user;
}

public String getSubject(){
    return subject;
}

public void setSubject(String subject){
    this.subject = subject;
}

public LocalDateTime getCreatedAt(){
    return createdAt; 
}
public void setCreatedAt(LocalDateTime createdAt){
    this.createdAt = createdAt;
}

}