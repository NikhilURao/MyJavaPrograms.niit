/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
@WebServlet(name = "StudentDetailsServ", urlPatterns = {"/StudentDetailsServ"})
public class StudentDetailsServ extends HttpServlet 
{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException, ServletException
    {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        int count=0;
        int count1=0;
        String URL = "jdbc:derby://localhost:1527/sample";
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            
            Connection con = DriverManager.getConnection(URL,"app","app");
            
            Statement stmt = con.createStatement();
            
            String qry="Select * from App.students";
            ResultSet rs = stmt.executeQuery(qry);
            
            while(rs.next())
            {
                
                String name = rs.getString("name");
                int age = rs.getInt("age");

                if(age> 21)
                {
                   // out.println(ct);
                    count1 = count1 + 1;
                }
                
            }
            out.println("Total Students Age > 21 are "+count);
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
