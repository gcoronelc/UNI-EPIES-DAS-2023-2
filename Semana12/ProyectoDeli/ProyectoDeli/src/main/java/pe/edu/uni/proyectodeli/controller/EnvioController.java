/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.proyectodeli.controller;

import java.util.ArrayList;
import java.util.List;

import pe.edu.uni.proyectodeli.view.Session;
import pe.edu.uni.proyectodeli.dto.ClienteDto;
import pe.edu.uni.proyectodeli.dto.UsuarioDto;
import pe.edu.uni.proyectodeli.service.ClientesService;
import pe.edu.uni.proyectodeli.service.EnviosService;
import pe.edu.uni.proyectodeli.view.Mensaje;


public class EnvioController {
    public static List<String> validarCliente(String dni){
        ClientesService.obtenerClientes();
        ArrayList<ClienteDto> clientes = (ArrayList<ClienteDto>) Session.get("clientes");
        
        if(clientes.stream().anyMatch(cliente -> cliente.getDni().equals(dni))){
            int index = clientes.indexOf(clientes.stream().filter(cliente -> cliente.getDni().equals(dni)).findFirst().orElse(null));
            ClienteDto clienteExistente = clientes.get(index);
            return List.of(clienteExistente.getNombre() + " " + clienteExistente.getApellidoP() + " " + clienteExistente.getApellidoM(), clienteExistente.getDni());
        } else {
            Mensaje.error(null, "El emisor no se encuentra registrado. Por favor, registre al emisor.");
            return List.of("","");
        }
    }

    public static void generarVenta(Integer dni, List<Double> lista2,List<String> lista3){

        UsuarioDto usuario;
        Double total;

        ClienteDto cliente = ClientesService.obtenerCliente(dni);
        usuario = (UsuarioDto) Session.get("USUARIO");


        if (lista2.get(3)<1){
            total = 7.00;
        } else {
            total = lista2.get(3)*2 + 10.00;
        }


        EnviosService.generarEnvios(usuario.getId_usuario(), cliente.getId_cliente(), "pendiente", total, lista2, lista3);
    }
}