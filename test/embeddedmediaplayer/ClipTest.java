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
       System.out.println("Check clips are equal");
       
       //Create first sub video clip
       String SubTitle1 = "Sub video 1"; 
       Clip subClip1 = new Clip(SubTitle1,5,40);
       
       //Create second sub video clip
       String SubTitle2 = "Sub video 1"; 
       Clip subClip2 = new Clip();
        
       subClip2.setTitle(SubTitle2);   // Set Ttile  
       subClip2.setStart(5);//Set start time 
       subClip2.setEnd(40);// set end time 
       
       // Check for Duplication
       
       boolean DuplicateClip = subClip1.equals(subClip2); 
       assertEquals(true,DuplicateClip);
       System.out.println("Duplicate video");  
        
   
    }
    
    @Test
    public void testEqualsOnNonEqualClips() 
    {
      
        System.out.println("Non Equal Clips");
       
       //Create first sub video clip
       
       String SubTitle1 = "Sub video 1"; 
       Clip subClip1 = new Clip(SubTitle1,5,40);
       
       //Create second sub video clip
       
       String SubTitle2 = "Sub video 2"; 
       Clip subClip2 = new Clip();
        
       subClip2.setTitle(SubTitle2);   // Set Ttile  
       subClip2.setStart(10);//Set start time 
       subClip2.setEnd(60);// set end time 
       
       // Check for Duplication
       
       boolean DuplicateClip = subClip1.NotEquals(subClip2); 
       assertEquals(true,DuplicateClip);
       System.out.println("Non Duplicate video"); 
       
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
