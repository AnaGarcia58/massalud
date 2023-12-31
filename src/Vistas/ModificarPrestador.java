package Vistas;

import AccesoData.EspecialidadData;
import AccesoData.PrestadorData;
import Entidades.Especialidad;
import Entidades.Prestador;
import Utilidades.Utilidades;
import java.awt.Font;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

public class ModificarPrestador extends javax.swing.JInternalFrame {

    PrestadorData prestadorData = new PrestadorData();
    Prestador prestador = new Prestador();
    EspecialidadData especialidadData = new EspecialidadData();
    Especialidad especialidad = null;

    public ModificarPrestador() {
        initComponents();
        Utilidades.addPlaceHolder(jTFDni, "Ej: 31282476");
        inhabilitarCampos(false);
        cargarCombo();
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
        jTFDni = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jBModificar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jTFNombre = new javax.swing.JTextField();
        jTFApellido = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jComboBoxEspecialidad1 = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(153, 220, 153));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("Modificar Prestador");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel2.setText("Por favor, ingrese el DNI del prestador");

        jTFDni.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N

        jBBuscar.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jBBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/buscar.jpg"))); // NOI18N
        jBBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel4.setText("Apellido");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel6.setText("Especialidad");

        jBModificar.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jBModificar.setText("Modificar");
        jBModificar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jBSalir.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jTFNombre.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N

        jTFApellido.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N

        jButton2.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButton2.setText("Limpiar");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBoxEspecialidad1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jTFDni, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBBuscar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(53, 53, 53))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBoxEspecialidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(77, 77, 77))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(144, 144, 144))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTFDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxEspecialidad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBModificar)
                    .addComponent(jBSalir)
                    .addComponent(jButton2))
                .addGap(35, 35, 35))
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

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed

        try{

        if (validar()) {
        int dni = Integer.parseInt(jTFDni.getText());
        String nombre = jTFNombre.getText();
        String apellido = jTFApellido.getText();
        
        Especialidad especialidad = (Especialidad) jComboBoxEspecialidad1.getSelectedItem();

            prestador = new Prestador(nombre, apellido, dni, true, especialidad);
            prestadorData.modificarPrestadorMejorado(prestador);
            borrarCampos();
            inhabilitarCampos(false);
            Utilidades.addPlaceHolder(jTFDni, "Ej: 31282476");
        }
        

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese números");
        }catch(NullPointerException ex){
            JOptionPane.showMessageDialog(this, "No ha sido seleccionada la especialidad");
        }
        
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed

        try {
              if (validarDni()) {

                int dniPrestador = Integer.parseInt(jTFDni.getText());
                prestador = prestadorData.buscarPrestador(dniPrestador);
                jTFNombre.setText(prestador.getNombre());
                jTFApellido.setText(prestador.getApellido());
                
                Especialidad especialidadPrestador = prestador.getEspecialidad();
                for (int i = 1; i < jComboBoxEspecialidad1.getItemCount(); i++) {
                    Especialidad especialidad = (Especialidad) jComboBoxEspecialidad1.getItemAt(i);
                    if (especialidadPrestador.getIdEspecialidad() == especialidad.getIdEspecialidad()) {
                        jComboBoxEspecialidad1.setSelectedIndex(i);
                        break; // Rompe el bucle una vez que se ha encontrado la especialidad
                    }
                }
                inhabilitarCampos(true);
             }
        } catch (NullPointerException e) {
            System.out.println("El prestador no existe en la base de datos");
            jTFDni.setText("");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,"El campo permite sólo números");

            jTFDni.setText("");
    }//GEN-LAST:event_jBBuscarActionPerformed
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        borrarCampos();
        Utilidades.addPlaceHolder(jTFDni, "Ej:31282476");
        inhabilitarCampos(false);
        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<Especialidad> jComboBoxEspecialidad1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTFApellido;
    private javax.swing.JTextField jTFDni;
    private javax.swing.JTextField jTFNombre;
    // End of variables declaration//GEN-END:variables

    public void borrarCampos() {
        jTFNombre.setText("");
        jTFApellido.setText("");
        jComboBoxEspecialidad1.setSelectedIndex(-1);
        jTFDni.setText("");
    }

    public Boolean validarDni() {
        String dni = jTFDni.getText();
        try {

            if (dni.isBlank() || dni.contains("Ej: ")) {
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
        String nombre = jTFNombre.getText();
        String apellido = jTFApellido.getText();
        String dniS = jTFDni.getText();

        // Validaciones de nombre
        if (nombre.isBlank() || nombre.contains("Ej: ")) {
            JOptionPane.showMessageDialog(this, "El campo Nombre no debe estar vacío");
            return false;
        } else {
            if (!Utilidades.contieneSoloLetras(nombre)) {
                JOptionPane.showMessageDialog(this, "El campo Nombre debe contener solo letras.");
                return false;
            }
        }

        // Validaciones de Apellido
        if (apellido.isBlank() || apellido.contains("Ej: ")) {
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
    
    
    public void inhabilitarCampos(boolean estado){
        jTFNombre.setEnabled(estado);
        jTFApellido.setEnabled(estado);
        jComboBoxEspecialidad1.setEnabled(estado);
        jBModificar.setEnabled(estado);
    }
    
    private void cargarCombo() {
        jComboBoxEspecialidad1.removeAllItems();
        jComboBoxEspecialidad1.addItem(null);
        List<Especialidad> especialidades = especialidadData.listaDeEspecialidades();
        
        for (Especialidad especialidad : especialidades){
           jComboBoxEspecialidad1.addItem(especialidad);
           
           jComboBoxEspecialidad1.setFont(new Font("Sanserif", Font.BOLD, 16));
        }
    }
}
