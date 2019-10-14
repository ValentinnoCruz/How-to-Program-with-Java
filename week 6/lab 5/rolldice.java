/*
 - Programmer Name: Valentinno Cruz
 - Assignment Start: 10/12/19 21:36
 - Assignment Completion:10/13/19 01:15
 - Total Hours for Assignment:  3 
 - Comments: I found this assignment to be a bit frustrating because
             it was difficult for my to format the tabular correctly. 
 */

package com.mycompany.rolldice;
import java.util.Date;                 //Date util.
import java.text.DateFormat;          //Format to text
import java.text.SimpleDateFormat;   //Simpler date format
import java.util.Random;            //Random Generator

/**
 *
 * @author valen
 */

public class rolldice {
        //Rolling Random Die
        private static Random Die1 = new Random();
        private static Random Die2 = new Random();

public static void main(String[] args) {
    
    //array to store the counts of all sums
    int[] data = new int[11];           

      //data[0] represents when sum of 2 dice = 2 
     //data[1] represents when sum of 2 dice = 3
    //etc, etc, etc...   
    for (int i = 0; i < 36000000; i++) {
        int random1 = Die1.nextInt((6 - 1) + 1) + 1;
        int random2 = Die2.nextInt((6 - 1) + 1) + 1;
        int sum = random1 + random2;

    //Counts are then increased
    if (sum == 2) {
        data[0]++;
    }   
        else if (sum == 3) {
            data[1]++; 
        }   
        else if (sum == 4) {
            data[2]++;
        }   
        else if (sum == 5) {
            data[3]++;
        }   
        else if (sum == 6) {
            data[4]++;
        }   
        else if (sum == 7) {
            data[5]++;
        }   
        else if (sum == 8) {
            data[6]++;
        }   
        else if (sum == 9) {
            data[7]++;
        }   
        else if (sum == 10) {
            data[8]++;
        }   
        else if (sum == 11) {
            data[9]++;
        }       
        else if (sum == 12) {
            data[10]++;
        }
}
    
    //Print out Columns
    System.out.println("\t1\t 2\t 3\t 4\t 5\t 6");

    //Calculate Values
    for(int i=1; i<=6;i++) {
        System.out.print(i + "    ");

    for(int j=1;j<=6;j++){
            int sum = i + j;
        if (sum == 2) {
            System.out.print(data[0] + "  ");
        } 
            else if (sum == 3) {
                System.out.print(data[1] + " ");
            } 
            else if (sum == 4) {
                System.out.print(data[2] + " ");
            } 
            else if (sum == 5) {
                System.out.print(data[3] + " ");
            } 
            else if (sum == 6) {
                System.out.print(data[4] + " ");
            } 
            else if (sum == 7) {
                System.out.print(data[5] + " ");
            } 
            else if (sum == 8) {
                System.out.print(data[6] + " ");
            } 
            else if (sum == 9) {
                System.out.print(data[7] + " ");
            }   
            else if (sum == 10) {
                System.out.print(data[8] + " ");
            }   
            else if (sum == 11) {
                System.out.print(data[9] + " ");
            }   
            else if (sum == 12) {
                System.out.print(data[10] + " ");
        }
}   
    System.out.println();
        }
    //Gather systems date and time to print out
    System.out.printf ("\n       Thank you for using The Dice Rolling application"
            + "\n          Time of calculation is: ");
        DateFormat df = new SimpleDateFormat("MM/dd/yy hh:mm:ss");
        Date dateobj = new Date();
            System.out.println(df.format(dateobj));
            System.exit(0); // Exit Program
            
    } //Terminate Method Main
} //Terminate Class RollDice