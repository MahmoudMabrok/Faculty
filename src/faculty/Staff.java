/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faculty;

import java.util.Scanner;

/**
 *
 * @author mo3tamed
 */
abstract public class Staff extends Faculty_member {

    private double salary;
    private int startYear;

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Error ");
        }
    }

    public double getSalary() {
        return salary;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        if (startYear < 2017)
        this.startYear = startYear;
    else
            System.out.println("Error");
    }
    
    
    
     public  void add ( Scanner s ){
        super.add(s);
        
        System.out.println("Enter salary ");
        setSalary(s.nextDouble()) ;
        System.out.println("Enter startYear of work ");
        setStartYear(s.nextInt());
        
        
    };
     
     
     @Override
    void display (String s )
    {
    super.display(s);
        System.out.println("Salary " + getSalary());
        System.out.println("startYear of work  " + getStartYear());
        
    
    
    }
    
     
     
     

}
