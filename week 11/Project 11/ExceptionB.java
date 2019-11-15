/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exceptions;
import java.io.IOException;

/**
 *
 * @author valen
 */

public class ExceptionB extends ExceptionA{
    public ExceptionB() {
    // Empty out constructor
}
    
public ExceptionB(final String exceptionMessage ) {
    super(exceptionMessage);
}

public void simpletest() throws ExceptionB {
    throw new ExceptionB( "An Exception of type 'ExceptionB' has been thrown" );
}//End Class


  
    public void ioexception() throws IOException {
        throw new IOException("I/O exception caught in Exception B");
    }  
}