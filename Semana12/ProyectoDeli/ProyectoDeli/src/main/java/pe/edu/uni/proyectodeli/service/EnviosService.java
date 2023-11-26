package pe.edu.uni.proyectodeli.service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import pe.edu.uni.proyectodeli.dbo.AccesoDB;

public class EnviosService{
    public static void generarEnvios(Integer id_empleado, Integer id_cliente, String estado, Double total,
                                     List<Double> lista2,
                                     List<String> lista3) {
        Integer id_envio;
        id_envio = generarEnvio(id_empleado, id_cliente, estado, total);
        generarEnvioDetalle(lista2, id_envio);
        generarEnvioReceptor(lista3, id_envio);
    }

    private static Integer generarEnvio(Integer id_empleado, Integer id_cliente, String estado, Double total) {
        Date date = new Date(System.currentTimeMillis());
        Connection cn = null;
        Integer envio = 0;
        try {
            cn = AccesoDB.getConnection();
            String sql = "insert into Envios(id_empleado, id_cliente, fecha, estado, total) values(?,?,?,?,?)";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setInt(1, id_empleado);
            pstm.setInt(2, id_cliente);
            pstm.setDate(3, date);
            pstm.setString(4, estado);
            pstm.setDouble(5, total);

            pstm.executeUpdate();
            pstm.close();
        } catch (SQLException e) {
            throw new RuntimeException("Error al registrar el Envio.", e);
        } catch (Exception e) {
            throw new RuntimeException("Error al registrar el Envio.", e);
        } finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
        
        try {
            cn = AccesoDB.getConnection();
            String sql = "SELECT TOP 1 * FROM ENVIOS ORDER BY ID_ENVIO DESC";
            PreparedStatement pstm = cn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            rs.next();
            envio = rs.getInt("id_envio");
        } catch (SQLException e) {

        }
        System.out.println("envio: " + envio);
        return envio;
    }

    private static void generarEnvioDetalle(List<Double> lista, Integer id_envio) {
        Connection cn = null;
        try {
            cn = AccesoDB.getConnection();
            String sql = "insert into ENVIOS_DETALLE(LARGO, ANCHO, ALTO, PESO, id_envio) values(?,?,?,?,?)";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setDouble(1, lista.get(0));
            pstm.setDouble(2, lista.get(1));
            pstm.setDouble(3, lista.get(2));
            pstm.setDouble(4, lista.get(3));
            pstm.setInt(5, id_envio);

            pstm.executeUpdate();
            pstm.close();
        } catch (SQLException e) {
            throw new RuntimeException("Error al registrar al Detalle de Envio.", e);
        } catch (Exception e) {
            throw new RuntimeException("Error al registrar al Detalle de Envio.", e);
        } finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
    }

    private static void generarEnvioReceptor(List<String> lista, Integer id_envio) {
        Connection cn = null;
        try {
            cn = AccesoDB.getConnection();
            String sql = "insert into ENVIOS_RECEPTOR(nombre, ApellidoP, ApellidoM, dni, celular, id_envio) values(?,?,?,?,?,?)";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, lista.get(0));
            pstm.setString(2, lista.get(1));
            pstm.setString(3, lista.get(2));
            pstm.setString(4, lista.get(3));
            pstm.setString(5, lista.get(4));
            pstm.setInt(6, id_envio);

            pstm.executeUpdate();
            pstm.close();
        } catch (SQLException e) {
            throw new RuntimeException("Error al registrar al Receptor.", e);
        } catch (Exception e) {
            throw new RuntimeException("Error al registrar al Receptor.", e);
        } finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
    }
}