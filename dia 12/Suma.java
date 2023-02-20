import java.util.Scanner;

public class Suma{
public static void main(String args[]){
   
   Scanner in = new Scanner(System.in);
   int num1 = 0, num2 = 0, resultado;

   System.out.print("Ingrese el primer numero: ");
   num1 = in.nextInt();
   System.out.print("");

   System.out.print("Ingrese el Segundo numero: ");
   num2 = in.nextInt();

   System.out.print("");
   resultado = num1 + num2;
   System.out.print("El resultado de tu suma es: " + resultado);

 }
}