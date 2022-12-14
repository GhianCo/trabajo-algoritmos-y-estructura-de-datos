package views;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.entities.ArbolClientes;
import models.entities.Cliente;
import models.entities.Cliente.membresia;
import services.ClienteService;
import services.impl.ClienteServiceImpl;

public class frmRegistroClientes extends javax.swing.JInternalFrame {

    List<Cliente> clientes;
    int accion = 0;

    DefaultTableModel dtm = new DefaultTableModel();
    ArbolClientes arbolClientes = new ArbolClientes();

    /**
     * Creates new form frmRegistroClientes
     */
    public frmRegistroClientes() {
        initComponents();
        CentrarVentana();
        CargarClientes();
    }

    private void CentrarVentana() {
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height;
        int width = pantalla.width;

        int x = (width / 2) - this.getWidth() / 2;
        int y = (height / 2) - this.getHeight() / 2;

        this.setLocation(x, y);

    }

//     private void CargarClientes() {
////        DefaultTableModel dtm = (DefaultTableModel) jclientes.getModel();
////        String[] fila = new String[5];
////        
////        ClienteService clienteService = new ClienteServiceImpl();
////        List<Cliente> clientes = clienteService.listar();
////        
////        for (int i = 0; i < clientes.size(); i++) {
////
////            fila[0] = clientes.get(i).getCliente_nombres();
////            fila[1] = clientes.get(i).getCliente_apellidos();
////            fila[2] = String.valueOf(clientes.get(i).getCliente_edad());
////            fila[3] = clientes.get(i).getCliente_telefono();
////            fila[4] = clientes.get(i).getMembresia_nombre();
////            dtm.addRow(fila);
////        }
//
//    }
    private void CargarClientes() {

        //si esta lleno limpia la tabla
        if (tblclientes.getRowCount() > 0) {

            for (int i = tblclientes.getRowCount() - 1; i >= 0; i--) {
                dtm.removeRow(i);
            }

        }

        String[] headers = new String[]{"ID", "dni", "NOMBRE", "APELLIDOS", "MEMBRESIA", "EDAD", "TELEFONO"};
        dtm.setColumnIdentifiers(headers);
        tblclientes.setModel(dtm);

        ClienteService clienteservice = new ClienteServiceImpl();
        clientes = clienteservice.listar();

        for (Integer count = 0; count < clientes.size(); count++) {
            arbolClientes.insertar(clientes.get(count));
            dtm.addRow(new Object[]{
                clientes.get(count).getCliente_id(),
                clientes.get(count).getDni(),
                clientes.get(count).getCliente_nombres(),
                clientes.get(count).getCliente_apellidos(),
                clientes.get(count).getMembresia_nombre(),
                clientes.get(count).getCliente_edad(),
                clientes.get(count).getCliente_telefono(),});
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblclientes = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        cmdnuevo = new javax.swing.JButton();
        cmdguardar = new javax.swing.JButton();
        cmdcancelar = new javax.swing.JButton();
        cmdeditar = new javax.swing.JButton();
        cmdsalir = new javax.swing.JButton();
        cmbbuscar = new javax.swing.JComboBox<>();
        txtbuscar = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        txtfono = new javax.swing.JTextField();
        txtedad = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cmbmembresia = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtdni = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setTitle("Clientes");

        tblclientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRES", "APELLIDOS", "EDAD", "TELEFONO", "MEMBRESIA"
            }
        ));
        tblclientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblclientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblclientes);

        jToolBar1.setRollover(true);

        cmdnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/page_add.png"))); // NOI18N
        cmdnuevo.setText("Nuevo");
        cmdnuevo.setFocusable(false);
        cmdnuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cmdnuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cmdnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdnuevoActionPerformed(evt);
            }
        });
        jToolBar1.add(cmdnuevo);

        cmdguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/disk_save.png"))); // NOI18N
        cmdguardar.setText("Guardar");
        cmdguardar.setEnabled(false);
        cmdguardar.setFocusable(false);
        cmdguardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cmdguardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cmdguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdguardarActionPerformed(evt);
            }
        });
        jToolBar1.add(cmdguardar);

        cmdcancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Cancel (2).png"))); // NOI18N
        cmdcancelar.setText("Cancelar");
        cmdcancelar.setEnabled(false);
        cmdcancelar.setFocusable(false);
        cmdcancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cmdcancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cmdcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdcancelarActionPerformed(evt);
            }
        });
        jToolBar1.add(cmdcancelar);

        cmdeditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/page_edit.png"))); // NOI18N
        cmdeditar.setText("Editar");
        cmdeditar.setFocusable(false);
        cmdeditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cmdeditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cmdeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdeditarActionPerformed(evt);
            }
        });
        jToolBar1.add(cmdeditar);

        cmdsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/door_in.png"))); // NOI18N
        cmdsalir.setText("Salir");
        cmdsalir.setAlignmentX(100.0F);
        cmdsalir.setFocusable(false);
        cmdsalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cmdsalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cmdsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdsalirActionPerformed(evt);
            }
        });
        jToolBar1.add(cmdsalir);

        cmbbuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BUSCAR POR DNI", "BUSCAR POR NOMBRE", "BUSCAR POR APELLIDO" }));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setText("DNI");

        jLabel9.setText("Membresia");

        txtapellido.setEnabled(false);

        txtfono.setEnabled(false);

        txtedad.setEnabled(false);

        txtnombre.setEnabled(false);

        jLabel10.setText("Nombre");

        cmbmembresia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BLACK", "ORO", "PLATA", "CLASICA" }));
        cmbmembresia.setEnabled(false);

        jLabel11.setText("Apellidos");

        jLabel12.setText("Edad");

        jLabel13.setText("Telefono");

        txtdni.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(txtnombre))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtapellido)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtfono, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbmembresia, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbmembresia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtfono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel13)
                        .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/find.png"))); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("REGISTRO DE CLIENTES");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnbuscar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdnuevoActionPerformed
        // TODO add your handling code here:

        //accion: 1 insert , 2 uupdate
        Limpiar();
        accion = 1;
        EstadoBotones(false);

    }//GEN-LAST:event_cmdnuevoActionPerformed

    private void Limpiar() {

        txtnombre.setText("");
        txtapellido.setText("");
        txtedad.setText("");
        txtfono.setText("");
        txtdni.setText("");
        cmbmembresia.setSelectedIndex(0);

    }

    private void EstadoBotones(boolean estado) {

        cmdnuevo.setEnabled(estado);
        cmdcancelar.setEnabled(!estado);
        cmdguardar.setEnabled(!estado);
        cmdeditar.setEnabled(estado);
        cmdsalir.setEnabled(estado);
//    
        txtnombre.setEnabled(!estado);
        txtapellido.setEnabled(!estado);
        txtedad.setEnabled(!estado);
        txtfono.setEnabled(!estado);
        txtdni.setEnabled(!estado);

//    txtCantidadVendida.setEnabled(!estado);
        cmbmembresia.setEnabled(!estado);
        tblclientes.setEnabled(estado);
        txtbuscar.setEnabled(estado);
        cmbbuscar.setEnabled(estado);
        btnbuscar.setEnabled(estado);

    }

    private void cmdguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdguardarActionPerformed
        // TODO add your handling code here:
        //accion: 1 insert , 2 update
        if (accion == 1) {

            Cliente cliente = new Cliente();
            cliente.setCliente_nombres(txtnombre.getText());
            cliente.setDni(txtdni.getText());
            cliente.setCliente_apellidos(txtapellido.getText());
            cliente.setCliente_orden("0");
            cliente.setCliente_edad(txtedad.getText());
            cliente.setCliente_telefono(txtfono.getText());

            int idmembresia = 0;
            switch (cmbmembresia.getSelectedIndex()) {
                case 0:
                    idmembresia = 4;
                    break;
                case 1:
                    idmembresia = 3;
                    break;
                case 2:
                    idmembresia = 2;
                    break;
                case 3:
                    idmembresia = 1;
                    break;

            }
            cliente.setMembresia_id(idmembresia);
            ClienteService clienteservice = new ClienteServiceImpl();
            clienteservice.crear(cliente);
            JOptionPane.showMessageDialog(rootPane, "Se registro correctamente", "Registro de categoria", JOptionPane.INFORMATION_MESSAGE, frameIcon);
            EstadoBotones(true);
            Limpiar();
            CargarClientes();

//
        } else if (accion == 2) {
//
            int fila = tblclientes.getSelectedRow();
//          
            Cliente cliente = new Cliente();
            cliente.setCliente_id(Integer.parseInt(tblclientes.getValueAt(fila, 0).toString()));
            cliente.setCliente_nombres(txtnombre.getText());
            cliente.setDni(txtdni.getText());
            cliente.setCliente_apellidos(txtapellido.getText());
            cliente.setCliente_orden("0");
            cliente.setCliente_edad(txtedad.getText());
            cliente.setCliente_telefono(txtfono.getText());
            int idmembresia = 0;
            switch (cmbmembresia.getSelectedIndex()) {
                case 0:
                    idmembresia = 4;
                    break;
                case 1:
                    idmembresia = 3;
                    break;
                case 2:
                    idmembresia = 2;
                    break;
                case 3:
                    idmembresia = 1;
                    break;

            }
            cliente.setMembresia_id(idmembresia);
            JOptionPane.showMessageDialog(rootPane, "se actualiza", "Registro de cliente", JOptionPane.INFORMATION_MESSAGE, frameIcon);

            ClienteService clienteservice = new ClienteServiceImpl();
            clienteservice.update(cliente);
            JOptionPane.showMessageDialog(rootPane, "Registro actualizado correctamente", "Registro de cliente", JOptionPane.INFORMATION_MESSAGE, frameIcon);
            EstadoBotones(true);
            Limpiar();
            CargarClientes();

        }
    }//GEN-LAST:event_cmdguardarActionPerformed

    private void cmdcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdcancelarActionPerformed
        // TODO add your handling code here:
        EstadoBotones(true);
    }//GEN-LAST:event_cmdcancelarActionPerformed

    private void cmdeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdeditarActionPerformed
        // TODO add your handling code here:

        //accion: 1 insert , 2 uupdate
        accion = 2;
        EstadoBotones(false);
    }//GEN-LAST:event_cmdeditarActionPerformed

    private void cmdsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdsalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cmdsalirActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
        if (txtbuscar.getText().length() == 0) {
            CargarClientes();
        } else {
            Cliente cli = arbolClientes.existe(txtbuscar.getText());
            if (cli == null) {
                JOptionPane.showMessageDialog(rootPane, "No se encontro un cliente con el texto " + txtbuscar.getText(), "Sin resultados", JOptionPane.ERROR_MESSAGE, frameIcon);
            } else {
                System.out.println(cli.getCliente_nombres());
                dtm.setRowCount(0);
                dtm.addRow(new Object[]{
                    cli.getCliente_id(),
                    cli.getDni(),
                    cli.getCliente_nombres(),
                    cli.getCliente_apellidos(),
                    cli.getMembresia_nombre(),
                    cli.getCliente_edad(),
                    cli.getCliente_telefono(),});
            }
        }
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void tblclientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblclientesMouseClicked
        // TODO add your handling code here:

        if (tblclientes.getRowCount() > 0) {
//             String[] headers = new String[]{"ID","dni","NOMBRE", "APELLIDOS", "MEMBRESIA", "EDAD", "TELEFONO"};
            int fila = tblclientes.getSelectedRow();

            txtnombre.setText(tblclientes.getValueAt(fila, 2).toString());
            txtapellido.setText(tblclientes.getValueAt(fila, 3).toString());
            txtfono.setText(tblclientes.getValueAt(fila, 6).toString());
            txtdni.setText(tblclientes.getValueAt(fila, 1).toString());
            txtedad.setText(tblclientes.getValueAt(fila, 5).toString());

            String membresia = tblclientes.getValueAt(fila, 4).toString();

            cmbmembresia.setSelectedItem(membresia);

        }
    }//GEN-LAST:event_tblclientesMouseClicked

    private void RegistrarCliente() {

        String nombre, apellido, membresiac;
        int edad = 0, dni = 0, telefono = 0;
        int orden = 0;

        nombre = txtnombre.getText();
        apellido = txtapellido.getText();
        telefono = Integer.parseInt(txtfono.getText());
        membresiac = cmbmembresia.getSelectedItem().toString();
        edad = Integer.parseInt(txtedad.getText());
        dni = Integer.parseInt(txtdni.getText());

        membresia m = membresia.BLACK;

        if (cmbmembresia.getSelectedIndex() == 0) {
            m = membresia.BLACK;
        } else if (cmbmembresia.getSelectedIndex() == 1) {
            m = membresia.ORO;
        } else if (cmbmembresia.getSelectedIndex() == 2) {
            m = membresia.PLATA;
        } else if (cmbmembresia.getSelectedIndex() == 3) {
            m = membresia.CLASICO;
        }

    }

    private void limpiar() {

        txtnombre.setText("");
        txtapellido.setText("");
        txtfono.setText("");
        cmbmembresia.setSelectedIndex(0);
        txtedad.setText("");
        txtdni.setText("");

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
            java.util.logging.Logger.getLogger(frmRegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistroClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JComboBox<String> cmbbuscar;
    private javax.swing.JComboBox<String> cmbmembresia;
    private javax.swing.JButton cmdcancelar;
    private javax.swing.JButton cmdeditar;
    private javax.swing.JButton cmdguardar;
    private javax.swing.JButton cmdnuevo;
    private javax.swing.JButton cmdsalir;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    public static javax.swing.JTable tblclientes;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtfono;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
