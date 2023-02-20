public class Sucesion{
  public static void main(String args[]){

  int i= 0, contador = 0, limite = 10;
  int linea = 0;
  
  for(i=0; i < limite; i++){
     System.out.print(contador + " ");
      contador++;
  }

  for(i=limite; i >= 0; i--){
    System.out.print(contador + " ");
    contador--;
  }
 }
}