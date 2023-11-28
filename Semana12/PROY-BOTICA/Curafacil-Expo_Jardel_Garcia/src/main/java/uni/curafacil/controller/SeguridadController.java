package uni.curafacil.controller;

import uni.curafacil.dto.EmpleadoDto;
import uni.curafacil.service.SeguridadService;
import uni.curafacil.view.Session;

public class SeguridadController {
    
    public void validar(String codigo, String clave){
        SeguridadService service = new SeguridadService();
        EmpleadoDto dto = service.validar(codigo, clave);
        Session.put("USUARIO", dto);
    }
}
