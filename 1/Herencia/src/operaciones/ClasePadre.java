
package operaciones;
import java.util.Scanner;

public class ClasePadre {
    
    Scanner entrada = new Scanner(System.in);
    protected int valor1, valor2, resultado;
    
    public void PedirDatos(){
        System.out.println("Dame el primer valor: ");
        valor1 = entrada.nextInt();
        
        System.out.println("Dame el segundo valor: ");
        valor2 = entrada.nextInt();
    }
    
    public void mostrarResultado(){
        System.out.println(resultado);
    }
}
