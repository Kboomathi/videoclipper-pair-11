/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package embeddedmediaplayer;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author comqsjb
 */
public class ClipTest {
    
    public ClipTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTitle method, of class Clip.
     */
    @Test
    public void testSetTitleToEmptyStringKeepsPreviousValue()
    {
         System.out.println("setTitle");
        Clip instance = new Clip();
        String OriginalTitle = "Original Title";
        instance.setTitle(OriginalTitle);              //set Empty Title
        String EmptyTitle = " ";
        instance.setTitle(EmptyTitle);              
        String ModifiedTitle = instance.getTitle(); 
        assertTrue(OriginalTitle.equals(ModifiedTitle));// compare original and empty title
        System.out.println("Empty Title is not set");
    }

    @Test
    public void testSetEndBeforeStartKeepsPreviousValue()
    {
          System.out.println("Set Time");
         Clip instance = new Clip();
       String OriginalTitle = "Sub video"; //Create sub video clip
       instance.setTitle(OriginalTitle);   // Set Ttile  
       int OriginalStartTime = 10;
       int originalEndtime = 50;
       instance.setMax(100);//set master video to 100 seconds video
       instance.setStart(OriginalStartTime); 
       instance.setEnd(originalEndtime);
       int EndTime = instance.getEnd(); //Get endtime of the video
       instance.setStart(EndTime); //Set end time as start time to the sub clip
       int CurrentStartTime = instance.getStart();//check time has changed
       assertEquals(OriginalStartTime,CurrentStartTime);
       System.out.println("Time has been set");
    
    }

    @Test
    public void testEqualsOnEqualClips() 
    {
        
   
    }
    
    @Test
    public void testEqualsOnNonEqualClips() 
    {
      
    }
    
    @Test
    public void testSetEndToNegativeNumberKeepsPreviousValue() 
    {
        
    }
    
    @Test
    public void testSetStartToValidPositiveNumber() 
    {    
        
    }
    
    
    
}
