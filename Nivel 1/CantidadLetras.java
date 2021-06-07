import java.util.Arrays;
import java.util.Collections; 
import java.util.List;
import java.util.Scanner;

public class CantidadLetras{
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Introduce un texto: ");
        String texto = scan.nextLine();
        System.out.println("Ahora ingrese una letra: ");
        String letra = scan.nextLine();
        int cantidadLetraRepetida = 0;

        List<String> textoList = Arrays.asList(texto.split(""));

        for(int i = 0; i < texto.length(); i++){
            
            cantidadLetraRepetida = Collections.frequency(textoList, letra);
        
        }
        
        System.out.println("La letra " + letra + " se repite " + cantidadLetraRepetida + " veces");
        scan.close();
    }
    
}