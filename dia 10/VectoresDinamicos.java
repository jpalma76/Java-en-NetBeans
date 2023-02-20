import java.util.Scanner;

public class VectoresDinamicos{
public static void main(String args[]){

   int longitud = 0, i = 0;
   Scanner in = new Scanner(System.in);
   
   System.out.print("Cuantos numeros deseas ingresar?");
   longitud = in.nextInt();

   int numeros[] = new int[longitud];

   for(i = 0; i < numeros.length; i++ ){
     System.out.print("Dame el valor #" + (i + 1) + " = ");
     numeros[i] = in.nextInt();
   }

   for(i = 0; i < numeros.length; i++){
     System.out.print("[" + numeros[i] + "]");
   }
 }
}