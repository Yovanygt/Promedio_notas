package controlnotas;

public class Grado {
    private String nombreGrado;
    private String seccion;
    private int anioEscolar;
    private String profesorEncargado;

    public Grado(String nombreGrado, String seccion, int anioEscolar, String profesorEncargado) {
        this.nombreGrado = nombreGrado;
        this.seccion = seccion;
        this.anioEscolar = anioEscolar;
        this.profesorEncargado = profesorEncargado;
    }

    public String getNombreGrado() {
        return nombreGrado;
    }

    public String getSeccion() {
        return seccion;
    }

    public int getAnioEscolar() {
        return anioEscolar;
    }

    public String getProfesorEncargado() {
        return profesorEncargado;
    }
}
