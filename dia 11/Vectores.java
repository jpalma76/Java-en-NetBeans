public class Vectores{
public static void main(String args[]){

 int numeros[] = new int[5];

for(int i = 0; i < numeros.length; i++){
  numeros[i] = i+10;
}
for(int  i = 0; i < numeros.length; i++){
   System.out.print("[" + numeros[i] + "]");
}

 }
}