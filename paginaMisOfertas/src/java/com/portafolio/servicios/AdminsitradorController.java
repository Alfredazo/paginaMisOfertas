package com.portafolio.servicios;

import java.util.ArrayList;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminsitradorController {
    @RequestMapping("administrador.htm")
    public ModelAndView administrador(HttpSession sesion) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("home/administrador");
        String nombre = (String)sesion.getAttribute("nombre");
        
        ArrayList<PersonaUsuario> listado;
        PersonaUsuario dato = null;
        listado = (ArrayList<PersonaUsuario>) sesion.getAttribute("listadoPersonas");          
            
         
  
  
        mav.addObject("nombreSesion",nombre);
        mav.addObject("listadoPersonas",listado);
        mav.addObject("dato",dato);
        return mav;
    }

}
