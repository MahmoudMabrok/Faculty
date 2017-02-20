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
public class Doctor  extends Staff {
    
    private int yearPhd  ; 

    public int getYearPhd() {
        return yearPhd;
    }

    public void setYearPhd(int yearPhd) {
       if (yearPhd < 2018 && yearPhd > 0 )
        this.yearPhd = yearPhd;
       else 
            System.out.println("Error ");
    }
    
    
    @Override
    void display(String s ) {
        super.display("Doctor"); 
        System.out.println("Year of Phd  " + getYearPhd());
        
    }
    
    
    
    @Override
    public void add( Scanner s ) {
       super.add(s);
        System.out.println("Enter  Phd Year");
        setYearPhd(s.nextInt());
       
        System.out.println("Thanks  ");
    
    } 
    
    
    
}
