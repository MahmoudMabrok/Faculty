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
public class Aftergrade  extends Student {
    private int gradeYear ; 

    public int getGradeYear() {
        return gradeYear;
    }

    public void setGradeYear(int gradeYear) {
        if (gradeYear <  2016)
        this.gradeYear = gradeYear;
        else
            System.out.println("Error Max Year is 2016 ");
        
    }
    
    void display() {
        super.display("AfterGrade"); 
        System.out.println("gradeYear to faculty " + getGradeYear());
       
    }
    
     @Override
    public void add( Scanner s ) {
       super.add(s);
        System.out.println("Enter  gradeYear");
        setGradeYear(s.nextInt());
        System.out.println("Thanks  ");
    
    } 
    
}
