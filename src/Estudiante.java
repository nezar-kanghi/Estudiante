public class Estudiante {
    private String nombre;
    private int edad;
    private double nota;


    public Estudiante(String nombre, int edad, double nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        if (nota >= 0 && nota <= 10) { //recordar que && es AND
            this.nota = nota;
        } else {
            this.nota = 0;
        }
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nota: " + nota);
    }
}
