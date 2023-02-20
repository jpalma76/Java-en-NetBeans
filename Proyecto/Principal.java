import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener{

  private JMenuBar mb;
  private JMenu menuOpciones, menuCalcular, menuAcercaDe, menuColorFondo;
  private JMenuItem miCalculo, miRojo, miAzulClaro, miMorado, miNegro, miElCreador, miSalir, miNuevo;
  private JLabel labelLogo, labelBienvenido, labelTitle, labelNombre, labelAPaternoTrabajador, 
                 labelAMaternoTrabajador, labelDepartamento, labelAntiguedad, labelResultado, labelFooter;
  private JTextField txtNombreTrabajador, txtAPaternoTrabajador, txtAMaternoTrabajador;
  private JComboBox comboDepartamento, comboAntiguedad;
  private JScrollPane scrollpane1;
  private JTextArea textarea1;
  private JButton boton1, boton2;
  String nombreAdministrador = "";
    

  public Principal(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Pantalla Principal - Calculo de Vacaciones");
    getContentPane().setBackground(new Color(255,0,0));
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
    Bienvenida ventanaBienvenida = new Bienvenida();
    nombreAdministrador = ventanaBienvenida.texto;

    mb = new JMenuBar();
    mb.setBackground(new Color(255,0,0));
    setJMenuBar(mb);

    menuOpciones = new JMenu("Opciones");
    menuOpciones.setBackground(new Color(255,0,0));
    menuOpciones.setFont(new Font("Andale Mono", 1, 12));
    menuOpciones.setForeground(new Color(255,255,255));
    mb.add(menuOpciones);

    menuCalcular = new JMenu("Calcular");
    menuCalcular.setBackground(new Color(255,0,0));
    menuCalcular.setFont(new Font("Andale Mono", 1, 12));
    menuCalcular.setForeground(new Color(255,255,255));
    mb.add(menuCalcular);

    menuAcercaDe = new JMenu("Acerca de ");
    menuAcercaDe.setBackground(new Color(255,0,0));
    menuAcercaDe.setFont(new Font("Andale Mono", 1, 12));
    menuAcercaDe.setForeground(new Color(255,255,255));
    mb.add(menuAcercaDe);
    
    menuColorFondo = new JMenu("Color de Fondo");
    menuColorFondo.setFont(new Font("Andale Mono", 1, 12));
    menuColorFondo.setForeground(new Color(255,0,0));
    menuOpciones.add(menuColorFondo);

    miCalculo = new JMenuItem("Vacaciones");
    miCalculo.setFont(new Font("Andale Mono", 1, 12));
    miCalculo.setForeground(new Color(255,0,0));
    menuCalcular.add(miCalculo);
    miCalculo.addActionListener(this);

    miRojo = new JMenuItem("Rojo");
    miRojo.setFont(new Font("Andale Mono", 1, 12));
    miRojo.setForeground(new Color(255,0,0));
    menuColorFondo.add(miRojo);
    miRojo.addActionListener(this);

    miAzulClaro = new JMenuItem("Azul Claro");
    miAzulClaro.setFont(new Font("Andale Mono", 1, 12));
    miAzulClaro.setForeground(new Color(255,0,0));
    menuColorFondo.add(miAzulClaro);
    miAzulClaro.addActionListener(this);

    miMorado = new JMenuItem("Morado");
    miMorado.setFont(new Font("Andale Mono", 1,12));
    miMorado.setForeground(new Color(255,0,0));
    menuColorFondo.add(miMorado);
    miMorado.addActionListener(this);

    miNegro = new JMenuItem("Negro");
    miNegro.setFont(new Font("Andale Mono", 1,12));
    miNegro.setForeground(new Color(255,0,0));
    menuColorFondo.add(miNegro);
    miNegro.addActionListener(this);
    
    miElCreador = new JMenuItem("El Creador");
    miElCreador.setFont(new Font("Andale Mono", 1, 12));
    miElCreador.setForeground(new Color(255,0,0));
    menuAcercaDe.add(miElCreador);
    miElCreador.addActionListener(this);

    miNuevo = new JMenuItem("Nuevo");
    miNuevo.setFont(new Font("Andale Mono", 1, 12));
    miNuevo.setForeground(new Color(255,0,0));
    menuOpciones.add(miNuevo);
    miNuevo.addActionListener(this);
    
    miSalir = new JMenuItem("Salir");
    miSalir.setFont(new Font("Andale Mono", 1,12));
    miSalir.setForeground(new Color(255,0,0));
    menuOpciones.add(miSalir);
    miSalir.addActionListener(this);

    ImageIcon imagen = new ImageIcon("images/logo-coca.png");
    labelLogo = new JLabel(imagen);
    labelLogo.setBounds(5,5,250,100);
    add(labelLogo);

    labelBienvenido = new JLabel("Bienvenido " + nombreAdministrador);
    labelBienvenido.setBounds(280,30,300,50);
    labelBienvenido.setFont(new Font("Andale Mono", 1, 32));
    labelBienvenido.setForeground(new Color(255,255,255));
    add(labelBienvenido);

    labelTitle = new JLabel("Datos de trabajador para el calculo de vacaciones.");
    labelTitle.setBounds(45,140,910,20);
    labelTitle.setFont(new Font("Andale Mono", 1, 20));
    labelTitle.setForeground(new Color(255,255,255));
    add(labelTitle);

    labelNombre = new JLabel("Nombre");
    labelNombre.setBounds(40,188,180,25);
    labelNombre.setFont(new Font("Andale Mono", 1, 12));
    labelNombre.setForeground(new Color(255,255,255));
    add(labelNombre);

    txtNombreTrabajador = new JTextField();
    txtNombreTrabajador.setBounds(25,213,150,25);
    txtNombreTrabajador.setBackground(new Color(224,224,224));
    txtNombreTrabajador.setFont(new Font("andale Mono", 1, 12));
    txtNombreTrabajador.setForeground(new Color(255,0,0));
    add(txtNombreTrabajador);

    labelAPaternoTrabajador = new JLabel("Apellido Paterno");
    labelAPaternoTrabajador.setBounds(40,248,150,25);
    labelAPaternoTrabajador.setFont(new Font("Andale Mono", 1, 12));
    labelAPaternoTrabajador.setForeground(new Color(255,255,255));
    add(labelAPaternoTrabajador);

    txtAPaternoTrabajador = new JTextField();
    txtAPaternoTrabajador.setBounds(25,273,150,25);
    txtAPaternoTrabajador.setBackground(new Color(224,224,224));
    txtAPaternoTrabajador.setFont(new Font("Andale Mono", 1,12));
    txtAPaternoTrabajador.setForeground(new Color(255,0,0));
    add(txtAPaternoTrabajador);

    labelAMaternoTrabajador = new JLabel("Apellido Materno");
    labelAMaternoTrabajador.setBounds(40,308,150,25);
    labelAMaternoTrabajador.setFont(new Font("Andale Mono", 1, 12));
    labelAMaternoTrabajador.setForeground(new Color(255,255,255));
    add(labelAMaternoTrabajador);

    txtAMaternoTrabajador = new JTextField();
    txtAMaternoTrabajador.setBounds(25,334,150,25);
    txtAMaternoTrabajador.setBackground(new Color(224,224,224));
    txtAMaternoTrabajador.setFont(new Font("Andale Mono", 1,12));
    txtAMaternoTrabajador.setForeground(new Color(255,0,0));
    add(txtAMaternoTrabajador);

    labelDepartamento = new JLabel("Selecciona Departamento:");
    labelDepartamento.setBounds(240,188,180,25);
    labelDepartamento.setFont(new Font("Andale Mono", 1, 12));
    labelDepartamento.setForeground(new Color(255,255,255));
    add(labelDepartamento);

    comboDepartamento = new JComboBox();
    comboDepartamento.setBounds(220,213,220,25);
    comboDepartamento.setBackground(new Color(224,224,224));
    comboDepartamento.setFont(new Font("Andale Mono", 1, 12));
    comboDepartamento.setForeground(new Color(255,0,0));
    add(comboDepartamento);
    comboDepartamento.addItem("");
    comboDepartamento.addItem("Atencion a Cliente");
    comboDepartamento.addItem("Departamento de Logistica");
    comboDepartamento.addItem("Departamento de Gerencia");

    labelAntiguedad = new JLabel("Selecciona Antiguedad:");
    labelAntiguedad.setBounds(240,248,180,25);
    labelAntiguedad.setFont(new Font("Andale Mono", 1, 12));
    labelAntiguedad.setForeground(new Color(255,255,255));
    add(labelAntiguedad);

    comboAntiguedad = new JComboBox();
    comboAntiguedad.setBounds(220,273,220,25);
    comboAntiguedad.setBackground(new Color(224,224,224));
    comboAntiguedad.setFont(new Font("Andale Mono", 1, 12));
    comboAntiguedad.setForeground(new Color(255,0,0));
    add(comboAntiguedad);
    comboAntiguedad.addItem("");
    comboAntiguedad.addItem("1 ano de Servicio");
    comboAntiguedad.addItem("2 a 6 anos de Servicio");
    comboAntiguedad.addItem("7 anos o mas de Servicio");    

    labelResultado = new JLabel("Resultado del Calculo");
    labelResultado.setFont(new Font("Andale Mono", 1, 12));
    labelResultado.setForeground(new Color(255,255,255));
    add(labelResultado);

    textarea1 = new JTextArea();
    textarea1.setEditable(false);
    textarea1.setBackground(new Color(224,224,224));
    textarea1.setFont(new Font("Andale Mono", 0, 11));
    textarea1.setForeground(new Color(255,0,0));
    textarea1.setText("\n      Aqui aparece el resultado del calculo de las vacaciones.");
    scrollpane1 = new JScrollPane(textarea1);
    scrollpane1.setBounds(220,333,385,90);
    add(scrollpane1);

    labelFooter = new JLabel("© 2021 The Coca-Cola Company, todos los derechos reservados");
    labelFooter.setBounds(135,445,500,30);
    labelFooter.setFont(new Font("Andale Mono", 1,12));
    labelFooter.setForeground(new Color(255,255,255));
    add(labelFooter);
    
  }

  public void actionPerformed(ActionEvent e){

      textarea1.setEditable(true);
      String nombreTrabajador = txtNombreTrabajador.getText();
      String AP = txtAPaternoTrabajador.getText();
      String AM = txtAMaternoTrabajador.getText();
      String Departamento = comboDepartamento.getSelectedItem().toString();
      String Antiguedad = comboAntiguedad.getSelectedItem().toString();

      if(e.getSource() == miCalculo){
          
          if(Departamento.equals("Atencion a Cliente")){

            if(Antiguedad.equals("1 ano de Servicio")){
              textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + "," +
                                "\n   quien trabaja en " + Departamento + " con " + Antiguedad + "," +
                                "\n   recibe 6 dias de vacaciones.");
            }

            if(Antiguedad.equals("2 a 6 anos de Servicio")){
              textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + "," +
                                "\n   quien trabaja en " + Departamento + " con " + Antiguedad + "," +
                                "\n   recibe 14 dias de vacaciones.");
            }
          
            if(Antiguedad.equals("7 anos o mas de Servicio")){
              textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + "," +
                                "\n   quien trabaja en " + Departamento + " con " + Antiguedad + "," +
                                "\n   recibe 20 dias de vacaciones.");
            }

          }

          if(Departamento.equals("Departamento de Logistica")){

            if(Antiguedad.equals("1 ano de Servicio")){
              textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + "," +
                                "\n   quien trabaja en " + Departamento + " con " + Antiguedad + "," +
                                "\n   recibe 7 dias de vacaciones.");
            }

            if(Antiguedad.equals("2 a 6 anos de Servicio")){
              textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + "," +
                                "\n   quien trabaja en " + Departamento + " con " + Antiguedad + "," +
                                "\n   recibe 15 dias de vacaciones.");
            }
          
            if(Antiguedad.equals("7 anos o mas de Servicio")){
              textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + "," +
                                "\n   quien trabaja en " + Departamento + " con " + Antiguedad + "," +
                                "\n   recibe 30 dias de vacaciones.");
            }

          } 

          if(Departamento.equals("Departamento de Gerencia")){
 
            if(Antiguedad.equals("1 ano de Servicio")){
              textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + "," +
                                "\n   quien trabaja en " + Departamento + " con " + Antiguedad + "," +
                                "\n   recibe 10 dias de vacaciones.");
            }

            if(Antiguedad.equals("2 a 6 anos de Servicio")){
              textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + "," +
                                "\n   quien trabaja en " + Departamento + " con " + Antiguedad + "," +
                                "\n   recibe 20 dias de vacaciones.");
            }
          
            if(Antiguedad.equals("7 anos o mas de Servicio")){
              textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + "," +
                                "\n   quien trabaja en " + Departamento + " con " + Antiguedad + "," +
                                "\n   recibe 30 dias de vacaciones.");
            }
          }
          textarea1.setEditable(false);

          if(nombreTrabajador.equals("") || AP.equals("") || AM.equals("") || Departamento.equals("") || Antiguedad.equals("")){
            JOptionPane.showMessageDialog(null, "Debes completar todos los campos!!!");
          }

      }
         if(e.getSource() == miRojo){
            getContentPane().setBackground(new Color(255,0,0));
          }

          if(e.getSource() == miAzulClaro){
            getContentPane().setBackground(new Color(51,153,255));

          }

          if(e.getSource() == miNegro){
            getContentPane().setBackground(new Color(0,0,0));
  
          }

          if(e.getSource() == miMorado){
            getContentPane().setBackground(new Color(51,0,51));
          }
  
          if(e.getSource() == miNuevo){
           txtNombreTrabajador.setText("");
           txtAPaternoTrabajador.setText("");
           txtAMaternoTrabajador.setText("");
           comboDepartamento.setSelectedIndex(0);
           comboAntiguedad.setSelectedIndex(0);
           textarea1.setText("\n      Aqui aparece el resultado del calculo de las vacaciones.");
           textarea1.setFont(new Font("Andale Mono", 1,12));
           textarea1.setEditable(false);
          }
  
          if(e.getSource() == miElCreador){
            JOptionPane.showMessageDialog(null, "          programa desarrollado por Juan Palma\n"+
                                                "      Deje sus comentarios en www.meimportaunpico.com");
                                                setFont(new Font("Andale Mono", 1, 16));
          }

          if(e.getSource() == miSalir){
            Licencia ventanalicencia = new Licencia();
            ventanalicencia.setBounds(0,0,610,370);
            ventanalicencia.setVisible(true);
            ventanalicencia.setResizable(false);
            ventanalicencia.setLocationRelativeTo(null);
            this.setVisible(false);
          }

  }
  public static void main(String args[]){
    Principal ventanaPrincipal = new Principal();
    ventanaPrincipal.setBounds(0,0,640,535);
    ventanaPrincipal.setVisible(true);
    ventanaPrincipal.setResizable(false);
    ventanaPrincipal.setLocationRelativeTo(null);
  }
}