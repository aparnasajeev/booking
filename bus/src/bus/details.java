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
    
    
    boardingPass b1=new boardingPass();//instantiation,creating an object
    Scanner inp=new Scanner(System.in);//it is a class in java.util packageused for obtaining input of primitive types
    /**
     * method enterInfo is used to take the user details for bus reservation and displaying the bill
     * @param n parameter holds the number of tickets mentioned by the the user
     * @param month parameter holds the month mentioned by the user 
     * @param z parameter holds the ticket number
     * @param seatNo parameter holds the seat number
     * @param amt parameter holds the amount to be paid by the user
     */
    public void enterInfo(int n,int month,int z,int seatNo,int amt,int temp)
    {
        String name;//declaring variable name of data type String
        int i;//declaring variable of type int
        String phNo;//declaraing variable phno of type String
                
               System.out.print("Enter your name:");//display message for the user to enter their name
               name=inp.next();//name varaiable is used to hold the input for above message
               System.out.print("Enter your phone number:");//display message for the user to enter their phone number
               phNo=inp.next();//phno varaiable is used to hold the input for above message
               System.out.println("Your seat has been reserved");
               
               b1.displayInfo(name,phNo,seatNo,z,amt,month,temp);//calling method displayinfo from boardingpass class
    
    }
   
}

