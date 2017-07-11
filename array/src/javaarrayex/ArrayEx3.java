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
public class ArrayEx3 
{
    public static void Declare()
    {
        int[] Age = {12,13,12,11,14};
        
        System.out.println("Number Is "+Age[0]);
        System.out.println("Number Is "+Age[1]);
        System.out.println("Number Is "+Age[2]);
        System.out.println("Number Is "+Age[3]);
        System.out.println("Number Is "+Age[4]);
    }
    
    public void twodimension()
    {
        String[][] NameAge = new String[2][4];
        
        NameAge[0][0]="John";
        NameAge[1][0]="12";
        
        NameAge[0][1]="David";
        NameAge[1][1]="13";
        
        NameAge[0][2]="Happy";
        NameAge[1][2]="13";
        
        NameAge[0][3]="Harry";
        NameAge[1][3]="12";
        
        
        for(int i=0;i<NameAge[i].length;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.println("Name and Age Is"+NameAge[i][j]);
            }
        }
    }
    
    public static void main(String[] aa)
    {
        Declare();
    }
    
}
