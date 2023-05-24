
package proyecto_final_grupo2;


import Conexion.conexion;
import java.sql.SQLException;
import java.sql.*;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ELIMINAR extends javax.swing.JFrame {
    conexion con = new conexion(); // Objeto para establecer la conexión con la base de datos
    Connection cn = con.conectar(); // Conexión a la base de datos
    PreparedStatement ps; // Objeto para ejecutar consultas SQL precompiladas
    ResultSet rs; // Objeto para almacenar los resultados de una consulta SQL

    // Método para limpiar los campos
    public void limpiar(){
        txtbuscartodo.setText("");   
    }
  
            
    // Constructor de la clase ELIMINAR
    public ELIMINAR() {
        initComponents();// Inicializa los componentes gráficos de la interfaz
        setLocationRelativeTo(null);
        Mostrar(""); // Llama al método "Mostrar" con un argumento vacío para mostrar todos los registros de la base de datos
         
    }
    private void LimpiarCajas(){
        txtbuscartodo.setText(null); // Establece el texto del campo txtbuscartodo como nulo, lo que significa que se borrará el contenido del campo
          
    }
    
/**

Este método se llama desde el constructor para inicializar el formulario.
ADVERTENCIA: NO modifique este código. El contenido de este método siempre se regenera por el Editor de Formularios.
*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtbuscartodo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        btneliminar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pngtree-health-and-vitality-milk-dairy-products-poster-background-material-image_126084.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        jLabel9.setToolTipText("");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/53b2ddd96c334e8cd52202670476e653 (2).jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ELIMINAR PRODUCTO");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Codigo:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 70, 20));

        txtbuscartodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscartodoActionPerformed(evt);
            }
        });
        txtbuscartodo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbuscartodoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbuscartodoKeyTyped(evt);
            }
        });
        jPanel2.add(txtbuscartodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 160, 30));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Codigo Producto", "Tipo de Producto", "Cantidad", "Fecha de Ingreso", "Fecha de Vencimiento"
            }
        ));
        Tabla.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                TablaAncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(Tabla);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 800, 160));

        btneliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btneliminar.setText("ELIMINAR ");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 150, 40));

        buscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buscar.setText("BUSCAR");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        jPanel2.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 60, 120, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pngtree-health-and-vitality-milk-dairy-products-poster-background-material-image_126084.jpg"))); // NOI18N
        jLabel10.setText("jLabel9");
        jLabel10.setToolTipText("");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, -240, 620, 740));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pngtree-health-and-vitality-milk-dairy-products-poster-background-material-image_126084.jpg"))); // NOI18N
        jLabel11.setText("jLabel9");
        jLabel11.setToolTipText("");
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -270, 620, 760));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO añade aquí tu código de manejo:
        this.toBack();// Enviar la ventana actual al fondo
        setVisible(false); // Ocultar la ventana actual
        new MENU().toFront(); // Traer al frente la ventana del menú
        new MENU().setState(java.awt.Frame.NORMAL);// Establecer el estado normal de la ventana del menú
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TablaAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TablaAncestorMoved
        // TODO añade tu código de manejo aquí:
    }//GEN-LAST:event_TablaAncestorMoved

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
     Borrar();
    }//GEN-LAST:event_btneliminarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        
     Buscar();
    }//GEN-LAST:event_buscarActionPerformed

    private void txtbuscartodoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscartodoKeyPressed
         
    }//GEN-LAST:event_txtbuscartodoKeyPressed

    private void txtbuscartodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscartodoActionPerformed
        // TODO añade tu código de manejo aquí:
    }//GEN-LAST:event_txtbuscartodoActionPerformed

    private void txtbuscartodoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscartodoKeyTyped
        // Si la longitud del texto en el campo txtbuscartodo es mayor o igual a 8
        if(txtbuscartodo.getText().length() >=8)
        // Consumir el evento, evitando que se realice la acción por defecto
        {
            evt.consume();
        }    
    }//GEN-LAST:event_txtbuscartodoKeyTyped

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
            java.util.logging.Logger.getLogger(ELIMINAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ELIMINAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ELIMINAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ELIMINAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ELIMINAR().setVisible(true);
            }
        });
    }


public void Mostrar(String Nombre){
    // Crear un nuevo modelo de tabla
    DefaultTableModel modelo=new DefaultTableModel();
    modelo.addColumn("Nombre");
    modelo.addColumn("Codigo Producto");
    modelo.addColumn("Tipo de Producto");    
    modelo.addColumn("Cantidad");
    modelo.addColumn("Fecha de Ingreso");
    modelo.addColumn("Fecha de Vencimiento");
    // Establecer el modelo de tabla en la Tabla
    Tabla.setModel(modelo);
    String sql="";
    if(Nombre.equals("")){
        sql="Select*from lacteos";// Consulta para mostrar todos los registros
    }else{
        sql="Select*from lacteos where Nombre like'%"+Nombre+"%'";// Consulta para filtrar por nombre
    }
    String lacteos[]=new String[6];
    Statement set;
    try {
        set = cn.createStatement(); 
        ResultSet resul=set.executeQuery(sql);
        // Iterar a través de los resultados del conjunto de resultados
        while(resul.next()){
            lacteos[0]=resul.getString(1);// Obtener el valor de la primera columna y asignarlo a lacteos[0]
              lacteos[1]=resul.getString(2);// Obtener el valor de la primera columna y asignarlo a lacteos[1]
                lacteos[2]=resul.getString(3); // Obtener el valor de la primera columna y asignarlo a lacteos[2] 
                    lacteos[3]=resul.getString(4);// Obtener el valor de la primera columna y asignarlo a lacteos[3]
                        lacteos[4]=resul.getString(5);// Obtener el valor de la primera columna y asignarlo a lacteos[4]
                            lacteos[5]=resul.getString(6);// Obtener el valor de la primera columna y asignarlo a lacteos[5]
                             // Agregar los valores de lacteos como una nueva fila al modelo de tabla
                  modelo.addRow(lacteos);
                  
                
        }
        // Establecer el modelo de tabla actualizado en la Tabla
        Tabla.setModel(modelo);
    } catch (SQLException ex) {
        Logger.getLogger(ELIMINAR.class.getName()).log(Level.SEVERE, null, ex);
    }
   
    
}
 
public void Borrar(){
    int fila=Tabla.getSelectedRow();
    String Codigo_Producto=Tabla.getValueAt(fila,1).toString();
    int n=JOptionPane.showConfirmDialog(null,"Desea eliminar registro","ELIMINAR",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
    if(n==JOptionPane.YES_NO_OPTION){
    try {
        PreparedStatement borrar=cn.prepareStatement("Delete from lacteos where Codigo_Producto='"+Codigo_Producto+"'");
        borrar.executeUpdate();
        Mostrar("");
    } catch (SQLException ex) {
        Logger.getLogger(ELIMINAR.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
}
public void Buscar(){  
      String campo = txtbuscartodo.getText();
        String where = "";

        if(!"".equals(campo))
        {
            where = "WHERE Codigo_Producto = '"+ campo + "'";
        }
        try{
            DefaultTableModel modelo=new DefaultTableModel();
            Tabla.setModel(modelo);
            String sql = "SELECT Nombre,Codigo_Producto,Tipo_Producto,Cantidad,Fecha_de_Ingreso,Fecha_de_Vencimiento FROM lacteos " + where;

            System.out.println(sql);

            ps =cn.prepareStatement(sql);
            rs =ps.executeQuery();
            ResultSetMetaData rsMd= rs.getMetaData();
            int cantidadColumnas =rsMd.getColumnCount();
            modelo.addColumn("Nombre");
            modelo.addColumn("Codigo Producto");
            modelo.addColumn("Tipo de Producto");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Fecha de Ingreso");
            modelo.addColumn("Fecha de Vencimiento");
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
       
 }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable Tabla;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton buscar;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtbuscartodo;
    // End of variables declaration//GEN-END:variables
}
