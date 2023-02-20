import java.util.Scanner;

public class Operaciones{
public static void main(String args[]){
   
   Scanner in = new Scanner(System.in);
   int num_uno = 0;
   int num_dos = 0;
   int resultado = 0;

   System.out.println("Estos es una suma:");
   System.out.println("");
   System.out.print("Ingrese el primer numero: ");
   num_uno = in.nextInt();
   System.out.println("");

   System.out.print("Ingrese el Segundo numero: ");
   num_dos = in.nextInt();

   System.out.println("");
   resultado = num_uno + num_dos;
   System.out.print("El resultado de tu suma es: " + resultado);
   System.out.println("");

   num_uno = 0;
   num_dos = 0;
   resultado = 0;

   System.out.println("");
   System.out.println("Esto es un resta:");
   System.out.println("");
   System.out.print("Ingrese el primer numero: ");
   num_uno = in.nextInt();
   System.out.println("");

   System.out.print("Ingrese el Segundo numero: ");
   num_dos = in.nextInt();

   System.out.println("");
   resultado = num_uno - num_dos;
   System.out.print("El resultado de tu resta es: " + resultado);
   System.out.println();

   num_uno = 0;
   num_dos = 0;
   resultado = 0;

   System.out.println("");
   System.out.println("Esto es una multiplicacion:");
   System.out.println("");
   System.out.print("Ingrese el primer numero: ");
   num_uno = in.nextInt();
   System.out.println("");

   System.out.print("Ingrese el Segundo numero: ");
   num_dos = in.nextInt();

   System.out.println("");
   resultado = num_uno * num_dos;
   System.out.println("El resultado de tu multiplicacion es: " + resultado);
   System.out.println("");

   num_uno = 0;
   num_dos = 0;
   resultado = 0;

   System.out.println("");
   System.out.println("Esto es una division:");
   System.out.println("");
   System.out.print("Ingrese el primer numero: ");
   num_uno = in.nextInt();
   System.out.println("");

   System.out.print("Ingrese el Segundo numero: ");
   num_dos = in.nextInt();

   System.out.println("");
   resultado = num_uno / num_dos;
   System.out.print("El resultado de tu division es: " + resultado);


 }
}