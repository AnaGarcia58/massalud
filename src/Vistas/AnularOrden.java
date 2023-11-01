package Vistas;

import AccesoData.AfiliadoData;
import AccesoData.OrdenData;
import Entidades.Afiliado;
import Entidades.Orden;
import Utilidades.Utilidades;
import java.awt.Font;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class AnularOrden extends javax.swing.JInternalFrame {

    private Afiliado afiliadoActual = null;
    private AfiliadoData ad;
    private OrdenData od = new OrdenData();
    DefaultTableModel modelo = new DefaultTableModel();

    public AnularOrden() {
        initComponents();
        Utilidades.addPlaceHolder(jTDni, "Ingrese el DNI");
        armarCabecera();
        ad = new AfiliadoData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTDni = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTOrdenesAfiliado = new javax.swing.JTable();
        jButtonAnular = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setTitle("Anular Orden");
        setPreferredSize(new java.awt.Dimension(507, 482));

        jPanel1.setBackground(new java.awt.Color(153, 220, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(495, 446));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("Anular Órdenes");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel2.setText("Dni afiliado:");

        jTDni.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N

        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/buscar.jpg"))); // NOI18N
        jButtonBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jTOrdenesAfiliado.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
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
        jTOrdenesAfiliado.setRowHeight(30);
        jTOrdenesAfiliado.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(jTOrdenesAfiliado);

        jButtonAnular.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButtonAnular.setText("Anular");
        jButtonAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnularActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel3.setText("Por favor, ingrese el dni del afiliado:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(98, 98, 98)
                        .addComponent(jButtonAnular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTDni, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(358, 358, 358)
                        .addComponent(jButtonBuscar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonBuscar)))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAnular)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        try {
            if (validarLongitud()) {
                int dni = Integer.parseInt(jTDni.getText());
                afiliadoActual = ad.buscarAfiliadoPorDni(dni);
                if (afiliadoActual == null) {
                    JOptionPane.showMessageDialog(this, "El Afiliado no existe");
                    jTDni.setText("");
                } else {
                    mostrarOrdenesPorAfiliado();
                }
                jButtonAnular.setEnabled(true);
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un Dni válido");
        } catch (NullPointerException ex) {
            System.out.println("");
        }

    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnularActionPerformed
        int filaSelec = jTOrdenesAfiliado.getSelectedRow();
        if (filaSelec != -1) {
            int idOrden = (Integer) modelo.getValueAt(filaSelec, 0);
            od.anularOrden(idOrden);
            mostrarOrdenesPorAfiliado();
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un afiliado.");
        }
    }//GEN-LAST:event_jButtonAnularActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        borrarFilas();
        jButtonAnular.setEnabled(false);
        Utilidades.addPlaceHolder(jTDni, "Ingrese el DNI");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonAnular;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTDni;
    private javax.swing.JTable jTOrdenesAfiliado;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        modelo.addColumn("N° Orden");
        modelo.addColumn("Fecha");
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

    public void mostrarOrdenesPorAfiliado() {
        List<Orden> ordenesAfiliado = od.obtenerOrdenesPorAfiliado(afiliadoActual.getIdAfiliado());
        borrarFilas();

        if (ordenesAfiliado.size() != 0) {
            for (Orden orden : ordenesAfiliado) {
                modelo.addRow(new Object[]{
                    orden.getIdOrden(),
                    orden.getFecha(),
                    orden.getAfiliado().getApellido(),
                    orden.getPrestador().getApellido(),
                    orden.getPrestador().getEspecialidad().getNombre()});
            }
        } else {
            JOptionPane.showMessageDialog(this, "El afiliado no tiene órdenes.");
        }
    }

    private boolean validarLongitud() {
        // Validar Dni
        String dniS = jTDni.getText();
        if (dniS.length() >= 9 || dniS.length() <= 6) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un DNI válido.");
            return false;
        } else {
            return true;
        }
    }
}
