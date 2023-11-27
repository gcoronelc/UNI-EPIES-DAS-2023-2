package uni.curafacil.dto;

public class ItemDto {

    private String codigo;
    private String descripcion;
    private Double precio;
    private Integer cantidad;
    private Double subtotal;

    public ItemDto() {
    }

    public ItemDto(String codigo, String descripcion, Double precio, Integer cantidad, Double subtotal) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Object[] toRowData() {
        Object[] rowData = {
            codigo, descripcion, cantidad, precio, subtotal
        };
        return rowData;
    }

}
