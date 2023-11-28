package uni.curafacil.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import uni.curafacil.db.AccesoDB;
import uni.curafacil.dto.ProductoDto;

public class ProductosService {

    public List<ProductoDto> getProductos() {
        List<ProductoDto> lista = new ArrayList<>();
        Connection cn = null;
        try {
            cn = AccesoDB.getConnection();
            String sql = "select codigo, descripcion, precio_caja, princ_activo, fecha_venc, stock from productos";
            PreparedStatement pstm = cn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                ProductoDto dto = new ProductoDto();
                dto.setCodigo(rs.getString("codigo"));
                dto.setDescripcion(rs.getString("descripcion"));
                dto.setPrecioCaja(rs.getDouble("precio_caja"));
                dto.setPrincActivo(rs.getString("princ_activo"));
                java.sql.Date fechaVenc = rs.getDate("fecha_venc");
                if (fechaVenc != null) {
                    dto.setFechaVenc(fechaVenc.toLocalDate().atStartOfDay());
                }
                dto.setStock(rs.getInt("stock"));
                lista.add(dto);
            }
            rs.close();
            pstm.close();
        } catch (SQLException e) {
            throw new RuntimeException("Error al acceder a la tabla Productos.");
        } catch (Exception e) {
            throw new RuntimeException("Error al acceder a la tabla Productos.");
        } finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
        return lista;
    }
}
