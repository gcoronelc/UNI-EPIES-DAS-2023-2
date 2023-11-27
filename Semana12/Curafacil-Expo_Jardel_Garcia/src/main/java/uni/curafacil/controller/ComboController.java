package uni.curafacil.controller;

import java.util.List;

import uni.curafacil.dto.ComboDto;
import uni.curafacil.service.ComboService;

public class ComboController {
 
    private ComboService comboService;

    public ComboController() {
        comboService = new ComboService();
    }
    
    public List<ComboDto> getCodigos(){
        return comboService.getCodigos();
    }

    public List<ComboDto> getMedicamentos() {
        return comboService.getMedicamentos();
    }
}
