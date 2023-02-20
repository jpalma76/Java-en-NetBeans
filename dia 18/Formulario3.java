import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{

  private JLabel label1, label2, label3, label4;
  private JComboBox combo1, combo2, combo3, combo4;
  private JButton boton1, boton2;

  public Formulario(){
    setLayout(null);
    label1 = new JLabel("rojo");
    label1.setBounds(20,20,100,20);
    add(label1);

    combo1 = new JComboBox();
    combo1.setBounds(120,10,50,30);
      for(int i = 0; i <= 255; i++){
        combo1.addItem(String.valueOf(i));
      }
    add(combo1);

    label2 = new JLabel("verde");
    label2.setBounds(20,50,100,20);
    add(label2);

    combo2 = new JComboBox();
    combo2.setBounds(120,50,50,30);
      for(int i = 0; i <= 255; i++){
        combo2.addItem(String.valueOf(i));
      }
    add(combo2);
   
    label3 = new JLabel("azul");
    label3.setBounds(20,90,100,20);
    add(label3);

    combo3 = new JComboBox();
    combo3.setBounds(120,90,50,30);
      for(int i = 0; i <= 255; i++){
        combo3.addItem(String.valueOf(i));
      }
    add(combo3);

    boton1 = new JButton("Fijar color");
    boton1.setBounds(20,140,100,20);
    add(boton1);
    boton1.addActionListener(this);

    boton2 = new JButton("Salir");
    boton2.setBounds(150,140,100,20);
    add(boton2);
    boton2.addActionListener(this);

  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == boton1){
      String cad1 = combo1.getSelectedItem().toString();
      String cad2 = combo2.getSelectedItem().toString();
      String cad3 = combo3.getSelectedItem().toString();

      int rojo = Integer.parseInt(cad1);
      int verde = Integer.parseInt(cad2);
      int azul = Integer.parseInt(cad3);
      
      Color color1 = new Color(rojo,verde,azul);
      boton1.setBackground(color1);
    }

    if(e.getSource() == boton2){
      System.exit(0);
    }
  }

  public static void main(String args[]){
    Formulario formulario1 = new Formulario();
    formulario1.setBounds(0,0,300,250);
    formulario1.setVisible(true);
    formulario1.setResizable(false);
    formulario1.setLocationRelativeTo(null);
  }
}