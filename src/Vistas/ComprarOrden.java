
package Vistas;

import AccesoData.AfiliadoData;
import AccesoData.OrdenData;
import AccesoData.PrestadorData;
import Entidades.Afiliado;
import Entidades.Orden;
import Entidades.Prestador;
import Utilidades.Utilidades;
import java.awt.Color;
import java.awt.Component;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;



import javax.swing.JOptionPane;

public class ComprarOrden extends javax.swing.JInternalFrame {
    private List<Prestador> listaP;
    private AfiliadoData ad;
    private PrestadorData pd;
    private OrdenData od;
    private Afiliado afiliadoActual = null;
    private Prestador prestadorSeleccionado = null;
    MenuPrincipal menuPrincipal;
    
    
    public ComprarOrden(MenuPrincipal menuPrincipal) {
        initComponents();
        this.menuPrincipal = menuPrincipal;
        Utilidades.addPlaceHolder(jTDni, "Ingrese el DNI");
        pd = new PrestadorData();
        listaP = pd.listarPrestadoresActivos();
        ad = new AfiliadoData();
        od = new OrdenData();
        cargarPrestadores();
        cargarPagos();
        limpiar();
        validarCaliendario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTDni = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jButtonAgregarAfiliado = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxFormaPago = new javax.swing.JComboBox<>();
        jBGuardar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jDateChooserCalendario = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxPrestador = new javax.swing.JComboBox<>();
        jButtonLimpiar = new javax.swing.JButton();
        jTImporte = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setTitle("Comprar órdenes");
        setPreferredSize(new java.awt.Dimension(507, 482));

        jPanel1.setBackground(new java.awt.Color(153, 220, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(495, 446));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel1.setText("Dni:");

        jTDni.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jTDni.setToolTipText("");

        jBBuscar.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jBBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/buscar.jpg"))); // NOI18N
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jButtonAgregarAfiliado.setText("Agregar Afiliado");
        jButtonAgregarAfiliado.setEnabled(false);
        jButtonAgregarAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarAfiliadoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setText("Comprar Órdenes");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel3.setText("Prestador:");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel4.setText("Pago:");

        jComboBoxFormaPago.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jComboBoxFormaPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxFormaPago.setSelectedIndex(-1);
        jComboBoxFormaPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFormaPagoActionPerformed(evt);
            }
        });

        jBGuardar.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jBGuardar.setText("Guardar");
        jBGuardar.setEnabled(false);
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBSalir.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel5.setText("Importe:");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel6.setText("Fecha:");

        jComboBoxPrestador.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jComboBoxPrestador.setToolTipText("");

        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.setEnabled(false);
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        jTImporte.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jBGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBSalir)
                        .addGap(107, 107, 107))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jComboBoxPrestador, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxFormaPago, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTImporte, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel6))
                                .addGap(64, 64, 64)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDateChooserCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTDni, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBBuscar))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButtonAgregarAfiliado)
                                        .addGap(29, 29, 29)
                                        .addComponent(jButtonLimpiar))))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(49, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(jBBuscar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAgregarAfiliado)
                    .addComponent(jButtonLimpiar))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooserCalendario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxPrestador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel4))
                    .addComponent(jComboBoxFormaPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGuardar)
                    .addComponent(jBSalir))
                .addGap(18, 18, 18))
        );

        jTDni.getAccessibleContext().setAccessibleDescription("dsdsfDS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
       dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        try {
            if (validarLongitud()) {
                int dni = Integer.parseInt(jTDni.getText());
                afiliadoActual = ad.buscarAfiliadoPorDni(dni);
                if (afiliadoActual == null) {
                    JOptionPane.showMessageDialog(this, "El Afiliado no existe");
                    jButtonAgregarAfiliado.setEnabled(true);
                    jButtonLimpiar.setEnabled(true);
                } else {
                    habilitar();
                }
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un Dni válido");
        }
    }//GEN-LAST:event_jBBuscarActionPerformed
    
    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        try {
            java.util.Date fecha = jDateChooserCalendario.getDate();
            LocalDate fechaSeleccionada = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            prestadorSeleccionado = (Prestador) jComboBoxPrestador.getSelectedItem();
            if (prestadorSeleccionado != null) {
                comprarOrden(fechaSeleccionada);                
            } else {
                JOptionPane.showMessageDialog(this, "Debe seleccionar un prestador");
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fecha");
        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jButtonAgregarAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarAfiliadoActionPerformed
        menuPrincipal.nuevaVista(jTDni.getText());
        jButtonAgregarAfiliado.setEnabled(false);
        habilitar();
    }//GEN-LAST:event_jButtonAgregarAfiliadoActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jComboBoxFormaPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFormaPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxFormaPagoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jButtonAgregarAfiliado;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JComboBox<String> jComboBoxFormaPago;
    private javax.swing.JComboBox<Prestador> jComboBoxPrestador;
    private com.toedter.calendar.JDateChooser jDateChooserCalendario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTDni;
    private javax.swing.JTextField jTImporte;
    // End of variables declaration//GEN-END:variables
    
    private void cargarPrestadores() { //Carga ComboBox Prestadores
        String mensaje = "<Seleccione un Prestador>";
        Prestador mensajePrestador = new Prestador(-1, mensaje);
        jComboBoxPrestador.removeAllItems();
        jComboBoxPrestador.addItem(mensajePrestador);
        for(Prestador prestador: listaP){
              jComboBoxPrestador.addItem(prestador);
        }
        jComboBoxPrestador.setRenderer(new DefaultListCellRenderer() { //Un "renderer" en Swing controla cómo se muestra cada elemento en el JComboBox. En este caso, se está personalizando la apariencia de los elementos del JComboBox.
            @Override
            public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if (value instanceof Prestador) { //verifica si el valor que se va a representar (value) es una instancia de la clase Prestador. Si lo es, significa que estamos trabajando con un objeto Prestador.
                    Prestador pres = (Prestador) value;
                    setText(pres.obtenerPrestadorCombo());
                }
                return this;
            }
        });
    }
    
    private void cargarPagos(){ //Carga ComboBox Forma de Pago
        jComboBoxFormaPago.removeAllItems();
        jComboBoxFormaPago.addItem("<Seleccione una forma de pago>");
        jComboBoxFormaPago.addItem("Efectivo");
        jComboBoxFormaPago.addItem("Debito");   
    }
    
    public void comprarOrden(LocalDate fechaSeleccionada){
        try{
        if (jComboBoxFormaPago.getSelectedItem() == "<Seleccione un tipo de pago>"){
            JOptionPane.showMessageDialog(this, "Debe seleccionar una forma de pago");
        } else {
            String formaPago = (String) jComboBoxFormaPago.getSelectedItem();
            double importe = Double.parseDouble(jTImporte.getText());
            Orden ordenActual = new Orden(fechaSeleccionada, formaPago, importe, afiliadoActual, prestadorSeleccionado, true);
            od.guardarOrden(ordenActual);
            limpiar();
        }
        }catch (NumberFormatException nfe){
            JOptionPane.showMessageDialog(this, "Debe ingresar un importe");
        }
    }
    
    private boolean validarLongitud(){
        // Validar Dni
        String dniS = jTDni.getText();
        if (dniS.length() >= 9 || dniS.length() <= 6) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un DNI válido.");
            return false;
        } else {
            return true;
        }
    }
    
    private void limpiar(){
        Utilidades.addPlaceHolder(jTDni, "Ingrese el DNI");
        jTImporte.setText("");
        jTImporte.setEnabled(false);
        jButtonAgregarAfiliado.setEnabled(false);
        jDateChooserCalendario.setDate(null);
        jComboBoxPrestador.setSelectedIndex(0);
        jComboBoxPrestador.setForeground(Color.LIGHT_GRAY);
        jComboBoxFormaPago.setSelectedIndex(0);
        jComboBoxFormaPago.setForeground(Color.LIGHT_GRAY);
        jDateChooserCalendario.setEnabled(false);
        jComboBoxPrestador.setEnabled(false);
        jComboBoxFormaPago.setEnabled(false);
        
    }
    
    private void habilitar(){
        jDateChooserCalendario.setEnabled(true);
        jComboBoxPrestador.setEnabled(true);
        jComboBoxPrestador.setBackground(Color.WHITE);
        jComboBoxFormaPago.setEnabled(true);
        jComboBoxFormaPago.setBackground(Color.WHITE);
        jTImporte.setEnabled(true);
       // Utilidades.addPlaceHolder(jTDni, "Ingrese el DNI");
        jBGuardar.setEnabled(true);
        jButtonAgregarAfiliado.setEnabled(false);
    }
    
    private void validarCaliendario(){
        Calendar cal = Calendar.getInstance();
        Date currentDate = cal.getTime();
        jDateChooserCalendario.setMinSelectableDate(currentDate);
    }
}    

