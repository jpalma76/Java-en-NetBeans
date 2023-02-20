package hilos;

public class Hilo4 extends Thread{
    
    @Override
    public void run(){
        for(int i = 0; i <= 10; i++){
            System.out.print("E");
            try{
            Hilo4.sleep(1000);        
        }catch(InterruptedException e){
            System.out.println("Error en el hilo 4" + e);
        }
        }
    }

}
