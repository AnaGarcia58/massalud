package Vistas;

import AccesoData.AfiliadoData;
import Entidades.Afiliado;
import Utilidades.*;
import javax.swing.JOptionPane;

public class ModificarAfiliado extends javax.swing.JInternalFrame {

    String nombreOriginal = "";
    String apellidoOriginal = "";

    public ModificarAfiliado() {
        initComponents();
        estadoCampos(false);
        Utilidades.addPlaceHolder(jTextField1DniABuscar, "Ingrese un DNI");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1Buscar = new javax.swing.JButton();
        jTextField1DniABuscar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellido = new javax.swing.JTextField();
        jButtonLimpiar = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(153, 220, 153));
        jPanel1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Modificar datos del Afiliado");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ingrese el DNI del afiliado a modificar: ");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Apellido: ");

        jButton1Buscar.setForeground(new java.awt.Color(153, 220, 153));
        jButton1Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/buscar.jpg"))); // NOI18N
        jButton1Buscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1BuscarActionPerformed(evt);
            }
        });

        jTextField1DniABuscar.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nombre: ");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("DNI :");

        jTextFieldNombre.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyReleased(evt);
            }
        });

        jTextFieldApellido.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jTextFieldApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldApellidoKeyReleased(evt);
            }
        });

        jButtonLimpiar.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        jButtonGuardar.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButtonGuardar.setText("Modificar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonSalir.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1DniABuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1Buscar))
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButtonLimpiar)
                                    .addGap(53, 53, 53)
                                    .addComponent(jButtonGuardar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonSalir))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(28, 28, 28)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 62, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jTextField1DniABuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1Buscar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(28, 28, 28)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLimpiar)
                    .addComponent(jButtonGuardar)
                    .addComponent(jButtonSalir))
                .addGap(32, 32, 32))
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

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButton1BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1BuscarActionPerformed
        AfiliadoData ad = new AfiliadoData();
        if (validarDni()) {
            Afiliado afiliado = ad.buscarAfiliado(Integer.valueOf(jTextField1DniABuscar.getText()));
            if (afiliado != null) {
                jTextFieldNombre.setText(afiliado.getNombre());
                nombreOriginal = afiliado.getNombre();
                jTextFieldApellido.setText(afiliado.getApellido());
                apellidoOriginal = afiliado.getApellido();
                jTextField1DniABuscar.setEnabled(false);
                jButton1Buscar.setEnabled(false);
                estadoCampos(true);
                jButtonGuardar.setEnabled(false);
            }
        }
    }//GEN-LAST:event_jButton1BuscarActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
//        AfiliadoData ad = new AfiliadoData();
//        Afiliado afiliadoModificado = new Afiliado();
//        String nombre = jTextFieldNombre.getText();
//        String apellido = jTextFieldApellido.getText();
//        if (validar()) {
//            afiliadoModificado.setNombre(nombre);
//            afiliadoModificado.setApellido(apellido);
//            afiliadoModificado.setDni(Integer.valueOf(jTextField1DniABuscar.getText()));
//            ad.modificarAfiliadoSinEstado(afiliadoModificado);
//            borrarCampos();
//            Utilidades.addPlaceHolder(jTextField1DniABuscar, "Ingrese un DNI");
//        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        borrarCampos();
        Utilidades.addPlaceHolder(jTextField1DniABuscar, "Ingrese un DNI");
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jTextFieldNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyReleased
        if (seModifica()) {
            jButtonGuardar.setEnabled(true);
        } else {
            jButtonGuardar.setEnabled(false);
        }
    }//GEN-LAST:event_jTextFieldNombreKeyReleased

    private void jTextFieldApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldApellidoKeyReleased
        if (seModifica()) {
            jButtonGuardar.setEnabled(true);
        } else {
            jButtonGuardar.setEnabled(false);
        }
    }//GEN-LAST:event_jTextFieldApellidoKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Buscar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1DniABuscar;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables

    public void estadoCampos(boolean estado) {
        jTextFieldNombre.setEnabled(estado);
        jTextFieldApellido.setEnabled(estado);
        jButtonGuardar.setEnabled(estado);
    }

    public void borrarCampos() {
        jTextFieldNombre.setText("");
        jTextFieldApellido.setText("");
        jTextField1DniABuscar.setText("");
        estadoCampos(false);
        jTextField1DniABuscar.setEnabled(true);
        jButton1Buscar.setEnabled(true);
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
        String dni = jTextField1DniABuscar.getText();
        if (dni.isEmpty() || dni.contains("Ingrese")) {
            JOptionPane.showMessageDialog(this, "El campo DNI no debe estar vacío.");
            return false;
        }
        try {
            if (dni.length() >= 9 || dni.length() <= 6) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese un DNI válido.");
                return false;
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese datos válidos. En DNI ingrese numeros de 7 u 8 dígitos.");
            return false;
        }
        return true;
    }

    private boolean quedaIgual(String original, String modificado) {
        return original.equalsIgnoreCase(modificado);
    }

    private boolean seModifica() {
        String nombre = jTextFieldNombre.getText();
        String apellido = jTextFieldApellido.getText();
        return !(quedaIgual(nombreOriginal, nombre) && quedaIgual(apellidoOriginal, apellido));
    }
}
