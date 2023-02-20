package main;
import operaciones.ClaseHija_suma;
import operaciones.ClaseHija_Resta;

public class Clase_Principal {
    public static void main(String args[]){
        
        ClaseHija_suma mensajeroSuma = new ClaseHija_suma();
        mensajeroSuma.PedirDatos();
        mensajeroSuma.Sumar();
        System.out.print("El resultado de la suma es: ");
        mensajeroSuma.MostrarResultado();
        System.out.println("");
        
        ClaseHija_Resta mensajeroResta = new ClaseHija_Resta();
        mensajeroResta.PedirDatos();
        mensajeroResta.Restar();
        System.out.print("El resultado de la resta es: ");
        mensajeroResta.MostrarResultado();
        System.out.println("");
    }
}
