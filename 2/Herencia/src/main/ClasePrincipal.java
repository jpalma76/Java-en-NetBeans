package main;
import operaciones.ClaseHija_Suma;
import operaciones.ClaseHija_Resta;

public class ClasePrincipal {
    public static void main(String[] args) {
        
        ClaseHija_Suma mensajero_Suma = new ClaseHija_Suma();
        System.out.println("Suma: ");
        
        mensajero_Suma.PedirDatos();
        mensajero_Suma.Suma();        
        System.out.println("El resultado de la suma es: ");
        mensajero_Suma.MostrarResultados();
        
        ClaseHija_Resta mensajero_Resta = new ClaseHija_Resta();
        System.out.println("Resta: ");
        mensajero_Resta.PedirDatos();
        mensajero_Resta.Resta();
        System.out.println("El resultado de la Resta es: ");
        mensajero_Resta.MostrarResultados();
    }

}
