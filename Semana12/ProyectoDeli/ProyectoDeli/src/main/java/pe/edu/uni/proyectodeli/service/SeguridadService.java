/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.proyectodeli.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pe.edu.uni.proyectodeli.dto.UsuarioDto;
import pe.edu.uni.proyectodeli.dbo.AccesoDB;

public class SeguridadService {
    
    public UsuarioDto validar(String codigo, String clave){
        UsuarioDto dto = null;
        String sql = "select ID_EMPLEADO AS ID, CODIGO, NOMBRE, APELLIDO,  CLAVE, CARGO ";
        sql += "from USUARIOS ";
        sql += "WHERE CODIGO = ? AND CLAVE = ?";
        PreparedStatement pstm;
        ResultSet rs;
        Connection cn = null;
        try {
            cn = AccesoDB.getConnection();
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, codigo);
            pstm.setString(2, clave);
            rs = pstm.executeQuery();
            if(!rs.next()){
                throw new SQLException("Los datos son incorrectos.");
            }
            dto = new UsuarioDto();
            dto.setId_usuario(rs.getInt("ID"));
            dto.setCodigo(rs.getString("CODIGO"));
            dto.setNombre(rs.getString("NOMBRE"));
            dto.setApellido(rs.getString("APELLIDO"));
            dto.setCargo(rs.getString("CARGO"));
            rs.close();
            pstm.close();
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }  catch (Exception e) {
            throw new RuntimeException("Error en el proceso.");
        } finally{
            if (cn != null) {
                try {
                    cn.close();
                } catch (SQLException e) {
                }
            }
        }
        return dto;
    }
    
}
