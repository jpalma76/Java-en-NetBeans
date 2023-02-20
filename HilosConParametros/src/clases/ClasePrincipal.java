package clases;

public class ClasePrincipal {
    public static void main(String[] args) {
        
        Proceso hilo1 = new Proceso(" Hilo 1");
        Proceso hilo2 = new Proceso(" Hilo 2");
        
        
        hilo1.ValorDeLaCondicion(5);
        hilo2.ValorDeLaCondicion(10);
        
        hilo1.start();
        try{
        hilo1.sleep(20);
        }catch(InterruptedException e){
            System.out.println("error en el hilo 1" + e);
        }
        hilo2.start();
        try{
        hilo2.sleep(20);
        }catch(InterruptedException e){
            System.out.println("error en el hilo 2" + e);
        }
    }
}
