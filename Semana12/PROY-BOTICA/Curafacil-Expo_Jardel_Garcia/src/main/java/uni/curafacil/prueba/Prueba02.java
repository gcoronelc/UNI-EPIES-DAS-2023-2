package uni.curafacil.prueba;

import uni.curafacil.dto.EmpleadoDto;
import uni.curafacil.service.SeguridadService;

public class Prueba02 {

	public static void main(String[] args) {

		try {
			// Datos
			String codigo = "A1B2";
			String clave = "1234";
			// Proceso
			SeguridadService service = new SeguridadService();
			EmpleadoDto dto = service.validar(codigo, clave);
			// Reporte
			System.out.println("Hola: " + dto.getNombre());
			System.out.println("Clave: " + dto.getClave());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
