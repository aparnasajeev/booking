/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import java.util.Scanner;

/**
 *
 * @author Shantanu
 */
public class details {
    
    
    boardingPass b1=new boardingPass();
    Scanner inp=new Scanner(System.in);
    /**
     * 
     * @param n parameter holds the number of tickets mentioned by the the user
     * @param month parameter holds the month mentioned by the user 
     * @param z parameter holds the ticket number
     * @param seatno parameter holds the seat number
     * @param amt parameter holds the amount to be paid by the user
     */
    int enterInfo(int n,int month,int z,int seatno,int amt)
    {
        String name;//declaring variable name of data type String
        int i;//declaring variable of type int
        String phno;//declaraing variable phno of type String
                
               System.out.print("Enter your name:");//display message for the user to enter their name
               name=inp.next();//name varaiable is used to hold the input for above message
               System.out.print("Enter your phone number:");//display message for the user to enter their phone number
               phno=inp.next();//phno varaiable is used to hold the input for above message
               System.out.println("Your seat has been reserved");
               
             int amount=  b1.displayinfo(name,phno,seatno,z,amt);//calling method displayinfo from boardingpass class
         return amount;
    }
   
}

