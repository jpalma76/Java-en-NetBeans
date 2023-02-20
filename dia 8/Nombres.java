import java.util.Scanner;

public class Nombres{
public static void main(String args[]){

   String nombre_uno = "", nombre_dos = "";
   Scanner in = new Scanner(System.in);

   System.out.print("ingrese el primer nombre : ");
   nombre_uno = in.nextLine();

   System.out.print("ingrese el segundo nombre : ");
   nombre_dos = in.nextLine();

   if(nombre_uno.equalsIgnoreCase(nombre_dos)){
     System.out.println("Los nombres son iguales");
   } else {
     System.out.println("Los nombres son distintos");
     }
 }
}