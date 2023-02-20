import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{
  
  private JTextField textfield1;
  private JScrollPane scrollpane1;
  private JTextArea textarea1;
  private JButton boton1;
  private JButton boton2; 

  public Formulario(){
    setLayout(null);
    textfield1 = new JTextField();
    textfield1.setBounds(20,20,200,20);
    add(textfield1);

    textarea1 = new JTextArea();
    scrollpane1 = new JScrollPane(textarea1);
    scrollpane1.setBounds(20,60,200,150);
    scrollpane1.setVisible(true);
    add(scrollpane1);

    boton1 = new JButton("Aceptar");
    boton1.setBounds(230,20,80,20);
    add(boton1);

    boton2 = new JButton("Salir");
    boton2.setBounds(230,50,80,20);
    boton2.addActionListener(this);
    add(boton2);
  }

    public void actionPerformed(ActionEvent e){
     if(e.getSource() == boton1){
       String texto = textfield1.getText();
       setTitle(texto);
     }
     if(e.getSource() == boton2){
       System.exit(0);
     }  
   }

  public static void main(String args[]){
    Formulario formulario1 = new Formulario();
    formulario1.setBounds(0,0,350,300);
    formulario1.setVisible(true);
    formulario1.setResizable(false);
    formulario1.setLocationRelativeTo(null);
  }
}