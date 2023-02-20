package palabras;

import java.util.Scanner;

public class PalabrasInvertidas {
    public static void main(String[] args) {
        
        String palabra = "", palabraInvertida = "";
        int longitudPalabra = 0;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Ingrese una palabra o frase: ");
        palabra = in.nextLine();
        System.out.println("");
        
        longitudPalabra = palabra.length();
        
        while(longitudPalabra != 0) {
            palabraInvertida += palabra.substring(longitudPalabra-1, longitudPalabra);
            longitudPalabra--;
        }
        System.out.println("La palabra o frase invertida es: " + palabraInvertida);
        System.out.println("");
    }
}
