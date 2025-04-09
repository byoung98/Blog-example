// package com.blog.demo.service;

// import com.blog.demo.model.User;
// import com.blog.demo.repository.UserRepository;
// import org.springframework.stereotype.Service;

// @Service
// public class PostService {
//     public  Post createPost(Post post){
// /*
// - connected to a button
//         - onclick (Create) enter post details(author, dateposted, post details, post id)
//         - onclick  of the save button, save details to database
//  */
//         return post;
//     }
//     public Long getPostById(Long id, Long userId){//im not sure if this is feasible for a blog
//       //get the id of  the post but return the post
//         return id;
//     }

//     public void getAllPostsbyUser(Long userId){//update to return a list of posts
// /*

// Goal: get all the posts associated with a specific user
//     actions:
//     locate the specific user
//         - make a user object to reference the user class & its attributes(userId)
//         - check if the account exists
//         - determine if the user is active

//     pull all of the posts associated with that ID    
//         -reference the findByID method in UserRepository

//     output:
//     all the users posts by in chronological order
// */
//     }

// public boolen updatePostbyPostId(Post postStat){
//     return postStat;
// }

//     public boolean updatePost(boolean updatedPost, Long userId){
// /*
//  locate a specific post by a user
//  - get the userid
//  -locate a specific post
//  - check if it still exists

//         case 1: if it still exists
//         - switch to edit mode
//         - make changes
//         - save and update changes in the database(post details, date/time)
//         - return a true status once updates have been made

//         case 2: if it doesnt exist
//         - return a message that says that this post does not exists (status = false)
//  */

//     return updatedPost;
//     }
    

//     public boolean deletePost(Long userId, boolean deleteStatus){
//     /*
//     actions:
//     - search for a specific post by userId
    
//     - find the post
//         - find post by postID(post repository)  
        
//     - Check if post still exists 
//     - if it does exist 
    
//     output:

//     - remove the post from the database
//     - send back a confirmation that the deletion was successful (true)


//     - if the post doesnt exist
//     - send back message that post doesnt exist (false)
         
//      */
// return deleteStatus;
//     }

// }
