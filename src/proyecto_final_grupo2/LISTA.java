
package proyecto_final_grupo2;
import Conexion.conexion;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.*;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
/**
 * La clase LISTA representa una ventana que muestra una lista de datos.
 * Esta clase se encarga de conectar con la base de datos, obtener los datos
 * y mostrarlos en una tabla.
 */
public class LISTA extends javax.swing.JFrame {
    conexion con= new conexion();
    Connection cn = con.conectar();
    PreparedStatement ps;
    ResultSet rs;
/**
     * Crea una nueva instancia de la clase LISTA.
     * Esta función se llama desde el constructor para inicializar la interfaz gráfica.
     */
    public LISTA() {
        initComponents();
        setLocationRelativeTo(null);
    }
    /**
     * Limpia los campos de texto de la interfaz gráfica.
     */
     private void LimpiarCajas(){
        txtCampos.setText(null);
        txtCampo.setText(null);
        
                
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
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
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pngtree-health-and-vitality-milk-dairy-products-poster-background-material-image_126084.jpg"))); // NOI18N
        jLabel10.setText("jLabel9");
        jLabel10.setToolTipText("");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pngtree-health-and-vitality-milk-dairy-products-poster-background-material-image_126084.jpg"))); // NOI18N
        jLabel12.setText("jLabel9");
        jLabel12.setToolTipText("");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/53b2ddd96c334e8cd52202670476e653.jpg"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pngtree-health-and-vitality-milk-dairy-products-poster-background-material-image_126084.jpg"))); // NOI18N
        jLabel13.setText("jLabel9");
        jLabel13.setToolTipText("");
        jLabel13.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

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
        jLabel2.setText("LISTA DE PRODUCTOS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        txtCampos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCamposKeyPressed(evt);
            }
        });
        jPanel1.add(txtCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 170, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Codigo Producto:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));

        txtCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCampoActionPerformed(evt);
            }
        });
        txtCampo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCampoKeyTyped(evt);
            }
        });
        jPanel1.add(txtCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 140, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton2.setText("CONSULTAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, -1));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Codigo Producto", "Tipo de Producto", "Cantidad", "Fecha de Ingreso", "Fecha de Vencimiento"
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 780, 240));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pngtree-health-and-vitality-milk-dairy-products-poster-background-material-image_126084.jpg"))); // NOI18N
        jLabel11.setText("jLabel9");
        jLabel11.setToolTipText("");
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, -20, 490, 600));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pngtree-health-and-vitality-milk-dairy-products-poster-background-material-image_126084.jpg"))); // NOI18N
        jLabel14.setText("jLabel9");
        jLabel14.setToolTipText("");
        jLabel14.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, -20, 490, 600));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pngtree-health-and-vitality-milk-dairy-products-poster-background-material-image_126084.jpg"))); // NOI18N
        jLabel15.setText("jLabel9");
        jLabel15.setToolTipText("");
        jLabel15.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, -20, 490, 600));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, -30, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pngtree-health-and-vitality-milk-dairy-products-poster-background-material-image_126084.jpg"))); // NOI18N
        jLabel16.setText("jLabel9");
        jLabel16.setToolTipText("");
        jLabel16.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, -270, 620, 860));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pngtree-health-and-vitality-milk-dairy-products-poster-background-material-image_126084.jpg"))); // NOI18N
        jLabel17.setText("jLabel9");
        jLabel17.setToolTipText("");
        jLabel17.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, -240, 620, 740));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO agregar código de manejo aquí:
        // Minimiza la ventana actual   
        this.toBack();
        // Oculta la ventana actual
        setVisible(false);
        // Trae al frente la ventana del menú principal
        new MENU().toFront();
        // Establece el estado normal de la ventana del menú principal
        new MENU().setState(java.awt.Frame.NORMAL);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tablaAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tablaAncestorMoved
        // TODO agregar código de manejo aquí:
    }//GEN-LAST:event_tablaAncestorMoved

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO agregar código de manejo aquí:
    Consultar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtCamposKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCamposKeyPressed
        // TODO agregar código de manejo aquí:
    }//GEN-LAST:event_txtCamposKeyPressed

    private void txtCampoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCampoKeyTyped
       if(txtCampo.getText().length() >=8)
        {
            evt.consume();
        }   
    }//GEN-LAST:event_txtCampoKeyTyped

    private void txtCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCampoActionPerformed
        // TODO agregar código de manejo aquí:
    }//GEN-LAST:event_txtCampoActionPerformed

    /**
       * @param args los argumentos de línea de comandos
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

         /* Crear y mostrar el formulario */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LISTA().setVisible(true);
            }
        });
    }
  /**
 * Realiza la consulta de datos.
 */
public void Consultar(){
        String campo = txtCampo.getText();
        String campo2 = txtCampos.getText();
        String where = "";
        // Verifica si el campo "campo" no está vacío
        if(!"".equals(campo))
        {
            where = "WHERE Codigo_Producto = '"+ campo + "'";
        }
        // Verifica si el campo "campo2" no está vacío
        if(!"".equals(campo2))
        {
            where = "WHERE Nombre = '"+ campo2 + "'";
        }
        try{
            // Crea un modelo de tabla por defecto
            DefaultTableModel modelo=new DefaultTableModel();
            tabla.setModel(modelo);
            // Construye la consulta SQL utilizando la variable "where"
            String sql = "SELECT Nombre, Codigo_Producto, Tipo_Producto,Cantidad, Fecha_de_Ingreso,Fecha_de_Vencimiento FROM parqueo " + where;

            System.out.println(sql);
            // Prepara la sentencia SQL y ejecuta la consulta
            ps =cn.prepareStatement(sql);
            rs =ps.executeQuery();
            // Obtiene los metadatos del resultado para obtener la cantidad de columnas
            ResultSetMetaData rsMd= rs.getMetaData();
            int cantidadColumnas =rsMd.getColumnCount();
            // Agrega las columnas al modelo de tabla
            modelo.addColumn("Nombre");
            modelo.addColumn("Codigo Producto");
            modelo.addColumn("Tipo de Producto");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Fecha de Ingreso");
            modelo.addColumn("Fecha de Vencimiento");
            // Recorre los resultados y agrega las filas al modelo de tabla
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

        }}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtCampo;
    private javax.swing.JTextField txtCampos;
    // End of variables declaration//GEN-END:variables
}
