import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;


public class TablasDeMultiplicar extends JFrame implements ActionListener, ItemListener{
    
    private JLabel label1, label2, label3;
    private JComboBox combo1;
    private JTextArea textarea1;
    private JScrollPane scrollpane1;
    private JButton boton1, boton2;
    int numero = 0;
    
    public TablasDeMultiplicar(){
        setLayout(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Tablas de Multiplicar");
        
        label1 = new JLabel("Selecciona la tabla que deseas.");
        label1.setBounds(30,10,300,25);
        add(label1);
        
        label2 = new JLabel("Tablas:");
        label2.setBounds(30,60,150,20);
        add(label2);
        
        label3 = new JLabel("Resultado:");
        label3.setBounds(130,60,200,25);
        add(label3);

	textarea1 = new JTextArea();
	scrollpane1 = new JScrollPane(textarea1);
        scrollpane1.setBounds(110,90,150,120);
	add(scrollpane1);


        combo1 = new JComboBox();
        combo1.setBounds(20,90,50,20);
        add(combo1);
        combo1.addItem("");
	combo1.addItem("1");
	combo1.addItem("2");
        combo1.addItem("3");
	combo1.addItem("4");
	combo1.addItem("5");
	combo1.addItem("6");
	combo1.addItem("7");
	combo1.addItem("9");
	combo1.addItem("10");
	combo1.addItemListener(this);

	boton1 =new JButton("Salir");
	boton1.setBounds(150,220,90,25);
	add(boton1);
	boton1.addActionListener(this);	    
    }

    public void actionPerformed(ActionEvent e){
      	if(e.getSource() == boton1){
	  System.exit(0);
       	}

    }

    public void itemStateChanged(ItemEvent e){
        if(e.getSource() == combo1){
	  int numero = 1;
	  for(int i = 1; i <= 10;i++){
	    private JLabel label1

	  }
	  
   	}
    }
    
    public static void main(String[] args) {
        TablasDeMultiplicar tabla = new TablasDeMultiplicar();
        tabla.setBounds(0,0,300,300);
        tabla.setVisible(true);
	tabla.setResizable(false);
        tabla.setLocationRelativeTo(null);
    }

}                                               