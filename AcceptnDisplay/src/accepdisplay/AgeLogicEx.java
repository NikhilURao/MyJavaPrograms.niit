/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accepdisplay;

/**
 *
 * @author Admin
 */

import java.util.Scanner;
import pack2.myclass;

public class AgeLogicEx 
{
    static String StdName;
    static int StdAge;
    static int i=0;
    static int total=0;
    
    
    public static void acceptandcheck()
    {
        Scanner sin = new Scanner(System.in);
        
        while(i < 10)
        {
            System.out.println("Enter Student Name");
            StdName = sin.next();
        
            System.out.println("Enter Student Age");
            StdAge = sin.nextInt();
        
            if(StdAge > 18)
            {
                total=total+1;
            }
            i++;
        }
        System.out.println("Total Student eligible are "+total);
    }
    
    public static void display()
    {
        System.out.println("Hello from static");
        
        //System.out.println(total);
    }
    
    public static void main(String[] aa)
    {
        myclass mobj = new myclass();
        mobj.ijk=10;
 
    }
}






