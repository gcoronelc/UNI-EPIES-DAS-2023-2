package pe.edu.uni.sistacademico.controller;

import pe.edu.uni.sistacademico.dto.AlumnoDto;
import pe.edu.uni.sistacademico.service.SeguridadService;
import pe.edu.uni.ventapasajes.util.Session;

public class SeguridadController {
    
    public void validar(String codigo, String clave){
        SeguridadService service = new SeguridadService();
        AlumnoDto dto = service.validar(codigo, clave);
        Session.put("USUARIO", dto);
    }
}
