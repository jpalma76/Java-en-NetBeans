
package resta;

import java.util.Scanner;

public class RestaMain {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Dame el primer valor: ");
        int num1 = entrada.nextInt();
                
        System.out.println("Dame el segundo valor: ");
        int num2 = entrada.nextInt();
        
        Resta mensajero = new Resta(num1, num2);
        mensajero.Imprimir();
    }
}
