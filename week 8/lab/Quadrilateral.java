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

//Quadrilateral 

public class Quadrilateral {
    Point point1, point2, point3, point4;

    public Quadrilateral( double x1, double y1, double x2, double y2,
                          double x3, double y3, double x4, double y4 )
    {
        point1 = new Point( x1, y1 );
        point2 = new Point( x2, y2 );
        point3 = new Point( x3, y3 );
        point4 = new Point( x4, y4 );
    }

    public Point getPoint1(){
        return point1;
    }

    public Point getPoint2(){
        return point2;
    }

    public Point getPoint3(){
        return point3;
    }

    public Point getPoint4(){
        return point4;
    }

@Override
    public String toString(){
        return "Coordinates of Quadrilateral are: \n" + printCoordinates();
    }

    public String printCoordinates(){
        return point1.toString() + ", " + point2.toString() + ", " +
               point3.toString() + ", " + point4.toString();
    }

} //End Quadrilateral