package pe.edu.uni.sistacademico.prueba;

import pe.edu.uni.sistacademico.dto.MatriculaDto;
import pe.edu.uni.sistacademico.service.AcademicosService;

public class Prueba04 {
    
    public static void main(String[] args) {
        
        try {
            // Datos
            String ciclo;
            // Proceso
            AcademicosService service = new AcademicosService();
            ciclo = service.getCicloActual();
				// Reporte
            System.out.println("Ciclo: " + ciclo);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
    }
}
