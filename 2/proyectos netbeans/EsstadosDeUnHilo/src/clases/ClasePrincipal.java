package clases;

public class ClasePrincipal {

    public static void main(String[] args) {
        Hilo_Proceso hilo1 = new Hilo_Proceso();
        Hilo_Proceso hilo2 = new Hilo_Proceso();
        
        System.out.println("Hilo 1:");
        hilo1.start();        
        try {
            hilo1.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Error en el hilo1 " + e);
        } 
        
        System.out.println("Hilo 2:");
        hilo2.start();

        
        try {
            hilo2.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Eror en el Hilo 2");
        } 

    }
}
