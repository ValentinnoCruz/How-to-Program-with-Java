/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.salary;

/**
 *
 * @author valen
 */

public class Date{
    private int month;
    private int day;
    private int year;
    private static final int[] daysPerMonth={0,31,28,31,30,31,30,31,31,30,31,30,31};
    
    //construcotr: confirm proper value for month and day given the year
    public Date(int month,int day,int year){
        
        //check if month in range
        if(month <=0 || month >12)
            throw new IllegalArgumentException("month ("+month+") must be 1-12");
        //Check if day in range for month
        if(day <=0 || (day > daysPerMonth[month] && !(month == 2 && day == 29)))
            throw new IllegalArgumentException("day ("+day+") out-of-range for the specified month and year");
        //Check for leap year if month is 2 and day is 29
        if(month ==2 && day==29 && !(year % 400 ==0 || (year % 4 ==0 && year % 100 !=0 )))
            throw new IllegalArgumentException("day ("+day+") out-of-range for the specified month and year");
                this.month=month;
                this.day=day;
                this.year=year;
    }
    
    //return Month
    public int getMonth(){
          return month;
    }
    
    //return day
    public int getDay(){
         return day;
    }
    
    //return year
    public int getYear(){
          return year;
    }
    
    //return a String of the form month/day/year
    public String toString(){
          return String.format("%d/%d/%d",getMonth(),getDay(),getYear());
    }
}//end class Date

