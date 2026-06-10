/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chatapppart_1;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class ChatAppPart_1 
{

    public static void main(String[] args) 
    {
         // introducing the scanner to allow the user to inpute details
    
    Scanner input = new Scanner(System.in);
     
    // creating an object
    
    Login login = new Login();
    
    // Allowing the user to register 
    
    System.out.println("=== USER REGISTRATION ===");
    
    // user to input his or her username and processing it
    
    System.out.print("Enter a username:");
    String username = input.nextLine();
    
    // user to input his or her password and processing it
    
    System.out.print("Enter a password:");
    String password = input.nextLine();
    
    // User to input his or her South African number
    
    System.out.print("Enter your South African phone number(+27...): ");
    String phone = input.nextLine();
    
    // Storing the registerd details 
    
    String response = login.registerUser(username, password, phone);
    
    // Dispalying the registration message
    
    System.out.println(response);
    
    
    // Enebling the user to login
    
    System.out.println("\n=== User LOGIN ===");
    
    // user to login usesing his/her username
    
    System.out.print("Enter your username: ");
    String loginUsername = input.nextLine();
    
    // user to login by entering his/her password
    
    System.out.print("Enter your password: ");
    String loginPassword = input.nextLine();
    
    // introducing loginuser to check if the deatails are correct
    
    boolean loggedIn = login.LoginUser(loginUsername,loginPassword);
    
    // Printing out the logged in message
    
    String loginMessage = login.returnloginStatus(loggedIn);
    System.out.println(loginMessage);
    
   // Part 2
     boolean loggedInPart2 = true;
   if (loggedInPart2) { 
   System.out.println("=== Welcome to ChatApp====");
   
   // using a loop to run until the user presses quit
    boolean running = true;
        while (running) {
    
            // Displaying menu options to the user
            System.out.println("1)Send Messanger");
            System.out.println("2)Show recently sent messages");
            System.out.println("3)Quit");
             System.out.println("Choose an option");
            
    //  waiting promoting the user to input the choice
    int choice = input.nextInt();
    
    input.nextLine();
    
   // Using switch statement to jump directly to the code for the choosen option
    switch(choice)
    {
        case 1:
            // ask user how many messages to send
    System.out.println("How many messages:");
    int numMessages = input.nextInt();
    input.nextLine();
    
    // starting a loop to for the messages
    for (int i = 0; i < numMessages; i++) {
        int messageNumber = i + 1;
        
        // Asking for the phone number
        System.out.print("Enter recipient number: ");
        String recipient = input.nextLine();
        
        // asking the usre to input the message
        System.out.print("Enter message: ");
        // keeping enter message and enter number on differnt lines
        String messageText = input.nextLine();
        // breaking the loops so the output can be clean
        System.out.println("---------------");
    }
    break;
    // showing sent messages
        case 2:
    System.out.println("Coming soon");
    break;
    // Leaving the app
        case 3:
    System.out.println("Goodbye!");
    running = false;
    break;
    
        case 4:
            displayStoredMessagesSubMenu(input);
            break;
            
    // incase the user types another option
    default:
    System.out.println("Invalid option.");
    
}
        }
} else {
    System.out.println("Login failed");
  
    
}
   input.close();

    }
         
    }
    
   

 

