/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setcollectionex;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class TreeSetEx 
{
    public static void main(String[] aa)
    {
        TreeSet<String> StudentName = new TreeSet<String>();
        
        StudentName.add("Srinivas");
        StudentName.add("Sai Prasad");
        StudentName.add("Aiswarya");
        StudentName.add("Kunal");
        StudentName.add("Venkat");
        StudentName.add("Venkat");
        StudentName.add("Venkat");
        StudentName.add("NULL");
        StudentName.add("NULL");
        
        System.out.println("Name Is     "+StudentName);        
        Iterator itr = StudentName.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
        TreeSet<Integer> StudentAge = new TreeSet<Integer>();
        
        
        StudentAge.add(12);
        StudentAge.add(22);
        StudentAge.add(45);
        StudentAge.add(12);
        StudentAge.add(16);
        StudentAge.add(15);
        StudentAge.add(17);
        
        System.out.println("Age Is       "+StudentAge);
        
        Iterator itr1 = StudentAge.iterator();
        
        while(itr1.hasNext())
        {
            System.out.println(itr1.next());
        }
        
    }
}