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
                    <c:forEach items="${employeesList}" var="employees">
                        <tr>      
                            <td><input type='checkbox' class='selected'></td>     
                            <td class='name'>${employees.name}</td>
                            <td class='firstName'>${employees.getFirstname()}</td>
                            <td>${employees.getTelhome()}</td>
                            <td>${employees.getTelmob()}</td>
                            <td>${employees.getTelpro()}</td>
                            <td>${employees.getAdress()}</td>
                            <td>${employees.getPostalcode()}</td>
                            <td>${employees.getCity()}</td>
                            <td>${employees.getEmail()}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <button class='btn btn-primary' onClick='deleteUser()'>Delete</button>
            <button class='btn btn-primary' onClick='detailsUser()'>Details</button>
            <a class='btn btn-primary' href='addUser.jsp'>Add an employee</a>
        </div>
    </body>
   
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
    
    <script>
        function deleteUser(){   
            var deleteList = [];
            $(".selected:checkbox:checked").each(function(){
                var name = $(this).parent().siblings().find('.name');
                var firstName = $(this).parent().siblings().find('.firstName');
                
                deleteList.push(name, firstName);
            });
            
            $.ajax({
                url: "Controller.java", 
                type: "POST",
                data: deleteList,
                success: function(result){
                    console.log(result);
                },
                error: function(data) {
                    alert(data);
                } 
            });
        }
        
        function detailsUser(){
            console.log("details");
        }    
    </script>
</html>
