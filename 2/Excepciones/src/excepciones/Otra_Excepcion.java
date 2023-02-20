package excepciones;

import java.util.Scanner;

public class Otra_Excepcion {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int valor;
        
        try {
            
            System.out.println("Digite un valor: ");
            valor = in.nextInt();
        
            System.out.println("El valor es: " + valor);
            
        } catch (Exception excepcion){
            System.out.println("Ocurrio una excepcion");
            excepcion.printStackTrace(System.out);
        } finally{
            //finalmente
            System.out.println("Cerramos el programa");
        }
    }
}
