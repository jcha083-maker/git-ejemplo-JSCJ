import java.util.Scanner;

public class clase1 {
    public static void main(String[] args) {
    System.out.println("Primera linea de texto modificado en diseño en main");
    System.out.println("Segunda linea de texto");
    System.out.println("cuarto lineas de texto");
    System.out.println("quintos lineas de texto");
    System.out.println("quinto lineas de texto");
    System.out.println("-----------------------------");
    Scanner leer = new Scanner(System.in);
    String linea = leer.next();
    String texto = leer.next();
    System.out.println(linea);
    System.out.println("Añadido después de la rama de desarrollo");
    }
}
