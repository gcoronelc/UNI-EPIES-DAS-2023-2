package uni.curafacil.db;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AccesoDB {

    // Constructor privado
    private AccesoDB() {
    }

    public static Connection getConnection() throws SQLException {
        Connection cn = null;
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String urlDB = "jdbc:sqlserver://localhost:1433;databaseName=CuraFacil;encrypt=True;TrustServerCertificate=True;";
        String user = "sa";
        String pass = "sql";
        try {
            // Paso 1: Cargar el driver a memoria 
            Class.forName(driver).getDeclaredConstructor().newInstance();
            // Paso 2: Obtener el objeto Connection 
            cn = DriverManager.getConnection(urlDB, user, pass);
        } catch (SQLException e) {
            throw new SQLException("No se puede establecer la conexion con la BD.", e);
        } catch (ClassNotFoundException e) {
            throw new SQLException("No se puede encontrar el driver de la BD.", e);
        } catch (NoSuchMethodException e) {
            throw new SQLException("No se puede encontrar el constructor del driver de la BD.", e);
        } catch (InstantiationException e) {
            throw new SQLException("No se puede instanciar el driver de la BD.", e);
        } catch (IllegalAccessException e) {
            throw new SQLException("No se puede acceder al driver de la BD.", e);
        } catch (InvocationTargetException e) {
            throw new SQLException("No se puede invocar al driver de la BD.", e);
        }
        return cn;
    }

}
