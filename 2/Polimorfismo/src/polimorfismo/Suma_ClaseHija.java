package polimorfismo;

public class Suma_ClaseHija extends Operaciones_ClasePadre  {
    
    @Override
    public void Operaciones(){
        System.out.println("Suma:");
        resultado = valor1 + valor2;
    }
}
