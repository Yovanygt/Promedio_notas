package controlnotas;

public class Estudiante {
    private String codigo;
    private String nombre;
    private String grado;
    private String seccion;
    private int edad;
    private String genero;

    public Estudiante(String codigo, String nombre, String grado, String seccion, int edad, String genero) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.grado = grado;
        this.seccion = seccion;
        this.edad = edad;
        this.genero = genero;
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGrado() {
        return grado;
    }

    public String getSeccion() {
        return seccion;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    // Método para mostrar la información del estudiante
    public void mostrarInformacion() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Grado: " + grado);
        System.out.println("Sección: " + seccion);
        System.out.println("Edad: " + edad);
        System.out.println("Género: " + genero);
    }
}
