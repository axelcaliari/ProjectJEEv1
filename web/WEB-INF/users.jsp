<%-- 
    Document   : users
    Created on : 19 déc. 2018, 09:44:30
    Author     : axelc
--%>

<%@page import="jee.model.Employees"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
      <title>Employees List Page</title>
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
    </head>
    <body>     
        <nav class="navbar navbar-expand-md">       
            <div class="navbar-collapse collapse w-100 order-3 dual-collapse2">
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="#" style="color:blue">
                            <%  
                                if(request.getSession(false) == null)
                                    out.println("No active session");
                                else
                                    out.println("Your session is active");
                            %>
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#"><img src="disconnect.PNG"></a>
                    </li>
                </ul>
            </div>
        </nav>
        <div class="container">
            <h2>List of Employees</h2>
            <form action="Controller" method="POST">
                <table class="table">
                    <thead class="thead-dark">
                        <tr>
                            <th>Sel</th>
                            <th>NAME</th>
                            <th>FIRSTNAME</th>
                            <th>HOMEPHONE</th>
                            <th>MOBILE<br> PHONE</th>
                            <th>WORK<br> PHONE</th>
                            <th>ADDRESS</th>
                            <th>POSTAL<br>CODE</th>
                            <th>CITY</th>
                            <th>EMAIL</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% 
                            ArrayList employees = (ArrayList)request.getAttribute("employeesList");
                            for(int i = 0; i < employees.size(); i++) {
                                Employees employee = (Employees)employees.get(i);
                        %>
                            <tr>     
                                <td><input type='radio' value='<%=employee.getId()%>' class='selected' name='selected' checked="checked"></td>
                                <td><%=employee.getName()%></td>
                                <td><%=employee.getFirstname()%></td>
                                <td><%=employee.getTelhome()%></td>
                                <td><%=employee.getTelmob()%></td>
                                <td><%=employee.getTelpro()%></td>
                                <td><%=employee.getAdress()%></td>
                                <td><%=employee.getPostalcode()%></td>
                                <td><%=employee.getCity()%></td>
                                <td><%=employee.getEmail()%></td>
                            </tr>
                        <% } %>                 
                    </tbody>
                </table>        
                <input type="submit" class='btn btn-primary' name="action" value="Delete">
                <input type="submit" class='btn btn-primary' name="action" value="Details">
                <input type="submit" class='btn btn-primary' name="action" value="Add">
            </form>
        </div>
    </body>
   
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
    
</html>
