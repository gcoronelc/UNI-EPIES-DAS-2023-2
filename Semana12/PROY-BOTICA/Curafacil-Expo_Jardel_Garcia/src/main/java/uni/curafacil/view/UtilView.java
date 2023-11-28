package uni.curafacil.view;

import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JTable;

import uni.curafacil.dto.ComboDto;
import uni.curafacil.dto.ProductoDto;

public class UtilView {

    static void llenarCombo(JComboBox<ComboDto> combo, List<ComboDto> lista) {
        combo.removeAllItems();
        for(ComboDto dto: lista){
            combo.addItem(dto);
        }
		  combo.setSelectedIndex(-1);
    }

    static void limpiarTabla(JTable tblDetalle) {
        tblDetalle.removeAll();        
    }  

    public static void llenarTabla(JTable tblDetalle, List<ProductoDto> lista) {
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel) tblDetalle.getModel();
        dtm.setRowCount(0);
        //agrega los datos del List<ProductoDto> a la tabla
        for (ProductoDto dto : lista) {
            Object[] row = {dto.getCodigo(), dto.getDescripcion(), dto.getPrecioCaja(), dto.getPrincActivo(), dto.getFechaVenc(), dto.getStock()};
            dtm.addRow(row);
        }
    }
    
    public static boolean isInteger(String texto){
        boolean rpta;
        try {
            int n = Integer.parseInt(texto);
            rpta = true;
        } catch (Exception e) {
            rpta = false;
        }
        return rpta;
    }
}
