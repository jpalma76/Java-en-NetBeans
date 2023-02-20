public class Fibonacci{
  public static void main(String args[]){

   int i = 0, a = 0, b = 1, c = 0;
   
   System.out.println("Serie con for:");
   for(i = 0; i < 20; i++){
     if(i < 19){
       System.out.print(a + ", ");
       c = a + b;
       a = b;
       b = c;
     } else{
         System.out.println(a);
       }
   }
   System.out.println("");
   i = 0;
   a = 0;
   b = 1;
   c = 0;

   System.out.println("Serie con while:");
   while(i < 20){
     if(i < 19){
       System.out.print(a + ", ");
       c = a + b;
       a = b;
       b = c;
     } else{
         System.out.println(a);
       }
     i++;
   }
   System.out.println("");
   i = 0;
   a = 0;
   b = 1;
   c = 0;
   System.out.println("Serie con do-while:");
   do{
     if(i < 19){
       System.out.print(a + ", ");
       c = a + b;
       a = b;
       b = c;
     } else{
         System.out.println(a);
       }
     i++;
   } while(i < 20);
 }
}