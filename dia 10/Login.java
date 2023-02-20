import java.util.Scanner;

public class Login{
  public static void main(String artg[]){
   
   String usuario = "", password = "";
   Scanner in = new Scanner(System.in);

   System.out.print("Ingrese Usuario:");
   usuario = in.nextLine();

   System.out.print("Ingrese Clave:");
   password = in.nextLine();
  
   if(usuario.equals("Juan")){
     if(password.equals("1234")){
       System.out.println("Ingreso Correcto, Bienvenido:");
     } else{
       System.out.println("clave incorrecta!!!");
     }
   } else{
     System.out.println("Usuario incorrecto!!!");
   }

 }
}