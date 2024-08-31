package controlnotas;

public class Estudiante {
    private String codigo;
    private String nombre;
    private String genero;
    private int grado;
    private String seccion;
    private String edad;

    // Constructor
    public Estudiante(String codigo, String nombre, String genero, int grado, String seccion, String edad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.genero = genero;
        this.grado = grado;
        this.seccion = seccion;
        this.edad = grupo;
    }

    // Método para mostrar información del estudiante
    public void mostrarInformacion() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Género: " + genero);
        System.out.println("Grado: " + grado);
        System.out.println("Sección: " + seccion);
        System.out.println("Grupo: " + edad);
    }

    // Getters y Setters (opcional)
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String edad) {
        this.grupo = edad;
    }
}
