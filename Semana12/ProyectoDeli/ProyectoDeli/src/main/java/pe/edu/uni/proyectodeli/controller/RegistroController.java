package pe.edu.uni.proyectodeli.controller;

import java.util.ArrayList;

import pe.edu.uni.proyectodeli.view.Session;
import pe.edu.uni.proyectodeli.dto.ClienteDto;
import pe.edu.uni.proyectodeli.service.ClientesService;
import pe.edu.uni.proyectodeli.view.Mensaje;

public class RegistroController {
    public void validarCliente(String nombre, String apellidoP, String apellidoM, String dni, String correo, String clave) {

        ClientesService.obtenerClientes();
        ArrayList<ClienteDto> clientes = (ArrayList<ClienteDto>) Session.get("clientes");

        if (clientes.stream().anyMatch(cliente -> cliente.getDni().equals(dni))) {
            // Cliente ya registrado, validar datos
            int index = clientes.indexOf(clientes.stream().filter(cliente -> cliente.getDni().equals(dni)).findFirst().orElse(null));
            ClienteDto clienteExistente = clientes.get(index);
            boolean datosIncorrectos = false;
            boolean flag;

            StringBuilder mensajeError = new StringBuilder("Error: Los siguientes datos del cliente no coinciden: ");

            if (!clienteExistente.getNombre().equals(nombre)) {
                mensajeError.append("nombre, ");
                datosIncorrectos = true;
            }
            if (!clienteExistente.getApellidoP().equals(apellidoP)) {
                mensajeError.append("apellido paterno, ");
                datosIncorrectos = true;
            }
            if (!clienteExistente.getApellidoM().equals(apellidoM)) {
                mensajeError.append("apellido materno, ");
                datosIncorrectos = true;
            }
            if (!clienteExistente.getCorreo().equals(correo)) {
                mensajeError.append("correo, ");
                datosIncorrectos = true;
            }
            if (clienteExistente.getClave() != null && !clienteExistente.getClave().equals(clave)) {
                mensajeError.append("clave, ");
                datosIncorrectos = true;
            }

            if (datosIncorrectos) {
                mensajeError.delete(mensajeError.length() - 2, mensajeError.length()); // Eliminar la última coma y espacio
                flag = Mensaje.confirm(null, mensajeError.toString() + ". ¿Desea actualizar los datos del cliente?");

                if(flag){
                    ClientesService.updateCliente(nombre, apellidoP, apellidoM, dni, correo, clave);
                    Mensaje.info(null, "Los datos del cliente se han actualizado correctamente.");
                    System.out.println("Los datos del cliente se han actualizado correctamente.");
                } else {
                    Mensaje.info(null, "Los datos del cliente no se han actualizado.");
                    System.out.println("Los datos del cliente no se han actualizado.");
                }

            } else {
                Mensaje.info(null, "El cliente ya se encuentra registrado.");
                System.out.println("El cliente ya se encuentra registrado.");
            }
        } else {
            // Cliente no registrado, registrar
            ClientesService.addCliente(nombre, apellidoP, apellidoM, dni, correo, clave);

            Mensaje.info(null, "El cliente se ha registrado correctamente.");
            System.out.println("El cliente se ha registrado correctamente.");
        }
    }
}