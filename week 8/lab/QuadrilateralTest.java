/*
 - Programmer Name: Valentinno Cruz
 - Assignment Start: 11/12/19 13:09
 - Assignment Completion:11/13/19 17:17
 - Total Hours for Assignment:  9.8 
 - Comments: Literally one of the most difficult assignments yet.
             It was not running and i could not figre out why.
             I accidentally deleted the file and recovered it.
             Afterwhich, it magically worked lol.
 */
package com.mycompany.quad;

/**
 *
 * @author valen
 */
//This is the program to use as a testing program.
import javax.swing.*;


public class QuadrilateralTest {

public static void main( String[] args )
{

    //Quad
    Quadrilateral quadrilateral = new Quadrilateral
        (1.1, 1.2, 6.6, 2.8, 6.2, 9.9, 2.2, 7.4 );

    //Trapazoid 
    Trapazoid trapazoid = new Trapazoid
        (0.0, 0.0, 10.0, 0.0, 8.0, 5.0, 3.3, 5.0 );

    //Parallelogram
    Parallelogram parallelogram = new Parallelogram
        (5.0, 5.0, 11.0, 5.0, 12.0, 20.0, 6.0, 20.0 );

    //Rectangle
    Rectangle rectangle = new Rectangle
        (17.0, 14.0, 30.0, 14.0, 30.0, 28.0, 17.0, 28.0 );

    //Square
    Square square = new Square
        (4.0, 0.0, 8.0, 0.0, 8.0, 4.0, 4.0, 4.0 );

        String result = quadrilateral.toString() + "\n" +
                        trapazoid.toString() + "\n" + parallelogram.toString() +
                        "\n" + rectangle.toString() + "\n" + square.toString();

    JOptionPane.showMessageDialog( null, result );
    System.exit( 0 );
    
    } // End Main
} // End QuadrilateralTest