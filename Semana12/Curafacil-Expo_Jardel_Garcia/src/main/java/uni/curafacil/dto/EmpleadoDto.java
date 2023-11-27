package uni.curafacil.dto;

public class EmpleadoDto {

    private String id_empleado;
    private String codigo;
    private String nombre;
    private String apellido;
    private String clave;
    private String cargo;

    public EmpleadoDto() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigoEmpleado) {
        this.codigo = codigoEmpleado;
    }

    public String getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(String idEmpleado) {
        this.id_empleado = idEmpleado;
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