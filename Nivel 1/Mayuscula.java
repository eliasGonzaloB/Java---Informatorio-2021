import java.util.Scanner;

public class Mayuscula{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese texto: ");
        String nombre = scan.nextLine();
        char letra;

        for(int i = 0; i < nombre.length(); i++ ){
            letra = nombre.charAt(i);
            if (letra <= 122 && letra >= 97){
                letra = (char)(letra - 32);
                System.out.print(letra);
            } else {
                System.out.print(letra);
            }
        } 
        scan.close();
    }
}