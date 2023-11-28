package uni.curafacil.dto;

public class ComboDto {

    private Integer id;
    private String etiqueta;

    public ComboDto() {
    }

    public ComboDto(Integer id, String etiqueta) {
        this.id = id;
        this.etiqueta = etiqueta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    @Override
    public String toString() {
        return etiqueta;
    }

}
