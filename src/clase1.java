import java.util.Scanner;

public class clase1 {
    public static void main(String[] args) {
    System.out.println("Primera linea de texto");
    System.out.println("Segunda linea de texto");
    System.out.println("Cuantos lineas de texto");
    System.out.println("-----------------------------");
    Scanner leer = new Scanner(System.in);
    String linea = leer.next();
    String texto = leer.next();
    System.out.println(linea);
    }
}
