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
        details d1;
       boardingPass b1;
        company c1;

    
    public testbus() {
        
          int amt,amount;
        int seatno,temp;
        int z,p,j;
        String name;
        String phno;
        int month;
        int n,i;
         this.b1=new boardingPass();
         this.d1=new details();
         this.c1=new company();
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

          @Test
     public void test_displayforSRS()
     {          
        assertEquals(800,b1.displayinfo("ram","6754557434",5,1,800));
        
     }
      @Test
     public void test_displayforVRL()
     {          
        assertEquals(750,b1.displayinfo("sanjana","9685769476",22,2,750));
       
     }
      @Test
     public void test_displayforPAI()
     {          
        assertEquals(1000,b1.displayinfo("pooja","7465987349",8,3,1000));
     }
     
      @Test
     public void test_displayforTELSON()
     {          
        assertEquals(700,b1.displayinfo("shruti","9844065342",19,4,700));
     }
     
      @Test
     public void test_displayseat()
     {          
        assertEquals(4,c1.displayseat(2,1,4));
        assertEquals(12,c1.displayseat(2,1,12));
        assertEquals(47,c1.displayseat(2,1,47));
        assertEquals(8,c1.displayseat(2,1,8));
        
        
       
     }
        @Test
     public void test_displayseat_and_displaybill()
     {          
        assertEquals(4,c1.displayseat(2,1,4));// in this function 4 is given as seat number 
        assertEquals(800,b1.displayinfo("ram","6754557434",4,1,800));//here the total amount is printed and the seat number   is passed from displayseat function
         assertEquals(47,c1.displayseat(2,1,47));          
        assertEquals(850,b1.displayinfo("mohan","6044653876",47,1,850));
        assertEquals(8,c1.displayseat(2,1,8));   
         assertEquals(1000,b1.displayinfo("pooja","7465987349",5,1,1000));                                                           // is passed from displayseat function
        
       
     }
        
        
}




