package Vistas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.*;

public class MenuPrincipal extends javax.swing.JFrame {

    GuardarPrestador ppe = new GuardarPrestador(this);
  
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
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2DarBajaAfiliado = new javax.swing.JMenuItem();
        jMenuItem1ModificarAfiliado = new javax.swing.JMenuItem();
        jMGuardarAfiliado = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuPrestadoresPorEspecialidad = new javax.swing.JMenuItem();
        jMenuItemPrestadoresActivos = new javax.swing.JMenuItem();
        jMenuItemGuardarPrestador = new javax.swing.JMenuItem();
        jMenuItemModificarPrestador = new javax.swing.JMenuItem();
        darDeAltaPrestador = new javax.swing.JMenuItem();
        jMenuItemEliminarPrestador = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemAgregar = new javax.swing.JMenuItem();
        jMenuItemEditar = new javax.swing.JMenuItem();
        jMenuItemBuscar = new javax.swing.JMenuItem();
        jGestionOrdenes = new javax.swing.JMenu();
        jMenuComprarOrdenes = new javax.swing.JMenuItem();
        jMenuAnularOrden = new javax.swing.JMenuItem();
        jMenuConsultarOrdenesPorFecha = new javax.swing.JMenuItem();
        jMenuConsultarOrdenesPorAfiliadoOPrestador = new javax.swing.JMenuItem();
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

        jMenuItem1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jMenuItem1.setText("Ver Afiliados");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1VerAfiliados.add(jMenuItem1);

