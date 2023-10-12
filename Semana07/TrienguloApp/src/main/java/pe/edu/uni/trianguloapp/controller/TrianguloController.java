package pe.edu.uni.trianguloapp.controller;

import pe.edu.uni.trianguloapp.service.TrianguloService;

public class TrianguloController {
	
	private TrianguloService service;

	public TrianguloController() {
		service = new TrianguloService();
	}
	
	public boolean esValido(int ladoA, int ladoB, int ladoC) {
		return service.esValido(ladoA, ladoB, ladoC);
	}

	public int perimetro(int ladoA, int ladoB, int ladoC) {
		return service.perimetro(ladoA, ladoB, ladoC);
	}

	public double area(int ladoA, int ladoB, int ladoC) {
		return service.area(ladoA, ladoB, ladoC);
	}
	
}
