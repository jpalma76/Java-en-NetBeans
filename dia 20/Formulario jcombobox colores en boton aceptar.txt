import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{
  
  private JTextField textfield1;
  private JScrollPane scrollpane1;
  private JTextArea textarea1;
  private JButton boton1;

  String texto = "";

  public Formulario(){
    setLayout(null);
    textfield1 = new JTextField();
    textfield1.setBounds(20,20,200,30);
    add(textfield1);
    
    boton1 = new JButton("Aceptar");
    boton1.setBounds(250,25,100,20);
    add(boton1);
    boton1.addActionListener(this);
    
    textarea1 = new JTextArea();
    scrollpane1 = new JScrollPane(textarea1);
    scrollpane1.setBounds(20,60,400,250);
    add(scrollpane1);
  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == boton1){
      texto += textfield1.getText() + "\n";
      textarea1.setText(texto);
      textfield1.setText("");
  }
}
  public static void main(String args[]){
    Formulario formulario1 = new Formulario();
    formulario1.setBounds(0,0,540,400);
    formulario1.setVisible(true);
    formulario1.setResizable(false);
    formulario1.setLocationRelativeTo(null);
  }
}
