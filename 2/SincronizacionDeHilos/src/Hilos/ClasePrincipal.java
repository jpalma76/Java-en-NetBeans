
package hilos;

public class ClasePrincipal {
    public static void main(String[] args) {
        
        Hilo1 hilo1 = new Hilo1();
        Hilo2 hilo2 = new Hilo2();
        Hilo3 hilo3 = new Hilo3();
        Hilo4 hilo4 = new Hilo4();
        
        hilo1.start();
        try{
           hilo1.sleep(100); 
        }catch(InterruptedException e){
            System.out.println("Error en el hilo 1" + e);
        }
        hilo2.start();
        try{
           hilo2.sleep(100); 
        }catch(InterruptedException e){
            System.out.println("Error en el hilo 2" + e);
        }
        hilo3.start();
        try{
           hilo3.sleep(100); 
        }catch(InterruptedException e){
            System.out.println("Error en el hilo 3" + e);
        }
        hilo4.start();
        try{
           hilo4.sleep(100); 
        }catch(InterruptedException e){
            System.out.println("Error en el hilo 4" + e);
        }
        
    }
}
