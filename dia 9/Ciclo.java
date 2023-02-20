public class Ciclo{
public static void main(String args[]){

   int i = 0;

   System.out.println("Serie con For:");

   for(i= 0; i <= 10; i++){
     if(i < 10){
       System.out.print(i + ",");       
     } else {
       System.out.println(i);
       }
   }
   i = 1;

   System.out.println("");
   System.out.println("Serie con while:");
   
   while(i <= 10){
   if(i < 10){
       System.out.print(i + ",");       
     } else {  
       System.out.println(i);
       }
     i++; 
   }
   i = 1;
   System.out.println("");
   System.out.println("Serie con do-while:");

   do{
     if(i < 10){
       System.out.print(i + ",");       
     } else {  
       System.out.println(i);
       }
     i++; 
   } while(i <= 10);

 }
}