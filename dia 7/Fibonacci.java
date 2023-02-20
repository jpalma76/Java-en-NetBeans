public class Fibonacci{
public static void main(String args[]){

   int a = 0, b = 1, c = 0, i = 0;

   System.out.println("Serie con for:");
  
   for(i = 0; i <= 9; i++){
     if(i < 9){
       System.out.print(a + ", "); 
       c = a + b;
       a = b;
       b = c;      
     } else{
         System.out.println(a);
       }
   }

   a = 0;
   b = 1;
   c = 0;
   i = 0;
   System.out.println("");
   System.out.println("Serie con while:");

   while(i <= 9){
      if(i < 9){
       System.out.print(a + ", "); 
       c = a + b;
       a = b;
       b = c;      
     } else{
         System.out.println(a);
       }
       i++;
   }

   a = 0;
   b = 1;
   c = 0;
   i = 0;
   System.out.println("");
   System.out.println("Serie con do-while:");

   do{
          if(i < 9){
       System.out.print(a + ", "); 
       c = a + b;
       a = b;
       b = c;      
     } else{
         System.out.println(a);
       }
       i++;
   } while(i <= 9); 

 }
}