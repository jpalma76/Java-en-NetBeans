
package decimales;
import java.text.DecimalFormat;
public class ClaseDecimalFormat {
    public static void main(String[] args) {
        
        int numero = 2;
        double raiz = Math.sqrt(numero);
        DecimalFormat df = new DecimalFormat("#.00");
        
        System.out.println("La raiz cuadrada de " + numero + " es: " + df.format(raiz));
    }
}
