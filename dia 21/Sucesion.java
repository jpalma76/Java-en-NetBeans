import java.util.Scanner;

public class Sucesion{
  public static void main(String args[]){
    
    Scanner in = new Scanner(System.in);
    int n1 = 0, n2 = 1, resultado;
    
    System.out.print("Cuantos numeros desea mostrar: ");
    n1 = in.nextInt();

    for(int i = 0; i <= n1; i++){
      
      System.out.print(n2 + " ");
      n2 += 4;
    }
   
  }
}