
package Vistas;

import AccesoData.AfiliadoData;
import AccesoData.OrdenData;
import AccesoData.PrestadorData;
import Entidades.Afiliado;
import Entidades.Orden;
import Entidades.Prestador;
import Utilidades.Utilidades;
import java.awt.Font;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class ConsultarOrdenesPorAfiliadoOPrestador extends javax.swing.JInternalFrame {
    private AfiliadoData ad;
    private PrestadorData pd;    
    private Afiliado afiliadoActual = null;
    private Prestador prestadorActual = null;
    private OrdenData od = new OrdenData();
    DefaultTableModel modelo = new DefaultTableModel();
    
    public ConsultarOrdenesPorAfiliadoOPrestador() {
        initComponents();
        Utilidades.addPlaceHolder(jTDni, "Ingrese el DNI");
        armarCabecera();
        ad = new AfiliadoData();
        pd = new PrestadorData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTDni = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTOrdenesAfiliado = new javax.swing.JTable();
        jBSalir = new javax.swing.JButton();
        jRadioButtonPorAfiliado = new javax.swing.JRadioButton();
        jRadioButtonPorPrestador = new javax.swing.JRadioButton();
        jBLimpiar = new javax.swing.JButton();

        setTitle("Consulta Órdenes");
        setPreferredSize(new java.awt.Dimension(507, 482));

        jPanel1.setBackground(new java.awt.Color(153, 220, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(495, 446));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel1.setText("Consultar Órdenes");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel2.setText("Dni:");

        jTDni.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jTDni.setEnabled(false);

        jBBuscar.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jBBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/buscar.jpg"))); // NOI18N
        jBBuscar.setEnabled(false);
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jTOrdenesAfiliado.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jTOrdenesAfiliado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTOrdenesAfiliado);

        jBSalir.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jRadioButtonPorAfiliado.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jRadioButtonPorAfiliado.setText("Por Afiliado");
        jRadioButtonPorAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPorAfiliadoActionPerformed(evt);
            }
        });

        jRadioButtonPorPrestador.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jRadioButtonPorPrestador.setText("Por Prestador");
        jRadioButtonPorPrestador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPorPrestadorActionPerformed(evt);
            }
        });

        jBLimpiar.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2)
                        .addGap(37, 37, 37)
                        .addComponent(jTDni, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jBBuscar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButtonPorAfiliado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButtonPorPrestador)
                        .addGap(69, 69, 69))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jBLimpiar)
                        .addGap(119, 119, 119)
                        .addComponent(jBSalir)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(172, 172, 172))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonPorAfiliado)
                            .addComponent(jRadioButtonPorPrestador))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTDni, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBBuscar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBSalir)
                    .addComponent(jBLimpiar))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
       dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        try {
            String dniS = jTDni.getText();
            if (validarLongitud()) {
                if (jRadioButtonPorAfiliado.isSelected()) {
                    int dni = Integer.parseInt(jTDni.getText());
                    afiliadoActual = ad.buscarAfiliadoPorDni(dni);
                    if (afiliadoActual == null) {
                        JOptionPane.showMessageDialog(this, "El Afiliado no existe");
                        limpiar();
                    } else {
                        mostrarOrdenesPorAfiliado();
                    }
                } else {
                    if (jRadioButtonPorPrestador.isSelected()) {
                        int dni = Integer.parseInt(jTDni.getText());
                        prestadorActual = pd.buscarPrestadorPorDni(dni);
                        if (prestadorActual == null) {
                            JOptionPane.showMessageDialog(this, "El prestador no existe");
                            limpiar();
                        } else {
                            mostrarOrdenesPorPrestador();
                        }
                    }
                }
            }
        } catch (NumberFormatException npe) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un Dni válido");
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jRadioButtonPorAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPorAfiliadoActionPerformed
        jTDni.setEnabled(true);
        jBBuscar.setEnabled(true);
        jRadioButtonPorPrestador.setEnabled(false);
    }//GEN-LAST:event_jRadioButtonPorAfiliadoActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jRadioButtonPorPrestadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPorPrestadorActionPerformed
        jTDni.setEnabled(true);
        jBBuscar.setEnabled(true);
        jRadioButtonPorAfiliado.setEnabled(false);
    }//GEN-LAST:event_jRadioButtonPorPrestadorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonPorAfiliado;
    private javax.swing.JRadioButton jRadioButtonPorPrestador;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTDni;
    private javax.swing.JTable jTOrdenesAfiliado;
    // End of variables declaration//GEN-END:variables

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
    
    private void armarCabecera() {
        modelo.addColumn("N° Orden");
        modelo.addColumn("Afiliado");
        modelo.addColumn("Prestador");
        modelo.addColumn("Especialidad");
        jTOrdenesAfiliado.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 14));
        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) jTOrdenesAfiliado.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(SwingConstants.CENTER);
        jTOrdenesAfiliado.setModel(modelo);

    }
    
    private void borrarFilas() {
        int filas = jTOrdenesAfiliado.getRowCount() - 1;
        for (; filas >= 0; filas--) {
            modelo.removeRow(filas);
        }
    }
    public void mostrarOrdenesPorAfiliado(){
        List<Orden> ordenesAfiliado = od.obtenerOrdenesPorAfiliado(afiliadoActual.getIdAfiliado());
        borrarFilas();
         if(ordenesAfiliado.size() != 0){
        for (Orden orden : ordenesAfiliado) {
            modelo.addRow(new Object[]{
                orden.getIdOrden(),
                orden.getAfiliado().getApellido(),
                orden.getPrestador().getApellido(),
                orden.getPrestador().getEspecialidad().getNombre()});                
        }
         }else{
              JOptionPane.showMessageDialog(this, "El Afiliado no tiene órdenes.");
         }
        
    }
    
    public void mostrarOrdenesPorPrestador(){
        List<Orden> ordenesPrestador = od.obtenerOrdenesPorPrestador(prestadorActual.getIdPrestador());
        borrarFilas();
        if(ordenesPrestador.size() != 0){
        for (Orden orden : ordenesPrestador) {
            modelo.addRow(new Object[]{
                orden.getIdOrden(),
                orden.getAfiliado().getApellido(),
                orden.getPrestador().getApellido(),
                orden.getPrestador().getEspecialidad().getNombre()});                
        }
        }else{
            JOptionPane.showMessageDialog(this, "El Prestador no tiene órdenes.");
        }
    } 
    
    public void limpiar(){
        Utilidades.addPlaceHolder(jTDni, "Ingrese el DNI");
        jTDni.setEnabled(false);
        borrarFilas();
        jRadioButtonPorAfiliado.setSelected(false);
        jRadioButtonPorPrestador.setSelected(false);
        jRadioButtonPorAfiliado.setEnabled(true);
        jRadioButtonPorPrestador.setEnabled(true);
        jBBuscar.setEnabled(false);
    }
}
