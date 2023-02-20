package area;
import java.util.Scanner;

public class RectanguloMain {
    public static void main(String[] args) {
        
        int base, altura;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("CALCULO AREA RECTANGULO.");
        System.out.println("");
        
        System.out.print("Dame el valor de la base: ");
        base = entrada.nextInt();
        
        System.out.print("Dame el valor de la Altura: ");
        altura = entrada.nextInt();
        
        Rectangulo mensajero = new Rectangulo(base, altura);
        mensajero.Imprimir();
    }

}
