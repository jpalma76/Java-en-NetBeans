
package ventanas;

import java.sql.*;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class RegistroAlumnos extends javax.swing.JFrame {

    public RegistroAlumnos() {
        initComponents();
        setTitle("Registro de alumnos");
        setLocationRelativeTo(null);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        ImageIcon wallpaper_logo = new ImageIcon("src/img/colegio.png");
        Icon icono_logo = new ImageIcon(wallpaper_logo.getImage().getScaledInstance(jLabel_Logo.getWidth(),
                jLabel_Logo.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Logo.setIcon(icono_logo);
        this.repaint();
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/colegio.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_titulo = new javax.swing.JLabel();
        jLabel_nombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_grupo = new javax.swing.JTextField();
        jButton_Regitrar = new javax.swing.JButton();
        jButton_Modificar = new javax.swing.JButton();
        jButton_Eliminar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel_footer = new javax.swing.JLabel();
        jLabel_Logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_Buscar = new javax.swing.JTextField();
        jButton_Buscar = new javax.swing.JButton();
        jButton_GenerarPdf = new javax.swing.JButton();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_titulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_titulo.setText("Registro de alumnos");
        getContentPane().add(jLabel_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jLabel_nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nombre.setText("Nombre:");
        getContentPane().add(jLabel_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Grupo:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        txt_nombre.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 210, -1));

        txt_grupo.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_grupo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_grupo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_grupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 210, -1));

        jButton_Regitrar.setText("Registrar");
        jButton_Regitrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegitrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Regitrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jButton_Modificar.setText("Modificar");
        jButton_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ModificarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        jButton_Eliminar.setText("Eliminar");
        jButton_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        jButton5.setText("Limpiar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 90, -1));

        jButton6.setText("Salir");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 90, -1));

        jLabel_footer.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel_footer.setText("Programa creado por Juan Palma ®");
        getContentPane().add(jLabel_footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));
        getContentPane().add(jLabel_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 120, 120));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Ingresa el ID del alumno:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 160, -1));

        txt_Buscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_Buscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Buscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 30, -1));

        jButton_Buscar.setText("Buscar");
        jButton_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, -1, -1));

        jButton_GenerarPdf.setText("Generar PDF");
        jButton_GenerarPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GenerarPdfActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_GenerarPdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, -1));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 347));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Boton registrar
    private void jButton_RegitrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegitrarActionPerformed

        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_ins", "root", "");
            PreparedStatement pst = cn.prepareStatement("insert into alumnos values(?, ?, ?)");

            pst.setString(1, "0");
            pst.setString(2, txt_nombre.getText().trim());
            pst.setString(3, txt_grupo.getText().trim());

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Registro exitoso!!!");
            txt_nombre.setText("");
            txt_grupo.setText("");

        } catch (Exception e) {
        }

    }//GEN-LAST:event_jButton_RegitrarActionPerformed

    //Boton Modificar
    private void jButton_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ModificarActionPerformed

        try {
            String ID = txt_Buscar.getText().trim();

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_ins", "root", "");
            PreparedStatement pst = cn.prepareStatement("update alumnos set NombreAlumno = ?, "
                    + "Grupo = ? where ID = " + ID);
            pst.setString(1, txt_nombre.getText().trim());
            pst.setString(2, txt_grupo.getText().trim());
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Modificación exitosa!!!");
            txt_nombre.setText("");
            txt_grupo.setText("");
            txt_Buscar.setText("");

        } catch (HeadlessException | SQLException e) {
            System.err.println("Error en la modificacion" + e);
            JOptionPane.showMessageDialog(null, "Error en la modificacion!!!");
        }

    }//GEN-LAST:event_jButton_ModificarActionPerformed

    //Boton Eliminar
    private void jButton_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EliminarActionPerformed

        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_ins", "root", "");
            PreparedStatement pst = cn.prepareStatement("delete from alumnos where ID = ?");

            //aqui se recupera lo que esta en la variable txt_buscar para luego eliminar el registro.
            pst.setString(1, txt_Buscar.getText().trim());
            pst.executeUpdate();
            
                JOptionPane.showMessageDialog(null, "Registro elminado correctamente!!!");
                txt_nombre.setText("");
                txt_grupo.setText("");
                txt_Buscar.setText("");

        } catch (Exception e) {
            System.err.println("Error en la Eliminación" + e);
            JOptionPane.showMessageDialog(null, "Error en la eliminación!!!");
        }

    }//GEN-LAST:event_jButton_EliminarActionPerformed

    //Boton Limpiar
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        txt_nombre.setText("");
        txt_grupo.setText("");
        txt_Buscar.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    //Boton Salir
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        JOptionPane.showMessageDialog(null, "Hasta la vista, baby!!!" + "\n" + "you could by mine.");
        System.exit(0);

    }//GEN-LAST:event_jButton6ActionPerformed

    //Boton Buscar
    private void jButton_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BuscarActionPerformed

        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_ins", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from alumnos where ID = ?"); //se compara el campo
                                                //de la bdd con la variable del jTextfield
            pst.setString(1, txt_Buscar.getText().trim());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txt_nombre.setText(rs.getString("NombreAlumno"));
                txt_grupo.setText(rs.getString("Grupo"));

            } else {
                JOptionPane.showMessageDialog(null, "Alumno no encotrado!!!");
                txt_Buscar.setText("");
            }

        } catch (Exception e) {
        }


    }//GEN-LAST:event_jButton_BuscarActionPerformed

    //Boton Generar PDF
    private void jButton_GenerarPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GenerarPdfActionPerformed
        
        Document documento = new Document();
        
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Reporte_Alumnos.pdf"));
            documento.open();
            
            PdfPTable tabla = new PdfPTable(3);
            tabla.addCell("Código");
            tabla.addCell("Nombre del Alumno");
            tabla.addCell("Grupo");
            
            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_ins", "root", "");
                PreparedStatement pst = cn.prepareStatement("select * from alumnos");
                
                ResultSet rs = pst.executeQuery();
                
                if (rs.next()) {
                    
                    do {                        
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));                        
                    } while (rs.next());
                    documento.add(tabla);
                }

            } catch (DocumentException | SQLException e) {
            }
            documento.close();
            JOptionPane.showMessageDialog(null , "Reporte creado!!!");
        } catch (DocumentException | HeadlessException | FileNotFoundException   e) {
        }
        
    }//GEN-LAST:event_jButton_GenerarPdfActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroAlumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton_Buscar;
    private javax.swing.JButton jButton_Eliminar;
    private javax.swing.JButton jButton_GenerarPdf;
    private javax.swing.JButton jButton_Modificar;
    private javax.swing.JButton jButton_Regitrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_Logo;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JLabel jLabel_footer;
    private javax.swing.JLabel jLabel_nombre;
    private javax.swing.JLabel jLabel_titulo;
    private javax.swing.JTextField txt_Buscar;
    private javax.swing.JTextField txt_grupo;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}