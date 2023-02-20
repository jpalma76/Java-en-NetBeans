package hilos;

public class Hilo2 extends Thread {
    
    @Override
    public void run(){
        for(int i = 0; i <= 10; i++){
            System.out.print("G");
            try{
            Hilo2.sleep(1000);        
        }catch(InterruptedException e){
            System.out.println("Error en el hilo 2" + e);
        }
        }
    }

}
