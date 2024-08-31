package controlnotas;

public class Main {
    public static void main(String[] args) {
        // Crear un grado
        Grado gradoPrimeroA = new Grado("Primero", "A", 2024, "Prof. Juan Pérez");

        // Crear un estudiante asociado a ese grado
        Estudiante estudiante1 = new Estudiante("001", "Carlos López", "Masculino", 10, gradoPrimeroA);

        // Mostrar la información del estudiante
        estudiante1.mostrarInformacion();
    }
}
