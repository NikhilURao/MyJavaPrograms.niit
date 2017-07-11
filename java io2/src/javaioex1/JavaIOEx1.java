/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaioex1;

/**
 *
 * @author slt
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class JavaIOEx1 
{
    public static void main(String[] args) 
    {
        try
        {
            FileOutputStream fobj = new FileOutputStream("D:\\Annu TIRM\\Annu\\JavaObjects.txt");
            ObjectOutputStream oobj = new ObjectOutputStream(fobj);
            
            oobj.writeObject(new Date());
            oobj.writeBoolean(true);
            oobj.writeFloat(23.77f);
            
            Student sobj1 = new Student();
            sobj1.setStdName("Tim");
            sobj1.setStdAge(12);
            
            Student sobj2 = new Student();
            sobj1.setStdName("Rim");
            sobj1.setStdAge(13);
            
            Course cobj1 = new Course();
            cobj1.setCrsName("Java Technology");
            
            Course cobj2 = new Course();
            cobj2.setCrsName("Web Technology");
            
            List<Student> l1 = new ArrayList<Student>();
            l1.add(sobj1);
            
            List<Student> l2 = new ArrayList<Student>();
            l1.add(sobj2);
                    
            cobj1.setStdDetails(l1);
            cobj2.setStdDetails(l2);
            
            oobj.writeObject(cobj1);
            oobj.writeObject(cobj2);
            
            
            ObjectInputStream oibj = new ObjectInputStream(new FileInputStream("D:\\Annu TIRM\\Annu\\JavaObjects.txt"));
            
            Date dd = (Date)oibj.readObject();
            boolean bb = oibj.readBoolean();
            float ff = oibj.readFloat();
            
            System.out.println("Date Is "+dd);
            System.out.println("Boolean Value Is "+bb);
            System.out.println("Float Value Is "+ff);
            
            Course cin = new Course();
            
            cin = (Course)oibj.readObject();
            
           
            System.out.println(cin.getCrsName());
                        
            Student ssc = cin.getstdDetails().get(0);
            
            System.out.println(ssc.getStdName());
            System.out.println(ssc.getStdAge());
            
        }
        catch(IOException ee)
        {
            System.out.println("Exception Occured "+ee.getMessage());
        }
        catch(ClassNotFoundException ce)
        {
            System.out.println(ce.getMessage());
        }
        catch(Exception e)
        {
            System.out.println("Handle Any Missed Exception");
        }
    }
}
