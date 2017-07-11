/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahashmapex;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
/**
 *
 * @author Admin
 */
public class HashMapEx 
{
    public static void main(String[] aa)
    {
        HashMap<Integer, String> hobj = new HashMap<Integer, String>();
        
        hobj.put(1, "Tea");
        hobj.put(2, "Coffe");
        hobj.put(3, "Water");
        hobj.put(4, "Juice");
        
        Scanner sobj= new Scanner(System.in);
        
        System.out.println("Enter your choice between 1,2,3,4");
        Integer a = sobj.nextInt();
        
        if(a>=1 && a<=4)
        {
        
        String item = hobj.get(a);
        
        System.out.println("You have odered "+item);
        
        }
        
        
        Set<Integer> ikey = hobj.keySet();
        
        for((int)a :ikey)
        {
            
        }
    }
}










