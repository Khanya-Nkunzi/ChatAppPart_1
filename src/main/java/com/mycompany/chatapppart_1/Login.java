/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatapppart_1;

/**
 *
 * @author Student
 */
public class Login {
    
    // Declaring variables that will store the user details
    
    String username;
    String password;
    String phoneNumber;
    
    // introducing a boolean 
    
    public boolean checkUserName(String username){
        
        // condtions of the inputs
        
       return username.contains("_") && username.length() <=5;
       
     }
    
    // checking if the password inputed meets the requiments
    
    public boolean checkPasswordComplexity(String password){
        
        boolean hasCapital = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;
        
        for (int i = 0; i < password.length(); i++){
            char c = password.charAt(i);
            
            if(Character.isUpperCase(c)){
                hasCapital = true;
            }else if (Character.isDigit(c)){
                hasNumber = true;
            }else if (!Character.isLetterOrDigit(c)){
                hasSpecial = true;
                
            }
        }
        
       return password.length() >= 8 && hasCapital && hasNumber && hasSpecial;
       
        }
    
    // Checking if the inputed SA number meets the requiments
    
    public boolean checkCellPhoneNumber(String phone){
        return phone.startsWith("+27") && phone.length() <=12;
        
    }
    
    // creating a method 
    
    public String registerUser(String username, String password, String phoneNumber){
        
        // checking the username
        
        if (!checkUserName(username)){
            return"Username is not correctly formatted; please ensure that your username contains at least eight characters, a capital letter, a number, and a special character";
        }
         
        // checking the password
        
        if(!checkPasswordComplexity(password)){
            return"Password is not correctly formatted; please ensure that the password contains at least eight characters, a number, and a special character";
        }
          
      // checking the phone number
      
      if(!checkCellPhoneNumber(phoneNumber)){
          return"Cell phone number incorrectly formattted or does not contain code";
          
      } 
        
      // Storing the data if every requirements are met
      
      this.username = username;
      this.password = password;
      this.phoneNumber = phoneNumber;
     
      return"User registerd successfully";
    }
    
    // Eneblling the user to login with the same registerd details
    
    public boolean LoginUser(String username, String password){
        
        return this.username.equals(username) && this.password.equals(password);
        
    }
     
    // loging in the user if everything is correct
    
    public String returnloginStatus(boolean success){
       
        if(success){
            return "Welcome" + username + "it is great to see you again.";
            
            // returning a feedback if inputed details are incorrect
        }
        else{
            return"Username or password incorrect, please try again.";
        }
    }

    boolean LoginUser(String ky_le, String ghhtkt8, String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
