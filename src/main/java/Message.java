/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
import java.util.Random;

// creating variables to store all data from each message
public class Message {
    private String messageID;
    private String messageText;
    private int numMessages;
    private String recipient;
    
    // Getters and Setters methods to safely read and update the variables
    
    // getting the message
    public String getMessageID() {
        return messageID;
    }
    // setting the unique message ID
    public void setMessageID(String messageID) {
        this.messageID = messageID;
    }
    // getting the total number of messages
    public int getNumMessageS() {
        return numMessages;
    }
    // setting the total number of messages
    public void setNumMessages (int numMessages) {
        this.numMessages = numMessages;
    }
    // getting the text content of the message
    public String getMessageText() {
        return messageText;
    }
    // setting the text content of the message
    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }
    // getting the recipient number
    public String getRecipient() {
        return recipient;
    }
    // setting the recipient number
    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }
    // creating a method to create didgit number and assignd it as the message ID
    public void generateMessageID() {
        Random rand = new Random();
        
        // gluening digits toether
        StringBuilder id = new StringBuilder();
        
        // using a loop to run 10 time and get 10 numbers
        for (int i = 0; i < 10; i++) {
            id.append(rand.nextInt(10));
        }
        // converting the didgits into normal text and saving to messageID
        this.messageID = id.toString();
    }
    // creating a method to return the messageID generated
    public String sentMessageID(){
        return this.messageID;
    }
    // CHECKING THE MESSAGE LENGTH
   // checking if the message is short enough to be sent
    public String checkMessageLength(String messageText){
        if (messageText.length() <=250){
            return "Message ready to send.";
        } else {
            // returning the if the message is to long
            return "Message exceeds 250 characters";
        }
    }
    // CHECKING THE RECIPIENT FORMAT
    
    // making sure the receivers cell number is correct
    public String checkRecipientCell(String recipient) {
        if (recipient != null && recipient.startsWith("+27") && recipient.length() == 12){
        return "cell phone number successfully captured!";
        // returning if the number is to long
    } else {
    return "cell phone number is incorrectly formatted!";
        } 
}
    // creating a message hash
    
    // this code creates a short unique summary tracking code for the message
    public String createMessageHash() {
        
        String[] words = messageText.split(" ");
        String firstWord = words[0].replaceAll("[^a-zA-Z]","");
        String lastWord = words[words.length - 1].replaceAll("[^a-zA-z]","");
        
        String hash = messageID.substring(0, 2) + ":" + numMessages + ":" + lastWord.toUpperCase();
        return hash;
    }
    // Generating message options 
    public String sentMessage(int option) {
        switch (option) {
            case 1:
                return "Message succesfully sent.";
            case 2: 
                return "Press 0 to delete the message.";
            case 3:
                return "Message succesfully stored.";
            default:
                return "Invalid option!";
       }
    }
   // public String sentMessageID(){
       // return this.messageID;
    //}
}