        jMenuItem2DarBajaAfiliado.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jMenuItem2DarBajaAfiliado.setText("Afiliar o Eliminar Afiliado");
        jMenuItem2DarBajaAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2DarBajaAfiliadoActionPerformed(evt);
            }
        });
        jMenu1VerAfiliados.add(jMenuItem2DarBajaAfiliado);

        jMenuItem1ModificarAfiliado.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jMenuItem1ModificarAfiliado.setText("Modificar Afiliado");
        jMenuItem1ModificarAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ModificarAfiliadoActionPerformed(evt);
            }
        });
        jMenu1VerAfiliados.add(jMenuItem1ModificarAfiliado);

        jMGuardarAfiliado.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jMGuardarAfiliado.setText("Nuevo Afiliado");
        jMGuardarAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMGuardarAfiliadoActionPerformed(evt);
            }
        });
        jMenu1VerAfiliados.add(jMGuardarAfiliado);

        jMenuBar1.add(jMenu1VerAfiliados);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Prestadores.jpg"))); // NOI18N
        jMenu2.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N

        jMenuPrestadoresPorEspecialidad.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jMenuPrestadoresPorEspecialidad.setText("Prestadores por Especialidad");
        jMenuPrestadoresPorEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPrestadoresPorEspecialidadActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuPrestadoresPorEspecialidad);

        jMenuItemPrestadoresActivos.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jMenuItemPrestadoresActivos.setText("Prestadores Activos");
        jMenuItemPrestadoresActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPrestadoresActivosActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemPrestadoresActivos);

        jMenuItemGuardarPrestador.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jMenuItemGuardarPrestador.setText("Guardar Prestador");
        jMenuItemGuardarPrestador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGuardarPrestadorActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemGuardarPrestador);

        jMenuItemModificarPrestador.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jMenuItemModificarPrestador.setText("Modificar Prestador");
        jMenuItemModificarPrestador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemModificarPrestadorActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemModificarPrestador);

        darDeAltaPrestador.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        darDeAltaPrestador.setText("Dar de alta a un Prestador");
        darDeAltaPrestador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                darDeAltaPrestadorActionPerformed(evt);
            }
        });
        jMenu2.add(darDeAltaPrestador);

        jMenuItemEliminarPrestador.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jMenuItemEliminarPrestador.setText("Eliminar Prestador");
        jMenuItemEliminarPrestador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEliminarPrestadorActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemEliminarPrestador);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Especialidades.jpg"))); // NOI18N
        jMenu3.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N

        jMenuItemAgregar.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jMenuItemAgregar.setText("Agregar Especialidad");
        jMenuItemAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAgregarActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemAgregar);

        jMenuItemEditar.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jMenuItemEditar.setText("Editar Especialidad");
        jMenuItemEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEditarActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemEditar);

        jMenuItemBuscar.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jMenuItemBuscar.setText("Buscar Especialidad ");
        jMenuItemBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBuscarActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemBuscar);

        jMenuBar1.add(jMenu3);

        jGestionOrdenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Ordenes.jpg"))); // NOI18N
        jGestionOrdenes.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N

        jMenuComprarOrdenes.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jMenuComprarOrdenes.setText("Comprar orden");
        jMenuComprarOrdenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuComprarOrdenesActionPerformed(evt);
            }
        });
        jGestionOrdenes.add(jMenuComprarOrdenes);

        jMenuAnularOrden.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jMenuAnularOrden.setText("Anular orden");
        jMenuAnularOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAnularOrdenActionPerformed(evt);
            }
        });
        jGestionOrdenes.add(jMenuAnularOrden);

        jMenuConsultarOrdenesPorFecha.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jMenuConsultarOrdenesPorFecha.setText("Consultar órdenes según fecha");
        jMenuConsultarOrdenesPorFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConsultarOrdenesPorFechaActionPerformed(evt);
            }
        });
        jGestionOrdenes.add(jMenuConsultarOrdenesPorFecha);

        jMenuConsultarOrdenesPorAfiliadoOPrestador.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jMenuConsultarOrdenesPorAfiliadoOPrestador.setText("Consultar órdenes por Afiliado o Prestador");
        jMenuConsultarOrdenesPorAfiliadoOPrestador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConsultarOrdenesPorAfiliadoOPrestadorActionPerformed(evt);
            }
        });
        jGestionOrdenes.add(jMenuConsultarOrdenesPorAfiliadoOPrestador);

        jMenuBar1.add(jGestionOrdenes);

        jMenu1Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Salir.jpg"))); // NOI18N
        jMenu1Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1SalirMouseClicked(evt);
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

    private void jMenuItemAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAgregarActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        JInternalFrameAddEspecialidad internalView = new JInternalFrameAddEspecialidad(ppe);
        internalView.setVisible(true);
        escritorio.add(internalView);
        escritorio.moveToFront(internalView);
        int x = (escritorio.getWidth() - internalView.getWidth()) / 2;
        int y = (escritorio.getHeight() - internalView.getHeight()) / 2;
        internalView.setLocation(x, y);

    }//GEN-LAST:event_jMenuItemAgregarActionPerformed

    private void jMenuItemEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEditarActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        JInternalFrameEditEspecialidad internalView = new JInternalFrameEditEspecialidad();
        internalView.setVisible(true);
        escritorio.add(internalView);
        escritorio.moveToFront(internalView);
        int x = (escritorio.getWidth() - internalView.getWidth()) / 2;
        int y = (escritorio.getHeight() - internalView.getHeight()) / 2;
        internalView.setLocation(x, y);

    }//GEN-LAST:event_jMenuItemEditarActionPerformed

    private void jMenuItemBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBuscarActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        JInternalFrameSearchEspecialidad internalView = new JInternalFrameSearchEspecialidad();
        internalView.setVisible(true);
        escritorio.add(internalView);
        escritorio.moveToFront(internalView);
        int x = (escritorio.getWidth() - internalView.getWidth()) / 2;
        int y = (escritorio.getHeight() - internalView.getHeight()) / 2;
        internalView.setLocation(x, y);
    }//GEN-LAST:event_jMenuItemBuscarActionPerformed

    private void jMenuComprarOrdenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuComprarOrdenesActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ComprarOrden comprarOrden = new ComprarOrden(this);
        comprarOrden.setVisible(true);
        escritorio.add(comprarOrden);
        escritorio.moveToFront(comprarOrden);
        int x = (escritorio.getWidth() - comprarOrden.getWidth()) / 2;
        int y = (escritorio.getHeight() - comprarOrden.getHeight()) / 2;
        comprarOrden.setLocation(x, y);
    }//GEN-LAST:event_jMenuComprarOrdenesActionPerformed

    private void jMenuAnularOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAnularOrdenActionPerformed
        escritorio.repaint();
        AnularOrden anularOrden = new AnularOrden();
        anularOrden.setVisible(true);
        escritorio.add(anularOrden);
        escritorio.moveToFront(anularOrden);
        int x = (escritorio.getWidth() - anularOrden.getWidth()) / 2;
        int y = (escritorio.getHeight() - anularOrden.getHeight()) / 2;
        anularOrden.setLocation(x, y);
    }//GEN-LAST:event_jMenuAnularOrdenActionPerformed

    private void jMenuConsultarOrdenesPorFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConsultarOrdenesPorFechaActionPerformed
        escritorio.repaint();
        ConsultarOrdenesPorFecha consultarPorFecha = new ConsultarOrdenesPorFecha();
        consultarPorFecha.setVisible(true);
        escritorio.add(consultarPorFecha);
        escritorio.moveToFront(consultarPorFecha);
        int x = (escritorio.getWidth() - consultarPorFecha.getWidth()) / 2;
        int y = (escritorio.getHeight() - consultarPorFecha.getHeight()) / 2;
        consultarPorFecha.setLocation(x, y);
    }//GEN-LAST:event_jMenuConsultarOrdenesPorFechaActionPerformed

    private void jMenuConsultarOrdenesPorAfiliadoOPrestadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConsultarOrdenesPorAfiliadoOPrestadorActionPerformed
        escritorio.repaint();
        ConsultarOrdenesPorAfiliadoOPrestador consultarOrdenesPorAfiliado = new ConsultarOrdenesPorAfiliadoOPrestador();
        consultarOrdenesPorAfiliado.setVisible(true);
        escritorio.add(consultarOrdenesPorAfiliado);
        escritorio.moveToFront(consultarOrdenesPorAfiliado);
        int x = (escritorio.getWidth() - consultarOrdenesPorAfiliado.getWidth()) / 2;
        int y = (escritorio.getHeight() - consultarOrdenesPorAfiliado.getHeight()) / 2;
        consultarOrdenesPorAfiliado.setLocation(x, y);
    }//GEN-LAST:event_jMenuConsultarOrdenesPorAfiliadoOPrestadorActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VerAfiliados verAfiliados = new VerAfiliados();
        verAfiliados.setVisible(true);
        escritorio.add(verAfiliados);
        escritorio.moveToFront(verAfiliados);
        int x = (escritorio.getWidth() - verAfiliados.getWidth()) / 2;
        int y = (escritorio.getHeight() - verAfiliados.getHeight()) / 2;
        verAfiliados.setLocation(x, y);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2DarBajaAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2DarBajaAfiliadoActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        DarBajaAltaAfiliado bajaAfiliado = new DarBajaAltaAfiliado();
        bajaAfiliado.setVisible(true);
        escritorio.add(bajaAfiliado);
        escritorio.moveToFront(bajaAfiliado);
        int x = (escritorio.getWidth() - bajaAfiliado.getWidth()) / 2;
        int y = (escritorio.getHeight() - bajaAfiliado.getHeight()) / 2;
        bajaAfiliado.setLocation(x, y);
    }//GEN-LAST:event_jMenuItem2DarBajaAfiliadoActionPerformed

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

    private void jMenu1SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1SalirMouseClicked
      dispose();
    }//GEN-LAST:event_jMenu1SalirMouseClicked

    private void jMenuPrestadoresPorEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPrestadoresPorEspecialidadActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        PrestadoresPorEspecialidad ppe = new PrestadoresPorEspecialidad();
        ppe.setVisible(true);
        escritorio.add(ppe);
        escritorio.moveToFront(ppe);
        int x = (escritorio.getWidth() - ppe.getWidth()) / 2;
        int y = (escritorio.getHeight() - ppe.getHeight()) / 2;
        ppe.setLocation(x, y);
    }//GEN-LAST:event_jMenuPrestadoresPorEspecialidadActionPerformed

    private void jMenuItemPrestadoresActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPrestadoresActivosActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        PrestadoresActivos pa = new PrestadoresActivos();
        pa.setVisible(true);
        escritorio.add(pa);
        escritorio.moveToFront(pa);
        int x = (escritorio.getWidth() - pa.getWidth()) / 2;
        int y = (escritorio.getHeight() - pa.getHeight()) / 2;
        pa.setLocation(x, y);
    }//GEN-LAST:event_jMenuItemPrestadoresActivosActionPerformed

    private void jMenuItemGuardarPrestadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGuardarPrestadorActionPerformed
        escritorio.removeAll();
        escritorio.repaint();

        ppe.setVisible(true);
        escritorio.add(ppe);
        escritorio.moveToFront(ppe);
        int x = (escritorio.getWidth() - ppe.getWidth()) / 2;
        int y = (escritorio.getHeight() - ppe.getHeight()) / 2;
        ppe.setLocation(x, y);
    }//GEN-LAST:event_jMenuItemGuardarPrestadorActionPerformed

    private void jMenuItemModificarPrestadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemModificarPrestadorActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ModificarPrestador mp= new ModificarPrestador();
        mp.setVisible(true);
        escritorio.add(mp);
        escritorio.moveToFront(mp);
        int x = (escritorio.getWidth() - mp.getWidth()) / 2;
        int y = (escritorio.getHeight() - mp.getHeight()) / 2;
        mp.setLocation(x, y);
    }//GEN-LAST:event_jMenuItemModificarPrestadorActionPerformed

    private void darDeAltaPrestadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_darDeAltaPrestadorActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        DarDeAltaPrestador alta= new DarDeAltaPrestador();
        alta.setVisible(true);
        escritorio.add(alta);
        escritorio.moveToFront(alta);
        int x = (escritorio.getWidth() -alta.getWidth()) / 2;
        int y = (escritorio.getHeight() -alta.getHeight()) / 2;
        alta.setLocation(x, y);
    }//GEN-LAST:event_darDeAltaPrestadorActionPerformed

    private void jMenuItemEliminarPrestadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEliminarPrestadorActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        EliminarPrestador ep = new EliminarPrestador();
        ep.setVisible(true);
        escritorio.add(ep);
        escritorio.moveToFront(ep);
        int x = (escritorio.getWidth() - ep.getWidth()) / 2;
        int y = (escritorio.getHeight() - ep.getHeight()) / 2;
        ep.setLocation(x, y);
    }//GEN-LAST:event_jMenuItemEliminarPrestadorActionPerformed

    
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
    private javax.swing.JMenuItem darDeAltaPrestador;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jGestionOrdenes;
    private javax.swing.JMenuItem jMGuardarAfiliado;
    private javax.swing.JMenu jMenu1Salir;
    private javax.swing.JMenu jMenu1VerAfiliados;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuAnularOrden;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuComprarOrdenes;
    private javax.swing.JMenuItem jMenuConsultarOrdenesPorAfiliadoOPrestador;
    private javax.swing.JMenuItem jMenuConsultarOrdenesPorFecha;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem1ModificarAfiliado;
    private javax.swing.JMenuItem jMenuItem2DarBajaAfiliado;
    private javax.swing.JMenuItem jMenuItemAgregar;
    private javax.swing.JMenuItem jMenuItemBuscar;
    private javax.swing.JMenuItem jMenuItemEditar;
    private javax.swing.JMenuItem jMenuItemEliminarPrestador;
    private javax.swing.JMenuItem jMenuItemGuardarPrestador;
    private javax.swing.JMenuItem jMenuItemModificarPrestador;
    private javax.swing.JMenuItem jMenuItemPrestadoresActivos;
    private javax.swing.JMenuItem jMenuPrestadoresPorEspecialidad;
    // End of variables declaration//GEN-END:variables
 
    public void nuevaVista(String dni) {
        escritorio.repaint();
        AgregarAfiliado agregarAfiliado = new AgregarAfiliado(dni);
        agregarAfiliado.setVisible(true);
        escritorio.add(agregarAfiliado);
        escritorio.moveToFront(agregarAfiliado);
        int x = (escritorio.getWidth() - agregarAfiliado.getWidth()) / 2;
        int y = (escritorio.getHeight() - agregarAfiliado.getHeight()) / 2;
        agregarAfiliado.setLocation(x, y);
    }
    
    public void nuevaVistaEspecialidad() {
        escritorio.repaint();
        JInternalFrameAddEspecialidad agregarEspecialidad = new JInternalFrameAddEspecialidad(ppe);
        agregarEspecialidad.setVisible(true);
        escritorio.add(agregarEspecialidad);
        escritorio.moveToFront(agregarEspecialidad);
        int x = (escritorio.getWidth() - agregarEspecialidad.getWidth()) / 2;
        int y = (escritorio.getHeight() - agregarEspecialidad.getHeight()) / 2;
        agregarEspecialidad.setLocation(x, y);
    }
    
}
