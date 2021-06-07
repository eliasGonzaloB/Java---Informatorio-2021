public class FizzBuzz{
    public static void main(String[] args) {
        System.out.println("Frase: ");
        String[] frase = fizzBuzzFuncion(1, 8);
        for (String string : frase) {
            System.out.print(string + ", ");
        }
        
    }
    public static String[] fizzBuzzFuncion(int numero1, int numero2){
        if(numero1 > numero2){
            throw new RuntimeException("Numero 1 es mayor que Numero 2");
        }
        String[] fizz = new String[numero2 -1];
        int contador = 0;
        for (int i = numero1; i < numero2; i++) {
            if(i % 2 == 0 && i % 3 == 0){
                fizz[contador] = "FizzBuzz";
            } else if(i % 3 == 0){
                fizz[contador] = "Buzz";
            }else if(i % 2 == 0){
                fizz[contador] = "Fizz";
            } else{
                fizz[contador] = String.valueOf(i);
            }
            contador++;
        }
        return fizz;
    }
}