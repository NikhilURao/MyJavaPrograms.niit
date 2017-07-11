/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahashmapex;

/**
 *
 * @author Admin
 */

import java.util.Map;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class JavaHashMapEx 
{
    public static void main(String[] args) 
    {
        HashMap<Integer,String> hobj = new HashMap<Integer,String>();
        
        hobj.put(101, "TIM");
        hobj.put(102, "RIM");
        hobj.put(103, "JIM");
        hobj.put(104, "SIM");
        hobj.put(105, "KIM");

        //Logic for retrieving Single Value based upon the known key
        String empName = hobj.get(103);
        
        System.out.println(empName);
        
        //Logic for retrieving All the keys.
        
        Set<Integer> ikey = hobj.keySet();
        
        for(Integer i:ikey)
        {
            System.out.println(i);
        }
        
        //Lets Check whether keys are available or not
        
        if(hobj.containsKey(102))
        {
            System.out.println("Key is present inside HashMap");
        }
        
        if(hobj.containsKey(1002))
        {
            System.out.println("Key is present inside HashMap");
        }
        else
        {
            System.out.println("Key is not present inside HashMap");
        }
        
        //Logic for retrieving All the keys.values based upon the keys available
        
        Set<Integer> ikeyval = hobj.keySet();
        
        for(Integer val:ikeyval)
        {
           // System.out.println(val);
            String data = hobj.get(val);
            System.out.println(val+"    "+data);
            
            if(data == "TIM")
            {
                System.out.println(val);
            }
        }
    }
}