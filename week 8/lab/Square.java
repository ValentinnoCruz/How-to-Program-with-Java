/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.quad;

/**
 *
 * @author valen
 */

//Square

public class Square extends Parallelogram {
    
    public Square( double x1, double y1, double x2, double y2,
                   double x3, double y3, double x4, double y4 )
        {
        super( x1, y1, x2, y2, x3, y3, x4, y4 );
        }

    public String toString(){
    return "\nCoordinates of Square are: \n" + printCoordinates() +
        "\nSide is: " + getHeight() + "\nArea is: " + getArea();
    }

} //End Square