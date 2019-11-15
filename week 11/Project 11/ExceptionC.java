/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exceptions;

/**
 *
 * @author valen
 */

public class ExceptionC extends ExceptionB {
    public ExceptionC() {
}
    
    public ExceptionC( final String exceptionMessage ) {
        super( exceptionMessage );}

@Override

    public void simpletest() throws ExceptionC {
        throw new ExceptionC( "An Exception of type 'ExceptionC' has been thrown" );
}

} //-- ends class definition