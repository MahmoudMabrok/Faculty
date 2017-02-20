/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faculty;

/**
 *
 * @author mo3tamed
 */
public class Faculty {
    
  

    Faculty_member[] fm = new Faculty_member[20];
    int i = 0;
    
    public  void add (Faculty_member  f )
    {
        fm[i] = f;   
        i++;
       
    }
    public  void display_all ()
    {
       // fm[0].display("");
        
        for (int j = 0; j < i; j++) {
            fm[j].display("");
        }

    
    }
    
    
}
