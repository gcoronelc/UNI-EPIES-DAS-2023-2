package pe.edu.uni.proyectocombo.service;

import java.util.ArrayList;
import java.util.List;
import pe.edu.uni.proyectocombo.model.ComboModel;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 * @cursos gcoronelc.github.io
 */
public class ComboService {
	
	
	public List<ComboModel> getClientes(){
		List<ComboModel> lista = new ArrayList<>();
		lista.add(new ComboModel("01", "Juan Perez"));
		lista.add(new ComboModel("02", "Jorge Torres"));
		lista.add(new ComboModel("03", "Pedro Vargas"));
		lista.add(new ComboModel("04", "Mariela Zaneti"));
		lista.add(new ComboModel("05", "Tula Rodriguez"));
		return lista;
	}

}
