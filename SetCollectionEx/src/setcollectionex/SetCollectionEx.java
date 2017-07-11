/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setcollectionex;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Admin
 */
public class SetCollectionEx 
{

    public static void main(String[] args) 
    {
        //HashSet does not support DUPLICATE values
        //HashSet does not support any type of order to the values
        //HashSet allows at least one NULL value
        
        HashSet StudentName = new HashSet();
        
        StudentName.add("Srinivas");
        StudentName.add("Sai Prasad");
        StudentName.add("Aiswarya");
        StudentName.add("Kunal");
        StudentName.add("Venkat");
        StudentName.add("Venkat");
        StudentName.add("Venkat");
        StudentName.add("NULL");
        StudentName.add("NULL");
        StudentName.add(1);
        StudentName.add(34.88f);
        
        
        
        System.out.println(StudentName);
        
        Iterator itr = StudentName.iterator();
        
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
    }
    
}
