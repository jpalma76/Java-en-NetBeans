import java.util.Scanner;

public class Sistema{
   public static void main(String args[]){

     Scanner entrada = new Scanner(System.in);
     String nombre = "";
     int clave = 0, antiguedad = 0;
     
     
     System.out.println("************************************************************");
     System.out.println("* Bienvenido al Sistema Vacacional de Coca - Cola Company. *");
     System.out.println("*                                                          *");
     System.out.println("* Programa hecho por Juan Palma Inc.                       *");
     System.out.println("*                                                          *");
     System.out.println("************************************************************");
     System.out.println("");
     System.out.println(""); 
     
     System.out.println("Ingreso de Datos:");
     System.out.println("____________________________________________________________");
     System.out.println("");
     
     System.out.print("Cual es el Nombre del trabajador: ");
     nombre = entrada.nextLine();
     System.out.println("");
     
     System.out.print("Cuanto tiempo de Servicio tiene el trabajador: ");
     antiguedad = entrada.nextInt();
     System.out.println("");
     
     System.out.print("Cual es la clave del trabajador: ");
     clave = entrada.nextInt();
     System.out.println("");

     if(clave == 0){
       System.out.println("ERROR : El trabajador no tiene derecho a vacaciones. ");
       System.out.println("JAJAJA MARGINAL IGUALADO ESTE!!!");
     } else
     
     if(clave ==1){
     
       if(antiguedad == 1){
         System.out.println("El trabajador " + nombre + " tiene derecho 6 dias de vacaciones");
       } else if(antiguedad >= 2 && antiguedad <=6){
         System.out.println("El trabajador " + nombre + " tiene derecho 14 dias de vacaciones");
       } else if(antiguedad >= 7){
        System.out.println("El trabajador " + nombre + " tiene derecho 20 dias de vacaciones");
       }
      
     } else if(clave ==2){
  
       if(antiguedad == 1){
         System.out.println("El trabajador " + nombre + " tiene derecho 7 dias de vacaciones");
       } else if(antiguedad >= 2 && antiguedad <=6){
         System.out.println("El trabajador " + nombre + " tiene derecho 15 dias de vacaciones");
       } else if(antiguedad >= 7){
         System.out.println("El trabajador " + nombre + " tiene derecho 22 dias de vacaciones");
       }
  
     } else if(clave ==3){
       
       if(antiguedad == 1){
         System.out.println("El trabajador " + nombre + " tiene derecho 10 dias de vacaciones");
       } else if(antiguedad >= 2 && antiguedad <=6){
         System.out.println("El trabajador " + nombre + " tiene derecho 20 dias de vacaciones");
       } else if(antiguedad >= 7){
         System.out.println("El trabajador " + nombre + " tiene derecho 30 dias de vacaciones");
       }
       
     } else{
       System.out.println("ERROR!!!, la clave de departamento es incorrecta");
     }
 }
}