public class Ciclos{
  public static void main(String args[]){

  int i = 1, j = 99;
  
  System.out.println("Ciclo con for:");
  for(i = 1; i <= 5; i++){
    if(i < 5){
      System.out.print(i + ",");
      System.out.print(j + ",");
      j--;
    } else {
        System.out.print(i + ",");
        System.out.print(j);
      }
  }

  System.out.println("");
  i=1;
  j=99;
  System.out.println("");

  System.out.println("Ciclo con while:");
    while(i <= 5){
      if(i < 5){
        System.out.print(i + ",");
        System.out.print(j + ",");
      } else {
          System.out.print(i + ",");
          System.out.print(j);
        }
        i++;
        j--;
    }

  System.out.println("");
  i=1;
  j=99;
  System.out.println("");

  System.out.println("Ciclo con do-while:");
  do {
    if(i < 5){
      System.out.print(i + ",");
      System.out.print(j + ",");
    } else {
        System.out.print(i + ",");
        System.out.print(j);
      }
      i++;
      j--;
  } while(i <=5);


  }
}