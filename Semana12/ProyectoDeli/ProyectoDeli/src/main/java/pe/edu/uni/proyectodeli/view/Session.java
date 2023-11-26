/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.proyectodeli.view;

import java.util.HashMap;
import java.util.Map;

public class Session {
    private static Map<String,Object> datos;
    
    static {
        datos = new HashMap <>();
    }
    
    private Session(){
    }
    
    public static void put(String key, Object object){
        datos.put(key,object);
    }
    
    public static Object get(String key){
        return datos.get(key);
    }
}
