import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class DecodificadorSimple extends JFrame implements ActionListener{

  private JTextField textfield1, textfield2, textfield3, textfield4, textfield5;
  private JTextArea textarea1, textarea2, textarea3, textarea4;
//  private JScrollPane scrollpane1, scrollpane2, scrollpane3, scrollpane4;
  private JButton boton1, boton2;
  private JLabel label1, label2, label3;
  private JCheckBox check1;
  String clave = "palma";
  String asterisco = "*";
  char i = 0, num1 = 0, num2 = 0, num3 = 0, num4 = 0;

  public DecodificadorSimple(){
    setLayout(null);
    setTitle("Decodificador");
    setFont(new Font("Arial",1,12));
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    int contador = 0;
    label1 = new JLabel("Decodificacion de fuerza bruta simple.");
    label1.setBounds(30,10,350,40);
    label1.setFont(new Font("Times new Roman",1,20));
    add(label1);
  
    textfield1 = new JTextField(asterisco);
    textfield1.setBounds(40,60,50,50);
    textfield1.setBackground(new Color(255,255,255));
    textfield1.setFont(new Font("New Times Roman",1,25));
    textfield1.setForeground(new Color(0,0,255));
    textfield1.setHorizontalAlignment(JTextField.CENTER);
    add(textfield1);

       
    textfield2 = new JTextField(asterisco);
    textfield2.setBounds(100,60,50,50);
    textfield2.setFont(new Font("New Times Roman",1,25));
    textfield2.setForeground(new Color(0,0,255));
    textfield2.setHorizontalAlignment(JTextField.CENTER);
    add(textfield2);

    textfield3 = new JTextField(asterisco);
    textfield3.setBounds(160,60,50,50);
    textfield3.setFont(new Font("New Times Roman",1,25));
    textfield3.setForeground(new Color(0,0,255));
    textfield3.setHorizontalAlignment(JTextField.CENTER);
    add(textfield3);

    textfield4 = new JTextField(asterisco);
    textfield4.setBounds(220,60,50,50);
    textfield4.setFont(new Font("New Times Roman",1,25));
    textfield4.setForeground(new Color(0,0,255));
    textfield4.setHorizontalAlignment(JTextField.CENTER);
    add(textfield4);

    textfield5 = new JTextField(asterisco);
    textfield5.setBounds(280,60,50,50);
    textfield5.setFont(new Font("New Times Roman",1,25));
    textfield5.setForeground(new Color(0,0,255));
    textfield5.setHorizontalAlignment(JTextField.CENTER);
    add(textfield5);

    boton1 = new JButton("Iniciar");
    boton1.setBounds(60,150,100,25);
    boton1.setFont(new Font("Arial",1,14));
    add(boton1);
    boton1.addActionListener(this);
    
    boton2 = new JButton("Salir");
    boton2.setBounds(220,150,100,25);
    boton2.setFont(new Font("Arial",1,14));
    add(boton2);
    boton2.addActionListener(this);
  }


  public void actionPerformed(ActionEvent e){
    if(e.getSource() == boton1){

      

    }

    if(e.getSource() == boton2){
      System.exit(0);
    }

  }

  public static void main(String args[]){
    DecodificadorSimple simpledecoder = new DecodificadorSimple();
    simpledecoder.setBounds(0,0,400,250);
    simpledecoder.setVisible(true);
    simpledecoder.setResizable(false);
    simpledecoder.setLocationRelativeTo(null);
  }
}