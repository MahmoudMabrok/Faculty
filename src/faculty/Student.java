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
 abstract public class Student  extends Faculty_member {
 
    
    
    
    private int   stage  ;
    String  grade   ;

    public int  getStage() {
        return stage;
    }

    public void setStage(int  stage) {
        if ( stage < 8 && stage > 0 )
        this.stage = stage;
        else
            System.out.println("Erro :: stage 1 to 7 ");
    }
    
    public  void add ( Scanner s ){
        super.add(s);
        
        System.out.println("Enter stage  ");
        setStage(s.nextInt()) ;
        System.out.println("Enter Grade  ");
         String sv = s.nextLine();
        this.grade = s.nextLine(); 
        
    };
    
    @Override
    void display (String s )
    {
    super.display(s);
        System.out.println("Stage " + getStage() );
        System.out.println("Grade " + grade );
    
    
    }
    
    
    
}
