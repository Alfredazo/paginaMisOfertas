/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portafolio.servicios;

import java.util.ArrayList;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("consumidor.htm")
public class ConsumidorController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView consumidor(HttpSession sesion) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("consumidor/consumidor");
        String nombre = (String) sesion.getAttribute("nombre");

//        ArrayList<PersonaUsuario> listado;
//        PersonaUsuario dato = null;
//        listado = (ArrayList<PersonaUsuario>) sesion.getAttribute("listadoPersonas");          
        mav.addObject("nombreSesion", nombre);
//        mav.addObject("listadoPersonas",listado);
//        mav.addObject("dato",dato);
        return mav;

    }
}
