import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Bienvenida extends JFrame implements ActionListener, ChangeListener{

  private JTextField textfield1, textfield2;
  private JTextArea textarea1;
  private JScrollPane scrollpane1;
  private JButton boton1, boton2;
  private JLabel label1, label2, label3;
  private JCheckBox check1;

  public Bienvenida(){
    setLayout(null);
    setTitle("  Ventana de Bienvenida");
    setFont(new Font("Times New Roman",1,12));
    setForeground(new Color(0,0,255));
    setIconImage(new ImageIcon(getClass().getResource("images/iconoHP.png")).getImage());
    getContentPane().setBackground(new Color(100,100,255));
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    label1 = new JLabel("Bienvenido al Sistema.");
    label1.setBounds(70,10,3000,80);
    label1.setFont(new Font("Times new Roman",1,30));
    label1.setForeground(new Color(255,255,255));
    add(label1);

    ImageIcon imagen = new ImageIcon("images/moai.jpg");
    label2 = new JLabel(imagen);
    label2.setBounds(150,70,150,70);
    label2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(label2.getWidth(),label2.getHeigth(), Image.SCALE_SMOOTH)));
    add(label2);
    
    check1 = new JCheckBox("Te comprometes a no divulgar ningun dato.");
    check1.setBounds(50,140,400,25);
    check1.setBackground(new Color(100,100,255));
    check1.setFont(new Font("Times new Roman", 1,16));
    check1.setForeground(new Color(255,255,255));
    add(check1);
    check1.addChangeListener(this);

    boton1 = new JButton("Ingresar");
    boton1.setBounds(50,180,100,25);
    boton1.setBackground(new Color(255,255,255));
    boton1.setFont(new Font("Arial",1,14));
    boton1.setForeground(new Color(0,50,255));
    boton1.setEnabled(false);
    add(boton1);
    boton1.addActionListener(this);

    
    boton2 = new JButton("Salir");
    boton2.setBounds(200,180,100,25);
    boton2.setBackground(new Color(255,255,255));
    boton2.setFont(new Font("Arial",1,14));
    boton2.setForeground(new Color(0,50,255));
    boton2.setEnabled(true);
    add(boton2);
    boton2.addActionListener(this);
  }

  public void stateChanged(ChangeEvent e){
    if(check1.isSelected() == true){
      boton1.setEnabled(true);
      boton2.setEnabled(false);
    } else{
      boton1.setEnabled(false);
      boton2.setEnabled(true);
    }
  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == boton1){
      System.exit(0);
    }

    if(e.getSource() == boton2){
      System.exit(0);
    }

  }

  public static void main(String args[]){
    Bienvenida ventanaBienvenida = new Bienvenida();
    ventanaBienvenida.setBounds(0,0,450,300);
    ventanaBienvenida.setVisible(true);
    ventanaBienvenida.setResizable(false);
    ventanaBienvenida.setLocationRelativeTo(null);
  }
}