package pe.edu.uni.sistacademico.prueba;

import pe.edu.uni.sistacademico.dto.AlumnoDto;
import pe.edu.uni.sistacademico.service.SeguridadService;

public class Prueba02 {
    
    public static void main(String[] args) {
        try {
            // Datos
            String codigo = "20210001A";
            String clave = "JFAM";
            // Proceso
            SeguridadService service = new SeguridadService();
            AlumnoDto dto = service.validar(codigo, clave);
            // Reporte
            System.out.println("Hola: " + dto.getNombre());
            System.out.println("Clave: " + dto.getClave());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
                
    }
    
}
