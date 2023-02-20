
package tablasdemultiplicar;
import javax.swing.*;
import java.awt.event.*;


public class TablasDeMultiplicar {
    
    private JLabel label1, label2, label3;
    private JComboBox combo1;
    private JTextArea textarea1;
    private JButton boton1, boton2;
    
    public TablasDeMultiplicar(){
        setLayout(null);
        setTitle("Tablas de Multiplicar");
        
        label1 = new JLabel("Selecciona la tabla que deseas Visualizar:");
        label1.setBounds(50,150,200,25);
        add(label1);
        
        label2 = new JLabel("Tablas:");
        label2.setBounds(100,80,200,25);
        add(label2);
        
        label3 = new JLabel("Resultado:");
        label3.setBounds(100,300,200,25);
        add(label3);
        
    
    }
    
    public static void main(String[] args) {
        TablasDeMultiplicar tabla = new TablasDeMultiplicar();
        tabla.setBounds(0,0,400,400);
        tabla.setVisible(true);
        tabla.setResizable(false);
        tabla.setLocationRelativeTo(null);
    }

}
