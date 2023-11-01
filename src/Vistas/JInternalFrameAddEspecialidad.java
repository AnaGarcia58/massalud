
package Vistas;

import AccesoData.EspecialidadData;
import Entidades.Especialidad;
import Exceptions.GenericException;
import Utilidades.Utilidades;
import static Utilidades.Utilidades.addPlaceHolder;
import java.awt.Color;

public class JInternalFrameAddEspecialidad extends javax.swing.JInternalFrame {

    private EspecialidadData especialidadData;
    private Especialidad especialidad;
    private String textPlaceholder = "Ej: Odontologia";
    GuardarPrestador guardarPrestador ;
    public JInternalFrameAddEspecialidad(GuardarPrestador guardarPrestador) {
        
        initComponents();
        this.guardarPrestador = guardarPrestador;
        stateInTrue();
        clearLabel();
        especialidadData = new EspecialidadData();
        addPlaceHolder(jTextFieldNombre,textPlaceholder );
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jRadioButtonEstado = new javax.swing.JRadioButton();
        jButtonAgregar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jLabelErrorEmptyField = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jPanel1.setBackground(new java.awt.Color(153, 220, 153));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("Agregue una Especialidad");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel4.setText("Estado ");

        jTextFieldNombre.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jTextFieldNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldNombreFocusLost(evt);
            }
        });

        jRadioButtonEstado.setEnabled(false);
        jRadioButtonEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonEstadoActionPerformed(evt);
            }
        });

        jButtonAgregar.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        jButtonSalir.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jLabelErrorEmptyField.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabelErrorEmptyField.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorEmptyField.setText("valor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSalir)
                        .addGap(102, 102, 102))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonEstado)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabelErrorEmptyField, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 10, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(151, 151, 151))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelErrorEmptyField)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jRadioButtonEstado))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAgregar)
                    .addComponent(jButtonSalir))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonEstadoActionPerformed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed

        try {
            String nameEspecialidad = jTextFieldNombre.getText();
            
            boolean stateEspecialidad = jRadioButtonEstado.isSelected();

            especialidad = new Especialidad(nameEspecialidad, stateEspecialidad);
            
            validateField(nameEspecialidad);
            
            especialidadData.AgregarEspecialidad(especialidad);
            clearTextField();
            guardarPrestador.cargarCombo();
       

        } catch (GenericException e) {
            
            showLabelError(e.getMessage());
        }


    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jTextFieldNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNombreFocusGained
        clearLabel();
        jTextFieldNombre.setForeground(Color.BLACK);
       clearTextField();
    }//GEN-LAST:event_jTextFieldNombreFocusGained

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jTextFieldNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNombreFocusLost

    }//GEN-LAST:event_jTextFieldNombreFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelErrorEmptyField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonEstado;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables

    private void stateInTrue(){
        jRadioButtonEstado.setSelected(true);
    }
    
    private void clearTextField(){
        jTextFieldNombre.setText("");
    }
    
    private void validateField(String text) throws GenericException{
    
        if(text.isEmpty() || text.equals("Ej: Odontologia")){
            throw new GenericException("No ingrese campos vacios");
        }
        else if(!Utilidades.contieneSoloLetras(text)){
           
            throw new GenericException("No ingrese numero");
        }
    }
    
    private void clearLabel(){
        jLabelErrorEmptyField.setVisible(false);
    }
    
    private void showLabelError(String message){
        jLabelErrorEmptyField.setVisible(true);
        
        jLabelErrorEmptyField.setText(message);
        
    }
}
