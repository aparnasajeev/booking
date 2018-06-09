/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import java.util.Scanner;

/**
 *
 * @author Shriya
 */
class company {
    Scanner inp=new Scanner(System.in);
     /**
      * method SRS  is used for selecting the destination to be traveled through an SRS company bus
      */
    void srs()
    {
        int temp;//declaration of variable temp//displaying menu for selecting th
        System.out.println("ENTER THE DESTINATION\n 1.Belgaum to Banglore\n 2.Belgaum to Mumbai\n 3.Belgaum to Pune");//displaying menu for selecting the destination
        temp=inp.nextInt();//temp variable is used to hold the choice for the destination
        int amt=800;//variable amt is initialized with the amount specified by the BUS COMPANY
       book(1,temp,amt);
        
    }
    
     /**
      * method VRL  is used for selecting the destination to be traveled through an VRL company bus
      */
    void vrl()
    {
        int temp;//declaration of variable temp
        System.out.println("ENTER THE DESTINATION\n 1.Belgaum to Banglore\n 2.Belgaum to Mumbai\n 3.Belgaum to Pune");//displaying menu for selecting the destination
        temp=inp.nextInt();//temp variable is used to hold the choice for the destination
        int amt=750;//variable amt is initialized with the amount specified by the BUS COMPANY
        
    }
    
      /**
      * method PAI  is used for selecting the destination to be traveled through an PAI company bus
      */
    void pai()
    {
        int temp;//declaration of variable temp
        System.out.println("ENTER THE DESTINATION\n 1.Belgaum to Banglore\n 2.Belgaum to Mumbai\n 3.Belgaum to Pune");//displaying menu for selecting the destination
        temp=inp.nextInt();//temp variable is used to hold the choice for the destination
        int amt=1000;//variable amt is initialized with the amount specified by the BUS COMPANY
        
        
    }
    
     /**
      * method TELSON  is used for selecting the destination to be traveled through an TELSON company bus
      */
    void telson()
    {
        int temp;//declaration of variable temp
        System.out.println("ENTER THE DESTINATION\n 1.Belgaum to Banglore\n 2.Belgaum to Mumbai\n 3.Belgaum to Pune");//displaying menu for selecting the destination
        temp=inp.nextInt();//temp variable is used to hold the choice for the destination
        int amt=700;//variable amt is initialized with the amount specified by the BUS COMPANY
       
        
    }
}
