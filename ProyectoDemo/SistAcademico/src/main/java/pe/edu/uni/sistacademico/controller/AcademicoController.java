package pe.edu.uni.sistacademico.controller;

import pe.edu.uni.sistacademico.dto.MatriculaDto;
import pe.edu.uni.sistacademico.service.AcademicosService;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 * @cursos gcoronelc.github.io
 */
public class AcademicoController {
	
	private AcademicosService academicosService;

	public AcademicoController() {
		academicosService = new AcademicosService();
	}
	
	public String getCicloActual() {
		return academicosService.getCicloActual();
	}

	public MatriculaDto matricular(MatriculaDto dto) {
		return academicosService.matricular(dto);
	}
}
