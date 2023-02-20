import java.util.Scanner;

public class VectoresDinamicos{
public static void main(String args[]){

  int longitud = 0;
  Scanner in = new Scanner(System.in);

  System.out.print("cuantos numeros deseas ingresar?: ");
  longitud = in.nextInt();

  int numeros[] = new int[longitud];

  for(int i = 0; i < numeros.length; i++){
    System.out.print("por favor, dame el valor #" + (i + 1) + " = ");
    numeros[i] = in.nextInt();
  }
  for(int  i = 0; i < numeros.length; i++){
    System.out.print("[" + numeros[i] + "]");
}

 }
}