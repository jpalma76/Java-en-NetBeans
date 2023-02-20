import java.util.Scanner;

public class MatricesDinamicas2{
  public static void main(String args[]){

   int filas = 3, columnas = 3, contador = 1;
   Scanner in = new Scanner(System.in);
   System.out.println("PROGRAMA DE MATRICES DINAMICAS.");
   System.out.println("===============================");
   System.out.print("Cuantas filas deseas: ");
   filas = in.nextInt();
   System.out.println("");

   System.out.print("Cuantas columnas deseas: ");
   columnas = in.nextInt();

   int numeros[][] = new int[filas][columnas];

   for(int j = 0; j < filas; j++){
     for(int i = 0; i < columnas; i++){
       numeros[j][i] = contador;
       contador++;
       System.out.print("[" + numeros[j][i] + "]");
     }
    System.out.println("");  
   } 
 }
}