
package operaciones;
import java.util.Scanner;

public class Clase_Padre {
    
    protected int valor1, valor2, resultado;
    Scanner in = new Scanner(System.in);
    
    public void PedirDatos(){
        System.out.print("Ingrese el primer numero: ");
        valor1 = in.nextInt();
        
        System.out.print("Ingrese el segundo numero: ");
        valor2 = in.nextInt(); 
    }
    public void MostrarResultado(){
        System.out.print(resultado);
    }
}
