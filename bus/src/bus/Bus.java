/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import java.util.Scanner;

/**
 *
 * @author MY PC
 */
public class Bus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int temp,t;//declaration of variables temp and t
           company c1=new company();
           System.out.println("WELCOME");
           /**
            * while loop displays the menu continuously until the user selects exit option
            */
               Exit:
             while(true)
             {
                 Scanner inp = new Scanner(System.in);
                 System.out.println("1.BUS RESERVATION\n 2.EXIT\n");
                 t=inp.nextInt();//t variable is used to hold the choice made for selection of above two options
                 /**
                  * if statement is used to check if the user has selected BUS RESERVATION option,if yes it will execute the statements under the 
                  * if statement
                  */
                 if(t==1)
                 {
                      System.out.println("FARES OF EACH BUS COMPANY");
                      System.out.println("1.SRS-Rs 800/-\n 2.VRL-Rs 750/-\n 3.PAI-Rs 1000/-\n 4.TELSON-Rs 700/-\n");//displaying the company names along with the travelling amount
                      System.out.println("\n SELECT THE BUS COMPANY ");
                      System.out.println("1.SRS\n2.VRL\n3.PAI\n4.TELSON");//displaying menu for BUS COMPANY selection
                      temp= inp.nextInt();//temp variable is used to hold the choice made for selecting the BUS COMPANY
                      /**
                       * switch statements is used to display and select the option for choosing the BUS COMPANY
                       */
                      switch(temp)
                      {
                          case 1: System.out.println("\nWELCOME TO SRS SERVICES");
                                   c1.srs();//calling method SRS from company class
                                   break;
                                   
                          case 2: System.out.println("\nWELCOME TO VRL SERVICES");
                                   c1.vrl();//calling method VRL from company class
                                   break;
                                   
                          case 3: System.out.println("\nWELCOME TO PAI SERVICES");
                                   c1.pai();//calling method PAI from company class
                                   break;
                                   
                          case 4: System.out.println("\nWELCOME TO TELSON SERVICES");
                                   c1.telson();//calling method TELSON from company class
                                   break;
                                                                                
                          default:System.out.println("INVALID CHOICE");//displaying default message for enter invalid choice
                      }
                 }
                 
                 
                 if(t==2)
                 {
                    break Exit;//to exit from the while loop
                 }
                 
             } 
        }
    }  
    
    
    

