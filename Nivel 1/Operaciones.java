import java.util.Scanner;

public class Operaciones{
    public static void main(String[] args) {
        System.out.println("Ingrese un número: ");
        Scanner scan = new Scanner(System.in); 
        int numero = scan.nextInt();
        System.out.println("Ingrese el siguiente número: ");
        int numero1 = scan.nextInt();

        System.out.println(numero + " + " + numero1 + " = " + (numero + numero1));
        System.out.println(numero + " - " + numero1 + " = " + (numero - numero1));
        System.out.println(numero + " * " + numero1 + " = " + (numero * numero1));
        System.out.println(numero + " / " + numero1 + " = " + (numero / numero1));
        System.out.println(numero + " % " + numero1 + " = " + (numero % numero1));

        scan.close();
    }
}

