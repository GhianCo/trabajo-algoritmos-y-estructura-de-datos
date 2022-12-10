/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package views;

import java.awt.Frame;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utils.DBConn;

/**
 *
 * @author ELIAS
 */
public class frmNuevoPedido extends javax.swing.JDialog {
    
    
 private Connection connection; 
 private int pedido_id;
 DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
DecimalFormat decimal = new DecimalFormat("####.00", simbolos);
    /**
     * Creates new form frmNuevoPedido
     */
    public frmNuevoPedido(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
          simbolos.setDecimalSeparator('.');
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtcliente = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jpedido = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtproducto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtcan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTotalItem = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        lblidproducto = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        lbltotalpedido = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        lbltotalpedido1 = new javax.swing.JLabel();
        lbltotalpedido2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblproductos = new javax.swing.JLabel();
        lblidcliente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nuevo Pedido");

        jLabel1.setText("Cliente");

        jpedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PRODUCTO", "CANTIDAD", "PRECIO", "SUBTOTAL"
            }
        ));
        jScrollPane2.setViewportView(jpedido);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Producto"));

        jLabel8.setText("Descripcion");

        txtcan.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcan.setText("1");
        txtcan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcanFocusLost(evt);
            }
        });

        jLabel4.setText("Cantidad");

        txtTotalItem.setEditable(false);

        jLabel7.setText("Precio");

        jLabel9.setText("Total Item");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/find.png"))); // NOI18N
        jButton3.setText("Buscar Producto");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        lblidproducto.setText("IDPRODUCTO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcan, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalItem, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtproducto))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lblidproducto)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4)
                    .addComponent(txtcan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtTotalItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblidproducto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/ic_add_shopping_cart_24.png"))); // NOI18N
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete16.png"))); // NOI18N
        jButton2.setText("Quitar");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/find.png"))); // NOI18N
        jButton4.setText("Buscar Cliente");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        lbltotalpedido.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        lbltotalpedido.setForeground(new java.awt.Color(204, 0, 51));
        lbltotalpedido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltotalpedido.setText("0.00");

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/disk_save.png"))); // NOI18N
        jButton5.setText("Guardar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Cancel (2).png"))); // NOI18N
        jButton6.setText("Cancelar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        lbltotalpedido1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbltotalpedido1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltotalpedido1.setText("NUEVO PEDIDO");

        lbltotalpedido2.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        lbltotalpedido2.setForeground(new java.awt.Color(204, 0, 51));
        lbltotalpedido2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbltotalpedido2.setText("TOTAL");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel2.setText("PRODUCTOS:");

        lblproductos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblproductos.setText("0");

        lblidcliente.setText("IDCLIENTE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 7, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4))
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblproductos)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblidcliente)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addGap(37, 37, 37)
                        .addComponent(lbltotalpedido2)
                        .addGap(18, 18, 18)
                        .addComponent(lbltotalpedido, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(lbltotalpedido1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbltotalpedido1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lblproductos)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6)
                            .addComponent(jButton5)
                            .addComponent(lblidcliente)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbltotalpedido2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbltotalpedido, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcanFocusLost
        // TODO add your handling code here:
        totalitem();
    }//GEN-LAST:event_txtcanFocusLost

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
         Frame frame=JOptionPane.getFrameForComponent(this);
        frmBuscliente cli=new frmBuscliente(frame,true);
        cli.setLocationRelativeTo(this);
       
        cli.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        Frame frame=JOptionPane.getFrameForComponent(this);
        frmBusproducto cli=new frmBusproducto(frame,true);
        cli.setLocationRelativeTo(this);
       
        cli.setVisible(true);
        totalitem();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AgregarItem();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        
        try {
            connection = DBConn.getConnection();
            connection.setAutoCommit(false);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
           int result = JOptionPane.showConfirmDialog(rootPane,"¿Esta seguro de registrar el pedido ?", "Registro de pedido", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(result == JOptionPane.YES_OPTION){
                
                if (GrabarCabecera())
                    if (GrabarDetalle())
                    {
                        try {
                           connection.commit();
                        } catch (Exception e) {
                            System.out.println(e.toString());
                            try {
                              connection.rollback();
                            } catch (Exception ex) {
                                  System.out.println(ex.toString());
                                }
                                                  
                           }
                         JOptionPane.showMessageDialog(rootPane, "Se registro correctamente el pedido", "Registro de pedidos", JOptionPane.INFORMATION_MESSAGE);
                         this.dispose();
                    }
                        
            }
            
    }//GEN-LAST:event_jButton5ActionPerformed

     private void AgregarItem() {

        String[] fila = new String[5];
        fila[0] = lblidproducto.getText();
        fila[1] = txtproducto.getText();
        fila[2] = txtcan.getText();
        fila[3] = txtPrecio.getText();
        fila[4] = txtTotalItem.getText();

        DefaultTableModel dtm = (DefaultTableModel) jpedido.getModel();

        dtm.addRow(fila);
        txtproducto.setText("");
        txtPrecio.setText("");
        txtTotalItem.setText("0.00");
        txtcan.setText("1");
        totalpedido();
        
    }
     
       private void totalpedido() {

        double precio = 0;
        double total = 0;

        int cantidad = 0;
        int totalcantidad = 0;

        for (int i = 0; i < jpedido.getRowCount(); i++) {

            precio = Double.parseDouble(jpedido.getValueAt(i, 4).toString());
            total = total + precio;
            cantidad = Integer.parseInt(jpedido.getValueAt(i, 2).toString());
            totalcantidad = totalcantidad + cantidad;
        }

        lbltotalpedido.setText(String.valueOf(decimal.format(total)));
       lblproductos.setText(String.valueOf(totalcantidad));
    }
    
  private void totalitem() {
      
      int cantidad=0;
      double precio =0;
      double total =0;
         cantidad = Integer.parseInt(txtcan.getText());
         precio = Double.parseDouble(txtPrecio.getText());
         total = cantidad * precio;
         txtTotalItem.setText(String.valueOf(decimal.format(total)));
    }
  
  private boolean GrabarCabecera(){
        boolean result=false;
    
         try {
              CallableStatement sp=connection.prepareCall("{call sp_insert_Pedido(?,?,?)}");
               sp.setInt(1,Integer.parseInt(lblidcliente.getText()));
               sp.setDouble(2,Double.parseDouble(lbltotalpedido.getText()));
               sp.registerOutParameter(3, java.sql.Types.INTEGER);
               
               sp.executeUpdate();
               pedido_id=sp.getInt(3);
               
                result=true;
                 sp.close();
          
      } catch (Exception e) {
             System.out.println(e.toString());
               result=false;
      }
      
      return result;
  }
  
  private boolean GrabarDetalle(){
      boolean result=false;
      
      try {
          
             CallableStatement sp=connection.prepareCall("{call sp_insert_DetallePedido(?,?,?,?)}");
             for(int i=0;i<jpedido.getRowCount();i++){
              
                sp.setInt(1,pedido_id);//idorden
                sp.setInt(2,Integer.parseInt(jpedido.getValueAt(i,0).toString()) );
                sp.setInt(3,Integer.parseInt(jpedido.getValueAt(i,2).toString()) );
               sp.setDouble(4,Double.parseDouble(jpedido.getValueAt(i,3).toString()) );
               
                sp.addBatch();
                 result=true;
               
           }
            sp.executeBatch();
            sp.close();
          
      } catch (Exception e) {
           System.out.println(e.toString());
               result=false;
      }
      
      return result;
  }
    
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
            java.util.logging.Logger.getLogger(frmNuevoPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmNuevoPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmNuevoPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmNuevoPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmNuevoPedido dialog = new frmNuevoPedido(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jpedido;
    public static javax.swing.JLabel lblidcliente;
    public static javax.swing.JLabel lblidproducto;
    private javax.swing.JLabel lblproductos;
    private javax.swing.JLabel lbltotalpedido;
    private javax.swing.JLabel lbltotalpedido1;
    private javax.swing.JLabel lbltotalpedido2;
    public static javax.swing.JTextField txtPrecio;
    public static javax.swing.JTextField txtTotalItem;
    private javax.swing.JTextField txtcan;
    public static javax.swing.JTextField txtcliente;
    public static javax.swing.JTextField txtproducto;
    // End of variables declaration//GEN-END:variables
}
