package hilos;

public class Hilo5 extends Thread {
    
    @Override
    public void run(){
        for(int i = 0; i <= 10; i++){
            System.out.println("K");
            try{
            Hilo5.sleep(1000);        
        }catch(InterruptedException e){
            System.out.println("Error en el hilo 5" + e);
        }
        }
    }

}
