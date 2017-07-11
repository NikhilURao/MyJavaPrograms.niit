/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomaccessfile;
import java.io.FileNotFoundException; 
import java.io.IOException; 
import java.io.RandomAccessFile; 
import java.nio.ByteBuffer; 
import java.nio.channels.FileChannel; 
// Java Program to read and write UTF String on RandomAccessFileEx in Java.
/**
 *
 * @author slt
 */
public class RandomAccessFileEx 
{
       public static void main(String args[]) 
       { 
            String data = "Android(4.4 - 4.4.2)";
            writeToRandomAccessFile("D:\\Annu TIRM\\Annu\\IO Ex\\sample.store",100, data); 
            System.out.println("String written into RandomAccessFile from Java Program : " + data); 
            String fromFile = readFromRandomAccessFile("D:\\Annu TIRM\\Annu\\IO Ex\\sample.store", 100); 
            System.out.println("String read from RandomAccessFile in Java : " + fromFile); 
       } 
       /* * Utility method to read from RandomAccessFileEx in Java */       
       public static String readFromRandomAccessFile(String file, int position) 
       { 
            String record = null;
            try 
            { 
                RandomAccessFile fileStore = new RandomAccessFile(file, "rw");
                // moves file pointer to position specified 
                fileStore.seek(position); 
                
                // reading String from 
                record = fileStore.readUTF(); 
                fileStore.close(); 
            } 
            catch (IOException e)
            {
                e.printStackTrace();
            } 
            return record; 
        } 
        
       /* * Utility method for writing into RandomAccessFileEx in Java */ 
       
       public static void writeToRandomAccessFile(String file, int position, String record)
       {
           try 
           { 
               RandomAccessFile fileStore = new RandomAccessFile(file, "rw"); 
                // moves file pointer to position specified 
                fileStore.seek(position); 
                // writing String to 
                fileStore.writeUTF(record); 
                fileStore.close();
           } 
           catch (IOException e)
           {
               e.printStackTrace(); 
           } 
       } 
}
