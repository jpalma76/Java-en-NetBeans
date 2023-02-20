package excepciones;

public class testExcepciones {
    
    public static void main(String[] args) {
        
        //dividir un numero entre cero
        int num1 = 10, num2 =0, resultado = 0;
        try{
            int division = num1/num2;
            System.out.println("la division es: " + division);
        } catch(Exception excepcion){
            System.out.println("Excepción: " + excepcion.getMessage());
            System.out.println("Ha ocurrido una excepción");
            excepcion.printStackTrace(System.out);
        }
    }
}
