package pe.edu.uni.trienguloapp.prueba;

import pe.edu.uni.trienguloapp.service.TrianguloService;

public class Prueba02 {
    
    public static void main(String[] args) {
        // Datos
        int a = 1;
        int b = 1;
        int c = 5;
        // Proceso
        TrianguloService service = new TrianguloService();
        boolean rpta = service.esValido(a, b, c);
        // Reporte
        System.out.println("Es valido? " + rpta);
    }
    
}
