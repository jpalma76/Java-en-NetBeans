public class Principal{


  public static void main(String args[]){
  
   String mensaje = "Juan Palma";
   char array[] = mensaje.toCharArray();
   for(int i = 0; i < array.length; i++){
     array[i] = (char)(array[i] * (char)5);
   }
   
   String encriptado = String.valueOf(array);
   System.out.println(encriptado);
   char arrayD[] = encriptado.toCharArray();

   for(int i = 0; i < arrayD.length; i++){
     arrayD[i] = (char)((arrayD[i]) - (char)3);
     String desencriptado = String.valueOf(arrayD);
     System.out.println(desencriptado);
   }
 }
}