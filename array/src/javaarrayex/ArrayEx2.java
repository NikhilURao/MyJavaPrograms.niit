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

import java.util.Scanner;
public class ArrayEx2 
{
    String[] name;
    public void accept()
    {
        name=new String[10];
        Scanner input = new Scanner(System.in);
        
        for(int i=0;i < 10;i++)
        {
            System.out.println("Enter Name");
            name[i]= input.next();
        }
    }
    public void display()
    {
        for(int i=0;i < 10;i++)
        {
            System.out.println("Name  Is "+name[i]);
        }
    }
    public static void main(String[] aa)
    {
        ArrayEx2 aobj = new ArrayEx2();
        aobj.accept();
        aobj.display();
    }
}




