package clases;

public class proceso2 implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i <= 5; i++) {
            System.out.println(i + " " + "Proceso2");
        }
        System.out.println("");
    }
}
