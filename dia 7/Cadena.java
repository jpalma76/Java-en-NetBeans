import java.util.Scanner;

public class Cadena{
  public static void main(String args[]){

   String cadena_original = "", cadena_substraccion = "";
   int num_caracteres = 0, desde = 0, hasta = 0;
   Scanner in = new Scanner(System.in);
  
   System.out.print("Ingrese una cadena de caracteres: ");
   cadena_original = in.nextLine();

   System.out.print("");
   num_caracteres = cadena_original.length();
   System.out.println("la cadena de caracteres " + cadena_original + " posee " +
                       num_caracteres + " caracteres");

   System.out.print("desde que carcter deseas obtener la nueva cadena: ");
   desde = in.nextInt();
   
   System.out.print("");
   System.out.print("hasta que carcter deseas obtener la nueva cadena: ");
   hasta = in.nextInt();

   System.out.print("");
   cadena_substraccion = cadena_original.substring(desde, hasta);
   System.out.println("la nueva cadena de caracteres es: " + cadena_substraccion);   
 }
}