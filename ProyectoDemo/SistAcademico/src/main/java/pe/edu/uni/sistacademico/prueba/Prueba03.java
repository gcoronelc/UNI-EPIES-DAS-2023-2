package pe.edu.uni.sistacademico.prueba;

import pe.edu.uni.sistacademico.dto.MatriculaDto;
import pe.edu.uni.sistacademico.service.AcademicosService;

public class Prueba03 {
    
    public static void main(String[] args) {
        
        try {
            // Datos
            MatriculaDto dto = new MatriculaDto();
            dto.setIdAlumno(5);
            dto.setCiclo("20231");
            dto.setCursos(new Integer[]{4,7,3,8});
            // Proceso
            AcademicosService service = new AcademicosService();
            dto = service.matricular(dto);
            System.out.println("ID: " + dto.getIdMatricula());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
        
    }
}
