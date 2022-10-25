
package proyecto_final_grupo2;
import Conexion.conexion;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.*;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;

public class LISTA extends javax.swing.JFrame {
    conexion con= new conexion();
    Connection cn = con.conectar();
    PreparedStatement ps;
    ResultSet rs;

    /**
     * Creates new form LISTA
     */
    public LISTA() {
        initComponents();
        setLocationRelativeTo(null);
    }

     private void LimpiarCajas(){
        txtCampos.setText(null);
        txtCampo.setText(null);
        
                
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCampos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCampo = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LISTA DE VEHICULOS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Propietario:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        txtCampos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCamposKeyPressed(evt);
            }
        });
        jPanel1.add(txtCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 170, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("No. Placa:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, -1));

        txtCampo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCampoKeyTyped(evt);
            }
        });
        jPanel1.add(txtCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 140, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton2.setText("CONSULTAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Propietario", "No. Placa", "Tipo", "Hora de Entrada"
            }
        ));
        tabla.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                tablaAncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 480, 230));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/53b2ddd96c334e8cd52202670476e653.jpg"))); // NOI18N
        jLabel1.setText("No. Placa");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.toBack();
        setVisible(false);
        new MENU().toFront();
        new MENU().setState(java.awt.Frame.NORMAL);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tablaAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tablaAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaAncestorMoved

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String campo = txtCampo.getText();
        String campo2 = txtCampos.getText();
        String where = "";

        if(!"".equals(campo))
        {
            where = "WHERE Placa = '"+ campo + "'";
        }
        if(!"".equals(campo2))
        {
            where = "WHERE Propietario = '"+ campo2 + "'";
        }
        try{
            DefaultTableModel modelo=new DefaultTableModel();
            tabla.setModel(modelo);
            String sql = "SELECT Propietario, Placa, Tipo_Vehiculo,Hora_Entrada FROM parqueo " + where;

            System.out.println(sql);

            ps =cn.prepareStatement(sql);
            rs =ps.executeQuery();
            ResultSetMetaData rsMd= rs.getMetaData();
            int cantidadColumnas =rsMd.getColumnCount();
            modelo.addColumn("Propietario");
            modelo.addColumn("No. Placa");
            modelo.addColumn("Tip de Vehiculo");
            modelo.addColumn("Hora de Entrada");
            while(rs.next()){
                Object [] filas = new Object[cantidadColumnas];
                for(int i = 0; i< cantidadColumnas; i++){
                    filas [i]=rs.getObject(i+1);
                }
                modelo.addRow(filas);
            }
        LimpiarCajas();
        }catch(SQLException ex){
            System.err.println(ex.toString());

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtCamposKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCamposKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCamposKeyPressed

    private void txtCampoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCampoKeyTyped
       if(txtCampo.getText().length() >=8)
        {
            evt.consume();
        }   
    }//GEN-LAST:event_txtCampoKeyTyped

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
            java.util.logging.Logger.getLogger(LISTA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LISTA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LISTA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LISTA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LISTA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtCampo;
    private javax.swing.JTextField txtCampos;
    // End of variables declaration//GEN-END:variables
}
