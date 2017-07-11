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
import java.io.*;

public class AccepDisplay 
{
    public void Accept()
    {
        try
        {
            InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(is);
        
            String name;
            int Age;
            String Add;
            String Phone;
        
            System.out.println("Enter Name");
            name = br.readLine();

            System.out.println("Enter Age");
            Age = Integer.parseInt(br.readLine());

            System.out.println("Enter Name");
            Add = br.readLine();
        
            System.out.println("Enter Name");
            Phone = br.readLine();
        
            System.out.println("The Name Is "+name);
            System.out.println("The Age Is "+Age);
            System.out.println("The Address Is "+Add);
            System.out.println("The Phone Is "+Phone);
        }
        catch(IOException ep)
        {
        
        }
    }
    
    
    public static void main(String[] args)
    {
        Scanner sin = new Scanner(System.in);
        
        String name;
        int Age;
        String Add;
        String Phone;
        
        System.out.println("Enter Name");
        name = sin.next();

        System.out.println("Enter Age");
        Age = sin.nextInt();

        System.out.println("Enter Name");
        Add = sin.next();        
        
        System.out.println("Enter Name");
        Phone = sin.next();
        
        System.out.println("The Name Is "+name);
        System.out.println("The Age Is "+Age);
        System.out.println("The Address Is "+Add);
        System.out.println("The Phone Is "+Phone);
        
    }
}














