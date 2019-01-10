<%-- 
    Document   : details
    Created on : 10 janv. 2019, 13:37:31
    Author     : axelc
--%>

<%@page import="jee.model.Employees"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%=(Employees)request.getAttribute("employee")%>
        <h1>Hello World!</h1>
    </body>
</html>
