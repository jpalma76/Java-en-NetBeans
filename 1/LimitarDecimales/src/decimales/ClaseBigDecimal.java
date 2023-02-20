package decimales;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ClaseBigDecimal {

    public static void main(String[] args) {

        int numero = 2;
        double raiz = Math.sqrt(numero);
        BigDecimal bd = new BigDecimal(raiz);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        System.out.println("La raiz cuadrada de " + numero + " es: " + bd.doubleValue());
    }
}
