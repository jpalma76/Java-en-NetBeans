import java.util.Scanner;

public class VectoresFibonacci{
public static void main(String args[]){

   Scanner in = new Scanner(System.in);
   int longitud = 0;
   int i = 0, a = 0, b = 1, c = 0;

   System.out.print("Ingrese la cantidad de vectores que desea imprimir en pantalla: ");
   longitud = in.nextInt();

   for(i=0; i < longitud; i++){
     System.out.print("[" + a + "]");
     c = a + b;
     a = b;
     b = c;
   }

 }
}