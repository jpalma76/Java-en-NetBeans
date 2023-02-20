package area;

public class Rectangulo {
    
    int vBase, vAltura, area;

    Rectangulo(int base, int altura) {
        this.vBase = base;
        this.vAltura = altura;
    }
    
    public void Rectangulo(int base, int altura){
        this.vBase = base;
        this.vAltura = altura;
    }
    public void Operacion(){
        area = vBase * vAltura;        
    }
    public void Imprimir(){
        Operacion();
        System.out.println("El area del rectangulo es: " + area);
    }
}
