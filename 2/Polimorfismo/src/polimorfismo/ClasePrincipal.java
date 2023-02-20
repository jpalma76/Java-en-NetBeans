
package polimorfismo;

public class ClasePrincipal {
    public static void main(String[] args) {
        
        Operaciones_ClasePadre mensajero_Suma = new Suma_ClaseHija();
        mensajero_Suma.PedirDatos();
        mensajero_Suma.Operaciones();
        System.out.println("El resultado de la suma es: ");
        mensajero_Suma.MostrarResultado();
        
        Operaciones_ClasePadre mensajero_Resta = new Resta_CLaseHija() ;
        mensajero_Resta.PedirDatos();
        mensajero_Resta.PedirDatos();
        System.out.println("El resultado de la resta es: ");
        mensajero_Resta.MostrarResultado();
    }
    
}
