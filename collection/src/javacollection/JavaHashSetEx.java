/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollection;

/**
 *
 * @author Admin
 */

import java.util.*;

public class JavaHashSetEx 
{
    public static void main(String[] aa)
    {
        HashSet hs = new HashSet();
        
        //Adding Elements to HashSet
        hs.add("TIM");
        hs.add("RIM");
        hs.add("RIM");
        hs.add("JIM");
        hs.add("SIM");
        hs.add("KIM");
        
        
        
        //Displaying Elements Of HashSet
        System.out.println("Display the content of HashSet");
        
        Iterator it = hs.iterator();
        
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        
        //Removing specific Elements Of HashSet
        hs.remove("JIM");
        
        System.out.println("Display the content after removing specific elements of HashSet");
        
        Iterator it1 = hs.iterator();
        
        while(it1.hasNext())
        {
            System.out.println(it1.next());
        }
        
        //Removing all the Elements Of HashSet
        
        hs.clear();
        System.out.println("Display the content after removing of HashSet");
        
        Iterator it2 = hs.iterator();
        
        while(it2.hasNext())
        {
            System.out.println(it2.next());
        }       
    }
}