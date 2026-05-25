/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.chatapppart_1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class LoginTest {
    
    // collecting all the methods from Login.java
    
    Login login = new Login();
    
    // Using piblic void to test  
    @Test
    public void testValidUsername(){
        
        /*calling username method to check if username has an underscore and the Length is correct*/ 
        
        assertTrue(login.checkUserName("ky_le"));
    }
 @Test
 public void testInvalidUsername_NoUnderscore(){
     
    // checking a username with no underscore
    
     assertFalse(login.checkUserName("abcdl"));
 }
@Test
public void testInvalidUsername_TooLong(){
    
    // checking username lenght
    // False because it is not suppose to be more than 5 characters
    
    assertFalse(login.checkUserName("abongile_"));
}

// Testing if password is valid

@Test
public void testValidPassword(){
    
    // Testing correct password must have 8 characters and has a special charect
    
    assertTrue(login.checkPasswordComplexity("Ghhskle@7"));
   
}
// Testing if password has a Capital letter

@Test

public void testInvaildPassword(){
    assertFalse(login.checkPasswordComplexity("hhhh@th7"));
    
}
// Testing if password has a special charcter

@Test
public void testInvalidPassword(){
    assertFalse(login.checkPasswordComplexity("Hhhhty7"));
}

// Testing a cell Phone Number

// Testing if Phone number has SA code
@Test   
public void testValidPhoneNumber(){
    assertTrue(login.checkCellPhoneNumber("+27691857256"));
}

// Testing if Phone number is not <> 10

@Test
public void testInvalidPhoneNumber(){
    assertFalse(login.checkCellPhoneNumber("+276918572577"));
}

// Testing log in process
@Test

public void testLoginSuccess(){
    
  // Registering with correct details
  
  login.registerUser("ky_le","Ghhtk@t8","+27691857256");
  
  assertTrue(login.LoginUser("ky_le","Ghhtk@t8"));
  
}
 // Testing log in fail
@Test
public void testLoginFail(){
    login.registerUser("ky_le","Ghhtk@t28","+27691857256");
    
    // entering wrong details
    
    assertFalse(login.LoginUser("ky-le","ghhtk@t8"));
}
}
