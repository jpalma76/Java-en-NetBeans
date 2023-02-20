import java.util.Scanner;

public class Login{
  public static void main(String args[]){

   String usuario = "", password = "";
   Scanner in = new Scanner(System.in);

   System.out.print("Ingrese su usuario: ");
   usuario = in.nextLine();

   System.out.print("Ingrese su clave: ");
   password = in.nextLine();

   if(usuario.equals("Juan")){ 
     if(password.equals("1234")){
       System.out.print("Inicio de sesion correcto!!!");
   } else {
       System.out.print("La clave no corresponde!!!");
     }    
   } else {
     System.out.print("El nombre de usuario no corresponde!!!");
     }
 }
}