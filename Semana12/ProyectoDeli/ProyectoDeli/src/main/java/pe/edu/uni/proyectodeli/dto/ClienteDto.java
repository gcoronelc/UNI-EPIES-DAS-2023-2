/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.proyectodeli.dto;

/**
 *
 * @author Critian
 */
public class ClienteDto {
    private Integer id_cliente;
    private String dni;
    private String nombre;
    private String ApellidoP;
    private String ApellidoM;
    private Integer celular;
    private String correo;
    private String clave;	
    
    public Integer getId_cliente(){
        return id_cliente;
    }    
    
    public void setId_cliente(Integer Id_cliente){
        this.id_cliente = Id_cliente;
    }
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }
    
    public String getApellidoP() {
        return ApellidoP;
    }

    public void setApellidoP(String apellidoM) {
        this.ApellidoP = apellidoM;
    }
    public String getApellidoM() {
        return ApellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.ApellidoM = apellidoM;
    }

    public Integer getCelular() {
        return celular;
    }

    public void setCelular(Integer celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String Clave) {
        this.clave = Clave;
    }
    
    
}
