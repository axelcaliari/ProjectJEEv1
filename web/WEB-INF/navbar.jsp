<%-- 
    Document   : navbar
    Created on : 10 janv. 2019, 17:24:40
    Author     : axelc
--%>

<%@ page language="java"%>

<nav class="navbar navbar-expand-md">       
    <div class="navbar-collapse collapse w-100 order-3 dual-collapse2">
        <ul class="navbar-nav ml-auto">
            <li class="nav-item">
                <p class="nav-link" style="color:blue">
                    <%  
                        if(request.getSession(false) == null)
                            out.println("No active session");
                        else
                            out.println("Your session is active");
                    %>
                </p>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="Controller?logout=true"><img src="disconnect.PNG"></a>
            </li>
        </ul>
    </div>
</nav>
