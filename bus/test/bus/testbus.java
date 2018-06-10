/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aparna sajeev
 */
public class testbus {
        details d1;//declaring instance variable
       boardingPass b1;//declaring instance variable
        company c1;//declaring instance variable

    
    public testbus() {
        /**
         * declaring variables
         */
          int amt;
        int seatNo,temp;
        int z,p,j;
        String name;
        String phNo;
        int month;
        int n,i;
         this.b1=new boardingPass();//instantiation,creating an object
         this.d1=new details();//instantiation,creating an object
         this.c1=new company();//instantiation,creating an object
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
     * test case for displaying amount for SRS company
     */
          @Test
     public void test_displayforSRS()
     {          
        assertEquals(800,b1.displayInfo("ram","6754557434",5,1,800,7,1));
        
     }
     
     /**
     * test case for displaying amount for VRL company
     */
      @Test
     public void test_displayforVRL()
     {          
        assertEquals(750,b1.displayInfo("sanjana","9685769476",22,2,750,8,2));
       
     }
     
     /**
     * test case for displaying amount for PAI company
     */
      @Test
     public void test_displayforPAI()
     {          
        assertEquals(1000,b1.displayInfo("pooja","7465987349",8,3,1000,12,3));
     }
     
     /**
     * test case for displaying amount for TELSON company
     */
      @Test
     public void test_displayforTELSON()
     {          
        assertEquals(700,b1.displayInfo("shruti","9844065342",18,4,700,5,1));
     }
     
     
     /**
     * test case for displaying the seat number booked by the user
     */
      @Test
     public void test_displaySeat()
     {          
        assertEquals(4,c1.displaySeat(2,1,4));
        assertEquals(12,c1.displaySeat(2,1,12));
        assertEquals(47,c1.displaySeat(2,1,47));
        assertEquals(8,c1.displaySeat(2,1,8));
        
        
       
     }
     
     /**
     * test case for displaying seat number and amount for the user who have booked their seats
     */
     @Test
     public void test_displayseat_and_displaybill()
     {          
        assertEquals(4,c1.displaySeat(2,1,4));// in this function 4 is given as seat number 
        assertEquals(800,b1.displayInfo("ram","6754557434",4,1,800,10,2));//here the total amount is printed and the seat number   is passed from displayseat function
         assertEquals(47,c1.displaySeat(2,1,47));          
        assertEquals(850,b1.displayInfo("mohan","6044653876",47,1,850,2,1));
        assertEquals(8,c1.displaySeat(2,1,8));   
         assertEquals(1000,b1.displayInfo("pooja","7465987349",5,1,1000,5,3));                                                           // is passed from displayseat function
        
       
     }
        
        
}




