
package polimorfismo;


public class ClasePrincipal {
    public static void main(String[] args) {
        
        Operaciones_ClasePadre mensajeroSuma = new Suma_ClaseHija();
        System.out.println("Suma:");
        mensajeroSuma.PedirDatos();
        mensajeroSuma.Operaciones();
        System.out.print("El resultado de la suma es: ");
        mensajeroSuma.MostrarResultado();
        System.out.println("");
        
        Operaciones_ClasePadre mensajeroResta = new Resta_ClaseHija();
        System.out.println("Resta:");
        mensajeroResta.PedirDatos();
        mensajeroResta.Operaciones();
        System.out.print("El resultado de la Resta es: ");
        mensajeroResta.MostrarResultado();
        System.out.println("");
        
    }
}
