package Vistas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.*;

public class MenuPrincipal extends javax.swing.JFrame {

  
    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(900, 700);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/Recursos/LogoMasSalud.jpg"));
        Image imagen = icon.getImage();
        escritorio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1VerAfiliados = new javax.swing.JMenu();
        jMGuardarAfiliado = new javax.swing.JMenuItem();
        jMenuItem1ModificarAfiliado = new javax.swing.JMenuItem();
        jMenuItem2DarBajaAfiliado = new javax.swing.JMenuItem();
        jMenuItem3DarAltaAfiliado = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jGestionPrestadores = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jGestionEspecialidades = new javax.swing.JMenuItem();
        jGestionOrdenes = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu1Salir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        jMenu1VerAfiliados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Afiliados.jpg"))); // NOI18N
        jMenu1VerAfiliados.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jMenu1VerAfiliados.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jMGuardarAfiliado.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jMGuardarAfiliado.setText("Nuevo Afiliado");
        jMGuardarAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMGuardarAfiliadoActionPerformed(evt);
            }
        });
        jMenu1VerAfiliados.add(jMGuardarAfiliado);

        jMenuItem1ModificarAfiliado.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jMenuItem1ModificarAfiliado.setText("Modificar Afiliado");
        jMenuItem1ModificarAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ModificarAfiliadoActionPerformed(evt);
            }
        });
        jMenu1VerAfiliados.add(jMenuItem1ModificarAfiliado);

        jMenuItem2DarBajaAfiliado.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jMenuItem2DarBajaAfiliado.setText("Dar de baja al Afiliado");
        jMenuItem2DarBajaAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2DarBajaAfiliadoActionPerformed(evt);
            }
        });
        jMenu1VerAfiliados.add(jMenuItem2DarBajaAfiliado);

        jMenuItem3DarAltaAfiliado.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jMenuItem3DarAltaAfiliado.setText("Dar de alta Afiliado");
        jMenuItem3DarAltaAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3DarAltaAfiliadoActionPerformed(evt);
            }
        });
        jMenu1VerAfiliados.add(jMenuItem3DarAltaAfiliado);

        jMenuItem1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jMenuItem1.setText("Ver Afiliados");
        jMenu1VerAfiliados.add(jMenuItem1);

        jMenuBar1.add(jMenu1VerAfiliados);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Prestadores.jpg"))); // NOI18N
        jMenu2.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N

        jGestionPrestadores.setText("Gestion Prestadores");
        jMenu2.add(jGestionPrestadores);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Especialidades.jpg"))); // NOI18N
        jMenu3.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N

        jGestionEspecialidades.setText("Gestion Especialidades");
        jMenu3.add(jGestionEspecialidades);

        jMenuBar1.add(jMenu3);

        jGestionOrdenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Ordenes.jpg"))); // NOI18N
        jGestionOrdenes.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N

        jMenuItem4.setText("Gestion Ordenes");
        jGestionOrdenes.add(jMenuItem4);

        jMenuBar1.add(jGestionOrdenes);

        jMenu1Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Salir.jpg"))); // NOI18N
        jMenu1Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1SalirActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1Salir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2DarBajaAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2DarBajaAfiliadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2DarBajaAfiliadoActionPerformed

    private void jMenuItem3DarAltaAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3DarAltaAfiliadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3DarAltaAfiliadoActionPerformed

    private void jMGuardarAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMGuardarAfiliadoActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        AgregarAfiliado agregarAfiliado = new AgregarAfiliado();
        agregarAfiliado.setVisible(true);
        escritorio.add(agregarAfiliado);
        escritorio.moveToFront(agregarAfiliado);
        int x = (escritorio.getWidth() - agregarAfiliado.getWidth()) / 2;
        int y = (escritorio.getHeight() - agregarAfiliado.getHeight()) / 2;
        agregarAfiliado.setLocation(x, y);
    }//GEN-LAST:event_jMGuardarAfiliadoActionPerformed

    private void jMenu1SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1SalirActionPerformed
      this.dispose();
    }//GEN-LAST:event_jMenu1SalirActionPerformed

    private void jMenuItem1ModificarAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ModificarAfiliadoActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ModificarAfiliado modificarAfiliado = new ModificarAfiliado();
        modificarAfiliado.setVisible(true);
        escritorio.add(modificarAfiliado);
        escritorio.moveToFront(modificarAfiliado);
        int x = (escritorio.getWidth() - modificarAfiliado.getWidth()) / 2;
        int y = (escritorio.getHeight() - modificarAfiliado.getHeight()) / 2;
        modificarAfiliado.setLocation(x, y);   
    }//GEN-LAST:event_jMenuItem1ModificarAfiliadoActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem jGestionEspecialidades;
    private javax.swing.JMenu jGestionOrdenes;
    private javax.swing.JMenuItem jGestionPrestadores;
    private javax.swing.JMenuItem jMGuardarAfiliado;
    private javax.swing.JMenu jMenu1Salir;
    private javax.swing.JMenu jMenu1VerAfiliados;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem1ModificarAfiliado;
    private javax.swing.JMenuItem jMenuItem2DarBajaAfiliado;
    private javax.swing.JMenuItem jMenuItem3DarAltaAfiliado;
    private javax.swing.JMenuItem jMenuItem4;
    // End of variables declaration//GEN-END:variables
}
