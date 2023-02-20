package palabrainvertida;

import java.util.Scanner;

public class PalabraInvertida {

    public static void main(String[] args) {
        
        int longitudPalabra;
        String palabra;
        String palabraInvertida = null;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingresa una Palabra o frase: ");
        palabra = in.nextLine();
        
        longitudPalabra = palabra.length();
        
        while (longitudPalabra > 0) {
            palabraInvertida+= palabra.substring(longitudPalabra - 1, longitudPalabra);
            longitudPalabra--;
        }
        
        System.out.println("palabra invertida: " + palabraInvertida);
    }

}
