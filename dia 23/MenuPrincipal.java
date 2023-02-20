import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class MenuPrincipal extends JFrame implements ActionListener{

  private JMenuBar menubar;
  private JMenu menu1, menu2, menu3, menu4, menu5, menu6;
  private JMenuItem menuitem1, menuitem2, menuitem3, menuitem4, menuitem5,
                    menuitem6, menuitem7, menuitem8, menuitem9, menuitem10, 
                    menuitem11, menuitem12, menuitem13, menuitem14, menuitem15,
                    menuitem16, menuitem17, menuitem18;
  private JLabel labelLogo, label1, label2, label3, label4, label5;
  private JTextField textfield1;
  private JButton boton1, boton2;
   
  public MenuPrincipal(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Menu Principal");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    getContentPane().setBackground(new Color(100,100,255));

    menubar = new JMenuBar();
    setJMenuBar(menubar);

    menu1 = new JMenu("Opciones");
    menu1.setFont(new Font("Times new Roman",1,14));
    menu1.setForeground(new Color(0,0,255));
    menubar.add(menu1);

    menu2 = new JMenu("Colores");
    menu2.setFont(new Font("Times new Roman",1,14));
    menu2.setForeground(new Color(0,0,255));
    menu1.add(menu2);

    menu3 = new JMenu("Tamano");
    menu3.setFont(new Font("Times new Roman",1,14));
    menu3.setForeground(new Color(0,0,255));
    menu1.add(menu3);

    menu4 = new JMenu("Mantencion de Personal");
    menu4.setFont(new Font("Times new Roman",1,14));
    menu4.setForeground(new Color(0,0,255));
    menubar.add(menu4);

    menu5 = new JMenu("Turnos");
    menu5.setFont(new Font("Times new Roman",1,14));
    menu5.setForeground(new Color(0,0,255));
    menu4.add(menu5);

    menu6 = new JMenu("Sala de Ventas");
    menu6.setFont(new Font("Times new Roman",1,14));
    menu6.setForeground(new Color(0,0,255));
    menubar.add(menu6);
//*************************************************************
    menuitem1 = new JMenuItem("Negro");
    menuitem1.setFont(new Font("Times new Roman",1,14));
    menuitem1.setForeground(new Color(0,0,255));
    menu2.add(menuitem1);
    menuitem1.addActionListener(this);

    menuitem2 = new JMenuItem("Azul");
    menuitem2.setFont(new Font("Times new Roman",1,14));
    menuitem2.setForeground(new Color(0,0,255));
    menu2.add(menuitem2);
    menuitem2.addActionListener(this);

    menuitem3 = new JMenuItem("Morado");
    menuitem3.setFont(new Font("Times new Roman",1,14));
    menuitem3.setForeground(new Color(0,0,255));
    menu2.add(menuitem3);
    menuitem3.addActionListener(this);

    menuitem4 = new JMenuItem("Celeste");
    menuitem4.setFont(new Font("Times new Roman",1,14));
    menuitem4.setForeground(new Color(0,0,255));
    menu2.add(menuitem4);
    menuitem4.addActionListener(this);

    menuitem5 = new JMenuItem("640 x 480");
    menuitem5.setFont(new Font("Times new Roman",1,14));
    menuitem5.setForeground(new Color(0,0,255));
    menu3.add(menuitem5);
    menuitem5.addActionListener(this);

    menuitem6 = new JMenuItem("800 x 600");
    menuitem6.setFont(new Font("Times new Roman",1,14));
    menuitem6.setForeground(new Color(0,0,255));
    menu3.add(menuitem6);
    menuitem6.addActionListener(this);

    menuitem7 = new JMenuItem("Full Screen");
    menuitem7.setFont(new Font("Times new Roman",1,14));
    menuitem7.setForeground(new Color(0,0,255));
    menu3.add(menuitem7);
    menuitem7.addActionListener(this);

    menuitem8 = new JMenuItem("Default");
    menuitem8.setFont(new Font("Times new Roman",1,14));
    menuitem8.setForeground(new Color(0,0,255));
    menu3.add(menuitem8);
    menuitem8.addActionListener(this);

    menuitem9 = new JMenuItem("Salir");
    menuitem9.setFont(new Font("Times new Roman",1,14));
    menuitem9.setForeground(new Color(0,0,255));
    menu1.add(menuitem9);
    menuitem9.addActionListener(this);

    menuitem10 = new JMenuItem("Turnos Supervisores");
    menuitem10.setFont(new Font("Times new Roman",1,14));
    menuitem10.setForeground(new Color(0,0,255));
    menu5.add(menuitem10);
    menuitem10.addActionListener(this);

    menuitem11 = new JMenuItem("Turnos Vendedores");
    menuitem11.setFont(new Font("Times new Roman",1,14));
    menuitem11.setForeground(new Color(0,0,255));
    menu5.add(menuitem11);
    menuitem11.addActionListener(this);

    menuitem12 = new JMenuItem("Remuneraciones");
    menuitem12.setFont(new Font("Times new Roman",1,14));
    menuitem12.setForeground(new Color(0,0,255));
    menu4.add(menuitem12);
    menuitem12.addActionListener(this);

    menuitem13 = new JMenuItem("Empleados");
    menuitem13.setFont(new Font("Times new Roman",1,14));
    menuitem13.setForeground(new Color(0,0,255));
    menu4.add(menuitem13);
    menuitem13.addActionListener(this);

    menuitem14 = new JMenuItem("Menu Clientes");
    menuitem14.setFont(new Font("Times new Roman",1,14));
    menuitem14.setForeground(new Color(0,0,255));
    menu6.add(menuitem14);
    menuitem14.addActionListener(this);

    menuitem15 = new JMenuItem("Ventas");
    menuitem15.setFont(new Font("Times new Roman",1,14));
    menuitem15.setForeground(new Color(0,0,255));
    menu6.add(menuitem15);
    menuitem15.addActionListener(this);

    menuitem16 = new JMenuItem("Inventario");
    menuitem16.setFont(new Font("Times new Roman",1,14));
    menuitem16.setForeground(new Color(0,0,255));
    menu6.add(menuitem16);
    menuitem16.addActionListener(this);

    menuitem17 = new JMenuItem("Cuadratura de Cajas");
    menuitem17.setFont(new Font("Times new Roman",1,14));
    menuitem17.setForeground(new Color(0,0,255));
    menu6.add(menuitem17);
    menuitem17.addActionListener(this);

    menuitem18 = new JMenuItem("Amarillo");
    menuitem18.setFont(new Font("Times new Roman",1,14));
    menuitem18.setForeground(new Color(0,0,255));
    menu2.add(menuitem18);
    menuitem18.addActionListener(this);

    ImageIcon imagen = new ImageIcon("images/descarga.png");
    labelLogo = new JLabel(imagen);
    labelLogo.setBounds(20,20,100,180);
    add(labelLogo);

  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == menuitem1){
      getContentPane().setBackground(new Color(0,0,0));
    }

    if(e.getSource() == menuitem2){
      getContentPane().setBackground(new Color(0,0,255));
    }

    if(e.getSource() == menuitem3){
      getContentPane().setBackground(new Color(120, 40, 140));
    }

    if(e.getSource() == menuitem4){
      getContentPane().setBackground(new Color(12, 183, 242));
    }

    if(e.getSource() == menuitem5){
      setSize(640,480);
    }

    if(e.getSource() == menuitem6){
      setSize(800,600);
    }

    if(e.getSource() == menuitem7){
      setSize(1366,768);
    }

    if(e.getSource() == menuitem8){
      setSize(600,450);
    }


    if(e.getSource() == menuitem9){
      System.exit(0);
    }
 
    if(e.getSource() == menuitem10){
      
    }

    if(e.getSource() == menuitem11){
      
    }

    if(e.getSource() == menuitem12){
      
    }

    if(e.getSource() == menuitem13){
      MenuEmpleados menuEmpleados1 = new MenuEmpleados();
      menuEmpleados1.setBounds(0,0,400,250);
      menuEmpleados1.setVisible(true);
      menuEmpleados1.setResizable(false);
      menuEmpleados1.setLocationRelativeTo(null);
      this.setVisible(false);
    }

    if(e.getSource() == menuitem14){
      MenuClientes menuClientes1 = new MenuClientes();
      menuClientes1.setBounds(0,0,400,250);
      menuClientes1.setVisible(true);
      menuClientes1.setResizable(false);
      menuClientes1.setLocationRelativeTo(null);
      this.setVisible(false);
    }

    if(e.getSource() == menuitem15){
      
    }

    if(e.getSource() == menuitem16){
      
    }

    if(e.getSource() == menuitem17){
      
    }

    if(e.getSource() == menuitem18){
      getContentPane().setBackground(new Color(255, 233, 0));
    }

 }


  public static void main(String args[]){
    MenuPrincipal menuPrincipal1 = new MenuPrincipal();
    menuPrincipal1.setBounds(0,0,600,450);
    menuPrincipal1.setVisible(true);
    menuPrincipal1.setResizable(false);
  }
}