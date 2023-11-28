package uni.curafacil.controller;

import java.util.List;
import uni.curafacil.dto.ProductoDto;
import uni.curafacil.service.ProductosService;

public class GCProductoController {
    
    private ProductosService productosService;

    public GCProductoController() {
        productosService = new ProductosService();
    }
    
    public List<ProductoDto> getProductos(){
        return productosService.getProductos();
    }
    
}
