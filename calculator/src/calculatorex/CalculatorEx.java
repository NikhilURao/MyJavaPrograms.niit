/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorex;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CalculatorEx 
{
    public int add(int num1,int num2)
    {
        return num1 + num2;
    }   
    public int sub(int num1,int num2)
    {
        return num1 - num2;
    }
    public int mul(int num1,int num2)
    {
        return num1 * num2;
    }
    public float div(int num1,int num2)
    {
        return num1 / num2;
    }
    
    public static void main(String[] args) 
    {
        CalculatorEx cobj = new CalculatorEx();
        int num1,num2,result,choice;
        
        Scanner sinput = new Scanner(System.in);
        
        System.out.println("1. Press 1 for Addition");
        System.out.println("2. Press 2 for Substraction");
        System.out.println("3. Press 3 for Multiplication");
        System.out.println("4. Press 4 for Division");
        System.out.println("5. Press 5 to Exit");
        
        System.out.println("Enter First Number");
        num1 = sinput.nextInt();

        System.out.println("Enter Second Number");
        num2 = sinput.nextInt();

        System.out.println("Enter Your Choice");
        choice = sinput.nextInt();        
        
        if(choice == 1)
        {
            result = cobj.add(num1, num2);
            System.out.println("Addition is "+result);
        }
        else if(choice == 2)
        {
            result = cobj.sub(num1, num2);
            System.out.println("Substraction is "+result);
        }
        else if(choice == 3)
        {
            result = cobj.mul(num1, num2);
            System.out.println("Product is "+result);
        }
        else if(choice == 4)
        {
            float result1 = cobj.div(num1, num2);
            System.out.println("Substraction is "+result1);
        }
        else 
        {
           System.exit(0);
        }
    }
}
