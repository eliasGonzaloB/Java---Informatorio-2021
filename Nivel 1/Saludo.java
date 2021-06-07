import java.util.Scanner;

public class Saludo{
    public static void main(String[] args) {
        System.out.println("NOMBRE DE USUARIO: ");
        Scanner scan = new Scanner(System.in);
        String nombre = scan.nextLine();
        System.out.println("HOLA" + " " + nombre);
    scan.close();
    }
}