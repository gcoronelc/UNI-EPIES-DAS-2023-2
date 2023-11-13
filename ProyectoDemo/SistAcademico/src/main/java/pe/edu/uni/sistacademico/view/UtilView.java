package pe.edu.uni.sistacademico.view;

import java.util.List;
import javax.swing.JComboBox;
import pe.edu.uni.sistacademico.dto.ComboDto;

public class UtilView {

    static void llenarCombo(JComboBox<ComboDto> combo, List<ComboDto> lista) {
        combo.removeAllItems();
        for(ComboDto dto: lista){
            combo.addItem(dto);
        }
		  combo.setSelectedIndex(-1);
    }
    
}
