package polimorfismo;

public class Resta_CLaseHija extends Operaciones_ClasePadre{

    @Override
    public void Operaciones(){
        System.out.println("Resta: ");
        resultado = valor1 - valor2;
    }
}
