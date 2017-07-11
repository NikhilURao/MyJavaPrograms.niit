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

public class JavaCollection 
{    
    public static void main(String[] args) 
    {
        //create a LinkedList which should contain only String Data
        LinkedList<String> ll = new LinkedList<String>();
        
        
        ll.add("Test 6");
        ll.add("Test 7");
        ll.add("Test 1");
        ll.add("Test 2");
        ll.add("Test 3");
        ll.add("Test 4");
        ll.add("Test 5");
        
        ListIterator it = ll.listIterator();
        
        System.out.println("Elements In Actual Order");
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        
        System.out.println("Elements In Reverse Order");
        while(it.hasPrevious())
        {
            System.out.println(it.previous());
        }
    }   
}