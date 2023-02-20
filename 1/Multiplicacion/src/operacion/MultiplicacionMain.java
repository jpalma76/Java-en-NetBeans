
package operacion;
import java.util.Scanner;

public class MultiplicacionMain {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Esto es una multiplicación.");
        System.out.println("dame el primer valor: ");
        int num1 = in.nextInt();
        
        System.out.println("dame el segundo valor: ");
        int num2 = in.nextInt();
        
        Multiplicacion mensajero = new Multiplicacion(num1, num2);
        mensajero.Imprimir();
    }
}
