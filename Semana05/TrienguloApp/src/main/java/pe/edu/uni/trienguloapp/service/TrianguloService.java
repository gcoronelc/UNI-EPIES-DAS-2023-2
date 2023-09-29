package pe.edu.uni.trienguloapp.service;

public class TrianguloService {

    public boolean esValido(int ladoA, int ladoB, int ladoC) {
        // Variables
        boolean respuesta;
        // Proceso
        boolean c1 = (ladoA + ladoB) > ladoC;
        boolean c2 = (ladoA + ladoC) > ladoB;
        boolean c3 = (ladoB + ladoC) > ladoA;
        respuesta = c1 && c2 && c3;
        // Reporte
        return respuesta;
    }
    
    

}
