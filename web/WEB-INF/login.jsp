<%-- 
    Document   : login
    Created on : 19 déc. 2018, 08:37:44
    Author     : axelc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1> Login</h1>
        <form method='POST' action='Controller'>
            <p>${connection}</p>
            Login <input type="text" name="loginField"></input><br><br>
            Password: <input type="text" name="pwdField"></input><br><br>
            <button type="submit">Send</button>
        </form>
    </body>
</html>
