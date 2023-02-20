package decimales;
import java.text.DecimalFormat;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class ClasePrincipal {
    public static void main(String[] args) {
        
        double numero = 2;
        double raiz = Math.sqrt(numero);
        System.out.println("La raiz cuadrada de " + numero + " es: " + raiz);
        
        //limitar utilizando DEcimalFormat
        DecimalFormat df = new DecimalFormat("#.0000");
        System.out.println("La raiz cuadrada de " + numero + " es: " + df.format(raiz));
        
        //Utilizando la clase StringFormat
        System.out.println("La raiz cuadrada de " + numero + " es: " + String.format("%.2f", raiz));
        
        //utilizando la clase Math.round
        System.out.println("La raiz cuadrada de " + numero + " es: " + (double)Math.round(raiz*10000d)/10000);
        
        //Utilizando la clase BigDecimal
        BigDecimal bd = new BigDecimal(raiz);
        System.out.println("La raiz cuadrada de " + numero + " es: " + raiz);
    }

}
