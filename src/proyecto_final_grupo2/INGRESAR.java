/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto_final_grupo2;

import Conexion.conexion;
import java.sql.Connection;
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.logging.*;

/**
 * Clase que representa la ventana de ingreso de datos.
 */
public class INGRESAR extends javax.swing.JFrame {

    conexion con = new conexion(); // Objeto de la clase 'conexion' para establecer la conexión a la base de datos
    Connection cn = con.conectar(); // Objeto de tipo 'Connection' para manejar la conexión a la base de datos
    PreparedStatement ps; // Objeto de tipo 'PreparedStatement' para preparar y ejecutar consultas SQL parametrizadas
    ResultSet rs; // Objeto de tipo 'ResultSet' para almacenar los resultados de las consultas SQL
    /**
     * Constructor de la clase.
     */
    public INGRESAR() {
        initComponents();
        setLocationRelativeTo(null);
        
    }
    /**
     * Método para limpiar los campos de entrada.
     */
private void LimpiarCajas(){
        txtnombre.setText(null); // Limpia el campo 'txtnombre'
        txtcodigoproducto.setText(null); // Limpia el campo 'txtcodigoproducto'
        producto.setSelectedIndex(0); // Restablece el valor seleccionado en el combo box 'producto'
        txtcantidad.setText(null); // Limpia el campo 'txtcantidad'
        txtfechaingreso1.setText(null); // Limpia el campo 'txtfechaingreso1'
        txtfechavenci.setText(null); // Limpia el campo 'txtfechavenci'
    }


 /**
     * Este método se llama desde el constructor para inicializar el formulario.
     * ADVERTENCIA: No modifiques este código. El contenido de este método siempre se regenera
     * cada vez que se modifica el formulario en el editor visual.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtcodigoproducto = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        producto = new javax.swing.JComboBox<>();
        txtfechavenci = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtfechaingreso1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/53b2ddd96c334e8cd52202670476e653 (2).jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("REGISTRAR PRODUCTO");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 320, 60));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Codigo Producto:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 140, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tipo de Producto:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 150, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha de Vencimiento:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        jPanel2.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 190, -1));

        txtcodigoproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoproductoActionPerformed(evt);
            }
        });
        txtcodigoproducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodigoproductoKeyTyped(evt);
            }
        });
        jPanel2.add(txtcodigoproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 190, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("REGISTRAR PRODUCTO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 210, 60));

        producto.setEditable(true);
        producto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        producto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Leche", "Queso", "Crema", "Yogurt", "Leche Condensada", "Mantequilla", " " }));
        producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoActionPerformed(evt);
            }
        });
        jPanel2.add(producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 190, -1));

        txtfechavenci.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfechavenciKeyTyped(evt);
            }
        });
        jPanel2.add(txtfechavenci, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 190, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cantidad:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        txtcantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcantidadKeyTyped(evt);
            }
        });
        jPanel2.add(txtcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 190, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fecha de Ingreso:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        txtfechaingreso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechaingreso1ActionPerformed(evt);
            }
        });
        txtfechaingreso1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfechaingreso1KeyTyped(evt);
            }
        });
        jPanel2.add(txtfechaingreso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 190, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pngtree-health-and-vitality-milk-dairy-products-poster-background-material-image_126084.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        jLabel9.setToolTipText("");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -250, 580, 750));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfechaingreso1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfechaingreso1KeyTyped
        // TODO agregar aquí el código de manejo correspondiente: 
    }//GEN-LAST:event_txtfechaingreso1KeyTyped

    private void txtcantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantidadKeyTyped
         // TODO agregar aquí el código de manejo correspondiente: 
    }//GEN-LAST:event_txtcantidadKeyTyped

    private void txtfechavenciKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfechavenciKeyTyped
        if(txtfechavenci.getText().length() >=5)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtfechavenciKeyTyped

    private void productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productoActionPerformed
        // TODO agregar aquí el código de manejo correspondiente: 
    }//GEN-LAST:event_productoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Guardar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtcodigoproductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoproductoKeyTyped
        if(txtcodigoproducto.getText().length() >=8)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtcodigoproductoKeyTyped

    private void txtcodigoproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoproductoActionPerformed
        // TODO agregar aquí el código de manejo correspondiente: 
    }//GEN-LAST:event_txtcodigoproductoActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO agregar aquí el código de manejo correspondiente: 
    }//GEN-LAST:event_txtnombreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO agregar aquí el código de manejo correspondiente: 
        this.toBack();
        setVisible(false);
        // Crea una nueva instancia de la clase MENU y la coloca en primer plano
        new MENU().toFront();
        // Establece el estado de la ventana MENU como normal
        new MENU().setState(java.awt.Frame.NORMAL);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtfechaingreso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechaingreso1ActionPerformed
        // TODO agregar aquí el código de manejo correspondiente: 
    }//GEN-LAST:event_txtfechaingreso1ActionPerformed
   
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(INGRESAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(INGRESAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(INGRESAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(INGRESAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new INGRESAR().setVisible(true);
        });
    }
public void Guardar(){
    try{
        // Preparar la sentencia SQL para insertar datos en la tabla "lacteos"
        PreparedStatement pps= cn.prepareStatement("INSERT INTO lacteos(Nombre,Codigo_Producto,Tipo_Producto,Cantidad,Fecha_de_Ingreso,Fecha_de_Vencimiento) VALUES(?,?,?,?,?,?)");
        // Establecer los valores de los parámetros en la sentencia SQL
        pps.setString(1, txtnombre.getText());
        pps.setString(2, txtcodigoproducto.getText());
        pps.setString(3, (String) producto.getSelectedItem());
        pps.setString(4, txtcantidad.getText());
        pps.setString(5, txtfechaingreso1.getText());
        pps.setString(6, txtfechavenci.getText());
        // Ejecutar la sentencia SQL para insertar los datos en la base de datos
        pps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Producto Registrado");
        // Limpiar los campos de entrada después de guardar los datos
        LimpiarCajas();
        }catch(SQLException ex) {
            Logger.getLogger(INGRESAR.class.getName()).log(Level.SEVERE, null, ex);
        }}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> producto;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtcodigoproducto;
    private javax.swing.JTextField txtfechaingreso1;
    private javax.swing.JTextField txtfechavenci;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
