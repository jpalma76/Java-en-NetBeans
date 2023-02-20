package area;

public class Rectangulo {
    private int base, altura, area;
    
    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    public void Operacion(){
        area = base*altura;
    }
    public void Imprimir(){
        Operacion();
        System.out.println("El area del rectangulo es: " + area);
    }
}
