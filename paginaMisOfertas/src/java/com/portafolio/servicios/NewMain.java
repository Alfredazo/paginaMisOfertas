/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portafolio.servicios;

/**
 *
 * @author Alfredazo
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("El resultado es:"+ingresarUsuario("papa", "123"));
        System.out.println(hello("prueba01"));
        
    }

    private static boolean ingresarUsuario(java.lang.String nombreUsuario, java.lang.String claveUsuario) {
        com.portafolio.servicios.WSGestionarUsuario_Service service = new com.portafolio.servicios.WSGestionarUsuario_Service();
        com.portafolio.servicios.WSGestionarUsuario port = service.getWSGestionarUsuarioPort();
        return port.ingresarUsuario(nombreUsuario, claveUsuario);
    }

    private static String hello(java.lang.String name) {
        com.portafolio.servicios.WSGestionarUsuario_Service service = new com.portafolio.servicios.WSGestionarUsuario_Service();
        com.portafolio.servicios.WSGestionarUsuario port = service.getWSGestionarUsuarioPort();
        return port.hello(name);
    }
    
}
