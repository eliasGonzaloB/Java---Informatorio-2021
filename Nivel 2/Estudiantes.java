import java.util.List;
import java.util.ArrayList;

public class Estudiantes {
    public static void main(String[] args) {
        ArrayList<String> listaEstudiantes = new ArrayList<>();

        listaEstudiantes.add("Verónica Escudero");
        listaEstudiantes.add("Brenda Aguilera");
        listaEstudiantes.add("Mirian Pardo");
        listaEstudiantes.add("Sabrina Espino");
        listaEstudiantes.add("Fabio Pla");
        listaEstudiantes.add("Maximino Blanco");
        listaEstudiantes.add("Antoni Sevilla");
        listaEstudiantes.add("Nicole Paredes");
        listaEstudiantes.add("Maria-Pilar Labrador");
        listaEstudiantes.add("Leonor Frances");
        listaEstudiantes.add("Ana-Belen Real");
        listaEstudiantes.add("Mauricio Hervas");

        List<String> primerCurso = listaEstudiantes.subList(0,4);
        List<String> segundoCurso = listaEstudiantes.subList(4,8);
        List<String> tercerCurso = listaEstudiantes.subList(8, listaEstudiantes.size());

        System.out.println("Primer curso");
        for (String estudiante : primerCurso) {
            System.out.println(estudiante);
        }

        System.out.println("\nSegundo curso");
        for (String estudiante : segundoCurso) {
            System.out.println(estudiante);
        }

        System.out.println("\nTercer curso");
        for (String estudiante : tercerCurso) {
            System.out.println(estudiante);
        }
    }
}