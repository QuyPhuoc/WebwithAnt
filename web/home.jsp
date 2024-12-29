<%-- 
    Document   : home
    Created on : Oct 7, 2024, 10:03:52 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
    </head>
    <body>
        <h1>HOME</h1>
        <% 
            int n = 10;
            %>
            <% if(n % 2 == 0){ %>
            <h1> CHAN </h1> 
            <% } else {%>
            <h1>LE</h1>
            <%}%>
    </body> 
</html>
