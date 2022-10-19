/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package proyecto;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ghianco
 */
public class ProductList extends javax.swing.JInternalFrame {

    DefaultTableModel dtm = new DefaultTableModel();

    /**
     * Creates new form ProductList
     */
    public ProductList() {
        initComponents();
        CentrarVentana();
        CargarProductos();
    }

    private void CentrarVentana() {
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height;
        int width = pantalla.width;

        int x = (width / 2) - this.getWidth() / 2;
        int y = (height / 2) - this.getHeight() / 2;

        this.setLocation(x, y);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        selectSorts = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblProducto = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtProducto = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtCategoria = new javax.swing.JTextPane();
        lblCategoria = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtCosto = new javax.swing.JTextPane();
        lblCosto = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtPrecio = new javax.swing.JTextPane();
        lblPrecio = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtCantidadVendida = new javax.swing.JTextPane();
        lblCantidadVendida = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Lista de productos");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Seleccione un metodo de ordenamiento"));

        selectSorts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Valid.png"))); // NOI18N
        jButton7.setText("Ordenar tabla");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectSorts, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addGap(0, 31, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(selectSorts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cambiar.png"))); // NOI18N
        jButton3.setText("Actualizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDPRODUCTO", "NOMBRE", "PRECIO COSTO", "PRECIO VENTA", "VENDIDOS"
            }
        ));
        tblProductos.setName("tblProductos"); // NOI18N
        jScrollPane1.setViewportView(tblProductos);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Add_Symbol.png"))); // NOI18N
        jButton1.setText("Añadir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete16.png"))); // NOI18N
        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Agregar nuevo registro"));

        lblProducto.setText("Producto");

        jScrollPane2.setViewportView(txtProducto);

        jScrollPane3.setViewportView(txtCategoria);

        lblCategoria.setText("Categoria");

        jScrollPane4.setViewportView(txtCosto);

        lblCosto.setText("Costo");

        jScrollPane5.setViewportView(txtPrecio);

        lblPrecio.setText("Precio");

        jScrollPane6.setViewportView(txtCantidadVendida);

        lblCantidadVendida.setText("Cantidad vendida");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProducto))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCategoria))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCosto))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecio))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCantidadVendida))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblProducto)
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCategoria)
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCosto)
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPrecio)
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCantidadVendida)
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BubleSort() {

        int tamaño_array = tblProductos.getRowCount();
        Producto listado[] = new Producto[tamaño_array];

        String nombre;
        String nombre_categoria;
        int id;
        int id_categoria;
        double costo;
        double precio;
        int cantvendida;

        for (int i = 0; i < tblProductos.getRowCount(); i++) {

            id = i;
            id_categoria = 0;
            nombre = tblProductos.getValueAt(i, 0).toString();
            nombre_categoria = tblProductos.getValueAt(i, 1).toString();
            costo = Double.parseDouble(tblProductos.getValueAt(i, 2).toString());
            precio = Double.parseDouble(tblProductos.getValueAt(i, 3).toString());
            cantvendida = Integer.parseInt(tblProductos.getValueAt(i, 4).toString());

            listado[i] = new Producto(nombre, id, id_categoria, costo, precio, cantvendida, nombre_categoria);

        }

        MetodosSort metodos = new MetodosSort();
        metodos.bubbleSort(listado);

        //se limpia la tabla para volver a llenar con la lista ordenada
        LimpiarTabla();
        //se vuelve a llenar la tabla
        String[] fila = new String[5];

        for (int i = 0; i < listado.length; i++) {

            fila[0] = listado[i].nombre;
            fila[1] = listado[i].nombre_categoria;
            fila[2] = String.valueOf(listado[i].costo);
            fila[3] = String.valueOf(listado[i].precio);
            fila[4] = String.valueOf(listado[i].cantvendida);

            dtm.addRow(fila);

        }

    }

    private void QuickSort() {

        String nombre;
        String nombre_categoria;
        int id;
        int id_categoria;
        double costo;
        double precio;
        int cantvendida;

        ArrayList<Producto> productos = new ArrayList();

        for (int i = 0; i < tblProductos.getRowCount(); i++) {
            id = i;
            id_categoria = 0;
            nombre = tblProductos.getValueAt(i, 0).toString();
            nombre_categoria = tblProductos.getValueAt(i, 1).toString();
            costo = Double.parseDouble(tblProductos.getValueAt(i, 2).toString());
            precio = Double.parseDouble(tblProductos.getValueAt(i, 3).toString());
            cantvendida = Integer.parseInt(tblProductos.getValueAt(i, 4).toString());

            Producto producto = new Producto(nombre, id, id_categoria, costo, precio, cantvendida, nombre_categoria);
            productos.add(producto);
        }

        MetodosSort metodos = new MetodosSort();
        metodos.OrdenarQuickSort(productos);
        LimpiarTabla();
        // se vuelve a llenar la tabla
        String[] fila = new String[5];
        for (Producto item : productos) {

            fila[0] = item.getNombre();
            fila[1] = item.getNombre();
            fila[2] = String.valueOf(item.getCosto());
            fila[3] = String.valueOf(item.getPrecio());
            fila[4] = String.valueOf(item.getCantvendida());
            dtm.addRow(fila);
        }

    }

    private void MergeSort() {

        String nombre;
        String nombre_categoria;
        int id;
        int id_categoria;
        double costo;
        double precio;
        int cantvendida;

        ArrayList<Producto> productos = new ArrayList();

        for (int i = 0; i < tblProductos.getRowCount(); i++) {
            id = i;
            id_categoria = 0;
            nombre = tblProductos.getValueAt(i, 0).toString();
            nombre_categoria = tblProductos.getValueAt(i, 1).toString();
            costo = Double.parseDouble(tblProductos.getValueAt(i, 2).toString());
            precio = Double.parseDouble(tblProductos.getValueAt(i, 3).toString());
            cantvendida = Integer.parseInt(tblProductos.getValueAt(i, 4).toString());

            Producto producto = new Producto(nombre, id, id_categoria, costo, precio, cantvendida, nombre_categoria);
            productos.add(producto);
        }

        MetodosSort metodos = new MetodosSort();
        metodos.sortGivenArray(productos);
        LimpiarTabla();
        // se vuelve a llenar la tabla
        String[] fila = new String[5];
        for (Producto item : productos) {

            fila[0] = item.getNombre();
            fila[1] = item.getNombre();
            fila[2] = String.valueOf(item.getCosto());
            fila[3] = String.valueOf(item.getPrecio());
            fila[4] = String.valueOf(item.getCantvendida());
            dtm.addRow(fila);
        }

    }

    private void SelectionSort() {

        int tamaño_array = tblProductos.getRowCount();
        Producto listado[] = new Producto[tamaño_array];

        String nombre;
        String nombre_categoria;
        int id;
        int id_categoria;
        double costo;
        double precio;
        int cantvendida;

        for (int i = 0; i < tblProductos.getRowCount(); i++) {

            id = i;
            id_categoria = 0;
            nombre = tblProductos.getValueAt(i, 0).toString();
            nombre_categoria = tblProductos.getValueAt(i, 1).toString();
            costo = Double.parseDouble(tblProductos.getValueAt(i, 2).toString());
            precio = Double.parseDouble(tblProductos.getValueAt(i, 3).toString());
            cantvendida = Integer.parseInt(tblProductos.getValueAt(i, 4).toString());

            listado[i] = new Producto(nombre, id, id_categoria, costo, precio, cantvendida, nombre_categoria);

        }

        MetodosSort metodos = new MetodosSort();
        metodos.selectionSort(listado);

        //se limpia la tabla para volver a llenar con la lista ordenada
        LimpiarTabla();
        //se vuelve a llenar la tabla
        String[] fila = new String[5];

        for (int i = 0; i < listado.length; i++) {

            fila[0] = listado[i].nombre;
            fila[1] = listado[i].nombre_categoria;
            fila[2] = String.valueOf(listado[i].costo);
            fila[3] = String.valueOf(listado[i].precio);
            fila[4] = String.valueOf(listado[i].cantvendida);

            dtm.addRow(fila);

        }

    }

    private void InsertioSort() {

        String nombre;
        String nombre_categoria;
        int id;
        int id_categoria;
        double costo;
        double precio;
        int cantvendida;

        ArrayList<Producto> productos = new ArrayList();

        for (int i = 0; i < tblProductos.getRowCount(); i++) {
            id = i;
            id_categoria = 0;
            nombre = tblProductos.getValueAt(i, 0).toString();
            nombre_categoria = tblProductos.getValueAt(i, 1).toString();
            costo = Double.parseDouble(tblProductos.getValueAt(i, 2).toString());
            precio = Double.parseDouble(tblProductos.getValueAt(i, 3).toString());
            cantvendida = Integer.parseInt(tblProductos.getValueAt(i, 4).toString());

            Producto producto = new Producto(nombre, id, id_categoria, costo, precio, cantvendida, nombre_categoria);
            productos.add(producto);
        }

        MetodosSort metodos = new MetodosSort();
        metodos.insertionSort(productos);
        LimpiarTabla();
        // se vuelve a llenar la tabla
        String[] fila = new String[5];
        for (Producto item : productos) {

            fila[0] = item.getNombre();
            fila[1] = item.getNombre();
            fila[2] = String.valueOf(item.getCosto());
            fila[3] = String.valueOf(item.getPrecio());
            fila[4] = String.valueOf(item.getCantvendida());
            dtm.addRow(fila);
        }

    }

    private void ShellSort() {

        String nombre;
        String nombre_categoria;
        int id;
        int id_categoria;
        double costo;
        double precio;
        int cantvendida;

        ArrayList<Producto> productos = new ArrayList();

        for (int i = 0; i < tblProductos.getRowCount(); i++) {
            id = i;
            id_categoria = 0;
            nombre = tblProductos.getValueAt(i, 0).toString();
            nombre_categoria = tblProductos.getValueAt(i, 1).toString();
            costo = Double.parseDouble(tblProductos.getValueAt(i, 2).toString());
            precio = Double.parseDouble(tblProductos.getValueAt(i, 3).toString());
            cantvendida = Integer.parseInt(tblProductos.getValueAt(i, 4).toString());

            Producto producto = new Producto(nombre, id, id_categoria, costo, precio, cantvendida, nombre_categoria);
            productos.add(producto);
        }

        MetodosSort metodos = new MetodosSort();
        metodos.ShellSort(productos);
        LimpiarTabla();
        // se vuelve a llenar la tabla
        String[] fila = new String[5];
        for (Producto item : productos) {

            fila[0] = item.getNombre();
            fila[1] = item.getNombre();
            fila[2] = String.valueOf(item.getCosto());
            fila[3] = String.valueOf(item.getPrecio());
            fila[4] = String.valueOf(item.getCantvendida());
            dtm.addRow(fila);
        }

    }

    private void LimpiarTabla() {
        //se limpia la tabla para volver a llenar con la lista ordenada
        for (int i = tblProductos.getRowCount() - 1; i >= 0; i--) {
            dtm.removeRow(i);
        }
    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        switch (selectSorts.getSelectedIndex()) {
            case 0:
                MergeSort();
                break;
            case 1:
                BubleSort();
                break;
            case 2:
                SelectionSort();
                break;
            case 3:
                InsertioSort();
                break;
            case 4:
                QuickSort();
                break;

            case 5:
                ShellSort();
                break;

        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void agregarProducto() {
        dtm.addRow(new Object[]{
            txtProducto.getText(),
            txtCategoria.getText(),
            txtCosto.getText(),
            txtPrecio.getText(),
            txtCantidadVendida.getText()
        });
    }

    private void CargarProductos() {

        String raiz = new File("").getAbsolutePath();
        String archivo = raiz + "/src/proyecto/data.csv";

        String[] headers = new String[]{"Producto", "Categoria", "Costo S/", "Precio S/", "Cantidad vendida"};
        dtm.setColumnIdentifiers(headers);
        tblProductos.setModel(dtm);
        selectSorts.removeAllItems();
        selectSorts.addItem("Ordenar por cantidad vendida | Merge");
        selectSorts.addItem("Ordenar por producto | Buble");
        selectSorts.addItem("Ordenar por categoria | Selection");
        selectSorts.addItem("Ordenar por costo | Insertion");
        selectSorts.addItem("Ordenar por precio | Quick sort");
        selectSorts.addItem("Ordenar por cantidad vendida | Shell sort");

        String line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            while ((line = br.readLine()) != null) {
                String[] campos = line.split(",");

                dtm.addRow(new Object[]{
                    campos[0],
                    campos[1],
                    campos[2],
                    campos[3],
                    campos[4]
                });

            }
            //tamaño de las columnas
            tamaños();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void eliminarProducto() {
        int fila = tblProductos.getSelectedRow();
        dtm.removeRow(fila);
    }

    private void actualizarProducto() {
        int fila = tblProductos.getSelectedRow();
        dtm.setValueAt(txtProducto.getText(), fila, 0);
        dtm.setValueAt(txtCategoria.getText(), fila, 1);
        dtm.setValueAt(txtCosto.getText(), fila, 2);
        dtm.setValueAt(txtPrecio.getText(), fila, 3);
        dtm.setValueAt(txtCantidadVendida.getText(), fila, 4);

    }

    private void tamaños() {
        tblProductos.getColumnModel().getColumn(0).setMaxWidth(450);
        tblProductos.getColumnModel().getColumn(0).setMinWidth(450);
        tblProductos.getColumnModel().getColumn(0).setPreferredWidth(450);

        tblProductos.getColumnModel().getColumn(1).setMaxWidth(200);
        tblProductos.getColumnModel().getColumn(1).setMinWidth(200);
        tblProductos.getColumnModel().getColumn(1).setPreferredWidth(200);

        tblProductos.getColumnModel().getColumn(2).setMaxWidth(80);
        tblProductos.getColumnModel().getColumn(2).setMinWidth(80);
        tblProductos.getColumnModel().getColumn(2).setPreferredWidth(80);

        tblProductos.getColumnModel().getColumn(3).setMaxWidth(80);
        tblProductos.getColumnModel().getColumn(3).setMinWidth(80);
        tblProductos.getColumnModel().getColumn(3).setPreferredWidth(80);

        tblProductos.getColumnModel().getColumn(4).setMaxWidth(120);
        tblProductos.getColumnModel().getColumn(4).setMinWidth(120);
        tblProductos.getColumnModel().getColumn(4).setPreferredWidth(120);
    }


    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        actualizarProducto();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        agregarProducto();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        eliminarProducto();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lblCantidadVendida;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JComboBox<String> selectSorts;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextPane txtCantidadVendida;
    private javax.swing.JTextPane txtCategoria;
    private javax.swing.JTextPane txtCosto;
    private javax.swing.JTextPane txtPrecio;
    private javax.swing.JTextPane txtProducto;
    // End of variables declaration//GEN-END:variables
}
