package suma;
import java.util.Scanner;

public class SumaMain {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Dame el primer valor: ");
        int valorUno = in.nextInt();
        
        System.out.println("Dame el primer valor: ");
        int valorDos = in.nextInt();
        
        Suma valores = new Suma(valorUno, valorDos);
        valores.Imprimir();
    }
}
