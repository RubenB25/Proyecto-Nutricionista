package Vistas;

import java.awt.Dimension;
import javax.swing.JInternalFrame;

/**
 * @author Gabriel
 */
public class NutricionistaEscritorio extends javax.swing.JFrame {

    public NutricionistaEscritorio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDPescritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMIformularioPaciente = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDPescritorio.setPreferredSize(new java.awt.Dimension(1360, 768));

        javax.swing.GroupLayout jDPescritorioLayout = new javax.swing.GroupLayout(jDPescritorio);
        jDPescritorio.setLayout(jDPescritorioLayout);
        jDPescritorioLayout.setHorizontalGroup(
            jDPescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1360, Short.MAX_VALUE)
        );
        jDPescritorioLayout.setVerticalGroup(
            jDPescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
        );

        jMenu1.setText("Pacientes");

        jMIformularioPaciente.setText("Formulario paciente");
        jMIformularioPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIformularioPacienteActionPerformed(evt);
            }
        });
        jMenu1.add(jMIformularioPaciente);

        jMenuItem2.setText("Buscar paciente");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Dietas");

        jMenuItem3.setText("Listar pacientes");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Registrar dieta");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Modificar dieta");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Consulta");

        jMenuItem7.setText("Historial de paciente");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem8.setText("Registrar consulta");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Comidas");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenuItem6.setText("Administrar comida");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuItem9.setText("Ingredientes");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDPescritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDPescritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        BuscarPaciente bp = new BuscarPaciente();
        jDPescritorio.removeAll();
        jDPescritorio.repaint();
        jDPescritorio.add(bp);
        bp.moveToFront();
        bp.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMIformularioPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIformularioPacienteActionPerformed
        FormularioPaciente fp = new FormularioPaciente();
        jDPescritorio.removeAll();
        jDPescritorio.repaint();
        jDPescritorio.add(fp);
        fp.moveToFront();
        fp.setVisible(true);
    }//GEN-LAST:event_jMIformularioPacienteActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        ListarPacientes vistaLP = new ListarPacientes();

        // Verifica si el JInternalFrame ya está en el JDesktopPane
        JInternalFrame[] frames = jDPescritorio.getAllFramesInLayer(javax.swing.JLayeredPane.DEFAULT_LAYER);
        boolean estaAbierta = false;
        for (JInternalFrame frame : frames) {
            if (frame.getClass() == vistaLP.getClass()) {
                estaAbierta = true;
                try {
                    frame.setSelected(true);
                } catch (java.beans.PropertyVetoException e) {
                    e.printStackTrace();
                }
                break;
            }
        }

        if (!estaAbierta) {
            jDPescritorio.add(vistaLP);
            Dimension desktopSize = jDPescritorio.getSize();
            Dimension frameSize = vistaLP.getSize();
            vistaLP.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);

            // Hace que el JInternalFrame sea visible
            vistaLP.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        RegistrarDieta vistaRD = new RegistrarDieta();
        // Verifica si el JInternalFrame ya está en el JDesktopPane
        JInternalFrame[] frames = jDPescritorio.getAllFramesInLayer(javax.swing.JLayeredPane.DEFAULT_LAYER);
        boolean estaAbierta = false;

        for (JInternalFrame frame : frames) {
            if (frame.getClass() == vistaRD.getClass()) {
                estaAbierta = true;
                try {
                    frame.setSelected(true);
                } catch (java.beans.PropertyVetoException e) {
                    e.printStackTrace();
                }
                break;
            }
        }

        if (!estaAbierta) {
            jDPescritorio.add(vistaRD);
            Dimension desktopSize = jDPescritorio.getSize();
            Dimension frameSize = vistaRD.getSize();
            vistaRD.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);
            vistaRD.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        HistorialConsulta hc = new HistorialConsulta();
        // Verifica si el JInternalFrame ya está en el JDesktopPane
        JInternalFrame[] frames = jDPescritorio.getAllFramesInLayer(javax.swing.JLayeredPane.DEFAULT_LAYER);
        boolean estaAbierta = false;

        for (JInternalFrame frame : frames) {
            if (frame.getClass() == hc.getClass()) {
                estaAbierta = true;
                try {
                    frame.setSelected(true);
                } catch (java.beans.PropertyVetoException e) {
                    e.printStackTrace();
                }
                break;
            }
        }

        if (!estaAbierta) {
            jDPescritorio.add(hc);
            Dimension desktopSize = jDPescritorio.getSize();
            Dimension frameSize = hc.getSize();
            hc.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);
            hc.setVisible(true);
        }
        
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        FormularioConsulta fc = new FormularioConsulta();
        // Verifica si el JInternalFrame ya está en el JDesktopPane
        JInternalFrame[] frames = jDPescritorio.getAllFramesInLayer(javax.swing.JLayeredPane.DEFAULT_LAYER);
        boolean estaAbierta = false;

        for (JInternalFrame frame : frames) {
            if (frame.getClass() == fc.getClass()) {
                estaAbierta = true;
                try {
                    frame.setSelected(true);
                } catch (java.beans.PropertyVetoException e) {
                    e.printStackTrace();
                }
                break;
            }
        }

        if (!estaAbierta) {
            jDPescritorio.add(fc);
            Dimension desktopSize = jDPescritorio.getSize();
            Dimension frameSize = fc.getSize();
            fc.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);
            fc.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
         ModificarDieta md = new ModificarDieta();
        // Verifica si el JInternalFrame ya está en el JDesktopPane
        JInternalFrame[] frames = jDPescritorio.getAllFramesInLayer(javax.swing.JLayeredPane.DEFAULT_LAYER);
        boolean estaAbierta = false;

        for (JInternalFrame frame : frames) {
            if (frame.getClass() == md.getClass()) {
                estaAbierta = true;
                try {
                    frame.setSelected(true);
                } catch (java.beans.PropertyVetoException e) {
                    e.printStackTrace();
                }
                break;
            }
        }

        if (!estaAbierta) {
            jDPescritorio.add(md);
            Dimension desktopSize = jDPescritorio.getSize();
            Dimension frameSize = md.getSize();
            md.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);
            md.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        V_Table_AdminComidas ac = new V_Table_AdminComidas();
        jDPescritorio.removeAll();
        jDPescritorio.repaint();
        jDPescritorio.add(ac);
        ac.moveToFront();
        ac.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        V_Table_Ingredientes vi = new V_Table_Ingredientes();
        jDPescritorio.removeAll();
        jDPescritorio.repaint();
        jDPescritorio.add(vi);
        vi.moveToFront();
        vi.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NutricionistaEscritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NutricionistaEscritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NutricionistaEscritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NutricionistaEscritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NutricionistaEscritorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDPescritorio;
    private javax.swing.JMenuItem jMIformularioPaciente;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables

}
