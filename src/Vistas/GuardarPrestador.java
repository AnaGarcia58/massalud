
package Vistas;

import AccesoData.EspecialidadData;
import Entidades.Prestador;
import AccesoData.PrestadorData;
import Entidades.Especialidad;
import Utilidades.*;
import static Utilidades.Utilidades.contieneSoloLetras;
import java.awt.Font;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

public class GuardarPrestador extends javax.swing.JInternalFrame {

    private EspecialidadData especialidadData;
    MenuPrincipal menuPrincipal;
    
    
    
    public GuardarPrestador(){
        initComponents();
    }
    
    public GuardarPrestador(MenuPrincipal menuPrincipal) {
        
        initComponents();
        this.menuPrincipal = menuPrincipal;
        especialidadData = new EspecialidadData();
        
        cargarCombo();
        Utilidades.addPlaceHolder(jTFDniP1, "Ej:31282476");
        Utilidades.addPlaceHolder(jTFApellidoP1, "Ej:Uchiha");
        Utilidades.addPlaceHolder(jTFNombreP1, "Ej:Madara");
        
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
        jRBEstadoP1 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxEspecialidad1 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jBGuardar1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jSalirP1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTFNombreP1 = new javax.swing.JTextField();
        jTFApellidoP1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTFDniP1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jBAgregarEspecialidad = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(153, 220, 153));

        jRBEstadoP1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jRBEstadoP1.setSelected(true);
        jRBEstadoP1.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel8.setText("Especialidad");

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel9.setText("Nuevo Prestador");

        jComboBoxEspecialidad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEspecialidad1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel10.setText("Por favor, ingrese los datos del nuevo prestador:");

        jBGuardar1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jBGuardar1.setText("Guardar");
        jBGuardar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardar1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel11.setText("Nombre:");

        jSalirP1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jSalirP1.setText("Salir");
        jSalirP1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jSalirP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirP1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel12.setText("Apellido:");

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel13.setText("Estado: ");

        jTFNombreP1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jTFNombreP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNombreP1ActionPerformed(evt);
            }
        });

        jTFApellidoP1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel14.setText("DNI:");

        jTFDniP1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N

        jBAgregarEspecialidad.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jBAgregarEspecialidad.setText("Agregar Especialidad");
        jBAgregarEspecialidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBAgregarEspecialidadMouseClicked(evt);
            }
        });
        jBAgregarEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarEspecialidadActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButton1.setText("Limpiar");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(jTFNombreP1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(jTFApellidoP1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(52, 52, 52)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFDniP1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRBEstadoP1)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jBAgregarEspecialidad)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(18, 18, 18)
                                            .addComponent(jComboBoxEspecialidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jBGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(80, 80, 80)
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSalirP1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(80, 80, 80))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel9)
                .addGap(15, 15, 15)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNombreP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTFApellidoP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFDniP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jRBEstadoP1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBoxEspecialidad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jBAgregarEspecialidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGuardar1)
                    .addComponent(jButton1)
                    .addComponent(jSalirP1))
                .addGap(37, 37, 37))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardar1ActionPerformed
        try {
            PrestadorData prestadorData = new PrestadorData();
                    String dni = jTFDniP1.getText();
        if (prestadorData.verificarDniExistente(dni)) {
            JOptionPane.showMessageDialog(this, "El DNI ingresado ya existe en la base de datos.");
            return;
        }

            String nombre = jTFNombreP1.getText();
            String apellido = jTFApellidoP1.getText();
            String dniString = jTFDniP1.getText();
            //Especialidad especialidad = new Especialidad(jTFEspecialidadP.getText()); //crear una instancia de la clase Especialidad para poder almacenar los datos
            String nombreEspecialidad = (String) jComboBoxEspecialidad1.getSelectedItem();
            
            Especialidad especialidad = obtenerEspecialidad(nombreEspecialidad);
            
            
            if (validar() && validarDni()) {

                int dniPrestador = Integer.parseInt(jTFDniP1.getText());
                Prestador nuevoPrestador = new Prestador(nombre, apellido, dniPrestador, jRBEstadoP1.isSelected(), especialidad);
                
                prestadorData.guardarPrestadorA(nuevoPrestador);
                borrarCampos();
                Utilidades.addPlaceHolder(jTFDniP1, "Ej:31282476");
                Utilidades.addPlaceHolder(jTFApellidoP1, "Ej:Uchiha");
                Utilidades.addPlaceHolder(jTFNombreP1, "Ej:Madara");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese solo números enteros.");

        }catch(NullPointerException ex){
            JOptionPane.showMessageDialog(this, "No ha sido seleccionada la especialidad");
        }
    }//GEN-LAST:event_jBGuardar1ActionPerformed

    private void jSalirP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirP1ActionPerformed
        dispose();
    }//GEN-LAST:event_jSalirP1ActionPerformed

    private void jTFNombreP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNombreP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNombreP1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        borrarCampos();
        Utilidades.addPlaceHolder(jTFDniP1, "Ej:31282476");
        Utilidades.addPlaceHolder(jTFApellidoP1, "Ej:Uchiha");
        Utilidades.addPlaceHolder(jTFNombreP1, "Ej:Madara");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBAgregarEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarEspecialidadActionPerformed
 
        //jBAgregarEspecialidad.setEnabled(false);
    }//GEN-LAST:event_jBAgregarEspecialidadActionPerformed

    private void jComboBoxEspecialidad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEspecialidad1ActionPerformed
