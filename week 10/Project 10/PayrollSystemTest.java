/*
 - Programmer Name: Valentinno Cruz
 - Assignment Start: 11/19/19 13:09
 - Assignment Completion:11/20/19 17:50
 - Total Hours for Assignment:  10.15 
 - Comments: This was extremly hard for me. I have never 
             used abstract approaches so it took me time to get use to it.
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
        SalariedEmployee("Sam","Cooke","111-11-1111",800.00,new Date(2,22,1931));
        HourlyEmployee hourlyEmployee=new 
        HourlyEmployee("Carole","King","222-22-2222",16.75,40,new Date(2,9,1942));
        CommissionEmployee commissionEmployee= new 
        CommissionEmployee("Stevie","Nicks","333-33-3333",10000,.06,new Date(5,26,1948));
        BasePlusCommissionEmployee basePlusCommissionEmployee=new 
        BasePlusCommissionEmployee("Roberta ","Flak","444-44-4444",5000,.04,300,new Date(2,10,1937));
         
        //make employee array
        Employee [] employees=new Employee[4];
          
        //Initialize array 
        employees[0]=salariedEmployee;
        employees[1]=hourlyEmployee;
        employees[2]=commissionEmployee;
        employees[3]=basePlusCommissionEmployee;
         
        System.out.printf("Employees processed polymorphically: %n%n");
          
    //calculate the payroll (polymorphically)
    for(Employee currentEmployee: employees){
              
    //add a $100.00 bonus when the employees birthday comes up
    if (currentEmployee.getBirthDate().getMonth()==Calendar.getInstance().get(Calendar.MONTH)+1)
      {
        System.out.printf("%s%n%s: $%,.2f%n",
                currentEmployee,"earned",
                currentEmployee.earnings());
        System.out.printf("Birthday bonus : $%,.2f%n",100.00);
        System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings()+100);
      }
    
     //Otherwise
        else{
              System.out.printf("%s%n%s: $%,.2f%n%n",
                                currentEmployee,"earned",
                                currentEmployee.earnings());
        }
    
        for(int j=0;j<employees.length;j++) {
            System.out.printf("Employee %d is a %s%n",
                                j,
                                employees[j].getClass().getName());
        }
     }
    }
}

