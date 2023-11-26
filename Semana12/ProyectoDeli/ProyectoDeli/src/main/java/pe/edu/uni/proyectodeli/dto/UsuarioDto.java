/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.proyectodeli.dto;

/**
 *
 * @author Critian
 */
public class UsuarioDto {
    
    private Integer id_usuario;
    private String codigo;
    private String nombre;
    private String apellido;
    private String clave;
    private String cargo;

    public UsuarioDto() {
    }
    
    public Integer getId_usuario(){
        return id_usuario;
    }
    
    public void setId_usuario(Integer Id_usuario){
        this.id_usuario = Id_usuario;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigoEmpleado) {
        this.codigo = codigoEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombreEmpleado) {
        this.nombre = nombreEmpleado;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellidoEmpleado) {
        this.apellido = apellidoEmpleado;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String claveEmpleado) {
        this.clave = claveEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargoEmpleado) {
        this.cargo = cargoEmpleado;
    }
}
