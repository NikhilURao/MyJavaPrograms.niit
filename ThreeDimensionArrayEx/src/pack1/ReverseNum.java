/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

/**
 *
 * @author Admin
 */

import java.util.Scanner;
public class ReverseNum 
{
    public void revnum()
    {
        int num;
        int rev=0;
        int rem;
        
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter the Number");
        num = sin.nextInt();
        
        
        while(num != 0)
        {
            rem = num%10;
            rev = rev*10 + rem;
            num = num/10;
        }
        
        System.out.println("The Number After reversing "+rev);
    }
    
    public static void main(String[] aa)
    {
        ReverseNum rnobj = new ReverseNum();
        rnobj.revnum();
    }
    
}
