
package lista_tipo_pila;

import javax.swing.JOptionPane;

public class Pila {
    
    private Nodo UltimoValorIngresado;
    int tamano = 0;
    String Lista = "";
    
    public Pila(){
        UltimoValorIngresado = null;
        tamano = 0;
    }
    
    //metodo para saber cuando la pila está vacía
    public boolean PilaVacia(){
        return UltimoValorIngresado == null; 
    }
    
    //metodo para insertar un nodo en la pila 
    public void InsertarNodo(int nodo){
        Nodo nuevo_nodo = new Nodo(nodo); 
        nuevo_nodo.siguiente = UltimoValorIngresado;
        UltimoValorIngresado = nuevo_nodo;
        tamano++;
    }
    
    //metodo para eliminar un nodo de la pila
    public int EliminarNodo(){
        int auxiliar = UltimoValorIngresado.informacion;
        UltimoValorIngresado = UltimoValorIngresado.siguiente;
        tamano--;
        return auxiliar;
    }
    
    //metodo para conocer el ultimop valor ingresado
    public int MostrarUltimoValorIngresado(){
        return UltimoValorIngresado.informacion;
    }
    
    //metodo para conocer el tamaño de la pila
    public int tamanoPila(){
        return tamano;
    }
    
    //metodo para vaciar la pila
    public void VaciarPila(){
        while(!PilaVacia()){
            EliminarNodo();
        }
    }
    
    //metodo para mostrar el contenido de la pila
    public void MostrarValores(){
        Nodo recorrido = UltimoValorIngresado;
        
        while(recorrido != null){
            Lista += recorrido.informacion + "\n";
            recorrido = recorrido.siguiente;
        }
        JOptionPane.showMessageDialog(null, Lista);
        Lista = "";
    }
}
