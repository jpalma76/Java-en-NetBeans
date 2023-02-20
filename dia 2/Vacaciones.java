import java.util.Scanner;

public class Vacaciones{
   public static void main(String args[]){

   Scanner entrada = new Scanner(System.in);
   String nombre = "";
   int clave = 0, antiguedad = 0;
   

   System.out.println("*******************************************");
   System.out.println("* Bienvenido al Sistema Vacacional        *");
   System.out.println("* de Coca -Cola Company.                  *");
   System.out.println("*                                         *");
   System.out.println("* Programa hecho por Juan Palma Inc.      *");
   System.out.println("*                                         *");
   System.out.println("*******************************************");
   System.out.println("");
   System.out.println("");

   System.out.println("Ingreso de Datos:");
   System.out.println("___________________________________________");

   
   System.out.print("Ingrese el Nombre: ");
   nombre = entrada.nextLine();
   System.out.println("");

   System.out.print("Cuanto tiempo de Servicio tiene el trabajador: ");
   antiguedad = entrada.nextInt();
   System.out.println("");

   System.out.print("Ingrese clave del trabajador: ");
   clave = entrada.NextInt();
   System.out.println("");

  
 }
}