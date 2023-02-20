import java.util.Scanner;

public class Numeros{
  public static void main(String args[]){
  
    Scanner in = new Scanner(System.in);
    String nombre = "";
    int cantidad = 0, a = 0, b = 0, c = 0;

    System.out.print("Ingrese su nombre: ");
    nombre = in.nextLine();
    System.out.println("");

    System.out.print("Ingrese cuantos numeros desea mostrar:");
    cantidad = in.nextInt();

    for(int i = 0; i <= cantidad; i++){
      if(i<cantidad){
        c = a + b;
        b++;       
        System.out.print(c + " ");
      }      
    }
  }
}