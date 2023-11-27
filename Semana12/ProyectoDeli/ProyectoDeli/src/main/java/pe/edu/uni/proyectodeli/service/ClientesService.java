/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.proyectodeli.service;

/**
 * Clase que contiene los métodos para el manejo de los clientes.
 * Los métodos son: obtener todos los datos de los clientes actuales.
 * 
 * @version 1.0
 * @ksince 2021-05-16
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import pe.edu.uni.proyectodeli.view.Session;
import pe.edu.uni.proyectodeli.dbo.AccesoDB;
import pe.edu.uni.proyectodeli.dto.ClienteDto;


public class ClientesService {

    public static void addCliente(String nombre, String apellidoP, String apellidoM, String dni, String correo, String clave) {
        Connection cn = null;
        try {
            cn = AccesoDB.getConnection();
            String sql = "insert into clientes(nombre, apellidoP, apellidoM, dni, correo, clave) values(?,?,?,?,?,?)";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, nombre);
            pstm.setString(2, apellidoP);
            pstm.setString(3, apellidoM);
            pstm.setString(4, dni);
            pstm.setString(5, correo);
            pstm.setString(6, clave);
            pstm.executeUpdate();
            pstm.close();
        } catch (SQLException e) {
            throw new RuntimeException("Error al registrar al cliente.", e);
        } catch (Exception e) {
            throw new RuntimeException("Error al registrar al cliente.", e);
        } finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
        obtenerClientes();
    }

    public static ArrayList<ClienteDto> obtenerClientes() {
        ArrayList<ClienteDto> clientes = new ArrayList<>();
        Connection cn = null;
        try {
            cn = AccesoDB.getConnection();
            String sql = "select * from clientes";
            try (PreparedStatement pstm = cn.prepareStatement(sql)) {
                ResultSet rs = pstm.executeQuery();
                while (rs.next()) {
                    ClienteDto cliente = new ClienteDto();
                    cliente.setId_cliente(rs.getInt("ID_CLIENTE"));
                    cliente.setNombre(rs.getString("nombre"));
                    cliente.setApellidoM(rs.getString("apellidoM"));
                    cliente.setApellidoP(rs.getString("apellidoP"));
                    cliente.setDni(rs.getString("DNI"));
                    cliente.setCorreo(rs.getString("correo"));
                    cliente.setCelular(rs.getInt("celular"));
                    
                    clientes.add(cliente);
                }
                rs.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al obtener los clientes.", e);
        } catch (Exception e) {
            throw new RuntimeException("Error al obtener los clientes.", e);
        } finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
        return clientes;
    }

    public static void updateCliente(String nombre, String apellidoP, String apellidoM, String dni, String correo, String clave) {
        Connection cn = null;
        try {
            cn = AccesoDB.getConnection();
            String sql = "update clientes set nombre=?, apellidoP=?, apellidoM=?, correo=?, clave=? where dni=?";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, nombre);
            pstm.setString(2, apellidoP);
            pstm.setString(3, apellidoM);
            pstm.setString(4, correo);
            pstm.setString(5, clave);
            pstm.setString(6, dni);
            pstm.executeUpdate();
            pstm.close();
        } catch (SQLException e) {
            throw new RuntimeException("Error al actualizar los datos del cliente.", e);
        } catch (Exception e) {
            throw new RuntimeException("Error al actualizar los datos del cliente.", e);
        } finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
        obtenerClientes();
    }

    public static ClienteDto obtenerCliente(String dni){
        ClienteDto clienteExistente = null;
        Connection cn = null;
        try {
            cn = AccesoDB.getConnection();
            String sql = "select * from clientes where dni = ?";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, dni);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                clienteExistente = new ClienteDto();
                clienteExistente.setId_cliente(rs.getInt("ID_CLIENTE"));
                clienteExistente.setNombre(rs.getString("nombre"));
                clienteExistente.setApellidoM(rs.getString("apellidoM"));
                clienteExistente.setApellidoP(rs.getString("apellidoP"));
                clienteExistente.setDni(rs.getString("DNI"));
                clienteExistente.setCorreo(rs.getString("correo"));
                clienteExistente.setCelular(rs.getInt("celular"));
            }
            rs.close();
            pstm.close();
        } catch (SQLException e) {
            throw new RuntimeException("Error al obtener los clientes.", e);
        } catch (Exception e) {
            throw new RuntimeException("Error al obtener los clientes.", e);
        } finally {
            try {
                cn.close();
            } catch (SQLException e) {
            }
        }
        return clienteExistente;
    }

}
