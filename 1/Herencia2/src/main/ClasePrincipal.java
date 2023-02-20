
package main;
import operaciones.ClaseHija_Suma;
import operaciones.ClaseHija_Resta;

public class ClasePrincipal {
    public static void main(String[] args) {
        
        System.out.println("Suma:");
        ClaseHija_Suma mensajeroSuma = new ClaseHija_Suma();
        mensajeroSuma.PedirDatos();
        mensajeroSuma.Suma();
        System.out.print("El resultado de la Suma es: ");
        mensajeroSuma.MostrarResultado();
        
        System.out.println("Resta:");
        ClaseHija_Resta mensajeroResta = new ClaseHija_Resta();
        mensajeroResta.PedirDatos();
        mensajeroResta.Resta();
        System.out.print("El resultado de la Resta es: ");
        mensajeroResta.MostrarResultado();
    }
    
}
