/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjavaex1;

/**
 *
 * @author Admin
 */

import java.util.*;

public class MyJavaEx1 
{
    //Declaring the Variables
    String EmployeeName;
    String EmployeeAddress;
    String EmployeePhone;
    int EmployeeAge;
    
    
    //Declaring the functions
    public void Accept()
    {
        Scanner sin = new Scanner(System.in);
        
        System.out.println("Enter Employee Name");
        EmployeeName = sin.next();
        
        System.out.println("Enter Employee Address");
        EmployeeAddress = sin.next();
        
        System.out.println("Enter Employee Phone");
        EmployeePhone = sin.next();
        
        System.out.println("Enter Employee Age");
        EmployeeAge = sin.nextInt();
    }
    
    public void Display()
    {
        System.out.println("Employee Name Is "+EmployeeName);
        System.out.println("Employee Age Is "+EmployeeAge);
        System.out.println("Employee Address Is "+EmployeeAddress);
        System.out.println("Employee Phone Is "+EmployeePhone);
    }
    
    public static void main(String[] args) 
    {
        //Object of class is declared
        MyJavaEx1 mm = new MyJavaEx1();
        mm.Accept();
        mm.Display();
    }
}






