
package polimorfismo;

public class ClasePrincipal {
    public static void main(String[] args) {
        
        Operaciones_ClasePadre mensajero_Suma = new Suma_ClaseHija();
        mensajero_Suma.PedirDatos();
        mensajero_Suma.Operaciones();
        
        mensajero_Suma.MostrarResultado();
        
        Operaciones_ClasePadre mensajero_resta = new Resta_ClaseHija();
        mensajero_resta.PedirDatos();
        mensajero_resta.Operaciones();
        
        mensajero_resta.MostrarResultado();
    }
}
