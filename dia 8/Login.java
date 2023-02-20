import java.util.Scanner;

public class Login{
public static void main(String args[]){


   Scanner in = new Scanner(System.in);
   String nombre = "";
   String clave = "";

   System.out.print("Usuario: ");
   nombre = in.nextLine();

   System.out.print("Clave: ");
   clave = in.nextLine();

   if(nombre.equals("Juan")){
     if(clave.equals("1234rs")){
       System.out.println("ACCESO CORRECTO!!!");
     } else {
         System.out.println("La clave no corresponde!!!");
       }
   } else{
       System.out.println("Usuario incorrecto!!!");
     }
 }
}