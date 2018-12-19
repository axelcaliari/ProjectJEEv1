<%-- 
    Document   : users
    Created on : 19 déc. 2018, 09:44:30
    Author     : axelc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
      <title>Employees List PAge</title>
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
      <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
      <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container">
            <h2>List of Employees</h2>
            <table class="table">
                <thead class="thead-dark">
                    <tr>
                        <th>Sel</th>
                        <th>NAME</th>
                        <th>FISRTNAME</th>
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
                    <tr>
                        <td> <input type =checkbox> </td>
                        <td>Jones</td>
                        <td>Bourne</td>
                        <td>Stark</td>
                    </tr>
                    <tr>
                        <td>July</td>
                        <td>Dooley</td>
                        <td>july@example.com</td>
                    </tr>
                </tbody>
            </table>
        </div>
    </body>
</html>
