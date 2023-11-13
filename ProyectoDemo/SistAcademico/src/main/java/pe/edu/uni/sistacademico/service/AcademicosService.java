package pe.edu.uni.sistacademico.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pe.edu.uni.sistacademico.db.AccesoDB;
import pe.edu.uni.sistacademico.dto.MatriculaDto;

public class AcademicosService {

	public String getCicloActual() {
		Connection cn = null;
		PreparedStatement pstm;
		ResultSet rs;
		String sql = "select ciclo from ciclo where ACTIVO = 1";
		String ciclo = "";
		try {
			cn = AccesoDB.getConnection();
			pstm = cn.prepareStatement(sql);
			rs = pstm.executeQuery();
			if(rs.next()){
				ciclo = rs.getString("ciclo");
			}
			rs.close();
			pstm.close();
		} catch (SQLException e) {
			ciclo = "";
		}finally{
			try {
				cn.close();
			} catch (Exception e) {
			}
		}
		return ciclo;
	}

	public MatriculaDto matricular(MatriculaDto dto) {
		Connection cn = null;
		PreparedStatement pstm;
		ResultSet rs;
		String sql;
		Integer IdMat = 0;
		try {
			// Inicio
			cn = AccesoDB.getConnection();
			cn.setAutoCommit(false);
			// Registrar matricula
			sql = "insert into matricula(idalumno,ciclo,estado,fecha) ";
			sql += "values(?,?,1,getdate())";
			pstm = cn.prepareStatement(sql);
			pstm.setInt(1, dto.getIdAlumno());
			pstm.setString(2, dto.getCiclo());
			pstm.executeUpdate();
			pstm.close();
			// Recuperar IdMat
			sql = "SELECT @@IDENTITY AS ID";
			pstm = cn.prepareStatement(sql);
			rs = pstm.executeQuery();
			rs.next();
			IdMat = rs.getInt("ID");
			rs.close();
			pstm.close();
			// Registrar cursos
			sql = "insert into detalle(idmat,idprog,activo) values(?,?,1)";
			pstm = cn.prepareStatement(sql);
			for (Integer codigo : dto.getCursos()) {
				pstm.setInt(1, IdMat);
				pstm.setInt(2, codigo);
				pstm.executeUpdate();
			}
			pstm.close();
			// Fin 
			cn.commit();
			dto.setIdMatricula(IdMat);
		} catch (SQLException e) {
			try {
				cn.rollback();
			} catch (Exception e1) {
			}
			throw new RuntimeException(e.getMessage());
		} catch (Exception e) {
			try {
				cn.rollback();
			} catch (Exception e1) {
			}
			throw new RuntimeException("Un error en el proceso.");
		} finally {
			try {
				cn.close();
			} catch (Exception e) {
			}
		}
		return dto;
	}

}
