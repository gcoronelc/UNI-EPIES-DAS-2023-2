package uni.curafacil.controller;

import java.util.List;

import javax.swing.JTable;

import uni.curafacil.dto.ProductoDto;
import uni.curafacil.service.ProductosService;
import uni.curafacil.view.UtilView;

public class ProductosControler {
	
	private final ProductosService productosService;

	public ProductosControler() {
		productosService = new ProductosService();
	}

    public void llenarProductos(JTable tblDetalle, List<ProductoDto> listaProductos) {
		UtilView.llenarTabla(tblDetalle, listaProductos);
	}

    public List<ProductoDto> getProductos() {
		return productosService.getProductos();
    }
}
