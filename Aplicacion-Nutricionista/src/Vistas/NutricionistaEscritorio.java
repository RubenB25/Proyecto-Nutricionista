package Vistas;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JInternalFrame;

/**
 * @author Gabriel
 */
public class NutricionistaEscritorio extends javax.swing.JFrame {

    public NutricionistaEscritorio() {
        initComponents();
       setLocationRelativeTo(null);
         
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
        jMListarDieta = new javax.swing.JMenuItem();
        jMRegistrarDieta = new javax.swing.JMenuItem();
        jMAdminDIeta = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMRegistrarConsulta = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMAdministrarComida = new javax.swing.JMenuItem();
        jMIngredientes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDPescritorio.setPreferredSize(new java.awt.Dimension(1360, 768));

        javax.swing.GroupLayout jDPescritorioLayout = new javax.swing.GroupLayout(jDPescritorio);
        jDPescritorio.setLayout(jDPescritorioLayout);
        jDPescritorioLayout.setHorizontalGroup(
            jDPescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
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

        jMListarDieta.setText("Listar pacientes");
        jMListarDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMListarDietaActionPerformed(evt);
            }
        });
        jMenu2.add(jMListarDieta);

        jMRegistrarDieta.setText("Registrar dieta");
        jMRegistrarDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMRegistrarDietaActionPerformed(evt);
            }
        });
        jMenu2.add(jMRegistrarDieta);

        jMAdminDIeta.setText("Administrar dieta");
        jMAdminDIeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAdminDIetaActionPerformed(evt);
            }
        });
        jMenu2.add(jMAdminDIeta);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Consulta");

        jMRegistrarConsulta.setText("Registrar consulta");
        jMRegistrarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMRegistrarConsultaActionPerformed(evt);
            }
        });
        jMenu3.add(jMRegistrarConsulta);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Comidas");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMAdministrarComida.setText("Administrar comida");
        jMAdministrarComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAdministrarComidaActionPerformed(evt);
            }
        });
        jMenu4.add(jMAdministrarComida);

        jMIngredientes.setText("Ingredientes");
        jMIngredientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIngredientesActionPerformed(evt);
            }
        });
        jMenu4.add(jMIngredientes);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDPescritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 1366, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDPescritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1382, 830));
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        BuscarPaciente bp = new BuscarPaciente();
        JInternalFrame[] frames = jDPescritorio.getAllFramesInLayer(javax.swing.JLayeredPane.DEFAULT_LAYER);
        boolean estaAbierta = false;

        for (JInternalFrame frame : frames) {
            if (frame.getClass() == bp.getClass()) {
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
            jDPescritorio.repaint();
             Dimension desktopSize = jDPescritorio.getSize();
            Dimension frameSize = bp.getSize();
            bp.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);
            jDPescritorio.add(bp);
            
            bp.moveToFront();
            bp.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMIformularioPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIformularioPacienteActionPerformed
        FormularioPaciente fp = new FormularioPaciente();
        JInternalFrame[] frames = jDPescritorio.getAllFramesInLayer(javax.swing.JLayeredPane.DEFAULT_LAYER);
        boolean estaAbierta = false;

        for (JInternalFrame frame : frames) {
            if (frame.getClass() == fp.getClass()) {
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

            jDPescritorio.repaint();
              Dimension desktopSize = jDPescritorio.getSize();
            Dimension frameSize = fp.getSize();
            fp.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);
            jDPescritorio.add(fp);
            fp.moveToFront();
            fp.setVisible(true);
            
        }
    }//GEN-LAST:event_jMIformularioPacienteActionPerformed

    private void jMListarDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMListarDietaActionPerformed
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
    }//GEN-LAST:event_jMListarDietaActionPerformed

    private void jMRegistrarDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMRegistrarDietaActionPerformed
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
    }//GEN-LAST:event_jMRegistrarDietaActionPerformed

    private void jMAdminDIetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAdminDIetaActionPerformed
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
    }//GEN-LAST:event_jMAdminDIetaActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMAdministrarComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAdministrarComidaActionPerformed
        V_Table_AdminComidas ac = new V_Table_AdminComidas();
        JInternalFrame[] frames = jDPescritorio.getAllFramesInLayer(javax.swing.JLayeredPane.DEFAULT_LAYER);
        boolean estaAbierta = false;

        for (JInternalFrame frame : frames) {
            if (frame.getClass() == ac.getClass()) {
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
            jDPescritorio.removeAll();
            jDPescritorio.repaint();
             Dimension desktopSize = jDPescritorio.getSize();
            Dimension frameSize = ac.getSize();
            ac.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);
            jDPescritorio.add(ac);
            ac.moveToFront();
            ac.setVisible(true);
        }
    }//GEN-LAST:event_jMAdministrarComidaActionPerformed

    private void jMIngredientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIngredientesActionPerformed
        V_Table_Ingredientes vi = new V_Table_Ingredientes();
        JInternalFrame[] frames = jDPescritorio.getAllFramesInLayer(javax.swing.JLayeredPane.DEFAULT_LAYER);
        boolean estaAbierta = false;

        for (JInternalFrame frame : frames) {
            if (frame.getClass() == vi.getClass()) {
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
            jDPescritorio.repaint();
            jDPescritorio.add(vi);
             Dimension desktopSize = jDPescritorio.getSize();
            Dimension frameSize = vi.getSize();
            vi.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);
            vi.moveToFront();
            vi.setVisible(true);
        }
    }//GEN-LAST:event_jMIngredientesActionPerformed

    private void jMRegistrarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMRegistrarConsultaActionPerformed
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
    }//GEN-LAST:event_jMRegistrarConsultaActionPerformed

    public static void main(String args[]) {
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(NutricionistaEscritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(NutricionistaEscritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(NutricionistaEscritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(NutricionistaEscritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
  
          
                new NutricionistaEscritorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JDesktopPane jDPescritorio;
    private static javax.swing.JMenuItem jMAdminDIeta;
    private static javax.swing.JMenuItem jMAdministrarComida;
    private static javax.swing.JMenuItem jMIformularioPaciente;
    private static javax.swing.JMenuItem jMIngredientes;
    private static javax.swing.JMenuItem jMListarDieta;
    private static javax.swing.JMenuItem jMRegistrarConsulta;
    private static javax.swing.JMenuItem jMRegistrarDieta;
    private static javax.swing.JMenu jMenu1;
    private static javax.swing.JMenu jMenu2;
    private static javax.swing.JMenu jMenu3;
    private static javax.swing.JMenu jMenu4;
    private static javax.swing.JMenuBar jMenuBar1;
    private static javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables

}
