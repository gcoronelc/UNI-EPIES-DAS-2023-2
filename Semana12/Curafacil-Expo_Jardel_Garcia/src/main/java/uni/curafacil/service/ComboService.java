package uni.curafacil.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import uni.curafacil.db.AccesoDB;
import uni.curafacil.dto.ComboDto;

public class ComboService {
	
	Integer i=1;

	public List<ComboDto> getCodigos() {
		List<ComboDto> lista = new ArrayList<>();
		String sql = "SELECT CODIGO, DESCRIPCION ";
		sql += "FROM PRODUCTOS ";
		Connection cn = null;
		PreparedStatement pstm;
		ResultSet rs;
		ComboDto dto;
		try {
			cn = AccesoDB.getConnection();
			pstm = cn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while (rs.next()) {
				dto = rowMapper(rs, "CODIGO");
				lista.add(dto);
				i += 1;
			}
			rs.close();
			pstm.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				cn.close();
			} catch (SQLException e) {
			}

		}
		return lista;
	}

	public List<ComboDto> getMedicamentos() {
		List<ComboDto> lista = new ArrayList<>();
		String sql = "SELECT CODIGO, DESCRIPCION ";
		sql += "FROM PRODUCTOS ";
		Connection cn = null;
		PreparedStatement pstm;
		ResultSet rs;
		ComboDto dto;
		try {
			cn = AccesoDB.getConnection();
			pstm = cn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while (rs.next()) {
				dto = rowMapper(rs, "DESCRIPCION");
				lista.add(dto);
				i += 1;
			}
			rs.close();
			pstm.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				cn.close();
			} catch (SQLException e) {
			}

		}
		return lista;
	}

	private ComboDto rowMapper(ResultSet rs, String Columna) throws SQLException {
		ComboDto dto = new ComboDto();
		dto.setId(i);
		dto.setEtiqueta(rs.getString(Columna));
		return dto;
	}
}
