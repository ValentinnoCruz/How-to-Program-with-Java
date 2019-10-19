/*
 - Programmer Name: Valentinno Cruz
 - Assignment Start: 11/05/19 19:15
 - Assignment Completion:10/06/19 16:40
 - Total Hours for Assignment:  3 
 - Comments: I was having difficulty with using the static classes.
             with C++ i could just use top level classes, so this
             was a bit different for me to use nested classes.
 */
package com.mycompany.testrectangle;
import java.util.Scanner;               // Scanner
import java.util.Date;                 //Date util.
import java.text.DateFormat;          //Format to text
import java.text.SimpleDateFormat;   //Simpler date format


/**
 *
 * @author valen
 */
class Rectangle {
    private double length, width;
    
        // constructor W/O parameters 
        public Rectangle (){
            setLength (1.0);
            setWidth (1.0);
        }
    
        // constructor W/ length & width
        public Rectangle( double Length1, double Width1){
            setLength ( Length1 );
            setWidth  ( Width1  );
        }
    
        // set the length 
        public void setLength(double Length1){
            length = ( Length1 > 0.0 &&
                       Length1 < 20.0 ? Length1 : 1.0);
        }
    
        // set the width
        public void setWidth (double Width1){
            width = ( Width1 > 0.0 &&
                      Width1 < 20.0 ? Width1 : 1.0);
        }
    
        // val of length
        public double getLength(){
            return length;
        }
    
        //val of width
        public double getWidth(){
            return width;
        }
    
        // perimeter eq
        public double perimeter (){
            return 2*length+2*width;
        }
    
        // area eq
        public double area (){
            return length*width;
        }
    
        // change to string
        public String Rect1String(){
            return ( "- Length: " +length+ "\n"+ "- Width: "
                    + width + "\n" + "- Perimeter: "
                    + perimeter() + "\n" + "- Area: " + area() );
       //Gather systems date and time to print out
      System.out.printf ("\n       Thank you for using the rectangle applcation"
            + "\n          Time of calculation is: ");
        DateFormat df = new SimpleDateFormat("MM/dd/yy hh:mm:ss");
        Date dateobj = new Date();
            System.out.println(df.format(dateobj));
            
        }
    } //End rectangle

public class testrectangle
    {
        
        public static void main(String[] args) {
    
            Rectangle Rect_0ne=new Rectangle();
                double length,
                       width;
    
            // scanner for the input
            Scanner input = new Scanner(System.in);
            
            // input Length
            System.out.println("Enter the Length of rectangle:");
                length=input.nextDouble();
    
            // input Width
            System.out.println("Enter the Width of rectangle:");
                width=input.nextDouble();
    
            // call val
            Rect_0ne.setLength(length);
            Rect_0ne.setWidth(width);
    
            // call out 
            System.out.println(Rect_0ne.Rect1String());
            
            
        //Gather systems date and time to print out
        System.out.printf ("\n     Thank you for using the rectangle applcation "
            + "\n      Time of calculation is: ");
        DateFormat df = new SimpleDateFormat("MM/dd/yy hh:mm:ss");
        Date dateobj = new Date();
        System.out.println(df.format(dateobj));
        System.exit(0); // Exit Program
        
            
        }// End of main
}//End testrectangle

