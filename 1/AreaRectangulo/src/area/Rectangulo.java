
package area;

public class Rectangulo {
    
    int base, altura, area;
    
    public Rectangulo(int base, int altura){ //este es el constructor donde llegan
        this.base = base; // los valores enviados desde la otra clase.
        this.altura = altura;
    }
    
    public void Operacion(){
        area = base * altura;
    }
    
    public void Imprimir(){
        Operacion();
        System.out.println("Ela area del rectangulo es: " + area + " cm cuadrados");
    }
}
