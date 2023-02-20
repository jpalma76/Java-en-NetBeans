
package ventanas;
import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{
    
    private JLabel label1;
    private JTextField textfield1;
    private JButton boton1;
    
    public Formulario(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        label1 = new JLabel("Mensaje:");
        label1.setBounds(15,10,100,30);
        add(label1);
        
        textfield1 = new JTextField();
        textfield1.setBounds(80,16,190,20);
        add(textfield1);
        
        boton1 = new JButton("Mostrar");
        boton1.setBounds(10,60,100,30);
        add(boton1);
        boton1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boton1){
            String cadena = textfield1.getText();
            JOptionPane.showMessageDialog(null, cadena);
        }
    }
    
    public static void main(String[] args) {
        Formulario formulario1 = new Formulario();
        formulario1.setBounds(0,0,300,150);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
    }
}
