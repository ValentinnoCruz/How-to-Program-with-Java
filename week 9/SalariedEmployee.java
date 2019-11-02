/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.salary;
import java.util.IllegalFormatConversionException;


/**
 *
 * @author valen
 */


public class SalariedEmployee extends Employee{
    private double weeklySalary;

    //constructor
    public SalariedEmployee(String firstName,
                            String lastName,
                            String socialSecurityNumber, 
                            double weeklySalary,
                            Date birthDate)
        {   
        super(firstName,lastName,socialSecurityNumber,birthDate);
            if(weeklySalary <0.0)
                throw new IllegalArgumentException("Weekly salary must be >= 0.0");
                    this.weeklySalary=weeklySalary;
        }
    
        public void setWeeklySalary(double weeklySalary){
             if(weeklySalary <0.0)
                 throw new IllegalArgumentException("Weekly salary must be >= 0.0");
                    this.weeklySalary=weeklySalary;
        }
        
        public double getWeeklySalary(){
            return weeklySalary;
        }
        
        public String toString(){
            return String.format("salaried employee: %s%n%s: $%,.2f",
                super.toString(),"weekly salary",getWeeklySalary());
            }
    @Override
        public double earnings(){
          return weeklySalary;
     }
}
