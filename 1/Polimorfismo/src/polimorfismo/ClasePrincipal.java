
package polimorfismo;
import polimorfismo.Suma_ClaseHija;
import polimorfismo.Resta_ClaseHija;

public class ClasePrincipal {
    public static void main(String[] args) {
        
        Operaciones_ClasePadre mensajeroSuma = new Suma_ClaseHija();
        System.out.println("Suma:");
        mensajeroSuma.PedirDatos();
        mensajeroSuma.Operaciones();
        mensajeroSuma.MostrarResultado();
        
        Operaciones_ClasePadre mensajeroResta = new Resta_ClaseHija();
        System.out.println("Resta:");
        mensajeroResta.PedirDatos();
        mensajeroResta.Operaciones();
        mensajeroResta.MostrarResultado();
    }
    
}
