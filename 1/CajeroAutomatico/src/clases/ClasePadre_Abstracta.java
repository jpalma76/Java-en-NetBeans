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
                System.out.println("Bienvenido");
                System.out.println("    1.- Consulta de Saldo.");
                System.out.println("    2.- Retiro de efectivo");
                System.out.println("    3.- Depósito de efectivo");
                System.out.println("    4.- Salir.");
                System.out.println("Elija una opcion: ");
                seleccion = entrada.nextInt();

                if (seleccion >= 1 && seleccion <= 4) {
                    bandera = 1;
                } else {
                    System.out.println("-----------------------------");
                    System.out.println("la opcion no corresponde!!!");
                    System.out.println("-----------------------------");
                }

            } while (bandera == 0);
            
            if(seleccion == 1){
                ClasePadre_Abstracta mensajero = new ClaseHija_Consulta();
                mensajero.Transacciones();
            } else if(seleccion == 2){
                ClasePadre_Abstracta mensajero = new ClaseHija_Retiro();
                mensajero.Transacciones();
            } else if(seleccion == 3){
                ClasePadre_Abstracta mensajero = new ClaseHija_Deposito();
                mensajero.Transacciones();
            } else if(seleccion == 4){
                System.out.println("------------------------");
                System.out.println("Gracias, vualva pronto.");
                System.out.println("------------------------");
                bandera = 2;
            }
        } while (bandera != 2);

    }
    
    //Método para solicitar cantidad de retiro.
    public void Retiro(){
        retiro = entrada.nextInt();
    }
    
    //Método para solicitar depósito.
    public void Deposito(){
        deposito = entrada.nextInt();
    }
    
    //Método Abstracto.
    public abstract void Transacciones();
    
    //Métodos setter y getter.
    public int getSaldo(){
        return saldo;
    }
    
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }
}
