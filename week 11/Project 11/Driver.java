/*
 - Programmer Name: Valentinno Cruz
 - Assignment Start: 11/26/19 12:20
 - Assignment Completion:11/27/19 16:20
 - Total Hours for Assignment:   11.17
 - Comments: Felt kind of odd running a program with no actual end result
             so i felt odd when it said the program didnt excute 
             even though it did what the assignment asked. 
 */
package com.mycompany.exceptions;

/**
 *
 * @author valen
 */

    public class Driver{
        
        public static void main( String [] args ) throws Exception{
            ExceptionB exceptionb = new ExceptionB();
            ExceptionC exceptionc = new ExceptionC();
        
    // Throw B
    try{ 
        exceptionb.simpletest(); 
    }
    
        // Catch with A
        catch(ExceptionA ex ) {
            ex.printStackTrace(System.err);
        } // End
    
    // Throw C
    try {
        exceptionc.simpletest(); 
    } // End
    
        // Catch With A
        catch( ExceptionA ex ) {
            ex.printStackTrace( System.err );
        } //  End
    
    exceptionb.ioexception();

    }// End Main
} // End Class
