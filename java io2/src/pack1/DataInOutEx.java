/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 *
 * @author slt
 */
public class DataInOutEx 
{
    public static void main(String[] aa) 
    {
        float[] prices = {19.99f,9.99f};
        int[] units ={12,8};
        String[] descriptions={"Test 1","Test 2"};
        float total=0;
        try
        {
            DataOutputStream doobj = new DataOutputStream(new FileOutputStream("D:\\Annu TIRM\\Annu\\testdata.txt"));
     
            for(int i = 0;i<prices.length;i++)
            {
                doobj.writeFloat(prices[i]);
                doobj.writeChar('\t');

                doobj.writeInt(units[i]);
                doobj.writeChar('\t');

                doobj.writeUTF(descriptions[i]);
                doobj.writeChar('\t');            
            }
            
            DataInputStream doibj = new DataInputStream(new FileInputStream("D:\\Annu TIRM\\Annu\\testdata.txt"));
           
            
            while(true)
            {
                float price = doibj.readFloat();
                doibj.readChar();
                System.out.println(price);
                int unit = doibj.readInt();
                doibj.readChar();
                System.out.println(unit);
                String desc = doibj.readUTF();
                doibj.readChar();
                System.out.println(desc);
                
                System.out.println("Order is made of "+unit+" units of "+desc+" at $"+price);
                   
                total = total + (unit*price);
            }
        }
        catch(Exception ee)
        {
            System.out.println("Exception"+ee.getMessage());
        }
        System.out.println("Total Price Is "+total);
    }
}
