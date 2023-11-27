package pe.edu.uni.proyectodeli.controller;

import java.util.ArrayList;
import java.util.List;

import pe.edu.uni.proyectodeli.view.Session;
import pe.edu.uni.proyectodeli.dto.ClienteDto;
import pe.edu.uni.proyectodeli.dto.UsuarioDto;
import pe.edu.uni.proyectodeli.service.ClientesService;
import pe.edu.uni.proyectodeli.service.EnviosService;

public class EnvioController {

	/**
	 * Si existe el DNI, retorna los datos del cliente.
	 * @param dni DNI del cliente
	 * @return Retorna el registro del cliente.
	 */
	public static ClienteDto validarCliente(String dni) {
		return ClientesService.obtenerCliente(dni);
	}

	public static void generarVenta(String dni, List<Double> lista2, List<String> lista3) {

		UsuarioDto usuario;
		Double total;

		ClienteDto cliente = ClientesService.obtenerCliente(dni);
		usuario = (UsuarioDto) Session.get("USUARIO");

		if (lista2.get(3) < 1) {
			total = 7.00;
		} else {
			total = lista2.get(3) * 2 + 10.00;
		}

		EnviosService.generarEnvios(usuario.getId_usuario(), cliente.getId_cliente(), "pendiente", total, lista2, lista3);
	}
}
