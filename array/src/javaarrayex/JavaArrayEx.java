/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarrayex;

/**
 *
 * @author Admin
 */
public class JavaArrayEx 
{
    
    //Declaring Array
    static String[] name;
    
    public static void accept()
    {
        //Initializing Array Object
        name = new String[10];
        
        //Initializing array with Values at different index
        
        name[0] = "Tim";
        name[1] = "Rim";
        name[2] = "Jim";
        name[3] = "Kim";
        name[4] = "Dim";
        name[5] = "Sim";
        name[6] = "John";
        name[7] = "David";
        name[8] = "Peter";
        name[9] = "Paul";
        
    }
    
    public static void display()
    {
        System.out.println("Name Is "+name[0]);
        System.out.println("Name Is "+name[1]);
        System.out.println("Name Is "+name[2]);
        System.out.println("Name Is "+name[3]);
        System.out.println("Name Is "+name[4]);
        System.out.println("Name Is "+name[5]);
        System.out.println("Name Is "+name[6]);
        System.out.println("Name Is "+name[7]);
        System.out.println("Name Is "+name[8]);
        System.out.println("Name Is "+name[9]);
    }
    

    public static void main(String[] args) 
    {
        //JavaArrayEx jobj = new JavaArrayEx();
        //jobj.accept();
        //jobj.display();
        
        accept();
        display();
        
        
        
    }
}