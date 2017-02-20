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
public class NewClass {

public static void main(String[] args) {
    
   Scanner  scanner = new Scanner (System.in);
    Faculty f = new Faculty();
    int x ; 
    
 do {
     System.out.println(" 1 add underGrade "); 
     System.out.println(" 2 add afterGrade "); 
     System.out.println(" 3 add afterGrade "); 
     System.out.println(" 4 add afterGrade "); 
     System.out.println(" 5  dsiplay all  ");
     System.out.println(" 0  exit   ");
     x = scanner.nextInt() ;
    switch ( x )
    {
        case 1 :
            Undergrad un = new Undergrad();
            un.add(scanner);
            f.add(un);
            break ; 
        case 2 :
            Aftergrade af = new Aftergrade();
            af.add(scanner);
            f.add(af);
            break ; 
        case 3 :
            Doctor d = new Doctor();
            d.add(scanner);
            f.add(d);
            break ; 
        case 4 :
            Assistant a = new Assistant();
            a.add(scanner);
            f.add(a);
            break ; 
        case 5 :
            f.display_all();
            break;
 
                
    }
    
 } while ( x > 0 );
   
        
        System.out.println("visit us again ----> ");
    }

}
