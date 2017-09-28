package com.portafolio.servicios;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MantenedorUsuarioController {

    @RequestMapping("mantenedorUsuario.htm")
    public ModelAndView home() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("encargado/mantenedorUsuario");
        return mav;
    }
}