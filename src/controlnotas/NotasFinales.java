package controlnotas;

public class NotasFinales {
    private String codigo;
    private String nombre;
    private String grado;
    private String seccion;
    private String materia;
    private double bimestre1;
    private double bimestre2;
    private double bimestre3;
    private double bimestre4;

    public NotasFinales(String codigo, String nombre, String grado, String seccion, String materia, 
                        double bimestre1, double bimestre2, double bimestre3, double bimestre4) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.grado = grado;
        this.seccion = seccion;
        this.materia = materia;
        this.bimestre1 = bimestre1;
        this.bimestre2 = bimestre2;
        this.bimestre3 = bimestre3;
        this.bimestre4 = bimestre4;
    }

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

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getBimestre1() {
        return bimestre1;
    }

    public void setBimestre1(double bimestre1) {
        this.bimestre1 = bimestre1;
    }

    public double getBimestre2() {
        return bimestre2;
    }

    public void setBimestre2(double bimestre2) {
        this.bimestre2 = bimestre2;
    }

    public double getBimestre3() {
        return bimestre3;
    }

    public void setBimestre3(double bimestre3) {
        this.bimestre3 = bimestre3;
    }

    public double getBimestre4() {
        return bimestre4;
    }

    public void setBimestre4(double bimestre4) {
        this.bimestre4 = bimestre4;
    }

    public double calcularPromedio() {
        return (bimestre1 + bimestre2 + bimestre3 + bimestre4) / 4;
    }

    public String obtenerResultado() {
        double promedio = calcularPromedio();
        return promedio >= 60 ? "Aprobado" : "Reprobado";
    }
}
