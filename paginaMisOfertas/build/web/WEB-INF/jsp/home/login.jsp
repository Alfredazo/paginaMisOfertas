<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <title>Iniciar sesión</title>

        <link href="<c:url value="/Resources/css/bootstrap.min.css"/>" rel="stylesheet">
        <link href="<c:url value="/Resources/font-awesome/css/font-awesome.css"/>" rel="stylesheet">

        <link href="<c:url value="/Resources/css/animate.css"/>" rel="stylesheet">
        <link href="<c:url value="/Resources/css/style.css"/>" rel="stylesheet">

    </head>

    <body class="gray-bg">

        <div class="loginColumns animated fadeInDown">
            <div class="row">

                <div class="col-md-6">
                    <h2 class="font-bold">Bienvenido a Mis Ofertas</h2>

                    <p>
                        El Sitio perfecto para tus compras online
                    </p>

                    <p>
                        Encontraras cientos de ofertas en todo el pais
                    </p>



                    <p>
                        <small>Todas las ofertas son exclusiva Responsabilidad de las tiendas asociadas</small>
                    </p>

                </div>
                <div class="col-md-6">
                    <div class="ibox-content">
                        <form:form class="m-t" method="post" value="login1" commandName="login1">
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Usuario" required="" id="txtNombreUsuario" name="txtNombreUsuario" value="<c:out value="${nombre}"/>" />
                            </div>
                            <div class="form-group">
                                <input type="password" class="form-control" placeholder="Contraseña" required=""id="txtClave" name="txtClave"/>
                            </div>
                            <button type="submit" class="btn btn-primary block full-width m-b" id="btnRegister" name="btnRegister" value="Register">Login</button>
                            <p class="text-muted text-center">
                                <small><c:out value="${errores}"/></small>
                            </p>
                            <a href="#">
                                <small>Olvidaste tu contraseña?</small>
                            </a>

                            <p class="text-muted text-center">
                                <small>No tienes Cuenta?</small>
                            </p>
                            <a class="btn btn-sm btn-white btn-block" href="registrar.htm">Crea un Cuenta</a>
                        </form:form>
                        <p class="m-t">
                            <small>Diseñado por grupo 1</small>
                        </p>
                    </div>
                </div>
            </div>
            <hr/>
            <div class="row">
                <div class="col-md-12 text-center">
                    Copyright Grupo1<small>© 2017</small>
                </div>
            </div>
        </div>

    </body>

</html>