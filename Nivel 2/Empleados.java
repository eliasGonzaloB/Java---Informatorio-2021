import java.util.HashMap;
import java.util.HashSet;

public class Empleados {
    public static void main(String[] args) {
        HashSet<Empleado> empleadoHashSet = new HashSet<>();
        HashMap<Integer, Float> salarios = new HashMap<>();

        empleadoHashSet.add(new Empleado("Empleado 1", 11111111, 5, 98765));
        empleadoHashSet.add(new Empleado("Empleado 2", 22222222, 8, 15948));
        empleadoHashSet.add(new Empleado("Empleado 3", 33333333, 1, 32487));
        empleadoHashSet.add(new Empleado("Empleado 4", 44444444, 3, 36574));

        for (Empleado e : empleadoHashSet) {
            salarios.put(e.getDni(), e.getSalario());
        }

        salarios.forEach((dni, salario) -> System.out.println("D.N.I.: " + dni + " - Sueldo: " + salario));
    }
}

class Empleado {
    String nombre;
    int dni;
    float horasTrabajadas;
    float precioPorHora;

    public Empleado(String nombre, int dni, float horasTrabajadas, float precioPorHora) {
        this.nombre = nombre;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.precioPorHora = precioPorHora;
    }

    public int getDni() {
        return dni;
    }

    public float getSalario() {
        return this.horasTrabajadas * this.precioPorHora;
    }
    
}
