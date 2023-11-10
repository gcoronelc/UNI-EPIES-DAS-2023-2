package pe.edu.uni.sistacademico.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pe.edu.uni.sistacademico.db.AccesoDB;
import pe.edu.uni.sistacademico.dto.ComboDto;

public class ComboService {

    public List<ComboDto> getCursos(String ciclo, Integer idAlumno){
        List<ComboDto>lista = new ArrayList<>();
        String sql = "SELECT idcurso id, nombre etiqueta FROM CURSO";
        Connection cn = null;
        PreparedStatement pstm;
        ResultSet rs;
        ComboDto dto;
        try {
            cn = AccesoDB.getConnection();
            pstm = cn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while(rs.next()){
                dto = rowMapper(rs);
                lista.add(dto);
            }
            rs.close();
            pstm.close();
        } catch (Exception e) {  
            //e.printStackTrace();
        } finally{
            try {
                cn.close();
            } catch (Exception e) {
            }
   
        }
        return lista;
    }

    private ComboDto rowMapper(ResultSet rs) throws SQLException {
        ComboDto dto = new ComboDto();
        dto.setId(rs.getInt("id"));
        dto.setEtiqueta(rs.getString("etiqueta"));
        return dto;
    }

    
}
