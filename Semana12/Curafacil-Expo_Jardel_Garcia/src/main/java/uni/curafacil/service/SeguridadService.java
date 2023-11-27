package uni.curafacil.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import uni.curafacil.db.AccesoDB;
import uni.curafacil.dto.EmpleadoDto;

public class SeguridadService {
    
    public EmpleadoDto validar(String codigo, String clave){
        EmpleadoDto dto = null;
        String sql = "select ID_EMPLEADO AS ID, CODIGO, NOMBRE, APELLIDO,  CLAVE, CARGO ";
        sql += "from EMPLEADOS ";
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
            dto = new EmpleadoDto();
            dto.setId_empleado(rs.getString("ID"));
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
