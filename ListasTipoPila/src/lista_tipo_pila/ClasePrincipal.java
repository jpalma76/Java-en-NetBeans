package lista_tipo_pila;

import javax.swing.JOptionPane;

public class ClasePrincipal {

    public static void main(String[] args) {

        int opcion = 0, nodo = 0;
        Pila pila = new Pila();

        do {
            try {

                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menu de Opciones.\n\n"
                        + "1.- Insertar un Nodo.\n"
                        + "2.- Eliminar un Nodo.\n"
                        + "3.- ¿La pila está vacía?\n"
                        + "4.- ¿Cual es el último valor ingresado en la Pila?\n"
                        + "5.- ¿Cuantos Nodos tiene la Pila\n"
                        + "6.- Vaciar Pila\n"
                        + "7.- Mostrar contenido de la Pila\n"
                        + "8.- Salir\n\n"));

                switch (opcion) {
                    case 1:
                        nodo = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "por favor ingrese el vslor a guardar en el nodo."));
                        pila.InsertarNodo(nodo);
                        break;

                    case 2:
                        if (!pila.PilaVacia()) {
                            JOptionPane.showMessageDialog(null, "Se ha eliminado un nodo con el valor: "
                            + pila.EliminarNodo());
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila está vacía");
                        }
                        break;

                    case 3:
                        if (pila.PilaVacia()) {
                            JOptionPane.showMessageDialog(null, "La pila está vacía");
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila NO está vacía");
                        }
                        break;

                    case 4:
                        if (!pila.PilaVacia()) {
                            JOptionPane.showMessageDialog(null, "El último valor ingresado es: "
                            + pila.MostrarUltimoValorIngresado());
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila está vacía");
                        }
                        break;

                    case 5:
                        JOptionPane.showMessageDialog(null, "La pila contiene " + pila.tamanoPila() + " nodos.");
                        break;

                    case 6:
                        if (!pila.PilaVacia()) {
                            pila.VaciarPila();
                            JOptionPane.showMessageDialog(null, "La pila se ha vaciado correctamente.");
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila está vacía.");
                        }
                        break;

                    case 7:
                        if (pila.PilaVacia()) {
                            JOptionPane.showMessageDialog(null, "La pila está vacía");
                        } else {
                            pila.MostrarValores();
                        }
                        break;

                    case 8:
                        opcion = 8;
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "la opción ingresada no es válida");
                        break;

                }

            } catch (NumberFormatException e) {

            }
        } while (opcion != 8);
    }
}
