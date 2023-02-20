//Fila = 3
//Columna = 3
//contador = 1
//j=filas, i=columnas

public class MatricesDinamicas{
  public static void main(String args[]){

   int j = 0, i = 0, contador = 1;
   int columna = 0;
   int fila = 0;

   int numeros[][] = new int[3][3];

   for(fila = 0; fila < 3; fila++){

     for(columna =0; columna < 3; columna++){
       System.out.print("[" + contador + "]");
       if(contador == 3){
         System.out.println("");
       }
       if(contador == 6){
         System.out.println("");
       } 
       contador++;
     }
     System.out.print("");
   }

 }
}