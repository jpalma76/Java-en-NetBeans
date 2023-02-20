import java.util.Scanner;

public class Ingreso{
  public static void main(String args[]){
   String usuario = "", clave = "";

   Scanner in = new Scanner(System.in);
   System.out.print("Ingrese su nombre: " );
   usuario = in.nextLine();

   System.out.print("Ingrese su clave: " );
   clave = in.nextLine();

   if(usuario.equals("Juan") && clave.equals("123456")){
     System.out.println("Inicio de secion es correcto!!!");    
   } else{
       System.out.println("El inicio de secion es incorrecto!!!");
     }
 }
}