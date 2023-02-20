package main;
import operaciones.ClaseHija_Suma;
import operaciones.ClaseHija_Resta;

public class ClasePrincipal {
    public static void main(String[] args) {
        
        System.out.println("Esto es una suma:");
        ClaseHija_Suma mensajeroSuma = new ClaseHija_Suma();
        mensajeroSuma.PedirDatos();
        mensajeroSuma.Suma();
        System.out.println("El resultado de la suma es: ");
        mensajeroSuma.mostrarResultado();
        
        System.out.println("Esto es una resta:");
        ClaseHija_Resta mensajeroResta = new ClaseHija_Resta();
        mensajeroResta.PedirDatos();
        mensajeroResta.Resta();
        System.out.println("El resultado de la resta es: ");
        mensajeroResta.mostrarResultado();
        
        
    }
}
