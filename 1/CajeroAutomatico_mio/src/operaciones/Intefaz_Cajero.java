package operaciones;

import java.util.Scanner;

public abstract class Intefaz_Cajero {

    Scanner entrada = new Scanner(System.in);
    protected int saldo = 500;
    protected int operacion = 0;
    private int opcion = 0;
    int bandera = 1;

    public void EligeOpcion() {
        while (bandera != 2) {
            System.out.println("    Bienvenido.");
            System.out.println("1.- Deposito");
            System.out.println("2.- Giro");
            System.out.println("3.- Cosulta de Saldo");
            System.out.println("4.- Salir");
            System.out.print("Elija una opción: ");
            opcion = entrada.nextInt();

            if (opcion == 1) {
                Deposito mensajero = new Deposito();
                mensajero.Transaccion();
                mensajero.setSaldo(operacion);
            } else if (opcion == 2) {
                Giro mensajero = new Giro();
                mensajero.Transaccion();
                mensajero.setSaldo(operacion);
            } else if (opcion == 3) {
                Saldo mensajero = new Saldo();
                mensajero.Transaccion();
                mensajero.setSaldo(operacion);
            } else if (opcion == 4) {
                System.out.println("Gracias, vuelva pronto.");
                bandera = 2;
            } else {
                System.out.println("la opción no existe,");
            }
        }
    }

    public abstract void Transaccion();

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int operacion) {
        this.saldo = operacion;
    }

}
