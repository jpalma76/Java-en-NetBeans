package paquete2;
import paquete1.Atributos_Metodos;

public class ClaseJavaDos {
    public static void main(String[] args) {
        
        Atributos_Metodos mensajero = new Atributos_Metodos();
        mensajero.set_valorUno(2);
        mensajero.get_valorUno();
        System.out.println( "El valor es: " + mensajero.get_valorUno() );
    }
}
