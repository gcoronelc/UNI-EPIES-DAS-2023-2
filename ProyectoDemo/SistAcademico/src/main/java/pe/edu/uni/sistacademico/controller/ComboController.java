package pe.edu.uni.sistacademico.controller;

import java.util.List;
import pe.edu.uni.sistacademico.dto.ComboDto;
import pe.edu.uni.sistacademico.service.ComboService;

public class ComboController {
 
    private ComboService comboService;

    public ComboController() {
        comboService = new ComboService();
    }
    
    public List<ComboDto> getCursos(String ciclo, Integer idAlumno){
        return comboService.getCursos(ciclo, idAlumno);
    }
	 
	 public List<ComboDto> getHorario(String ciclo, Integer IdCurso) {
		 return comboService.getHorario(ciclo, IdCurso);
	 }
}
