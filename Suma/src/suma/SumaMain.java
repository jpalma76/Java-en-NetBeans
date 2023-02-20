
package suma;

import java.util.Scanner;

public class SumaMain {
    public static void main(String args[]){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Dame el primer Valor: ");
        int valorUno = entrada.nextInt();
        
        System.out.print("Dame el segundo Valor: ");
        int valorDos = entrada.nextInt();
        
        Suma valores = new Suma(valorUno, valorDos);
        valores.imprimir();        
    }
}
