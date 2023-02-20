
package operacion;

public class Multiplicacion {
    
    int valor1, valor2, resultado;
    
    public Multiplicacion(int num1, int num2){
        this.valor1 = num1;
        this.valor2 = num2;
    }
    
    public void Operacion(){
        resultado = valor1 * valor2;
    }
    
    public void Imprimir(){
        Operacion();
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
}
