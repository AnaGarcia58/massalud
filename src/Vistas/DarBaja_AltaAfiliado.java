package Vistas;

import AccesoData.AfiliadoData;
import Entidades.Afiliado;
import Utilidades.Utilidades;
import javax.swing.JOptionPane;

public class DarBaja_AltaAfiliado extends javax.swing.JInternalFrame {

    public DarBaja_AltaAfiliado() {
        initComponents();
        Utilidades.addPlaceHolder(jTextFieldDNI, "Ingrese un DNI");
        jLabelDesafiliado.setVisible(false);
        estadoCampos(false);
        JButtonBaja.setEnabled(false);
        JButtonAlta.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldDNI = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellido = new javax.swing.JTextField();
        jTextFieldDni = new javax.swing.JTextField();
        jButtonLimpiar = new javax.swing.JButton();
        JButtonBaja = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jLabelDesafiliado = new javax.swing.JLabel();
        JButtonAlta = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(153, 220, 153));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Afiliar o Eliminar a un Afiliado");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ingrese el DNI del afiliado:");

        jTextFieldDNI.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N

        jButtonBuscar.setBackground(new java.awt.Color(153, 220, 153));
        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/buscar.jpg"))); // NOI18N
        jButtonBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Apellido:");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("DNI:");

        jTextFieldNombre.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N

        jTextFieldApellido.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N

        jTextFieldDni.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N

        jButtonLimpiar.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        JButtonBaja.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        JButtonBaja.setText("Dar de Baja");
        JButtonBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonBajaActionPerformed(evt);
            }
        });

        jButtonSalir.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jLabelDesafiliado.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabelDesafiliado.setForeground(new java.awt.Color(204, 0, 0));
        jLabelDesafiliado.setText("El Afiliado está desvinculado de la mutual.");

        JButtonAlta.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        JButtonAlta.setText("Dar de Alta");
        JButtonAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonAltaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(JButtonAlta)
                                        .addGap(29, 29, 29)
                                        .addComponent(JButtonBaja)
                                        .addGap(38, 38, 38)
                                        .addComponent(jButtonLimpiar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonSalir))
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTextFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonBuscar)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(40, 40, 40)
                                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextFieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabelDesafiliado)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(jButtonBuscar))
                .addGap(28, 28, 28)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(28, 28, 28)
                .addComponent(jLabelDesafiliado)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalir)
                    .addComponent(jButtonLimpiar)
                    .addComponent(JButtonBaja)
                    .addComponent(JButtonAlta))
                .addContainerGap(35, Short.MAX_VALUE))
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

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void JButtonBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonBajaActionPerformed
        AfiliadoData ad = new AfiliadoData();

        Afiliado afiliadoEliminado = new Afiliado();
        if (validar()) {
            afiliadoEliminado.setNombre(jTextFieldNombre.getText());
            afiliadoEliminado.setApellido(jTextFieldApellido.getText());
            afiliadoEliminado.setDni(Integer.valueOf(jTextFieldDni.getText()));
            ad.bajaAfiliado(afiliadoEliminado.getDni());
            borrarCampos();
            jTextFieldDNI.setEnabled(true);
            jTextFieldDNI.setText("");
            JButtonBaja.setEnabled(false);
        }
    }//GEN-LAST:event_JButtonBajaActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        borrarCampos();
        jTextFieldDNI.setText("");
        jLabelDesafiliado.setVisible(false);
        Utilidades.addPlaceHolder(jTextFieldDNI, "Ingrese un DNI");
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        AfiliadoData ad = new AfiliadoData();
        if (validarDni()) {
            Afiliado afiliado = ad.buscarAfiliado(Integer.valueOf(jTextFieldDNI.getText()));
            if (afiliado != null) {
                jTextFieldNombre.setText(afiliado.getNombre());
                jTextFieldApellido.setText(afiliado.getApellido());
                jTextFieldDni.setText(afiliado.getDni() + "");
                jTextFieldDNI.setEnabled(false);
                jButtonBuscar.setEnabled(false);
                JButtonBaja.setEnabled(true);
                estadoCampos(true);
                if (!afiliado.isEstado()) {
                    jLabelDesafiliado.setVisible(true);
                    JButtonBaja.setEnabled(false);
                    JButtonAlta.setEnabled(true);
                }
            }
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void JButtonAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonAltaActionPerformed
        AfiliadoData ad = new AfiliadoData();
        Afiliado afiliado = new Afiliado();
        if (validar()) {
            afiliado.setNombre(jTextFieldNombre.getText());
            afiliado.setApellido(jTextFieldApellido.getText());
            afiliado.setDni(Integer.valueOf(jTextFieldDni.getText()));
            ad.darDeAlta(afiliado.getDni());
            jTextFieldDNI.setEnabled(true);
            jTextFieldDNI.setText("");
            Utilidades.addPlaceHolder(jTextFieldDNI, "Ingrese un DNI");
            JButtonAlta.setEnabled(false);
            borrarCampos();
             if (afiliado.isEstado()) {
                    jLabelDesafiliado.setVisible(true);
                    JButtonBaja.setEnabled(true);
                    JButtonAlta.setEnabled(false);
        }
        }
    }//GEN-LAST:event_JButtonAltaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonAlta;
    private javax.swing.JButton JButtonBaja;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelDesafiliado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldDNI;
    private javax.swing.JTextField jTextFieldDni;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables

    public void borrarCampos() {
        jTextFieldNombre.setText("");
        jTextFieldApellido.setText("");
        jTextFieldDni.setText("");
        estadoCampos(false);
        jTextFieldDNI.setEnabled(true);
        jButtonBuscar.setEnabled(true);
        jLabelDesafiliado.setVisible(false);
    }

    public void estadoCampos(boolean estado) {
        jTextFieldNombre.setEnabled(estado);
        jTextFieldApellido.setEnabled(estado);
        jTextFieldDni.setEnabled(estado);
    }

    public Boolean validar() {
        String nombre = jTextFieldNombre.getText();
        String apellido = jTextFieldApellido.getText();

        // Validaciones de nombre
        if (nombre.isBlank() || nombre.contains("Ingrese")) {
            JOptionPane.showMessageDialog(this, "El campo Nombre no debe estar vacío");
            return false;
        } else {
            if (!Utilidades.contieneSoloLetras(nombre)) {
                JOptionPane.showMessageDialog(this, "El campo Nombre debe contener solo letras.");
                return false;
            }
        }

        // Validaciones de Apellido
        if (apellido.isBlank() || apellido.contains("Ingrese")) {
            JOptionPane.showMessageDialog(this, "El campo Apellido no debe estar vacío.");
            return false;
        } else {
            if (!Utilidades.contieneSoloLetras(apellido)) {
                JOptionPane.showMessageDialog(this, "El campo Apellido debe contener solo letras.");
                return false;
            }
        }
        return true;
    }

    public Boolean validarDni() {
        String dni = jTextFieldDNI.getText();
        try {

            if (dni.isBlank() || dni.contains("Ingrese")) {
                JOptionPane.showMessageDialog(this, "El campo DNI no debe estar vacío.");
                return false;
            } else {
                Integer.parseInt(dni);
                if (dni.length() >= 9 || dni.length() <= 6) {
                    JOptionPane.showMessageDialog(this, "Por favor, ingrese un DNI válido.");
                    return false;
                }
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese datos válidos. En DNI ingrese numeros de 7 u 8 dígitos.");
            return false;
        }
        return true;
    }
}
