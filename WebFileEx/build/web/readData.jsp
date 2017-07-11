<%-- 
    Document   : readData
    Created on : 26 Apr, 2017, 2:37:59 PM
    Author     : slt
--%>

<%@page import="java.io.IOException"%>
<%@page import="java.io.FileInputStream"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Reading Data From File</h1>
        
        <%
            int i;
        char c;
        
        try
        {
            FileInputStream f = new FileInputStream("D:\\Annu TIRM\\myfile.txt");
            while((i=f.read()) != -1)
            {
                c = (char) i;
                out.print(c);
            }
        }
        catch(IOException e)
        {
            out.println(e.getMessage());
        }   
        %>
    </body>
</html>
