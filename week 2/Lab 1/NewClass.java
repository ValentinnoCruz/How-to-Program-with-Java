/*
 - Programmer Name: Valentinno Cruz
 - Assignment Start: 09/10/19 23:20
 - Assignment Completion:09/11/19 15:50
 - Total Hours for Assignment:  1.25 
 - Comments:Very interesting assignment, I am
    so use to coding in C++ that my muscle memory wanted to take over when
    doing this assignment and start coding certain parts in C++. Overall I
    am pretty excited to learn even more about java given its popularity.
    The most difficult part was getting the program to actually run and set up.
 */
package com.mycompany.javaproject;
import java.util.Scanner;               //class scanner
import java.util.Date;                 //Date util.
import java.text.DateFormat;          //Format to text
import java.text.SimpleDateFormat;   //Simpler date format

/**
 *
 * @author valen
 */
public class NewClass {                 // execution of application

    public static void main (String[] args)
    {
        Scanner input=new Scanner (System.in);  //Scanner to get input from cmnd
        int r;
        double diameter, 
               Circumference,
               area;
        
        System.out.print ("Enter Radius: "); //the promt
        r=input.nextInt();                  //use radius from user input
        
        diameter=2*r;                 //Diameter formula
        Circumference=2*Math.PI*r;   //Circumference Formula
        area=Math.PI*r*r;           //Area of a circle formula
        System.out.printf ("\nThe diameter is = %f", diameter);
        System.out.printf ("\nThe Circumference is = %f",Circumference);
        System.out.printf ("\nThe area is = %f",area);
        
    //Gather systems date and time to print out
        System.out.printf ("\n Time of calculation is: ");
            DateFormat df = new SimpleDateFormat("MM/dd/yy hh:mm:ss");
             Date dateobj = new Date();
                System.out.println(df.format(dateobj));

    } // Terminate method main
    
}   //Terminate class NewClass
