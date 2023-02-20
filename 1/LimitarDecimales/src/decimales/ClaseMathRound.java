package decimales;

public class ClaseMathRound {

    public static void main(String[] args) {

        int numero = 2;
        double raiz = Math.sqrt(numero);

        System.out.println("La raiz cuadrada de " + numero + " es: " + (double) Math.round(raiz * 100d) / 100);
    }
}
