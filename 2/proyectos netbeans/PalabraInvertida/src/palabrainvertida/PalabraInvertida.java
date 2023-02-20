package palabrainvertida;

import java.util.Scanner;

public class PalabraInvertida {

    public static void main(String[] args) {

        String palabra = "", palabraAlReves = "";
        int largoPalabra = 0;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Escribe una palabra o frase: ");
        palabra = in.nextLine();
        
        largoPalabra = palabra.length();
        
        while (largoPalabra != 0) {
            palabraAlReves += palabra.substring(largoPalabra -1, largoPalabra);
            largoPalabra--;
        }
        
        System.out.print("Palabra invertida: " + palabraAlReves);
        System.out.println("");
    }

}
