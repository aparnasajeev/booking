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
class boardingPass {
     /**
     * 
     * @param name parameter holds the user name
     * @param phno parameter holds the user phone number
     * @param seatno parameter holds the user seat number
     * @param z parameter holds the user ticket number
     * @param amt parameter holds the amount to be paid by the user
     */
     int displayinfo(String name,String phno,int seatno,int z,int amt)
    {
        System.out.println("\n\n******BUS RESERVATION BILL*****");//displays bill
        System.out.println("Ticket number:"+z);//displays ticket number
        System.out.println("Name:"+name);//displays user name
        System.out.println("Seat number:"+seatno);//displays seat number
        System.out.println("Phone number:"+phno);//displays user phone number
        System.out.println("Amount to be paid: Rs"+amt+"/-");//displays amount to be paid
        System.out.println(" *******************************\n\n");
       
        return amt;
    }
}
