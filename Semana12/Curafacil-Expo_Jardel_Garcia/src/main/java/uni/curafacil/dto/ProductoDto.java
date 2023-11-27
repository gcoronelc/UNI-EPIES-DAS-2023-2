package uni.curafacil.dto;

import java.time.LocalDateTime;

public class ProductoDto {

    private String codigo;
    private String descripcion;
    private Double precio_caja;
    private String principio_activo;
    private LocalDateTime fecha_vencimiento;
    private Integer stock;

    public ProductoDto() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigoProducto) {
        this.codigo = codigoProducto;
    }

    public Double getPrecioCaja() {
        return precio_caja;
    }

    public void setPrecioCaja(Double precioCajaProducto) {
        this.precio_caja = precioCajaProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcionProducto) {
        this.descripcion = descripcionProducto;
    }

    public String getPrincActivo() {
        return principio_activo;
    }

    public void setPrincActivo(String principioActivoProducto) {
        this.principio_activo = principioActivoProducto;
    }

    public LocalDateTime getFechaVenc() {
        return fecha_vencimiento;
    }

    public void setFechaVenc(LocalDateTime fechaVencimientoProducto) {
        this.fecha_vencimiento = fechaVencimientoProducto;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stockProducto) {
        this.stock = stockProducto;
    }
}