package clases;

public class Procesos extends Thread {
    
    int num_int;
    
    public Procesos (String NombreHilo){
        super(NombreHilo);
    }
    
    @Override
    public void run() {
        for (int i = 0; i <= num_int; i++) {
            System.out.println(i + " " + this.getName());
        }
        System.out.println("");
    }
    
    public void ValorDeLaCondicion(int valor){
        this.num_int = valor;
    }
}
