/*
* creado por Juan Palma
* Version 1.0
* Creado el dia 26 de noviembre de 2021
*/

package inversordepalabras;

import java.util.Scanner;

public class InversorDePalabras {
    public static void main(String[] args) {
        String palabra = "", palabraInvertida = "";
        int longitudPalabra = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("");

        System.out.println("Escribe una palabra o frase: ");
        palabra = entrada.nextLine();

        longitudPalabra = palabra.length();

        while (longitudPalabra != 0) {
            palabraInvertida += palabra.substring(longitudPalabra - 1, longitudPalabra);
            longitudPalabra--;
        }
        System.out.print("palabraInvertida: " + palabraInvertida);
        System.out.println("");
    }

}
