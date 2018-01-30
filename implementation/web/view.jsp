<%-- 
    Document   : view
    Created on : 30/01/2018, 16:08:22
    Author     : es
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            out.print(request.getParameter("data"));
        %>
        <h1>Hello World!</h1>
    </body>
</html>
