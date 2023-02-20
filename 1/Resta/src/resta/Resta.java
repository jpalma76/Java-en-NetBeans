
package resta;

public class Resta {
    
    int vUno, vDos, resultado;
    
    public Resta(int num1, int num2){
        this.vUno = num1;
        this.vDos = num2;
    }
    
    public void Operacion(){
        resultado = vUno - vDos;
    }
    
    public void Imprimir(){
        Operacion();
        System.out.println("El resultado de la resta es: " + resultado);
    }
}
