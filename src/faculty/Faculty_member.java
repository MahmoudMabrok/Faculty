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
 abstract public class Faculty_member {
    private String name ;
    private String department  ;
    private int  age ;

  
    public void setAge(int age) {
        this.age = age;
    }
    public  void add ( Scanner s ){
        this.name = s.nextLine() ;
        System.out.println("Enter Name ");
        this.name = s.nextLine() ;
        System.out.println("Enter department  ");
        this.department = s.nextLine(); 
        System.out.println("Enter  age ");
        setAge(s.nextInt()) ;
    String sv = s.nextLine();
    };
    
    
    void display ( String s )
    {
        System.out.println("Faculty Member " + s );
        System.out.println("=================");
        System.out.println("Name " + name);
        System.out.println("Department  " + department );
        System.out.println("Age  " + getAge() );
        
   
    }

    public int getAge() {
        return age;
    }
    
}
