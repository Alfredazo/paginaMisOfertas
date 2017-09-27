/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portafolio.servicios;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("encargado.htm")
public class EncargadoController {
    
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView encargado(HttpSession sesion) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("encargado/encargado");
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
