public class User {
   public String userName;
   public String firstName; 
   public String lastName;
   public String email;
   private Integer userID; 

   public User(){

        userName = "";
        firstName = "";
        lastName = "";
        email = "";
        userID = 0;
//determine props of the user
//create getter/setters
//create a model for a post
//stretch goal - how to wire this in spring boot
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

