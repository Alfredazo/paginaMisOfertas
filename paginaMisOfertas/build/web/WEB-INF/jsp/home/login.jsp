<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>        
        <form:form method="post" value="login1" commandName="login1">
            <h1>Iniciar Sesión</h1>          
            Nombre Usuario o Email:<input class ="iptRegister" type="text" id="txtNombreUsuario" name="txtNombreUsuario" value="<c:out value="${nombre}"/>" />
            <br>
            Nombre Contraseña:<input class ="iptRegister" type="password" id="txtClave" name="txtClave"/>
            <br>            
            <input type="submit" id="btnRegister" name="btnRegister" value="Register" onclick="" style="cursor:pointer"/>
        </form:form>
        <c:out value="${errores}"/>
         
            
            
            


    </body>
</html>
