/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exceptions;
import java.io.IOException;             //signal an io exception will occur
import java.util.Date;                 //Date util.
import java.text.DateFormat;          //Format to text
import java.text.SimpleDateFormat;   //Simpler date format

/**
 *
 * @author valen
 */
public abstract class ExceptionA extends Exception {
    public ExceptionA() {
    }

    public ExceptionA( final String exceptionMessage ) {
        super( exceptionMessage );
    }

    // Abstract to be decalred in subclasses
    public abstract void simpletest() throws ExceptionA;
    public abstract void ioexception() throws IOException;
}