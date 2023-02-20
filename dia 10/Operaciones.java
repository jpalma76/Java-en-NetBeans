//operaciones con shitch case.

public class Operaciones{
  public static void main(String args[]){

   int a = 6, b = 3, resultado = 0;
   int parametro = 5;

   switch(parametro){
     case 1: resultado = a + b;
             System.out.println("el resultado de la suma es: " + resultado);
             break;

     case 2: resultado = a - b;
             System.out.println("el resultado de la resta es: " + resultado);
             break;

     case 3: resultado = a * b;
             System.out.println("el resultado de la multiplicacion es: " + resultado);
             break;

     case 4: resultado = a / b;
             System.out.println("el resultado de la division es: " + resultado);
             break;

     default: System.out.println("la opcion no corresponde!!!");

   }
 }
}