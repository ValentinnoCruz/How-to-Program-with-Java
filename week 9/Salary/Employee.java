/*
 - Programmer Name: Valentinno Cruz
 - Assignment Start: 09/17/19 13:09
 - Assignment Completion:09/18/19 01:50
 - Total Hours for Assignment:  3.17 
 - Comments: I remember doing a similar problem in C++, i find doing it in 
             java is much more direct with what informatino you want from
             the code. 
 */
package com.mycompany.salary;

/**
 *
 * @author valen
 */

public abstract class Employee{
        private final String firstName;
        private final String lastName;
        private final String SocialSecurityNumber;
        private final Date birthDate;
    
    //constructor
    public Employee(String firstName,
                    String lastName, 
                    String socialSecurityNumber,
                    Date birthDate) 
        {
          this.firstName=firstName;
          this.lastName=lastName;
          this.SocialSecurityNumber=socialSecurityNumber;
          this.birthDate=birthDate;
        }

    

    //return first name
    public String getFirstName(){
          return firstName;
    }

    //return last name
    public String getLastName() {
          return lastName;
     }
     
    //return social security number
    public String getSocialSecurityNumber(){
          return SocialSecurityNumber;
    }

    //return date of birth
    public Date getBirthDate(){
          return birthDate;
    }

    //return String representation of Employee object
    public String toString(){
          return String.format("%s %s%nsocial security number: %s%nDOB: %s",
                  getFirstName(), 
                  getLastName(), 
                  getSocialSecurityNumber(),
                  getBirthDate());
    }
    
    //abstract method
    public abstract double earnings();
    
 }//end class Employee
    
