package pe.edu.uni.sistacademico.dto;

public class MatriculaDto {

    private Integer idMatricula;
    private Integer idAlumno;
    private String ciclo;
    private Integer[] cursos;

    public MatriculaDto() {
    }

    public MatriculaDto(Integer idMatricula, Integer idAlumno, String ciclo, Integer[] cursos) {
        this.idMatricula = idMatricula;
        this.idAlumno = idAlumno;
        this.ciclo = ciclo;
        this.cursos = cursos;
    }

    public Integer getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(Integer idMatricula) {
        this.idMatricula = idMatricula;
    }

    public Integer getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public Integer[] getCursos() {
        return cursos;
    }

    public void setCursos(Integer[] cursos) {
        this.cursos = cursos;
    }

    
}
