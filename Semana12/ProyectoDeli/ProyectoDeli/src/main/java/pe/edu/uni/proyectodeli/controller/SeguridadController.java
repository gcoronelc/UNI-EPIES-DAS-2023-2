/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.proyectodeli.controller;

import pe.edu.uni.proyectodeli.service.SeguridadService;
import pe.edu.uni.proyectodeli.dto.UsuarioDto;
import pe.edu.uni.proyectodeli.view.Session;

public class SeguridadController {
    
    public void validar(String codigo, String clave){
        SeguridadService service = new SeguridadService();
        UsuarioDto dto = service.validar(codigo, clave);
        Session.put("USUARIO", dto);
    }
}

