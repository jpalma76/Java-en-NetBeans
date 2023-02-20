import java.util.Scanner;

public class Suma {
  public static void main(String args[]) {

   String nombre = "";
   Scanner in = new Scanner(System.in);
   
   int num_uno = 0, num_dos = 0, resultado;
   int parametro = 0;
   
   resultado = num_uno + num_dos;
   
   System.out.println("Esto es una operacion matematica con ingreso");
   System.out.println(" de variables y con el resultado dependiente");
   System.out.println("de un parametro");
   System.out.println("______________________________________________");
  
   System.out.print("Cual es tu nombre: ");
   nombre = in.nextLine();

   System.out.print("Ingresa el primer numero: ");
   num_uno = in.nextInt();

   System.out.print("Ingresa el segundo numero: ");
   num_dos = in.nextInt();

   System.out.println("1.- Suma.");
   System.out.println("2.- Resta.");
   System.out.println("3.- Multiplicacion.");
   System.out.println("4.- Division.");
   
   System.out.println("");
   System.out.print("Elije la Operacion matematica a resolver: ");
   parametro =in.nextInt();   
   
   switch(parametro){

     case 1: resultado = num_uno + num_dos;
             System.out.println("El resultado de la suma es: " + resultado);
             break;

     case 2: resultado = num_uno - num_dos;
             System.out.println("El resultado de la resta es: " + resultado);
             break;

     case 3: resultado = num_uno * num_dos;
             System.out.println("El resultado de la multiplicacion es es: " + resultado);
             break;

     case 4: resultado = num_uno / num_dos;
             System.out.println("El resultado de la division es: " + resultado);
             break;

     default: System.out.println("Error, parametro incorrecto!!!");
             break;  

   }

 }
}