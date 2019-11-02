/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.salary;
import java.util.Calendar;


/**
 *
 * @author valen
 */
public class PayrollSystemTest
{
    public static void main(String[] args)
    {
        //Create subclass objects
        SalariedEmployee salariedEmployee=new 
        SalariedEmployee("John","Smith","111-11-1111",800.00,new Date(07,23,2016));
        HourlyEmployee hourlyEmployee=new 
        HourlyEmployee("Karen","Price","222-22-2222",16.75,40,new Date(4,2,1981));
        CommissionEmployee commissionEmployee= new 
        CommissionEmployee("Sue","Jones","333-33-3333",10000,.06,new Date(5,8,1993));
        BasePlusCommissionEmployee basePlusCommissionEmployee=new 
        BasePlusCommissionEmployee("Bob","Lewis","444-44-4444",5000,.04,300,new Date(2,29,2000));
         
        //create four-element Employee array
        Employee [] employees=new Employee[4];
          
        //Initialize array with Employees
        employees[0]=salariedEmployee;
        employees[1]=hourlyEmployee;
        employees[2]=commissionEmployee;
        employees[3]=basePlusCommissionEmployee;
         
        System.out.printf("Employees processed polymorphically: %n%n");
          
    //calculate the payroll for each Employee (polymorphically)
    for(Employee currentEmployee: employees){
              
        //add a $100.00 bonus to the person’s payroll amount if the current month is
        //the one in which the Employee’s birthday occurs.
    if (currentEmployee.getBirthDate().getMonth()==Calendar.getInstance().get(Calendar.MONTH)+1)
      {
        System.out.printf("%s%n%s: $%,.2f%n",currentEmployee,"earned",currentEmployee.earnings());
        System.out.printf("Birthday bonus : $%,.2f%n",100.00);
        System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings()+100);
      }
    
     //Otherwise
        else{
              System.out.printf("%s%n%s: $%,.2f%n%n",currentEmployee,"earned",currentEmployee.earnings());
        }
    
        for(int j=0;j<employees.length;j++) {
            System.out.printf("Employee %d is a %s%n",j,employees[j].getClass().getName());
        }
     }
    }
}

