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
import java.util.Scanner;

/**
 *
 * @author Shantanu
 */
public class test_bus {
  details d1;
  boardingPass b1;
  company c1;

    public test_bus() {
        int amt;
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
        assertEquals(800,b1.displayinfo("ram","6754557434",7,2,800));
        
     }
      @Test
     public void test_displayforVRL()
     {          
        assertEquals(750,b1.displayinfo("sanjana","9685769476",5,1,750));
       
     }
      @Test
     public void test_displayforPAI()
     {          
        assertEquals(1000,b1.displayinfo("pooja","7465987349",8,2,1000));
     }
     
      @Test
     public void test_displayforTELSON()
     {          
        assertEquals(700,b1.displayinfo("shruti","9844075361",17,3,700));
     }
}
