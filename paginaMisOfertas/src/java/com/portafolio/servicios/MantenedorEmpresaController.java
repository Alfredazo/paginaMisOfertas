package com.portafolio.servicios;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MantenedorEmpresaController {

    @RequestMapping("mantenedorEmpresa.htm")
    public ModelAndView home() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("encargado/mantenedorEmpresa");
        return mav;
    }
}
