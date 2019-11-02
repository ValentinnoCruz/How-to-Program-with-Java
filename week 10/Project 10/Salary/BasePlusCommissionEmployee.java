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
public class BasePlusCommissionEmployee extends CommissionEmployee {
    
    private double baseSalary;
    
    //constructor
    public BasePlusCommissionEmployee(String firstName,
                                      String lastName,
                                      String socialSecurityNumber, 
                                      double grossSales, 
                                      double commissionRate, 
                                      double baseSalary,
                                      Date birthDate){
        
        super(firstName,lastName,
                socialSecurityNumber,
                grossSales,
                commissionRate,
                birthDate);
        
            if(baseSalary < 0.0 )//validate base salary per week
                throw new IllegalArgumentException("Base salary must be >= 0.0");
                this.baseSalary=baseSalary;
        }
   
        public void setBaseSalary(double baseSalary) {
            if(baseSalary < 0.0 )
                throw new IllegalArgumentException("Base salary must be >= 0.0");
                    this.baseSalary=baseSalary;
        }
        
        public double getBaseSalary(){
            return baseSalary;
        }
        
        public double earnings() {
            return getBaseSalary()+super.earnings();
        }
        
        public String toString(){
             return String.format("%s %s: %s: $%,.2f","base-salaried",
                           super.toString(),"base salary",
                           getBaseSalary());
        }
}

