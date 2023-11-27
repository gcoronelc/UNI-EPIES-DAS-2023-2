package uni.curafacil.dto;

public class ClienteDto {
    
    private Integer id_cliente;
    private String nombre;
	private String apellidos;
	private String dni;
	private String direc;
	private String telefono;
	private String correo;

    public ClienteDto() {
    }

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer idCliente) {
        this.id_cliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombreCliente) {
        this.nombre = nombreCliente;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidosCliente) {
        this.apellidos = apellidosCliente;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dniCliente) {
        this.dni = dniCliente;
    }

    public String getDirec() {
        return direc;
    }

    public void setDirec(String direcCliente) {
        this.direc = direcCliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefonoCliente) {
        this.telefono = telefonoCliente;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correoCliente) {
        this.correo = correoCliente;
    }
}