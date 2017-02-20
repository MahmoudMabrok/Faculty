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
public class Assistant  extends Staff {
    
    private int yearMaster   ; 

    public int getYearMaster() {
        return yearMaster;
    }

    public void setYearMaster(int yearMaster) {
        if (yearMaster < 2018  && yearMaster > 0 )
        this.yearMaster = yearMaster;
        else
            System.out.println("Error ");
           
    }
    
    @Override
    void display(String s ) {
        super.display("Assistance "); 
        System.out.println("Year of Master  " + getYearMaster());
        
        
    }
    
    @Override
    public void add( Scanner s ) {
       super.add(s);
        System.out.println("Enter  Master Year");
        setYearMaster(s.nextInt());
       
        System.out.println("Thanks  ");
    
    } 
    
}
