/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

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
public class InputPage extends HttpServlet 
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

            out.println("<html>");
            out.println("<head>");
            out.println("<title>User registration Page</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Enter Your Details</h1>");
            out.println("<form method='GET' action=''>");
            out.println("Enter Number 1");
            out.println("<input type='text' name='Num1'/>");
            out.println("Enter Number 2");
            out.println("<input type='text' name='Num2'/>");
            
            out.println("<input type='submit' value='SUBMIT'/>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
    }
}

