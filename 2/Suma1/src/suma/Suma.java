package suma;

public class Suma {

    int valor1, valor2, resultado;
    public Suma(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }    
    public void Operacion(){
        resultado = valor1 + valor2;
    }
    public void Imprimir(){
        Operacion();
        System.out.print("El resultado de la suma es: " + resultado + "\n");
    }
    

}
