import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
 
public class EjemploColores extends JFrame {
 
    private JPanel contentPane;
    private JTextField txtColor;
 
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    EjemploColores frame = new EjemploColores();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
 
    /**
     * Create the frame.
     */
    public EjemploColores() {
 
        //Parámetro asociados a la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setLayout(null);
        setContentPane(contentPane);
 
        //Colores
 
        Color color1=new Color(223, 45, 223);
        Color color2=new Color(223, 227, 40);
        Color color3=new Color(80, 13, 255);
 
        //Componentes
 
        JLabel lblColor = new JLabel("Color1");
        lblColor.setBackground(color1);
        //Si no lo indocamos no se vera el color
        lblColor.setOpaque(true);
        lblColor.setBounds(48, 38, 46, 14);
        contentPane.add(lblColor);
 
        JButton btnColor = new JButton("Color2");
        btnColor.setBackground(color2);
        //Si no lo indicamos, en este caso, no pasaria nada
        btnColor.setOpaque(true);
        btnColor.setBounds(48, 86, 89, 23);
        contentPane.add(btnColor);
 
        txtColor = new JTextField();
        txtColor.setText("color3");
        txtColor.setBackground(color3);
        //Si no lo indicamos, en este caso, no pasaria nada
        txtColor.setOpaque(true);
        txtColor.setBounds(48, 150, 86, 20);
        contentPane.add(txtColor);
        txtColor.setColumns(10);
 
    }
}