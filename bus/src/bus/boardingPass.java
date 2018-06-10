/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

/**
 *
 * @author Shantanu
 */
public class boardingPass {
     /**
     * method displayInfo is used to display the bill
     * @param name parameter holds the user name
     * @param phNo parameter holds the user phone number
     * @param seatNo parameter holds the user seat number
     * @param z parameter holds the user ticket number
     * @param amt parameter holds the amount to be paid by the user
  
     */
     public int displayInfo(String name,String phNo,int seatNo,int z,int amt,int month,int dest)
    {
        System.out.println("\n\n******BUS RESERVATION BILL*****");//displays bill
        System.out.println("Ticket number:"+z);//displays ticket number
        System.out.println("Name:"+name);//displays user name
        System.out.println("Seat number:"+seatNo);//displays seat number
        System.out.println("Phone number:"+phNo);//displays user phone number
        System.out.println("Month of travelling:"+month);//displays month of travelling
        System.out.println("Amount to be paid: Rs"+amt+"/-");//displays amount to be paid
        
        /**
         * if else statement is used to display the user destination according to the choice made by the user
         */
        if(dest==1)
        {
            System.out.println("Destination:Banglore");//displays destination as banglore
        }
        else if(dest==2)
        {
            System.out.println("Destination:Mumbai");//displays destination as mumbai
        }
        else
        {
             System.out.println("Destination:Pune");//displays destination as pune
        }
        System.out.println(" *******************************\n\n");
       
        return amt;
    }
}
