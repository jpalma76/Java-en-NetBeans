package clases;

import javax.swing.JOptionPane;

public class Cola {

    private Nodo inicioCola, finalCola;
    String Cola = "";

    public Cola() {
        inicioCola = null;
        finalCola = null;
    }

    //Método para saber si la pila está vacia
    public Boolean colaVacia() {
        if (inicioCola == null) {
            return true;
        } else {
            return false;
        }
    }

    //Método para insertar a la cola
    public void Insertar(int informacion) {
        Nodo nuevo_nodo = new Nodo();
        nuevo_nodo.informacion = informacion;
        nuevo_nodo.siguiente = null;

        if (colaVacia()) {
            inicioCola = nuevo_nodo;
            finalCola = nuevo_nodo;
        } else {
            finalCola.siguiente = nuevo_nodo;
            finalCola = nuevo_nodo;
        }
    }

    //Método para extraer de la Cola
    public int Extraer() {
        if (!colaVacia()) {
            int informacion = inicioCola.informacion;

            if (inicioCola == finalCola) {
                inicioCola = null;
                finalCola = null;
            } else {
                inicioCola = inicioCola.siguiente;
            }
            return informacion;
        } else {
            return Integer.MAX_VALUE;
        }
    }
    
    //Método para mostrar el contenido de la cola
    public void MostrarContenido(){
        Nodo recorrido = inicioCola;
        String ColaInvertida = "";
        
        /*este ciclo toma todos los nodos ingresados en la fila y los acumula o
        * concatena en la variable Cola y toma el valor de la variable recorrido.siguiente
        * y los guarda e nla variable recorrido.
        */
        while (recorrido != null) {
            Cola += recorrido.informacion + " ";
            recorrido = recorrido.siguiente;            
        }
        
        //este metodo secciona la cadena convirtiendola en un array
        String cadena [] = Cola.split(" ");
        
        // este for toma cada parte del array y lo invierte por seccion o nodo
        for (int i = cadena.length - 1; i >= 0; i--) {
            ColaInvertida += " " + cadena[i];
        }
        
        /*Se imprime en pantaalla un JOptionpane cojn ña cola invertida y
        * finalmente se limpia la va,riable Cola.*/
        JOptionPane.showMessageDialog(null, ColaInvertida);
        Cola = "";
    }
}
