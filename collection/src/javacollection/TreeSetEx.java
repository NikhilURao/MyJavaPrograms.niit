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
public class TreeSetEx 
{
    public static void main(String[] aa)
    {
        
        System.out.println("TreeSet Supporting String");
        TreeSet<String> tset = new TreeSet<String>();
        
        tset.add("Test 3");
        tset.add("Test 2");
        tset.add("Test 4");
        tset.add("Test 1");
        tset.add("Test 6");
        tset.add("Test 7");
        tset.add("Test 8");
        
        System.out.println("Display the content of TreeSet");
        
        Iterator it = tset.iterator();
        
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        
        System.out.println("TreeSet Supporting Integer");
        TreeSet<Integer> tsetint = new TreeSet<Integer>();
        
        tsetint.add(12);
        tsetint.add(13);
        tsetint.add(15);
        tsetint.add(12);
        tsetint.add(16);
        tsetint.add(19);
        tsetint.add(11999);
        
        
        System.out.println("Display the content of TreeSet");
        
        Iterator it1 = tsetint.iterator();
        
        while(it1.hasNext())
        {
            System.out.println(it1.next());
        }
    }
}