<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello desde Home!</h1>
        Session <c:out value="${session}"/>
        <br>
        Session <c:out value="${nombre}"/>
         <br>
        Session <c:out value="${clave}"/>
    </body>
</html>
