<%-- 
    Document   : RegisterUser
    Created on : 26 Apr, 2017, 1:56:43 PM
    Author     : slt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>User Registration Page</h1>
        <form action="http://localhost:8080/WebFileEx/ProcessData" method="get">
        <table border="1">
            <tr>
                <td>
                    First Name
                </td>
                <td>
                    <input type="text" name="fname"/>
                </td>
            </tr>
            <tr>
                <td>
                    Last Name
                </td>
                <td>
                    <input type="text" name="lname"/>
                </td>
            </tr>
            <tr>
                <td>
                    User ID
                </td>
                <td>
                    <input type="text" name="uid"/>
                </td>
            </tr>    
            <tr>
                <td>
                    Password
                </td>
                <td>
                    <input type="password" name="pass"/>
                </td>
            </tr>
            <tr>
                <td>
                    Confirm Password
                </td>
                <td>
                    <input type="password" name="cpass"/>
                </td>
            </tr>
            <tr>
                <td>
                    <input type="submit" name="submit"/>
                </td>
                <td>
                    <input type="reset" name="reset"/>
                </td>
            </tr>
        </table>
        </form>
    </body>
</html>
