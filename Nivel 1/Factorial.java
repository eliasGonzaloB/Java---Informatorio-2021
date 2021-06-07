import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int numero = scan.nextInt();
        int resultado = 1;

        for(int i = 1; i <= numero; i++){
            resultado *= i; 
        }
        System.out.println("El factorial de " + numero + " es: " + resultado);

        scan.close();
    }
}