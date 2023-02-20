import java.util.Scanner;

public class Operaciones{
  public static void main(String args[]){

  int num1 = 0, num2 = 0, resultado = 0, parametro = 0;
  Scanner in = new Scanner(System.in);
  String nombre = "";

  System.out.println("");
  System.out.println("          Programa de Operaciones matematicas.");
  System.out.println("");

  System.out.print("Ingrese su nombre:");
  nombre = in.nextLine();
  System.out.println("");

  System.out.print("Ingrese el primer numero: ");
  num1 = in.nextInt();
  System.out.println("");

  System.out.print("Ingrese el segundo numero: ");
  num2 = in.nextInt();
  System.out.println("");

  System.out.println("1.- Suma:");
  System.out.println("2.- Resta");
  System.out.println("3.- Multiplicacion");
  System.out.println("4.- Division");

  System.out.print("Hola " + nombre + ", que operacion desea realizar: ");
  parametro = in.nextInt();
  System.out.println("");

  
  switch(parametro){
    
    case 1: resultado = num1 + num2;
            System.out.println("El resultado de tu suma es: " + resultado);
            break;

    case 2: resultado = num1 - num2;
            System.out.println("El resultado de tu resta es: " + resultado);
            break;

    case 3: resultado = num1 * num2;
            System.out.println("El resultado de tu multiplicacion es: " + resultado);
            break;

    case 4: resultado = num1 / num2;
            System.out.println("El resultado de tu division es: " + resultado);
            break;

    default: System.out.println("Error, la opcion no existe!!!");
  } 

  }
}