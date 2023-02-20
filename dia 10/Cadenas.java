import java.util.Scanner;

public class Cadenas{
  public static void main(String args[]){

   Scanner in = new Scanner(System.in);
   String cadena_uno = "", cadena_dos = "";
   int desde = 0, hasta = 0, num_caracteres = 0;

   System.out.print("Ingresa una cadena de caracteres:");
   cadena_uno = in.nextLine();

   System.out.println("");
   num_caracteres = cadena_uno.length();
   System.out.println("la cadena de carcteres tiene " + num_caracteres + " caracteres.");
   
   System.out.println("");
   System.out.print("Desde que caracter quiere iniciar la nueva cadena de caracteres?");
   desde  = in.nextInt();

   System.out.println("");
   System.out.print("Hasta que caracter quiere iniciar la nueva cadena de caracteres?");
   hasta  = in.nextInt();

   System.out.println("");
   cadena_dos = cadena_uno.substring(desde, hasta);
   System.out.println("la nueva cadena de caracteres es: " + cadena_dos);
 }
}