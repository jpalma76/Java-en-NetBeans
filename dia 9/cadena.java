import java.util.Scanner;

public class Cadena{
  public static void main(String args[]){
   
   Scanner in = new Scanner(System.in);
   String cadena_original = "", cadena_substraccion = "";
   int num_caracteres, desde = 0, hasta = 0;
   
   System.out.print("Ingrese la cadena de caracteres: ");
   cadena_original = in.nextLine();
   System.out.println("");
   
   num_caracteres = cadena_original.length();

   System.out.print("la cadena " + cadena_original + " tiene " + num_caracteres + " caracteres.");
   System.out.println("");

   System.out.print("Desde que caracter deseas obtener la nueva cadena: ");
   desde = in.nextInt();
   System.out.println("");

   System.out.print("Hasta que caracter deseas obtener la nueva cadena: ");
   hasta = in.nextInt();
   System.out.println("");

   cadena_substraccion = cadena_original.substring(desde, hasta);

   System.out.println("La nueva cadena es: " + cadena_substraccion);
 }
}