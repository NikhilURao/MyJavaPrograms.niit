/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threedimensionarrayex;

/**
 *
 * @author Admin
 */
public class ThreeDimensionArrayEx 
{
    public static void main(String[] args) 
    {
        int data[][][] = new int[2][4][2];
        
        int i,j,k;
        int num1=1;
        
        for(i=0;i<2;i++)
        {
            for(j=0;j<4;j++)
            {
                for(k=0;k<2;k++)
                {
                    data[i][j][k]=num1;
                    num1++;
                }
            }
        }
        
        for(i=0;i<2;i++)
        {
            for(j=0;j<4;j++)
            {
                for(k=0;k<2;k++)
                {
                    System.out.println("data["+i+"]["+j+"]["+k+"] ="+data[i][j][k]);
                }
            }
        }   
    }
}
