import java.util.Scanner;

public class Promedio{
  public static void main(String args[]){
   
   Scanner in = new Scanner(System.in);
   String nombre = "";
   int matematica = 0, biologia = 0, quimica = 0, promedio = 0;
  
   System.out.println("");
   System.out.println("");
   System.out.println("*****************************************");
   System.out.print("cual es el nombre del alumno: ");
   nombre = in.nextLine();

   System.out.println("");
   System.out.println("Notas del alumno.");
   System.out.println("_________________________________________");
   System.out.print("Matematica   : ");
   matematica = in.nextInt();
   
   System.out.println("");
   System.out.print("Biologia     : ");
   biologia = in.nextInt();
   
   System.out.println("");
   System.out.print("Quimica      : ");
   quimica = in.nextInt();

   promedio =  (matematica + biologia + quimica) /3;

   System.out.println("");

   if(promedio >= 6){
    System.out.println("El alumno aprobo: " + promedio);
  } else {
    System.out.println("El alumno reprobo: " + promedio);
  }
 }
}