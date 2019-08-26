/*
 - Programmer Name: Valentinno Cruz
 - Assignment Start: 09/17/19 13:09
 - Assignment Completion:09/18/19 01:50
 - Total Hours for Assignment:  3.17 
 - Comments: I remember doing a similar problem in C++, i find doing it in 
             java is much more direct with what informatino you want from
             the code. 
 */
package com.mycompany.gas_mileage;
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
        int miles,          
            gallons,
            totmiles=0,
            totgallons=0;
        
    Scanner input = new Scanner(System.in);  //Scanner to get input from cmnd
        
    System.out.println("\nEnter the miles driven or -1 to Quit: "); //prompt 
        miles = input.nextInt();
        
    // Calculate miles driven and gallons used   
    while (miles != -1) {
        System.out.println("Enter the # of gallons used:");
            gallons = input.nextInt();
        System.out.println("\nThe miles driven for this trip: " +miles);
        System.out.println("\nGallons used for this trip: " +gallons);
            totmiles += miles;
            totgallons += gallons;
        System.out.printf("\nMiles/gallon for this trip: %f\nCombined miles"
                + " Per gallon: %f\n", (double)miles/gallons, 
                                       (double)totmiles/totgallons);
                            
            System.out.println("\nEnter the miles driven or -1 to Quit: ");
                miles = input.nextInt();
                
    } //end of while statement
        System.out.println();   //print out
            
    //Gather systems date and time to print out    
    if (miles == -1) {
        System.out.printf ("\nThank you for using the gas mileage application."
        + "\nTime of calculation is: ");
        DateFormat df = new SimpleDateFormat("MM/dd/yy hh:mm:ss");
        Date dateobj = new Date();
        System.out.println(df.format(dateobj));
        
    } //end of if statement   
  }   
}