package inversordepalabras;

import java.util.Scanner;

public class InversorDePalabras {

    public static void main(String[] args) {

        String palabra = "", palabraInvertida = "";
        int longitudPalabra = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("Ingrese una palabra o frase: ");
        palabra = in.nextLine();
        longitudPalabra = palabra.length();

        /* para imprimir la frase caracter por caracter, en el substring se debe
        * tomar longitud palabra - 1 que seria el nro de caracteres de palabra -1, 
        * en este caso la palabra tiene 12 caracteres, seria, (12-1, 12) para que 
        * tome el ultimo caracter y lo imprima.
        */
        while (longitudPalabra != 0) {
            palabraInvertida += palabra.substring(longitudPalabra -1, longitudPalabra);
            longitudPalabra--;
            
        }
        System.out.print("Palabra Invertida: " + palabraInvertida);
        System.out.println("");
    }

}
