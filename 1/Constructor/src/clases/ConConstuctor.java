package clases;
import java.util.Scanner;

public class ConConstuctor {

    public ConConstuctor(){
        
        Scanner entrada = new Scanner(System.in);
        String nombre = "";
        
        System.out.print("Cual e tu nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Tu nombre es: " + nombre);
    }
}
