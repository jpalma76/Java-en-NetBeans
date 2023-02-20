
package division;

import java.util.Scanner;

public class ClaseDivision {
    public static void main(String[] args) {
        int valor1, valor2, resultado;
        Scanner entrada = new Scanner(System.in);
        
        try{
        System.out.print("Dame el primer valor: ");
        valor1 = entrada.nextInt();
        
        System.out.print("Dame el segundo valor: ");
        valor2 = entrada.nextInt();
        
        resultado = valor1 / valor2;
        
        System.out.print("El resultado de la division es: " + resultado + "\n");
        }catch(Exception e){
            System.out.println("Error!!! " + e);
        }finally{
            System.out.println("Programa finalizado!!!");
        }
    }
}
