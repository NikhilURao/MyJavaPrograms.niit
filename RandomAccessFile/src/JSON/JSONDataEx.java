/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSON;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


/**
 *
 * @author slt
 */
public class JSONDataEx 
{
 
    public static void main(String args[])
    {
        // generate JSON String in Java
        writeJson("D:\\Annu TIRM\\Annu\\IO Ex\\Mybook.json");

        // let's read
        readJson("D:\\Annu TIRM\\Annu\\IO Ex\\Mybook.json");
    }
    
    public static void readJson(String file)
    {
        JSONParser parser = new JSONParser();
        try 
        {
            System.out.println("Reading JSON file from Java program");
            FileReader fileReader = new FileReader(file);
            JSONObject json = (JSONObject) parser.parse(fileReader);

            String title = (String) json.get("title");
            String author = (String) json.get("author");
            long price = (long) json.get("price");

            System.out.println("title: " + title);
            System.out.println("author: " + author);
            System.out.println("price: " + price);

            JSONArray characters = (JSONArray) json.get("characters");
            Iterator i = characters.iterator();

            System.out.println("characters: ");
            while (i.hasNext()) 
            {
                System.out.println(" " + i.next());
            

        } 
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
   
    public static void writeJson(String file) 
    {
        JSONObject json = new JSONObject();
        json.put("title", "Harry Potter in Rajasthan");
        json.put("author", "David Potter");
        json.put("price", 56);

        JSONArray jsonArray = new JSONArray();
        jsonArray.add("Ram");
        jsonArray.add("Shyam");
        jsonArray.add("Sai");

        json.put("characters", jsonArray);

        try
        {
            System.out.println("Writting JSON into file ...");
            System.out.println(json);
            FileWriter jsonFileWriter = new FileWriter(file);
            jsonFileWriter.write(json.toJSONString());
            jsonFileWriter.flush();
            jsonFileWriter.close();
            System.out.println("Done");

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
