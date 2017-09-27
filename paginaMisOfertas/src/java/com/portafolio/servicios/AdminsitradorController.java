package com.portafolio.servicios;

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
        mav.addObject("nombreSesion",nombre);
        return mav;
    }

}
