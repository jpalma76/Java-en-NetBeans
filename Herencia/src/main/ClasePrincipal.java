package main;
import operaciones.ClaseHija_Multiplicacion;
import operaciones.ClaseHija_Division;
import operaciones.ClaseHija_Suma;
import operaciones.ClaseHija_Resta;

public class ClasePrincipal {
    public static void main(String[] args) {
        
        ClaseHija_Suma mensajeroSuma = new ClaseHija_Suma();
        mensajeroSuma.PedirDatos();
        mensajeroSuma.Suma();
        System.out.print("El resultado de la suma es: ");
        mensajeroSuma.Resultado();
        
        ClaseHija_Resta mensajeroResta = new ClaseHija_Resta();
        mensajeroResta.PedirDatos();
        mensajeroResta.Resta();
        System.out.print("El resultado de la resta es: ");
        mensajeroResta.Resultado();
        
        ClaseHija_Multiplicacion mensajeroMultiplicacion = new ClaseHija_Multiplicacion();
        mensajeroMultiplicacion.PedirDatos();
        mensajeroMultiplicacion.Multiplicacion();
        System.out.print("El resultado de la multiplicacion es: ");
        mensajeroMultiplicacion.Resultado();
        
        ClaseHija_Division mensajeroDivision = new ClaseHija_Division();
        mensajeroDivision.PedirDatos();
        mensajeroDivision.Division();
        System.out.print("El resultado de la division es: ");
        mensajeroDivision.Resultado();
    }
}
