package Vistas;

import AccesoData.AfiliadoData;
import Entidades.Afiliado;
import Utilidades.Utilidades;
import javax.swing.JOptionPane;

public class AgregarAfiliado extends javax.swing.JInternalFrame {

    public AgregarAfiliado(String text) {
        initComponents();
        jTextField3Dni.setText(text);
    }
    
    public AgregarAfiliado() {
        initComponents();
        Utilidades.addPlaceHolder(jTextField1Nombre, "Ingrese el nombre");
        Utilidades.addPlaceHolder(jTextField2Apellido, "Ingrese el apellido");
        Utilidades.addPlaceHolder(jTextField3Dni, "Ingrese el DNI");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1Nombre = new javax.swing.JTextField();
        jTextField2Apellido = new javax.swing.JTextField();
        jTextField3Dni = new javax.swing.JTextField();
        jButton1Guardar = new javax.swing.JButton();
        jButton1Borrar = new javax.swing.JButton();
        jButton1Salir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(153, 220, 153));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setText("Agregar Afiliado");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel2.setText("Nombre: ");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel3.setText("Apellido: ");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel4.setText("DNI: ");

        jTextField1Nombre.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jTextField1Nombre.setMinimumSize(new java.awt.Dimension(64, 30));

        jTextField2Apellido.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jTextField2Apellido.setMinimumSize(new java.awt.Dimension(64, 30));

        jTextField3Dni.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jTextField3Dni.setMinimumSize(new java.awt.Dimension(64, 30));

        jButton1Guardar.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButton1Guardar.setText("Guardar");
        jButton1Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1GuardarActionPerformed(evt);
            }
        });

        jButton1Borrar.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButton1Borrar.setText("Limpiar");
        jButton1Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1BorrarActionPerformed(evt);
            }
        });

        jButton1Salir.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButton1Salir.setText("Salir");
        jButton1Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1SalirActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel5.setText("Por favor, ingrese los datos del nuevo afiliado:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(140, 140, 140))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3Dni, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jButton1Guardar)
                        .addGap(44, 44, 44)
                        .addComponent(jButton1Borrar)
                        .addGap(43, 43, 43)
                        .addComponent(jButton1Salir)))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(68, 68, 68))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3Dni, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1Guardar)
                    .addComponent(jButton1Borrar)
                    .addComponent(jButton1Salir))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1SalirActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1SalirActionPerformed

    private void jButton1GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1GuardarActionPerformed
        Afiliado nuevoAfiliado = new Afiliado();
        AfiliadoData ad = new AfiliadoData();
        if (validar()) {
            nuevoAfiliado.setNombre(jTextField1Nombre.getText());
            nuevoAfiliado.setApellido(jTextField2Apellido.getText());
            nuevoAfiliado.setDni(Integer.valueOf(jTextField3Dni.getText()));
            nuevoAfiliado.setEstado(true);
            ad.guardarAfiliado(nuevoAfiliado);
            borrarCampos();
        }
    }//GEN-LAST:event_jButton1GuardarActionPerformed

    private void jButton1BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1BorrarActionPerformed
        borrarCampos();
    }//GEN-LAST:event_jButton1BorrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Borrar;
    private javax.swing.JButton jButton1Guardar;
    private javax.swing.JButton jButton1Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1Nombre;
    private javax.swing.JTextField jTextField2Apellido;
    private javax.swing.JTextField jTextField3Dni;
    // End of variables declaration//GEN-END:variables

    public void borrarCampos() {
        jTextField1Nombre.setText("");
        jTextField2Apellido.setText("");
        jTextField3Dni.setText("");
        Utilidades.addPlaceHolder(jTextField1Nombre, "Ingrese el nombre");
        Utilidades.addPlaceHolder(jTextField2Apellido, "Ingrese el apellido");
        Utilidades.addPlaceHolder(jTextField3Dni, "Ingrese el DNI");
    }

    public Boolean validar() {
        String nombre = jTextField1Nombre.getText();
        String apellido = jTextField2Apellido.getText();
        String dni = jTextField3Dni.getText();

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
        if (apellido.isEmpty() || apellido.contains("Ingrese")) {
            JOptionPane.showMessageDialog(this, "El campo Apellido no debe estar vacío.");
            return false;
        } else {
            if (!Utilidades.contieneSoloLetras(apellido)) {
                JOptionPane.showMessageDialog(this, "El campo Apellido debe contener solo letras.");
                return false;
            }
        }

        // Validaciones de DNI
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
}