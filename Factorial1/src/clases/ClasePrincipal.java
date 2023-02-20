
package clases;
import java.util.Scanner;

public class ClasePrincipal {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        int numero = entrada.nextInt();
        
        Recursividad recursividad = new Recursividad();
        int Factorial = recursividad.Factorial(numero);
        System.out.print("El factorial de " + numero + " es " + Factorial + "\n");
        
    }
}
