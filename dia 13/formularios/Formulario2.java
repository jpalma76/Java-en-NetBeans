import javax.swing.*;

public class Formulario2 extends JFrame{

  private JLabel label1;
  private JLabel label2;
  private JLabel label3;
  private JLabel label4;

  public Formulario2(){
    setLayout(null);
    label1 = new JLabel("Interfaz grafica.");
    label1.setBounds(10,20,100,30);
    add(label1);
    label2 = new JLabel("Version 1.0");
    label2.setBounds(10,40,100,30);
    add(label2);
    label3 = new JLabel("Programa realizado por Juan Palma");
    label3.setBounds(10,60,300,30);
    add(label3);
    label4 = new JLabel("Programacion en Java");
    label4.setBounds(10,80,300,30);
    add(label4);
  }
  public static void main(String args[]){
    Formulario2 formulario1 = new Formulario2();
    formulario1.setBounds(0,0,300,200);
    formulario1.setResizable(false);
    formulario1.setVisible(true);
    formulario1.setLocationRelativeTo(null);
  }
}