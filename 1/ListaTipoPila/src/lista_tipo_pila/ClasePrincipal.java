package lista_tipo_pila;

import javax.swing.JOptionPane;

public class ClasePrincipal {
    
    public static void main(String[] args) {
        
        int opcion = 0, nodo = 0;
        Pila pila = new Pila();
        while(opcion != 8){
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menú de Opciones\n\n"
                        + "1.- Insertar un Nodo\n"
                        + "2.- Eliminar un Nodo\n"
                        + "3.- ¿La Pila está vacía?\n"
                        + "4.- ¿Cual es el último valor ingresado\n"
                        + "5.- ¿Cuantos Nodos tiene la Pila\n"
                        + "6.- Vaciar la Pila\n"
                        + "7.- Mostrar Contenido de la Pila\n"
                        + "8.- Salir\n\n"));
                
                switch (opcion) {
                    case 1:
                        nodo = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                "Por favor, ingresa el valor a guardar en el nodo"));
                        pila.InsertarNodo(nodo);
                        break;
                    
                    case 2:
                        if (!pila.PilaVacia()) {
                            JOptionPane.showMessageDialog(null,
                                    "Se ha eliminado un nodo con el valor: "
                                    + pila.EliminarNodo());
                        } else {
                            JOptionPane.showMessageDialog(null, 
                                    "Se ha vaciado la pila ");
                        }
                        break;
                    
                    case 3:
                        if (pila.PilaVacia()) {
                            JOptionPane.showMessageDialog(null, 
                                    "La pila está vacía!!!");
                        } else {
                            JOptionPane.showMessageDialog(null, 
                                    "La pila NO está vacía!!!");
                        }
                        break;
                    
                    case 4:
                        if (!pila.PilaVacia()) {
                            JOptionPane.showMessageDialog(null, 
                                    "El último valor ingresado en la pila es:"
                                    + pila.MostrarUltimoValorIngresado());
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila está vacía!!!");
                        }
                        break;
                    
                    case 5:
                        JOptionPane.showMessageDialog(null, "La Pila Contiene " 
                                + pila.TamanoPila() + " Nodos");
                        break;
                    
                    case 6:
                        if (!pila.PilaVacia()) {
                            pila.VaciarPila();
                            JOptionPane.showMessageDialog(null, "Se ha vaciado la pila correctamente.");
                        } else {
                            JOptionPane.showMessageDialog(null, "La Pila está vacía!!!");
                        }
                        break;
                    
                    case 7:
                        if(!pila.PilaVacia()){
                            pila.MostrarValores();
                        } else{
                            JOptionPane.showMessageDialog(null, "La Pila está vacía!!!");
                        }
                        break;
                    
                    case 8:
                        opcion = 8;
                        System.exit(0);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion Incorrecta,"
                                + " vuelve a intentar nuevamente");
                    
                }
                
            } catch (NumberFormatException e) {
                System.out.println(e);
            }
        } while (opcion == 8);
        }
    }
}
