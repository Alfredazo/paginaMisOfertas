package com.portafolio.servicios;

import java.sql.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
        String nombreUsuario = request.getParameter("nombreUsuario");
        String email = request.getParameter("email");
        String clave = request.getParameter("clave");
        String repetirClave = request.getParameter("repetirClave");
        int puntosAcumulados = 0;
        int nivelUsuario = 0;
        String urlImagen = request.getParameter("urlImagen");
        
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
        com.portafolio.service.WSGestionarUsuario_Service service = new com.portafolio.service.WSGestionarUsuario_Service();
        com.portafolio.service.WSGestionarUsuario port = service.getWSGestionarUsuarioPort();
        return port.retornarUltimoIDUsuario();
    }
}
