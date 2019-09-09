/*
 - Programmer Name: Valentinno Cruz
 - Assignment Start: 09/25/19 10:09
 - Assignment Completion:09/25/19 16:50
 - Total Hours for Assignment:  4.17 
 - Comments:  
 */
package com.mycompany.sales_calc;
import java.util.Scanner;               //class scanner
import java.util.Date;                 //Date util.
import java.text.DateFormat;          //Format to text
import java.text.SimpleDateFormat;   //Simpler date format


/**
 *
 * @author valen
 */

public class Main {
   public static void main(String [] args){
       
    Scanner keyBoard=new Scanner(System.in);
    
    double totretail=0;
    
    while(true){
    
    System.out.println("1 - Product 1, $2.98");
    System.out.println("2 - Product 2, $4.50");
    System.out.println("3 - Product 3, $9.98");
    System.out.println("4 - Product 4, $4.49");
    System.out.println("5 - Product 5, $6.87");
    System.out.println("6 - Exit");
    System.out.print("Enter The Product Number:");
    
    int prodnum =keyBoard.nextInt();
   
    
   if(prodnum==6){
       break;
   }
    
   
   //enter the qty sold
   System.out.print("Eneter the Quantity sold: ");
   
   int qtysold=keyBoard.nextInt();
   
   switch(prodnum){
        case 1:
           totretail+=2.98*qtysold;
           break;
        case 2:
           totretail+=4.50*qtysold;
           break;   
        case 3:
           totretail+=9.98*qtysold;
           break; 
        case 4:
           totretail+=4.49*qtysold;
           break;
        case 5:
           totretail+=6.87*qtysold;
           break;   
   }
   //Output
   System.out.println("\n The total retail value "
           + "of all products sold: $" +totretail );
}
        
                
    //Gather systems date and time to print out
        System.out.printf ("\n Thank you for using the Calculating Sales app"
                + "\n Time of calculation is: ");
            DateFormat df = new SimpleDateFormat("MM/dd/yy hh:mm:ss");
             Date dateobj = new Date();
                System.out.println(df.format(dateobj));
   }   
}
