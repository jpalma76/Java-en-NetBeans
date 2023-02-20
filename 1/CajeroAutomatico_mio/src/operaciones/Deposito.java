
package operaciones;

public class Deposito extends Intefaz_Cajero {
    int vsaldo;
    @Override
    public void Transaccion(){
        System.out.print("Ingrese Efectivo: ");
        int efectivo = entrada.nextInt();
        operacion = getSaldo() + efectivo;
        System.out.println("Depositó " + efectivo);
        System.out.println("Su nuevo saldo es: " + operacion);
        System.out.println("");
        
    }
    
}
