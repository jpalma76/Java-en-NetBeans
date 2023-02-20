
package decimales;

public class ClaseStringFormat {
    public static void main(String[] args) {
        
        double numero = 2;
        double raiz = Math.sqrt(numero);
         
        System.out.println("La raiz cuadrada de " + numero + " es: " + String.format("%.2f", raiz));
    }
}
