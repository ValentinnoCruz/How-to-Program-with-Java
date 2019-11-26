/*
 - Programmer Name: Valentinno Cruz
 - Assignment Start: 11/30/19 09:09
 - Assignment Completion:11/30/19 22:50
 - Total Hours for Assignment:  14.5 
 - Comments: I Enjoyed this assignment, it was quite easy in my opinion. 
 */
package com.mycompany.sentences;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author valen
 */

//Class 
class SentenceBuild {
    //Main 
    public static void main(String args[]) {
        
        //Make sentence object
        Sentence sentenceObj;

        //Print statement of 20
        for(int i=1; i<=20; i++) {
            
            //Create instance 
            sentenceObj = new Sentence();
        
            //Print out sentence made 
            System.out.println(sentenceObj.getSentence());
       }  
        
    //Gather systems date and time to print out
    System.out.printf ("\n      Thank you for using the Random Sentences application "
                         + "\n         Time of calculation is: ");
        DateFormat df = new SimpleDateFormat("MM/dd/yy hh:mm:ss");
        Date dateobj = new Date();
        System.out.println(df.format(dateobj));
        System.exit(0);
   }
}