//filas=3
//columnas=3
//contador=1

public class VectoresDinamicos{
  public static void main(String args[]){

   int i = 3, j = 3;
   int numeros[][]= new int[j][i];
   int contador = 1;

   for(j = 0; j < 3; j++){
     numeros[j][i] = contador;
     contador++;
     System.out.print("[" + numeros[j][i] + "]");
   }
   System.out.print("");
 }
}