package uni.curafacil.prueba;

import java.sql.Connection;
import uni.curafacil.db.AccesoDB;

public class Prueba01 {
    
    public static void main(String[] args) {
        
        try {
            Connection cn = AccesoDB.getConnection();
            System.out.println("Conexion ok.");
            cn.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
                
    }
    
}
