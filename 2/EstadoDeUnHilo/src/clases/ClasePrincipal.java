package clases;

public class ClasePrincipal {
    public static void main(String[] args) {
        
        Hilo_Proceso hilo1 = new Hilo_Proceso();
        Hilo_Proceso hilo2 = new Hilo_Proceso();
        
        hilo1.start();
        try{
            hilo1.sleep(3500);
        } catch(InterruptedException e){
            System.out.println("Error en el hilo 1" + e);
        }
        hilo2.start();
        try{
            hilo2.sleep(20);
        } catch(InterruptedException e){
            System.out.println("Error en el hilo 2" + e);
        }
    }
}
