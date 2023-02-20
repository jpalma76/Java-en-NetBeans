
package clases;

public class ClasePrincipal {
    public static void main(String[] args) {
        
        Proceso hilo1 = new Proceso(" hilo 1");
        Proceso hilo2 = new Proceso(" hilo 2");
        Proceso hilo3 = new Proceso(" hilo 3");
        
        hilo1.ValorDeLaCondicion(5);
        hilo2.ValorDeLaCondicion(9);
        hilo3.ValorDeLaCondicion(5);
        
        hilo1.start();
        try{
            hilo1.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Error en el hilo1" + e);
        }
        hilo2.start();
        try{
            hilo2.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Error en el hilo 2" + e);
        }
        hilo3.start();
        try{
            hilo3.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Error en el hilo 3" + e);
        }
    }
}
