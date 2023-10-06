package pe.edu.uni.trianguloapp.prueba;

import pe.edu.uni.trianguloapp.service.TrianguloService;

public class Prueba02 {
    
    public static void main(String[] args) {
        // Datos
        int a = 1;
        int b = 1;
        int c = 5;
        // Proceso
        TrianguloService service = new TrianguloService();
        boolean rpta = service.esValido(a, b, c);
		  int perimetro = service.perimetro(a, b, c);
		  double area = service.area(a, b, c);
        // Reporte
        System.out.println("Es valido? " + rpta);
		  System.out.println("Perimetro: " + perimetro);
		  System.out.println("Area: " + area);
    }
    
}
