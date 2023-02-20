import javax.swing.*;
import javax.swing.event.*;
import java.awt.*; 
import java.awt.event.*;

public class MenuClientes extends JFrame implements ActionListener{

  private JLabel label1, label2, label3, label4, label5;
  private JButton boton1, boton2, boton3, boton4, boton5, boton6;
   
  public MenuClientes(){
    setLayout(null);
    setTitle("Interface de Clientes");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    getContentPane().setBackground(new Color(100,100,255));

    label1 = new JLabel("Menu de Clientes:");
    label1.setBounds(50,30,280,30);
    label1.setBackground(new Color(100,100,255));
    label1.setFont(new Font("Times new Roman",1,25));
    label1.setForeground(new Color(255,255,255));
    add(label1);

    boton1 = new JButton("1.- Ingreso");
    boton1.setBounds(40,70,140,20);
    boton1.setBackground(new Color(230,230,230));
    boton1.setFont(new Font("Times new Roman",1,14));
    boton1.setForeground(new Color(0,0,255));
    add(boton1);
    boton1.addActionListener(this);

    boton2 = new JButton("2.- Consulta");
    boton2.setBounds(190,70,140,20);
    boton2.setBackground(new Color(230,230,230));
    boton2.setFont(new Font("Times new Roman",1,14));
    boton2.setForeground(new Color(0,0,255));
    add(boton2);
    boton2.addActionListener(this);

    boton3 = new JButton("3.- Modificacion");
    boton3.setBounds(40,100,140,20);
    boton3.setBackground(new Color(230,230,230));
    boton3.setFont(new Font("Times new Roman",1,14));
    boton3.setForeground(new Color(0,0,255));
    add(boton3);
    boton3.addActionListener(this);

    boton4 = new JButton("4.- Eliminacion");
    boton4.setBounds(190,100,140,20);
    boton4.setBackground(new Color(230,230,230));
    boton4.setFont(new Font("Times new Roman",1,14));
    boton4.setForeground(new Color(0,0,255));
    add(boton4);
    boton4.addActionListener(this);

    boton5 = new JButton("5.- Salir");
    boton5.setBounds(40,130,140,20);
    boton5.setBackground(new Color(230,230,230));
    boton5.setFont(new Font("Times new Roman",1,14));
    boton5.setForeground(new Color(0,0,255));
    add(boton5);
    boton5.addActionListener(this);

  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == boton5){
      MenuPrincipal menuPrincipal1 = new MenuPrincipal();
      menuPrincipal1.setBounds(0,0,500,350);
      menuPrincipal1.setVisible(true);
      menuPrincipal1.setResizable(false);
      this.setVisible(false);
    }

  }


  public static void main(String args[]){
    MenuClientes menuClientes1 = new MenuClientes();
    menuClientes1.setBounds(0,0,400,250);
    menuClientes1.setVisible(true);
    menuClientes1.setResizable(false);
    menuClientes1.setLocationRelativeTo(null);
  }
}