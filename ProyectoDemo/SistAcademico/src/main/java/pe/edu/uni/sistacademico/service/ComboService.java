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

	public List<ComboDto> getCursos(String ciclo, Integer idAlumno) {
		List<ComboDto> lista = new ArrayList<>();
		String sql = "select distinct C.IDCURSO id, C.NOMBRE etiqueta ";
		sql += "from CURSO C join PROG_CICLO P ";
		sql += "on C.IDCURSO = P.IDCURSO ";
		sql += "where CICLO = ? ";
		sql += "order by 2";
		Connection cn = null;
		PreparedStatement pstm;
		ResultSet rs;
		ComboDto dto;
		try {
			cn = AccesoDB.getConnection();
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, ciclo);
			rs = pstm.executeQuery();
			while (rs.next()) {
				dto = rowMapper(rs);
				lista.add(dto);
			}
			rs.close();
			pstm.close();
		} catch (SQLException e) {
			//e.printStackTrace();
		} finally {
			try {
				cn.close();
			} catch (Exception e) {
			}

		}
		return lista;
	}

	public List<ComboDto> getHorario(String ciclo, Integer IdCurso) {
		List<ComboDto> lista = new ArrayList<>();
		String sql = "select idprog id, horario etiqueta ";
		sql += "from PROG_CICLO ";
		sql += "where CICLO=? and IDCURSO= ? ";
		sql += "order by 2 ";
		Connection cn = null;
		PreparedStatement pstm;
		ResultSet rs;
		ComboDto dto;
		try {
			cn = AccesoDB.getConnection();
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, ciclo);
			pstm.setInt(2, IdCurso);
			rs = pstm.executeQuery();
			while (rs.next()) {
				dto = rowMapper(rs);
				lista.add(dto);
			}
			rs.close();
			pstm.close();
		} catch (SQLException e) {
			//e.printStackTrace();
		} finally {
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
