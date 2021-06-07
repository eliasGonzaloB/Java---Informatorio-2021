import java.util.Collections;
import java.util.ArrayList;


public class Cartas {
    public static void main(String[] args) {
        ArrayList<String> cartas = new ArrayList<>();
        for (int i = 0; i < 13; i++) {
            cartas.add("Carta " + (i + 1));
        }

        System.out.println("Orden normal");
        for (String carta : cartas) {
            System.out.println(carta);
        }

        Collections.reverse(cartas);
        System.out.println("Orden inverso");
        for (String carta : cartas) {
            System.out.println(carta);
        }

        Collections.shuffle(cartas);
        System.out.println("Orden aleatorio");
        for (String carta : cartas) {
            System.out.println(carta);
        }
    }
}
