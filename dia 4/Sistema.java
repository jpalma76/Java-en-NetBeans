import java.util.Scanner;

public class Sistema {
  public static void main(String args[]) {
   String entrada = "";
   Scanner entrada = new Scanner(System.in);
   String nombre = "";
   int clave = 0, antiguedad = 0;

   System.out.println("");
   System.out.println("");
   System.out.println("**********************************************************");
   System.out.println("* Bienvenido al sistema vacacional de Coca-Cola Company. *");
   System.out.println("* Programa creado por Juan Palma                         *");
   System.out.println("**********************************************************");
   System.out.println("");

   System.out.println("              Claves por departamentos.");
   System.out.println("");
   System.out.println("             1.- Atencion a clientes.");
   System.out.println("             2.- Logistica.");
   System.out.println("             3.- Gerencia.");
   System.out.println("");
   
   System.out.println("Ingreso de datos:");
   System.out.println("");

   System.out.print("Ingrese el nombre del trabajador : ");
   nombre = entrada.nextLine();
   System.out.println("");

   System.out.print("Ingrese antiguedad del trabajador: ");
   antiguedad = entrada.nextInt();
   System.out.println("");

   System.out.print("Ingrese la clave del trabajador: ");
   clave = entrada.nextInt();
   System.out.println("");

   if(clave == 1) {
     if(antiguedad == 1) {
       System.out.println("El trabajador " + nombre + ", tiene derecho a 6 dias de vacaciones.");
     } else
     if(antiguedad >= 2 && antiguedad <= 6) {
       System.out.println("El trabajador " + nombre + ", tiene derecho a 14 dias de vacaciones.");
     } else
     if(antiguedad >= 7) {
        System.out.println("El trabajador " + nombre + ", tiene derecho a 20 dias de vacaciones.");
     } else
       System.out.println("El trabajador " + ", todavia no tiene derecho a vacaciones.");
   } else

   if(clave ==2) {
     if(antiguedad == 1) {
       System.out.println("El trabajador " + nombre + ", tiene derecho a 7 dias de vacaciones.");
     } else
     if(antiguedad >= 2 && antiguedad <= 6) {
       System.out.println("El trabajador " + nombre + ", tiene derecho a 15 dias de vacaciones.");
     } else
     if(antiguedad >= 7) {
        System.out.println("El trabajador " + nombre + ", tiene derecho a 22 dias de vacaciones.");
     } else
       System.out.println("El trabajador " + ", todavia no tiene derecho a vacaciones.");
   } else
     
   if(clave == 3) {
        if(antiguedad == 1) {
       System.out.println("El trabajador " + nombre + ", tiene derecho a 10 dias de vacaciones.");
     } else
     if(antiguedad >= 2 && antiguedad <= 6) {
       System.out.println("El trabajador " + nombre + ", tiene derecho a 20 dias de vacaciones.");
     } else
     if(antiguedad >= 7) {
        System.out.println("El trabajador " + nombre + ", tiene derecho a 30 dias de vacaciones.");
     } else
       System.out.println("El trabajador " + ", todavia no tiene derecho a vacaciones.");
   } else

      System.out.println("ERROR: La clave no corresponde!!!");
   }

}