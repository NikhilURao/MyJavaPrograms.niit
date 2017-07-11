/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
@WebServlet(name = "ReadDataServlet", urlPatterns = {"/ReadDataServlet"})
public class ReadDataServlet extends HttpServlet 
{
    @Override
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
      
        PrintWriter out = res.getWriter();
        res.setContentType("text/html");
        
        String id = req.getParameter("EmpId");
        String name = req.getParameter("EmpName");
        int Age = Integer.parseInt(req.getParameter("EmpAge"));
        String Add = req.getParameter("EmpAdd");
        String phone = req.getParameter("EmpPh");
        String Email = req.getParameter("EmpEmail");
        int Sal = Integer.parseInt(req.getParameter("EmpSal"));
        String City = req.getParameter("EmpCity");
        String CZ = req.getParameter("Empcs");
        
        
        out.println("Employee ID Is "+id);
        out.println("<br/>");
        out.println("Employee Name Is "+name);
        out.println("<br/>");
        out.println("Employee Age Is "+Age);
        out.println("<br/>");
        out.println("Employee Phone Is "+phone);
        out.println("<br/>");
        out.println("Employee Email Is "+Email);
        out.println("<br/>");
        out.println("Employee Sal Is "+Sal);
        out.println("<br/>");
        out.println("Employee City Is "+City);
        out.println("<br/>");
        out.println("Employee CZ Is "+CZ);
        out.println("<br/>");
        
        
        if(Age > 30)
        {
            Sal=Sal+3500;
            out.println("Employee Sal after adding medical checkup Is "+Sal);
        }
        
        if(!Email.contains("niit.com"))
        {
            out.println("Not Valid Email Id "+Email);
        }
        
         if(!CZ.equals("Indian"))
        {
            float sal = Sal * (0.90f);
            out.println("Employee Sal after deducting the tax "+sal);
        }
    }
}




