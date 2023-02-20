import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Formulario extends JFrame implements ActionListener{

  private JLabel label1, label2, label3;
  private JTextField textfield1, textfield2;
  private JTextArea textarea1;
  private JScrollPane scrollpane1;
  private JButton boton1, boton2, boton3, boton4, boton5, boton6;
  String texto = "", texto1 = "", texto2 = "";
  int num1 = 0, num2 = 0, resultado= 0;

  public Formulario(){
    setLayout(null);
    setTitle("Comparacion de caracteres");

    label1 = new JLabel("Ingrese el primer texto: ");
    label1.setBounds(20,20,200,20);
    add(label1);

    textfield1 = new JTextField();
    textfield1.setBounds(170,20,250,20);
    add(textfield1);


    label2 = new JLabel("Ingrese el segundo texto: ");
    label2.setBounds(20,50,200,20);
    add(label2);

    textfield2 = new JTextField();
    textfield2.setBounds(170,50,250,20);
    add(textfield2);

    textarea1 =new JTextArea();
    scrollpane1 = new JScrollPane(textarea1);
    scrollpane1.setBounds(250,110,200,80);
    add(scrollpane1);
    textarea1.setEditable(false);



    label3 = new JLabel("");
    label3.setBounds(170,80,300,20);
    add(label3);
    
    boton1 = new JButton("Comparar");
    boton1.setBounds(30,110,100,20);
    add(boton1);
    boton1.addActionListener(this);    


    boton2 = new JButton("Concatenar");
    boton2.setBounds(30,140,100,20);
    add(boton2);
    boton2.addActionListener(this);


    boton3 = new JButton("Limpiar");
    boton3.setBounds(30,170,100,20);
    add(boton3);
    boton3.addActionListener(this);

    boton4 = new JButton("Sumar");
    boton4.setBounds(140,110,100,20);
    add(boton4);
    boton4.addActionListener(this);

    boton5 = new JButton("Ingresar");
    boton5.setBounds(140,140,100,20);
    add(boton5);
    boton5.addActionListener(this);
    
    boton6 = new JButton("Salir");
    boton6.setBounds(140,170,100,20);
    add(boton6);
    boton6.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e){

    if(e.getSource() == boton1){
        texto1 = textfield1.getText();
        texto2 = textfield2.getText();
      if(texto1.equals(texto2)){
        label3.setText("los textos son iguales.");
      } else {
        label3.setText("los textos son distintos.");
      }
    }

    if(e.getSource() == boton2){
      texto1 = textfield1.getText();
      texto2 = textfield2.getText();
      label3.setText(texto1 + " " + texto2);
    }

    if(e.getSource() == boton3){
      textfield1.setText("");
      textfield2.setText("");
      label3.setText("                    ");
      textarea1.setText(" ");
      String textarea1 = "";
    }

    if(e.getSource() == boton4){
  
      num1 = Integer.parseInt(textfield1.getText());
      num2 = Integer.parseInt(textfield2.getText());
      resultado = num1 + num2;
      label3.setText("El resultado es: " + resultado);
    }

    if(e.getSource() == boton5){       
      texto1 = textfield1.getText();
      texto2 = textfield2.getText();
      texto += texto1 + " " + texto2 + "\n";
      textarea1.setText(texto + "\n");
      textfield1.setText("");
      textfield2.setText("");
      label3.setText("                    ");

    }

    if(e.getSource() == boton6){
      System.exit(0);
    }

  }

  public static void main(String args[]){
    Formulario formulario1 = new Formulario();
    formulario1.setBounds(0,0,500,250);
    formulario1.setVisible(true);
    formulario1.setResizable(false);
    formulario1.setLocationRelativeTo(null);
  }
} 