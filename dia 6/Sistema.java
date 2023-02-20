// Sistema de Vacaciones de Coca-cola.
// variables nombre, clave y antiguedad.

import java.util.Scanner;

public class Sistema{
  public static void main(String args[]){

   Scanner in = new Scanner(System.in);
   String nombre = "";
   int clave = 0, antiguedad = 0;

   System.out.println("");
   System.out.println("*******************************************************");
   System.out.println("* Bienvenido al sistema vacacional Coca-Cola Company. *");
   System.out.println("* Programa hecho por Juan Palma - @jpalma76           *");
   System.out.println("*******************************************************");
   System.out.println("");

System.out.println("CLAVES DE AREA.");
   System.out.println("             1.- Atencion a clientes");
   System.out.println("             2.- Logistica");
   System.out.println("             3.- Gerencia");
   System.out.println("");

   System.out.println("INGRESO DE DATOS DEL TRABAJADOR.");
   System.out.print("Ingrese el nombre del trabajador: ");
   nombre = in.nextLine();

   System.out.println("");
   System.out.print("Ingrese la clave del trabajador: ");
   clave = in.nextInt();
   
   System.out.println("");
   System.out.print("Ingrese la antiguedad del trabajador: ");
   antiguedad = in.nextInt();

   
   if(clave == 1){
     if(antiguedad == 1){
       System.out.print("el trabajador " + nombre + ", tiene derecho a 6 dias de vacaciones.");
     } else if(antiguedad >= 2 && antiguedad <= 6){
              System.out.print("el trabajador " + nombre + ", tiene derecho a 10 dias de vacaciones.");
            } else if(antiguedad >= 7){
              System.out.print("el trabajador " + nombre + ", tiene derecho a 20 dias de vacaciones."); 
            } else {
              System.out.print("el trabajador " + nombre + ", todavia no tiene derecho a vacaciones.");
            }

   } else if(clave ==2){
            if(antiguedad == 1){
              System.out.print("el trabajador " + nombre + ", tiene derecho a 7 dias de vacaciones.");
            } else if(antiguedad >= 2 && antiguedad <= 6){
              System.out.print("el trabajador " + nombre + ", tiene derecho a 15 dias de vacaciones.");
            } else if(antiguedad >= 7){
              System.out.print("el trabajador " + nombre + ", tiene derecho a 22 dias de vacaciones."); 
            } else {
               System.out.print("el trabajador " + nombre + ", todavia no tiene derecho a vacaciones.");
            }
            
   } else if(clave == 3){
            if(antiguedad == 1){
              System.out.print("el trabajador " + nombre + ", tiene derecho a 10 dias de vacaciones.");
            } else if(antiguedad >= 2 && antiguedad <= 6){
              System.out.print("el trabajador " + nombre + ", tiene derecho a 20 dias de vacaciones.");
            } else if(antiguedad >= 7){
              System.out.print("el trabajador " + nombre + ", tiene derecho a 30 dias de vacaciones."); 
            } else {
               System.out.print("el trabajador " + nombre + ", todavia no tiene derecho a vacaciones.");
            }          

   } else {
       System.out.print("ERROR, la clave no corresponde!!!");
     }

 }
}