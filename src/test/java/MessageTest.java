/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

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
public class MessageTest {
    
    // setting up two variables to use in the test
    private Message message1;
    private Message message2;
    
    // using run before every test
    @BeforeEach
    public void setUp() {
        // creating the first test for a valid number
        message1 = new Message();
        message1.setMessageText("Hi Sam, can you join us for dinner tonight");
        message1.setRecipient("+2771869002");
        
        // creating a second test message for an invalid number
        message2 = new Message();
        message2.setMessageText("Hi keegan, did you receive the payment?");
        message2.setRecipient("0691835654");// invalid
        
    }
    // Test 1 normal message length
        @Test
        public void testCheckMessageLength_validMessage_returnsSuccess() {
        String result = message1.checkMessageLength(message1.getMessageText());
        assertEquals("Message ready to send.", result);
    }
        // Test 2 Message over 250 chars
        @Test
        public void testCheckMessageLength_over250chars_returnsFailure(){
            String longMessage = "a".repeat(260);
            String result = message1.checkMessageLength(longMessage);
            assertTrue(result.contains("Message exceeds 250 characters"));
        }
        // Test 3 valid number test
        @Test
        public void testCheckRecipientCell_validNumber_returnsSuccess() {
        String result = message1.checkRecipientCell(message1.getRecipient());
        assertEquals("cell phone number succesfully captured.", result);
        }
        // Test 4 invalid phone number
        @Test
        public void testCheckRecipientCell_invalidNumber_returnSucess() {
        String result = message1.checkRecipientCell(message2.getRecipient());
        assertEquals("cell phone number is incorrectly formatted.", result);
    }
        // Test 5
        @Test
        public void testCreateMessageHash_correctFormat() {
        message1.setMessageID("1234567890");
        message1.setNumMessages(0);
        
        String hash = message1.createMessageHash();
        assertTrue(hash.endsWith("::o:HITONIGHT"));
    }
        // TEST 6   
        @Test
        public void testCreateMessageHash_isUppercase() {
        message1.setMessageID("1234567890");
        message1.setNumMessages(0);
        
        String hash = message1.createMessageHash();
        assertEquals(hash, hash.toUpperCase());
      
    }
        // TSET 7
        @Test
        public void testMessageID_notNull() {
        message1.generateMessageID();
        assertNotNull(message1.getMessageID());
    }
        // TEST 8
        @Test
        public void testMessageID_lengthIs10() {
        assertEquals(10,message1.getMessageID().length());
        
    }
        // Test 9
        @Test
        public void testSebtMessageI_send() {
        String result = message1.sentMessage(1);
        assertEquals("Message succesfully sent.",result);
    }
        // Test 10
      @Test
      public void testSentMessage_disregard() {
        String result = message1.sentMessage(2);
        assertEquals("Press 0 to delete the message.", result);
        
    }
      // Tes 11
       public void testSentMessage_store() {
           String result = message1.sentMessage(3);
            assertEquals("Message succesfully stored.",result);
           
           
       }
      
    }
        
    
    

