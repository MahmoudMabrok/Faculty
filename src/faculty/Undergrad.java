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
public class Undergrad extends Student  {
    
    
    private int enterYear ; 
    private int section  ; 

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        if (section > 0 && section < 17 ) 
        this.section = section;
        else
            System.out.println(" Error  :: section 1 ---> 16 ");
    }

    
    @Override
    void display(String s ) {
        super.display("UnderGrade"); 
        System.out.println("enterYear to faculty " + enterYear);
        System.out.println("Section  ::  " + getSection());
    }

    
    @Override
    public void add( Scanner s ) {
       super.add(s);
        System.out.println("Enter  enterYear");
        setEnterYear(s.nextInt());
        System.out.println("Enter your Section  ");
        setSection(s.nextInt());
        System.out.println("Thanks  ");
    
    } 

    public int getEnterYear() {
        return enterYear;
    }

    public void setEnterYear(int en) {
        if (en < 2017 && en > 1975  )
        this.enterYear = en;
        else 
            System.out.println("Erroe must ne less 2017 and great  1975");
    }
    
    
}
