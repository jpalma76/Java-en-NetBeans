package clases;

import java.util.Scanner;

public abstract class ClasePadre_Abstracta {

    protected int transacciones, retiro, deposito;
    private static int saldo;
    Scanner entrada = new Scanner(System.in);

    public void Operaciones() {
        int bandera = 0;
        int seleccion = 0;
        do {
            do {
                System.out.println("Por favor seleccione una opción: ");
                System.out.println("    1.- Consulta de Saldo.");
                System.out.println("    2.- Retiro de Dinero.");
                System.out.println("    3.- Deposito de Efectivo.");
                System.out.println("    4.- Salir.");
                seleccion = entrada.nextInt();

                if (seleccion == 1 && seleccion <= 4) {
                    bandera = 1;
                } else {
                    System.out.println("--------------------------------------------------");
                    System.out.println("Opción no disponible, vuelva a intentar por vavor.");
                    System.out.println("---------------------------------------------------");
                }

            } while (bandera == 0);

            if (seleccion == 1) {
                ClasePadre_Abstracta mensajero = new ClaseHija_Consulta();
                mensajero.Transacciones();
            } else if (seleccion == 2) {
                ClasePadre_Abstracta mensajero = new ClaseHija_Retiro();
                mensajero.Transacciones();
            } else if (seleccion == 3) {
                ClasePadre_Abstracta mensajero = new ClaseHija_Deposito();
                mensajero.Transacciones();
            } else if (seleccion == 4) {
                System.out.println("------------------------");
                System.out.println("Gracias, Vuleva pronto.");
                System.out.println("------------------------");
                bandera = 2;
                

            }
        } while (bandera != 2);
    }
    
    // Metodo para solicitar cantidad de Retiro.
    public void Retiro(){
        retiro = entrada.nextInt();
    }
    
    // Metdo para solicitar Deposito.
    public void Deposito(){
        deposito = entrada.nextInt();
    }
    
    // Metodo abstracto.
    public abstract void Transacciones();
    
    //metodos setter y getter.
    
    public int getSaldo(){
        return saldo;
    }
    
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }

}
