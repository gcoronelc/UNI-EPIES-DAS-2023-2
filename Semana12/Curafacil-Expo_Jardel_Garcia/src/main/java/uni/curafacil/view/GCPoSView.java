package uni.curafacil.view;

import javax.swing.JFrame;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import uni.curafacil.controller.VentasController;
import uni.curafacil.dto.EmpleadoDto;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import uni.curafacil.dto.ItemDto;

public class GCPoSView extends javax.swing.JFrame {

    private EmpleadoDto empleado;
    private List<ItemDto> lista;

    public GCPoSView() {
        initComponents();
        lista = new ArrayList<>();
        actualizarHora();
        this.setLocationRelativeTo(null);
        
         
 /*
        empleado = (EmpleadoDto) Session.get("USUARIO");
        txtCajero.setText(empleado.getNombre() + " " + empleado.getApellido());

        tProductos.getModel().addTableModelListener((e) -> {
            int column = e.getColumn();
            if (column == 1 || column == 2) {
                actualizarSubtotales();
                actualizarTotales();
            }
            if (column == 3) {
                actualizarTotales();
            }
        }
        );
        try {
            Integer cantVentas = VentasController.getRowCount() + 1;
            txtCodPedido.setText(cantVentas.toString());
        } catch (SQLException e) {
            txtCodPedido.setText("0Error");
            System.out.println("Error al obtener el numero de ventas");
        }

        cbComprobante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Boleta", "Factura"}));

        cbPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Efectivo", "Tarjeta", "Yape", "Plin"}));

        txtCajero.setEditable(false);
        txtCodPedido.setEditable(false);
         */
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
        txtCajero = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDNICliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCodPedido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        labelHora = new javax.swing.JLabel();
        cbComprobante = new javax.swing.JComboBox<>();
        cbPago = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        btnLess = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tProductos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtImporte = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtIGV = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnGenerar = new javax.swing.JButton();
        btnCancelar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Punto de Venta");

        jLabel1.setText("ID Trabajador");

        jLabel2.setText("DNI Cliente");

        jLabel3.setText("Tipo de comprobante");

        jLabel6.setText("Tipo de pago");

        jLabel4.setText("Codigo de pedido");

        labelHora.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelHora.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelHora.setText("jLabel5");

        cbComprobante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setText("Productos");

        btnLess.setText("-");
        btnLess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLessActionPerformed(evt);
            }
        });

        btnAdd.setText("+");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        tProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Producto", "Cantidad", "Precio Unitario", "Subtotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tProductos);
        if (tProductos.getColumnModel().getColumnCount() > 0) {
            tProductos.getColumnModel().getColumn(0).setPreferredWidth(10);
            tProductos.getColumnModel().getColumn(2).setPreferredWidth(15);
            tProductos.getColumnModel().getColumn(3).setPreferredWidth(15);
            tProductos.getColumnModel().getColumn(4).setPreferredWidth(15);
        }

        jLabel5.setText("IMPORTE");

        txtImporte.setText(" ");

        jLabel9.setText("IGV");

        txtIGV.setText(" ");

        jLabel11.setText("TOTAL");

        txtTotal.setText(" ");

        btnCancelar.setText("CANCELAR PAGO");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGenerar.setText("GENERAR PAGO");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        btnCancelar1.setText("INVENTARIO");
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(cbPago, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(cbComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(txtCajero, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(txtDNICliente, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnLess, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtCodPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(btnCancelar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGenerar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9)
                    .addComponent(jLabel5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotal))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtImporte)
                            .addComponent(txtIGV, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtCodPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtDNICliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(labelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(btnAdd)
                    .addComponent(btnLess))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCancelar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtImporte))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtIGV))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtTotal)))
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGenerar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        String[][] data = new String[tProductos.getRowCount()][4];
        for (int i = 0; i < tProductos.getRowCount(); i++) {
            for (int j = 0; j < 4; j++) {
                Object value = tProductos.getValueAt(i, j);
                //imprimer en el temrinal el valor y tipo de value
                System.out.println(value + " " + value.getClass().getName());
                if (value instanceof Double) {
                    data[i][j] = String.valueOf((Double) value);
                } else if (value instanceof Integer) {
                    data[i][j] = String.valueOf((Integer) value);
                } else {
                    data[i][j] = String.valueOf(value);
                }
            }
        }

        String total = "0";
        if (txtTotal.getText().length() > 0) {
            total = txtTotal.getText();
        }

        String seleccion = (String) cbPago.getSelectedItem();
        try {
            VentasController.insertarVenta(txtCodPedido.getText(), empleado.getId_empleado(), total, seleccion, txtDNICliente.getText());
        } catch (Exception ex) {
            System.out.println("Error al insertar venta");
            System.out.println(ex.getMessage());
        }

        try {
            VentasController.insertarVentaDetalle(txtCodPedido.getText(), data);
        } catch (Exception ex) {
            System.err.println("Error al insertar venta detalle");
            System.err.println(ex.getMessage());
        }

        try {
            VentasController.subirVenta(txtCodPedido.getText());
        } catch (Exception e) {
            System.err.println("Error al subir venta");
            System.err.println(e.getMessage());
        }

        try {
            VentasController.restarStock(data);
        } catch (Exception e) {
        }

        try {
            TicketView tp = new TicketView(empleado.getId_empleado(), txtDNICliente.getText(), txtCodPedido.getText(), data, total);
            tp.setVisible(true);
            tp.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent we) {
                    dispose();
                }
            });
        } catch (Exception ex) {
            System.out.println("Error al generar ticket");
            System.out.println(ex.getMessage());
        }

    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        Session.put("item", null);
        BuscarProductoView productosView = new BuscarProductoView(null,true);
        productosView.setVisible(true);
        if(Session.get("item") == null){
            return;
        }
        ItemDto item = (ItemDto) Session.get("item");
        
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnLessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLessActionPerformed
        /*if (tProductos.getSelectedRow() != -1) {
            DefaultTableModel model = (DefaultTableModel) tProductos.getModel();
            model.removeRow(tProductos.getSelectedRow());
            actualizarTotales();
        }*/
    }//GEN-LAST:event_btnLessActionPerformed

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelar1ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GCPoSView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GCPoSView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnLess;
    private javax.swing.JComboBox<String> cbComprobante;
    private javax.swing.JComboBox<String> cbPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelHora;
    private javax.swing.JTable tProductos;
    private javax.swing.JTextField txtCajero;
    private javax.swing.JTextField txtCodPedido;
    private javax.swing.JTextField txtDNICliente;
    private javax.swing.JLabel txtIGV;
    private javax.swing.JLabel txtImporte;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables

    //define una funcion actualizarTotales() que actualize el valor del txtTotal:
    private void actualizarTotales() {
        BigDecimal total = BigDecimal.ZERO;

        for (int i = 0; i < tProductos.getRowCount(); i++) {
            Object val = tProductos.getValueAt(i, 3);

            if (val instanceof BigDecimal) {
                total = total.add((BigDecimal) val);
            } else {
                // Manejar el caso en el que el valor no es BigDecimal
                // Puedes mostrar un mensaje de error, lanzar una excepción, o realizar otra acción adecuada.
                System.err.println("Error: El valor en tProductos.getValueAt(" + i + ", 3) no es un BigDecimal.");
            }
        }

        // Formatear y mostrar los resultados
        String importe = String.format("%.2f", total.multiply(new BigDecimal("0.82")));
        String igv = String.format("%.2f", total.multiply(new BigDecimal("0.18")));
        String ntotal = String.format("%.2f", total);

        txtImporte.setText(importe);
        txtIGV.setText(igv);
        txtTotal.setText(ntotal);
    }

    //define una funcion actualizarSubtotales() que actualize el valor del jTable(i,3):
    private void actualizarSubtotales() {
        for (int i = 0; i < tProductos.getRowCount(); i++) {
            Object value1 = tProductos.getValueAt(i, 1);
            Object value2 = tProductos.getValueAt(i, 2);

            double valor1 = 0.0;
            double valor2 = 0.0;

            if (value1 instanceof Double) {
                valor1 = (double) value1;
            } else if (value1 instanceof Integer) {
                valor1 = (int) value1;
            } else {
                JOptionPane.showMessageDialog(null, "El valor no es numérico");
            }

            if (value2 instanceof Double) {
                valor2 = (double) value2;
            } else if (value2 instanceof Integer) {
                valor2 = (int) value2;
            } else {
                JOptionPane.showMessageDialog(null, "El valor no es numérico");
            }

            double subtotal = valor2 * valor1;

            tProductos.setValueAt(subtotal, i, 3);
        }
    }

    //define una funcion actualizarHora() que actualize el labelHora cada segundo:
    public final void actualizarHora() {
        Timer timer = new Timer("HoraActualizada");//Crea un timer y le asigna un nombre
        TimerTask task = new TimerTask() {//Crea una tarea para el timer
            @Override
            public void run() {
                labelHora.setText(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()));
            }
        };
        timer.schedule(task, 0, 1000);//Asigna la tarea al timer y lo ejecuta cada 1000 milisegundos
    }

    public JTextField getjTextField1() {
        return txtCajero;
    }
}
