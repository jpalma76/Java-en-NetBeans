
package lavadora_uno;
import libreria.LLFunciones;
import java.util.Scanner;

public class Lavadora_uno {
    public static void main(String args[]){
     
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("La ropa es blanca o de color");
        System.out.println("1.- Ropa blanca / 2.- Ropa de color");
        int TipoDeRopa = entrada.nextInt();
        
        System.out.println("Cuantos kilos de ropa:");
        int kilos = entrada.nextInt();
        
        LLFunciones mensajero = new LLFunciones(kilos, TipoDeRopa);
        mensajero.setTipoDeRopa(2);
        System.out.println("El tipo de Ropa es: " + mensajero.getTipoDeRopa());
        mensajero.CicloFinalizado();
    }
    
}
