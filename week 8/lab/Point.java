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

//Point 
public class Point {
    private double x, y;
    public Point( double xCoordinate, double yCoordinate ){
        x = xCoordinate;
        y = yCoordinate;
    }

    public double getX(){
        return x;
        }

    public double getY(){
        return y;
        }

    public String toString(){
        return "( " + getX() + ", " + getY() + " )";
    }

} // end class Point

