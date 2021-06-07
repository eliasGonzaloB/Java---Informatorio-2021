import java.util.Scanner;
import java.util.ArrayList;

public class Ciudades{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> favoritas = new ArrayList<>();

        boolean deNuevo = true;
        do {
            System.out.print("¿Quiere agregar una ciudad? [s/n]: ");
            switch (scanner.nextLine().charAt(0)) {
                case 's':
                    System.out.print("Ingrese el nombre de la ciudad: ");
                    favoritas.add(scanner.nextLine());
                    break;
                case 'n':
                    deNuevo = false;
                    break;
                default:
                    System.out.println("La opción ingresada no es valida.");
                    break;
            }
        } while (deNuevo);
        scanner.close();

        System.out.println("Sus ciudades favoritas son: ");
        for (int i = 0; i < favoritas.size(); i++) {
            System.out.println("#" + (i+1) + " - " + favoritas.get(i));
        }
        
    }
    
}