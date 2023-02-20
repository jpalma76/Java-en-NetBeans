public class Operaciones2{
  public static void main(String args[]){
     
  
  int num_uno = 4, num_dos = 4, operacion = 4, resultado = 0;

  System.out.println("");
  System.out.println("");
  System.out.println("");
  System.out.println("*******************************************");
  System.out.println("*Prueba de variables if - else             ");
  System.out.println("*******************************************");
  System.out.println("");

  if(operacion == 1) {
     resultado = num_uno + num_dos;
     System.out.println("El resultado de la suma es: " + resultado);
  } else {
      if(operacion == 2) {
        resultado = num_uno - num_dos;
        System.out.println("El resultado de la resta es: " + resultado);
      } else {
          if(operacion == 3) {
            resultado = num_uno * num_dos;
            System.out.println("El resultado de la multiplicacion es: " + resultado);
          } else {
              if(operacion == 4) {
                resultado = num_uno / num_dos;
                System.out.println("El resultado de la division es: " + resultado);
              } else {
                  System.out.println("ERROR!!! La operacion no corresponde. ");
                }
            }  
        } 
    }
 }
}

