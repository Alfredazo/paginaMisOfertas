package com.portafolio.servicios;

import java.sql.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.ws.Dispatch;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.Service;
import java.io.StringReader;

@Controller
@RequestMapping("registrar.htm")
public class RegistroUsuarioController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView cargarPaginaRegistro() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("home/registroUsuario");
        return mav;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView registrarse(HttpServletRequest request) {
        /*Rescatar Datos*/
        boolean error = false;
        String nombreUsuario = request.getParameter("nombreUsuario");
        String mensajeNombre = "";
        String nombreDevuelta= "";
        if (nombreUsuario.isEmpty()) {
            error = true;
            mensajeNombre = "El nombre no debe venir vacio";
        }else{
//            if (comprobarNombreUsuario(nombreUsuario)) {
//                
//            }
            nombreDevuelta = nombreUsuario;
        }
        
        
        
        String email = request.getParameter("email");
        String mensajeEmail = "";
        String mensajeDevuelta= "";
        if (nombreUsuario.isEmpty()) {
            error = true;
            mensajeEmail = "El email no debe venir vacio";
        }else{
            mensajeDevuelta = email;
        }

        String clave = request.getParameter("clave");
        String repetirClave = request.getParameter("repetirClave");
        int puntosAcumulados = 0;
        int nivelUsuario = 0;
        String urlImagen = request.getParameter("urlImagen");
        /*Agregar usuario*/

 /*Persona*/
        String rut = request.getParameter("rut");
        String primerNombre = request.getParameter("primerNombre");
        String segundoNombre = request.getParameter("segundoNombre");
        String fechaNacimiento = request.getParameter("fechaNacimiento");
        String direccion = request.getParameter("direccion");
        int telefono = Integer.parseInt(request.getParameter("telefono"));
        int idUsuarioPersona = retornarUltimoIDUsuario();

        ModelAndView mav = new ModelAndView();
        mav.setViewName("home/registroUsuario");
        return mav;
    }

    

    

    private static int retornarUltimoIDUsuario() {
        com.portafolio.servicios.WSGestionarUsuario_Service service = new com.portafolio.servicios.WSGestionarUsuario_Service();
        com.portafolio.servicios.WSGestionarUsuario port = service.getWSGestionarUsuarioPort();
        return port.retornarUltimoIDUsuario();
    }

    private static boolean comprobarNombreUsuario(java.lang.String nombreUsuario) {
        com.portafolio.servicios.WSGestionarUsuario_Service service = new com.portafolio.servicios.WSGestionarUsuario_Service();
        com.portafolio.servicios.WSGestionarUsuario port = service.getWSGestionarUsuarioPort();
        return port.comprobarNombreUsuario(nombreUsuario);
    }

    private static boolean comprobarsiExisteEmail(java.lang.String emailUsuario) {
        com.portafolio.servicios.WSGestionarUsuario_Service service = new com.portafolio.servicios.WSGestionarUsuario_Service();
        com.portafolio.servicios.WSGestionarUsuario port = service.getWSGestionarUsuarioPort();
        return port.comprobarsiExisteEmail(emailUsuario);
    }
    
    

    
    
}
