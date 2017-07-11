/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author slt
 */
public class ProcessData extends HttpServlet 
{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        String fname = req.getParameter("fname");
        String lname = req.getParameter("lname");
        String uid = req.getParameter("uid");
        String pass = req.getParameter("pass");
        String cpass = req.getParameter("cpass");
        
        String filename = "D:\\Annu TIRM\\myfile.txt";
        FileWriter fw =  null;
        BufferedWriter bw = null; 
            
        String Details = "User Data ::"+" First Name ::"+fname+" Last Name ::"+lname+"  User ID ::"+uid+"  Password ::"+pass;
        try
        {
            fw =  new FileWriter(filename,true);
            bw = new BufferedWriter(fw);
            
            if(pass.equals(cpass))
            {
            bw.write(Details);
            bw.newLine();
            bw.close();
            fw.close();
            out.println("Data Successfully Written to file .....");
            }
            else
            {
                out.println("Password Does not match");
            }
        }
        catch(IOException e)
        {   
            System.out.println(e.getMessage());
        }
    }
}
