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
// Class Trapazoid definition

public class Trapazoid extends Quadrilateral {
    double height;

    public Trapazoid( double x1, double y1, double x2, double y2,
                      double x3, double y3, double x4, double y4 )
        {
        super( x1, y1, x2, y2, x3, y3, x4, y4 );
        }

    public double getHeight(){
        if ( getPoint1().getY() == getPoint2().getY() )
            return Math.abs( getPoint2().getY() - getPoint3().getY() );
        else
            return Math.abs( getPoint1().getY() - getPoint2().getY() );
    }

    public double getArea(){
        return getSumOfTwoSides() * getHeight() / 2.0;
    }

    public double getSumOfTwoSides(){
        if ( getPoint1().getY() == getPoint2().getY() )
            return Math.abs( getPoint1().getX() - getPoint2().getX() ) +
                   Math.abs( getPoint3().getX() - getPoint4().getX() );
        else
            return Math.abs( getPoint2().getX() - getPoint3().getX() ) +
                   Math.abs( getPoint4().getX() - getPoint1().getX() );
    }

    public String toString(){
        return "\nCoordinates of Trapazoid are: \n" + printCoordinates() +
               "\nHeight is: " + getHeight() + "\nArea is: " + getArea();
    }

} //End Trapazoidezoid