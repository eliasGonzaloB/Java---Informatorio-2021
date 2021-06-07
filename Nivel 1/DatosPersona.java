import java.util.Scanner;

public class DatosPersona{
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Ingrese nombre y apellido: ");
    String nombreApellido = scan.nextLine();
    System.out.println("Ingrese edad: ");
    int edad = Integer.parseInt(scan.nextLine()); //pasa string a integer
    System.out.println("Ingrese dirección: ");
    String direccion = scan.nextLine();
    System.out.println("Ingrese ciudad: ");
    String ciudad = scan.nextLine();
    Persona persona1 = new Persona(nombreApellido, edad, direccion, ciudad);
    scan.close();
    System.out.println(persona1);
    }
}
class Persona{
   String nombreApellido;
   int edad;
   String direccion;
   String ciudad;

   public Persona(String nombreApellido, int edad, String direccion, String ciudad){
       this.nombreApellido = nombreApellido;
       this.edad = edad;
       this.direccion = direccion;
       this.ciudad = ciudad;
   }
   @Override
   public String toString() {
       return ciudad + " - " + direccion + " - " + edad + " - " + nombreApellido;
   }
}