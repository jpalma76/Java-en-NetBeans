package operaciones;

public class Giro extends Intefaz_Cajero {

    int vsaldo;
    @Override
    public void Transaccion() {
        System.out.print("Cuanto dinero desea retirar: ");
        int vgiro = entrada.nextInt();
        
        if(vgiro <= getSaldo()){
            operacion = getSaldo() - vgiro;
            System.out.println("Ha girado " + vgiro);
            System.out.println("su nuevo saldo es: " + operacion);
            System.out.println("");
        } else{
            System.out.println("su saldo es insuficiente.");
            System.out.println("");
            
        }
    }

}
