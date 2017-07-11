/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setcollectionex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class HashMapEx 
{
    public static void main(String[] aa)
    {
        HashMap<String,Integer> StudentDetails = new HashMap<String,Integer>();
        
        StudentDetails.put("TIM",12);
        StudentDetails.put("RIM",13);
        StudentDetails.put("JIM",14);
        StudentDetails.put("KIM",12);
        StudentDetails.put("DIM",12);
        StudentDetails.put("ZIM",11);
        
        
        for(Map.Entry m:StudentDetails.entrySet())
        {
            System.out.println("Key:  "+m.getKey()+" and Value  :"+m.getValue());
        }
        
        Iterator itr = StudentDetails.entrySet().iterator();
        
        while(itr.hasNext())
        {
            Map.Entry m1 = (Map.Entry)itr.next();
            System.out.println("Key:  "+m1.getKey()+"  and  Value  :"+m1.getValue());
        }
    }
    
}



