package lista_tipo_pila;

import javax.swing.JOptionPane;

public class ClasePrincipal {
    public static void main(String[] args) {
        int opcion = 0, nodo = 0;
        Pila pila = new Pila();
        
        do{
            
            try{
                
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Menu de Opciones.\n\n"
                    + "1.- Insertar un nodo\n"
                    + "2.- Eliminar un nodo\n"
                    + "3.- ¿la pila está vacía?\n"
                    + "4.- ¿Cual es el último valor ingresado en la pila?\n"
                    + "5.- ¿Cuantos nodos tiene la pila\n"
                    + "6.- Vaciar la Pila\n"
                    + "7.- Mostrar el contenido de la pila\n"
                    + "8.- Salir\n"));
                        
                switch (opcion) {
                    case 1:
                        nodo = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Por favor Ingresa el valor a guardar en el nodo: "));
                        pila.InsertarNodo(nodo);
                        break;
                        
                    case 2:
                        if (!pila.PilaVacia()) {
                            JOptionPane.showMessageDialog(null, "Se ha eliminado un nodo con el valor : "
                                    + pila.EliminarNodo());
                        } else {
                            JOptionPane.showMessageDialog(null, "la pila está vacia");
                        }
                        break;
                        
                    case 3:
                        if (pila.PilaVacia()) {
                            JOptionPane.showMessageDialog(null, "la pila está vacia");
                        } else {
                            JOptionPane.showMessageDialog(null, "la pila NO está vacia");
                        }
                        break;
                        
                    case 4:
                        if (!pila.PilaVacia()) {
                            JOptionPane.showMessageDialog(null, "El ultimo valor ingresado es: " 
                                    + pila.MostrarUltimoValorIngresado());
                        } else {
                        }
                        break;
                        
                    case 5:
                        JOptionPane.showMessageDialog(null, "la pila contiene " + pila.tamanoPila() + " nodos");
                        break;
                        
                    case 6:
                        if (!pila.PilaVacia()) {
                            pila.VaciarPila();
                            JOptionPane.showMessageDialog(null, "la pila se ha vaciado correctamente");
                        } else {
                            JOptionPane.showMessageDialog(null, "la pila está vacia");
                        }
                        break;
                        
                    case 7:
                        pila.MostrarValores();
                        break;
                        
                    case 8:
                        JOptionPane.showMessageDialog(null, "Hasta pronto!!!");
                        opcion = 8;
                        break;
                    
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta, vuelva a intentar nuevamente.");
                        break;
                }
                
            }catch(NumberFormatException e){
                
            }
            
        }while(opcion != 8);
        
        
    }
}
