
package lavadora_uno;
import java.util.Scanner;
import libreria.LLFunciones;

public class Lavadora_Uno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el tipo de ropa:");
        System.out.println("1.- Ropa Blanca / 2.- Ropa de Color.");
        int TipoDeRopa = entrada.nextInt();
        
        System.out.println("¿Cuantos kilos de ropa desea lavar?");
        int kilos = entrada.nextInt();
        
        LLFunciones mensajero = new LLFunciones(kilos, TipoDeRopa);
        mensajero.setTipoDeRopa(2);
        System.out.println("El tipo de ropa es: " + mensajero.getTipoDeRopa());
        mensajero.CicloFinalizado();
    }
}