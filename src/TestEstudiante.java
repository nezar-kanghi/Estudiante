public class TestEstudiante {
    public static void main(String[] args) {

        Estudiante e = new Estudiante("Lucía", 20, 8.5);
        e.mostrarInfo();

        e.setNombre("Carlos");
        e.setEdad(22);
        e.setNota(15);  //nota superior a 10

        e.mostrarInfo();
    }
}
