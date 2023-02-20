
package clases;

public class ClasePrincipal {
    public static void main(String[] args) {
        
        Proceso hilo1 = new Proceso(" Hilo 1");
        Proceso hilo2 = new Proceso(" Hilo2");
        Proceso hilo3 = new Proceso(" Hilo3");
        
        hilo1.ValordeLaCondicion(5);
        hilo2.ValordeLaCondicion(10);
        hilo3.ValordeLaCondicion(15);
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }       
}