//        jComboBoxEspecialidad1.removeAllItems();
//        cargarCombo();
    }//GEN-LAST:event_jComboBoxEspecialidad1ActionPerformed

    private void jBAgregarEspecialidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAgregarEspecialidadMouseClicked
       menuPrincipal.nuevaVistaEspecialidad();
       especialidadData.listaDeEspecialidades();
       
       cargarCombo();
    }//GEN-LAST:event_jBAgregarEspecialidadMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregarEspecialidad;
    private javax.swing.JButton jBGuardar1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxEspecialidad1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBEstadoP1;
    private javax.swing.JButton jSalirP1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTFApellidoP1;
    private javax.swing.JTextField jTFDniP1;
    private javax.swing.JTextField jTFNombreP1;
    // End of variables declaration//GEN-END:variables
    
    
        public Boolean validarDni() {
        String dni = jTFDniP1.getText();
        try {

            if (dni.isBlank() || dni.contains("Ej:")) {
                JOptionPane.showMessageDialog(this, "El campo DNI no debe estar vacío.");
                return false;
            } else {
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
    
     public Boolean validar() {
        String nombre = jTFNombreP1.getText();
        String apellido = jTFApellidoP1.getText();
        

        // Validaciones de nombre
        if (nombre.isBlank() || nombre.contains("Ej:")) {
            JOptionPane.showMessageDialog(this, "El campo Nombre no debe estar vacío");
            return false;
        } else {
            if (!Utilidades.contieneSoloLetras(nombre)) {
                JOptionPane.showMessageDialog(this, "El campo Nombre debe contener solo letras.");
                return false;
            }
        }

        // Validaciones de Apellido
        if (apellido.isBlank() || apellido.contains("Ej:")) {
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

public void cargarCombo() {
    try{

        String mensaje = "<Seleccionar>";
        Especialidad mensajePrestador = new Especialidad(-1, mensaje);
        jComboBoxEspecialidad1.removeAllItems();
        jComboBoxEspecialidad1.addItem(mensajePrestador.obtenerEspecialidadCombo());

        List<Especialidad> especialidades = especialidadData.listaDeEspecialidades();
        
        for (Especialidad especialidad : especialidades){
           jComboBoxEspecialidad1.addItem(especialidad.obtenerEspecialidadCombo());
           
           jComboBoxEspecialidad1.setFont(new Font("Sanserif", Font.BOLD, 16));
           //especialidad.obtenerEspecialidadCombo();
        }
    }catch(NullPointerException ex){
        System.out.println("Especialidad nula");
    }
    }

public void borrarCampos(){
   jTFNombreP1.setText("");
   jTFApellidoP1.setText("");
   jTFDniP1.setText("");
   jComboBoxEspecialidad1.setSelectedIndex(-1);
}

private Especialidad obtenerEspecialidad(String nombre){
    List<Especialidad> especialidades = especialidadData.listaDeEspecialidades();
    
    for(Especialidad iteradora : especialidades){
        if(iteradora.getNombre().equals(nombre)){
            return iteradora;
            
        }
    }
    return null;
}




}
