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
public class company {
    
    Scanner inp=new Scanner(System.in);//it is a class in java.util packageused for obtaining input of primitive types
    details d1=new details();//instantiation,creating an object
    int i,j,day = 0;//declaraling variables of datatype integer
     int a[][][][]=new int[10][10][400][60];//declaraing multiple dimensional array of type integer
                                            
     /**
      * method SRS  is used for selecting the destination to be traveled through an SRS company bus
      */
    public void srs()
    {
        int temp;//declaration of variable temp//displaying menu for selecting th
        System.out.println("ENTER THE DESTINATION\n 1.Belgaum to Banglore\n 2.Belgaum to Mumbai\n 3.Belgaum to Pune");//displaying menu for selecting the destination
        temp=inp.nextInt();//temp variable is used to hold the choice for the destination
        int amt=800;//variable amt is initialized with the amount specified by the BUS COMPANY
        book(1,temp,amt);//calling method book used to book seat for travelling
    }
    
     /**
      * method VRL  is used for selecting the destination to be traveled through an VRL company bus
      */
    public void vrl()
    {
        int temp;//declaration of variable temp
        System.out.println("ENTER THE DESTINATION\n 1.Belgaum to Banglore\n 2.Belgaum to Mumbai\n 3.Belgaum to Pune");//displaying menu for selecting the destination
        temp=inp.nextInt();//temp variable is used to hold the choice for the destination
        int amt=750;//variable amt is initialized with the amount specified by the BUS COMPANY
        book(2,temp,amt);//calling method book used to book seat for travelling
    }
    
      /**
      * method PAI  is used for selecting the destination to be traveled through an PAI company bus
      */
    public void pai()
    {
        int temp;//declaration of variable temp
        System.out.println("ENTER THE DESTINATION\n 1.Belgaum to Banglore\n 2.Belgaum to Mumbai\n 3.Belgaum to Pune");//displaying menu for selecting the destination
        temp=inp.nextInt();//temp variable is used to hold the choice for the destination
        int amt=1000;//variable amt is initialized with the amount specified by the BUS COMPANY
        book(3,temp,amt);//calling method book used to book seat for travelling
    }
    
     /**
      * method TELSON  is used for selecting the destination to be traveled through an TELSON company bus
      */
    public void telson()
    {
        int temp;//declaration of variable temp
        System.out.println("ENTER THE DESTINATION\n 1.Belgaum to Banglore\n 2.Belgaum to Mumbai\n 3.Belgaum to Pune");//displaying menu for selecting the destination
        temp=inp.nextInt();//temp variable is used to hold the choice for the destination
        int amt=700;//variable amt is initialized with the amount specified by the BUS COMPANY
        book(4,temp,amt);//calling method book used to book seat for travelling
    }
    
   /**
     *  method book is used for booking seats by entering the month,day,number of tickets they want and the seat number
     * the passengers are alloted with seat depending upon their availability
     * @param p parameter holds the bus company number 
     * @param temp parameter holds the destination selected by the user 
     * @param amt parameter holds the amount to be paid by the user for traveling to the desired destination
     */
    public void book(int p,int temp,int amt)
    {
        int tickets,month,x,date,seatNo,z=1;//declaration and initialization of variables
       
        //i=p;
        j=temp;//initializing j with the value of temp
        System.out.print("\nEnter the month for travelling:");//display message for the user to enter the month of travelling
        month=inp.nextInt();//month varaiable is used to hold the input for above message
        
        /**
         * switch statement is used to choose the month according to the input given by user
         */
        switch(month)
        {
            case 1:day=0;break;
            case 2:day=31;break;
            case 3:day=59;break;
            case 4:day=90;break;
            case 5:day=120;break;
            case 6:day=151;break;
            case 7:day=181;break;
            case 8:day=212;break;
            case 9:day=243;break;
            case 10:day=273;break;
            case 11:day=304;break;
            case 12:day=334;break;
        }
            
            System.out.print("\nEnter the date of travelling:");//display message for the user to enter the date of travelling
            date=inp.nextInt();//date varaiable is used to hold the input for above message
            day= day+date;//day is updated with the date the user wants to travel
            
            
            System.out.println("SEAT ARRANGEMENT");
            displaySeat(p,j,day);//calling display method for displaying the seat arrangement
            
            System.out.print("\nEnter the number of tickets u want:");//display message for the user to enter the number of tickets they want to book 
            tickets=inp.nextInt();//tickets varaiable is used to hold the input for above message
            /**
             * for loop is used for accepting user details for the number of tickets mentioned by the user
             */
            for(i=1;i<=tickets;i++)
            {
                System.out.print("\nEnter seat number you want:");//display message for the user to enter the seat number
                seatNo=inp.nextInt();//seatno varaiable is used to hold the input for above message
                /**
                 * if statement is used to check whether the seat mentioned by the user is already reserved or not
                 */
                if(a[p][j][day][seatNo]!=1)
                {
                    a[p][j][day][seatNo]=1;
                    displaySeat(p,j,day);//calling display method which will display the seat arrangement after a seat is booked.The seat booked will be marked with [0]
                    
                    System.out.println("\nYour ticket number is:"+z);//display the ticket number once a seat is booked
                    d1.enterInfo(tickets,month,z,seatNo, amt,temp);//calling enterInfo method for entering the details of users
                    z++;//incrementing ticket number for next entry
                }
                else
                {
                    System.out.println("Seat is already reserved.Choose some other seat");//displaying the message if the seat mentioned by the user is already been booked
                }
                
            }
          
    }
     /**
     * method displaySeat is used for displaying the arrangement of seats and thus confirms the seat reservation
     * @param i parameter is used to hold bus number
     * @param j parameter is used to hold destination
     * @param seatNo parameter is used hold seat number
     * 
     */
     public int displaySeat(int i,int j,int seatNo)
    {
       
        int x;//declaring variable i 
        /**
         * for loop for displaying all 32 seats
         */
        for(x=0;x<32;x++)
        {
            if(x%2==0)
            {
                System.out.println("\t");
            }
            else
            {
                System.out.println("\t\n");
            }
            /**
             * check if the seat is reserved.If it is not mark it with [0]
             */
            if(a[i][j][day][x]!=1)
            {
                System.out.print("[]"+x);
            }
            else
                System.out.print("[0]"+x);
            }
             return seatNo;
                    
        }
   
    }

    
    



   
   

