package pe.edu.uni.trianguloapp.prueba;

import pe.edu.uni.trianguloapp.service.TrianguloService;

public class Prueba01 {
    
    public static void main(String[] args) {
        // Datos
        int a = 3;
        int b = 4;
        int c = 5;
        // Proceso
        TrianguloService service = new TrianguloService();
        boolean rpta = service.esValido(a, b, c);
		  int perimetro = service.perimetro(a, b, c);
		  double area = service.area(a, b, c);
        // Reporte
        System.out.println("Es valido? " + rpta);
        System.out.println("Perimetro: " + perimetro + " u");
        System.out.println("Area: " + area + " u2");
    }
    
}
