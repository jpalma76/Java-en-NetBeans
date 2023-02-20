package decimales;
import java.text.DecimalFormat; //para la operacion con el objeto DecimalFormat()

import java.math.BigDecimal;
import java.math.RoundingMode;


public class ClasePrincipal {
    public static void main(String[] args) {
        
        int numero = 2;
        double raiz = Math.sqrt(numero);//sqrt calcula la raiz cuadrada de la variable
        
        System.out.println("la raiz cuadrada de " + numero + " es " + raiz);
        
        //Utilizando la clase decimalFormat.
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("la raiz cuadrada de " + numero + " es " + df.format(raiz));
        
        //Utilizando String Format.
        System.out.println("la raiz cuadrada de " + numero + " es " + String.format("%.2f", raiz));
        
        //Utilizando la clase Math.round - se importa la clase DecimalFormat.
        System.out.println("la raiz cuadrada de " + numero + " es " + (double)Math.round(raiz * 100d)/ 100);
        
        //Utilizando la clase BigDecimal - se importan las clases BigDecimal y RoundingMode.
        BigDecimal bd = new BigDecimal(raiz);
        bd = bd.setScale(4, RoundingMode.HALF_UP);
        System.out.println("la raiz cuadrada de " + numero + " es " + bd.doubleValue());
        
       
    }
}
