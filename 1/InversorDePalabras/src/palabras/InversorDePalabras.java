
package palabras;
import java.util.Scanner;

public class InversorDePalabras {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String palabra = "", palabraInvertida = "";
        int longitudPalabra = 0;
        
        System.out.println("Programa inversor de palabras.");
        System.out.println("");
        
        System.out.print("Ingrese una palabra o frase: ");
        palabra = entrada.nextLine();
        
        longitudPalabra = palabra.length();
        
        while(longitudPalabra != 0){
            palabraInvertida += palabra.substring(longitudPalabra - 1,longitudPalabra);
            longitudPalabra--;
        }
        System.out.print("la palabra o frase invertida es: ");
        System.out.print(palabraInvertida);
        System.out.println("");
    }
}
