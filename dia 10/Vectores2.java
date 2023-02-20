import java.util.Scanner;

public class Vectores2{
  public static void main(String args[]){
   
   Scanner in = new Scanner(System.in);
   int vector[] = new int[5];
   int nv = 0, vv = 0, cont = 1, n = 0, cont2 = 0;

   System.out.print("Ingrese el primer valor de la cadena de vectores: ");
   n = in.nextInt(); 
   vv = n;
   cont2 = n;

   while(cont <= cont2){
     if(cont < cont2){
       System.out.print("[" + nv + "]" + " = " + vv + ", ");
       nv++;
       vv += n;

     }else{
       System.out.println("[" + nv + "]" + " = " + vv);      
    }
    cont++;
   }
 }
}