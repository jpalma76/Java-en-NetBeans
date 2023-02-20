import javax.swing.*;
import java.awt.event.*;

  public class Boton extends JFrame implements ActionListener{

  JButton boton1;
  private JLabel label1;
  private JLabel label2;
  private JLabel label3;
  private JLabel label4;

  public Boton(){
    setLayout(null);
    label1 =new JLabel("INTERFAZ GRAFICA DE PRUEBA");
    label1.setBounds(50,40,200,20);
    add(label1);

    label2 =new JLabel("Programa realizado por JPalma76 Enterprice");
    label2.setBounds(50,60,300,20);
    add(label2);

    label3 =new JLabel("Programador: Juan Palma");
    label3.setBounds(50,150,200,20);
    add(label3);

    label4 =new JLabel("Programa realizado en Java con notepad y cmd ");
    label4.setBounds(50,170,400,20);
    add(label4);

    boton1 = new JButton("Cerrar");
    boton1.setBounds(150,200,80,25);  
    add(boton1);
    boton1.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == boton1){
      System.exit(0);
    }
  }
  
  public static void main(String args[]){
    Boton formulario1 = new Boton();
    formulario1.setBounds(0,0,400,300);
    formulario1.setVisible(true);
    formulario1.setResizable(false);
    formulario1.setLocationRelativeTo(null);
  }
}