package pe.edu.uni.sistacademico.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pe.edu.uni.sistacademico.db.AccesoDB;
import pe.edu.uni.sistacademico.dto.AlumnoDto;

public class SeguridadService {
    
    public AlumnoDto validar(String codigo, String clave){
        AlumnoDto dto = null;
        String sql = "select IDALUMNO ID, CODIGO, NOMBRE,";
        sql += " '*****' CLAVE from ALUMNO ";
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
            dto = new AlumnoDto();
            dto.setId(rs.getInt("ID"));
            dto.setCodigo(rs.getString("CODIGO"));
            dto.setNombre(rs.getString("NOMBRE"));
            dto.setClave(rs.getString("CLAVE"));
            rs.close();
            pstm.close();
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }  catch (Exception e) {
            throw new RuntimeException("Error en el proceso.");
        } finally{
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
        return dto;
    }
    
}
