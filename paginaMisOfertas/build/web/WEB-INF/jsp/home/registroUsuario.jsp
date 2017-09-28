<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">


        <link href="<c:url value="/Resources/css/bootstrap.min.css" />" rel="stylesheet">
        <link href="<c:url value="/Resources/font-awesome/css/font-awesome.css" />" rel="stylesheet">
        <link href="<c:url value="/Resources/css/plugins/iCheck/custom.css" />" rel="stylesheet">
        <<link href="<c:url value="/Resources/css/animate.css" />" rel="stylesheet">
        <link href="<c:url value="/Resources/css/style.css"/>" rel="stylesheet" >
        <link href="<c:url value="/Resources/css/plugins/dropzone/basic.css" />t" rel="styleshee">
        <link href="<c:url value="/Resources/css/plugins/dropzone/dropzone.css" />" rel="stylesheet">
        <link href="<c:url value="/Resources/css/plugins/jasny/jasny-bootstrap.min.css"/>" rel="stylesheet" >
        <link href="<c:url value="/Resources/css/plugins/codemirror/codemirror.css" />" rel="stylesheet">

        <title>Registro</title>
    </head>

    <body class="gray-bg">

        <div class="middle-box text-center loginscreen   animated fadeInDown">
            <div>
                <h3>Registro en MisOfertas</h3>
                <p>Creación de cuenta</p>
                <form class="m-t" role="form" method="post" >
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="Usuario" required="" name="nombreUsuario" value="<c:out value="${nombreValue}"/>">
                        <c:out value="${nombreError}"/>

                    </div>
                    <div class="form-group">
                        <input type="email" class="form-control" placeholder="Email" required=""  name="email"  value="<c:out value="${emailValue}"/>" >
                        <c:out value="${emailError}"/>
                    </div>
                    <div class="form-group">
                        <input type="password" class="form-control" placeholder="Contraseña" required=""  name="clave">
                    </div>
                    <div class="form-group">
                        <input type="password" class="form-control" placeholder="Repita Contraseña" required=""  name="repetirClave">
                        <c:out value="${claveError}"/>
                    </div>

                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="Rut" required=""  name="rut" value="<c:out value="${rutValue}"/>">
                        <c:out value="${errorRut}"/>
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="Primer Nombre" required=""  name="primerNombre" value="<c:out value="${primerNValue}"/>">
                        <c:out value="${errorPrimerN}"/>
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="Segundo Nombre" required=""  name="segundoNombre" value="<c:out value="${segundoNValue}"/>">
                        <c:out value="${errorSegundoN}"/>
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="Primer Apellido" required=""  name="primerApellido" value="<c:out value="${primerApellidoDevuelta}"/>">
                        <c:out value="${errorPrimerA}"/>
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="Segundo Apellido" required="" name="segundoApellido" value="<c:out value="${segundoApellidoDevuelta}"/>">
                        <c:out value="${errorSegundoA}"/>
                    </div>
                    <div class="form-group">
                        <input type="date" class="form-control" placeholder="Fecha de nacimiento" required=""  name="fechaNacimiento" value="<c:out value="${fechaValue}"/>">
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="Dirección" required=""  name="direccion" value="<c:out value="${direccionValue}"/>">
                        <c:out value="${errorDireccion}"/>
                    </div>
                    <div class="form-group">
                        <input type="number" class="form-control" placeholder="Telefono" required=""  name="telefono" value="<c:out value="${telefonoValue}"/>">
                        <c:out value="${errorTelefono}"/>
                    </div>
                    <!--
                    <div class="fileinput fileinput-new input-group" data-provides="fileinput">
                        <span class="input-group-addon btn btn-default btn-file">
                            <span class="fileinput-new">Subir imagen de perfil</span>
                            <span class="fileinput-exists">Cargar</span>
                            <input type="file"  name="urlImagen"/>
                        </span>
                        <div class="form-control" data-trigger="fileinput">
                            <i class="glyphicon glyphicon-file fileinput-exists"></i>
                            <span class="fileinput-filename"></span>
                        </div>

                        <a href="#" class="input-group-addon btn btn-default fileinput-exists" data-dismiss="fileinput">Remover</a>
                    </div>
                    -->
                    <div class="form-group">
                        <div class="checkbox i-checks"><label> <input type="checkbox"><i></i> Acepta los terminos </label></div>
                    </div>
                    <button type="submit" class="btn btn-primary block full-width m-b">Registrar</button>

                    <p class="text-muted text-center"><small>Ya tienes cuenta?</small></p>
                    <a class="btn btn-sm btn-white btn-block" href="login.htm">Ingresar</a>
                </form>
                <p class="m-t"> <small>Grupo 1&copy; 2017</small> </p>
            </div>
        </div>

        <!-- Mainly scripts -->

        <script src="<c:url value="/Resources/js/jquery-3.1.1.min.js" />"></script>
        <script src="<c:url value="/Resources/js/bootstrap.min.js" />"></script>
        <!-- iCheck -->
        <script src="<c:url value="/Resources/js/plugins/iCheck/icheck.min.js"/>"</script>
        <script>
            $(document).ready(function () {
                $('.i-checks').iCheck({
                    checkboxClass: 'icheckbox_square-green',
                    radioClass: 'iradio_square-green',
                });
            });
        </script>
    </body>

</html>

