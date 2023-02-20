
package operaciones;

public class Saldo extends Intefaz_Cajero {
    
    @Override
    public void Transaccion(){
        System.out.println("Tu saldo es: " + getSaldo());
        System.out.println("");
    }
}
