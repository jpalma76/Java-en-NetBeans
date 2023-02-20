package paquete1;

public class ClaseJavaUno {
    public static void main(String[] args) {
        
        Atributos_Metodos mensajero = new Atributos_Metodos();
        mensajero.set_valorUno(15);
        mensajero.get_valorUno();
        System.out.println( "El valor es: " + mensajero.get_valorUno() );
    }
}
