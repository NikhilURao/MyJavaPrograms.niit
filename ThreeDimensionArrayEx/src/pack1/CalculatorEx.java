/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CalculatorEx 
{

    int result=0;
    public int add(int num1,int num2)
    {
        result = num1+num2;
        return result;
    }
    
    public int sub(int num1,int num2)
    {
        result = num1-num2;
        return result;
    }
    public int mul(int num1,int num2)
    {
        result = num1*num2;
        return result;
    }
    public int div(int num1,int num2)
    {
        result = num1/num2;
        return result;
    }
    public int percentage(int num1,int num2)
    {
        result = (num1+num2)/200;
        return result;
    }
    
    
    public static void main(String[] aa)
    {
        int num1,num2,result;
        num1=num2=result=0;
        int choice;
        Scanner sin = new Scanner(System.in);
        CalculatorEx cobj = new CalculatorEx();
        
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Percentage");
        System.out.println("6. Exit");
        
        System.out.println("Enter Your Choice");
        choice = sin.nextInt();
        
        System.out.println("Enter First Number");
        num1=sin.nextInt();
        
        System.out.println("Enter Second Number");
        num2=sin.nextInt();
        
        switch(choice)
        {
            case 1:
                result = cobj.add(num1, num2);
                System.out.println("The result as per your choice is "+result);
            break;
            
            case 2:
                result = cobj.sub(num1, num2);
                System.out.println("The result as per your choice is "+result);
            break;
            
            case 3:
                result = cobj.mul(num1, num2);
                System.out.println("The result as per your choice is "+result);
            break;
            
            case 4:
                result = cobj.div(num1, num2);
                System.out.println("The result as per your choice is "+result);
            break;
            
            case 5:
                result = cobj.percentage(num1, num2);
                System.out.println("The result as per your choice is "+result);
            break;
            
            case 6:
                System.out.println("Exiting ................");
                System.exit(0);
            break;
            default:
                System.out.println("Please Enter correct Choice");
            break;
        }
    }
}
