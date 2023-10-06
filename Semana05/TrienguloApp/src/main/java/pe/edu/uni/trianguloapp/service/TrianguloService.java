package pe.edu.uni.trianguloapp.service;

public class TrianguloService {

	/**
	 * Verifica si los lados de un triangulo son validos para formar el triangulo.
	 *
	 * @param ladoA Valor del lado a.
	 * @param ladoB Valor del lado b.
	 * @param ladoC Valor del lado c.
	 * @return Retorna true si es un triangulo valido.
	 */
	public boolean esValido(int ladoA, int ladoB, int ladoC) {
		// Variables
		boolean respuesta;
		// Proceso
		boolean c1 = (ladoA + ladoB) > ladoC;
		boolean c2 = (ladoA + ladoC) > ladoB;
		boolean c3 = (ladoB + ladoC) > ladoA;
		respuesta = c1 && c2 && c3;
		// Reporte
		return respuesta;
	}

	/**
	 * Calcula el perimetro de un triangulo.
	 *
	 * @param ladoA Valor del lado a.
	 * @param ladoB Valor del lado b.
	 * @param ladoC Valor del lado c.
	 * @return Retorna el perimetro si el triangulo es valido, caso contrario retorna -1.
	 */
	public int perimetro(int ladoA, int ladoB, int ladoC) {
		// Variables
		int p;
		// Proceso
		p = -1; // Punto de partida, triangulo invalido.
		if (esValido(ladoA, ladoB, ladoC)) {
			p = ladoA + ladoB + ladoC;
		}
		// Reporte
		return p;
	}

	/**
	 * Calcula el area de un triangulo.
	 * @param ladoA Valor del lado a.
	 * @param ladoB Valor del lado b.
	 * @param ladoC Valor del lado c.
	 * @return Retorna el area del triangulo si es valido, caso contrario retorna -1.
	 */
	public double area(int ladoA, int ladoB, int ladoC){
		// Variables
		double area;
		// Proceso
		area = -1; // Punto de partida, triangulo invalido.
		if (esValido(ladoA, ladoB, ladoC)) {
			int sp = (ladoA + ladoB + ladoC) / 2;
			area = Math.sqrt(sp*(sp-ladoA)*(sp-ladoB)*(sp-ladoC));
		}
		// Reporte
		return area;
	}
	
}
