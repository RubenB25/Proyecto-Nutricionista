package Vistas;

import Vistas.Dietas.ListarPacientes;
import Vistas.Dietas.RegistrarDieta;
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
        jMBListarPacientes = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDPescritorioLayout = new javax.swing.GroupLayout(jDPescritorio);
        jDPescritorio.setLayout(jDPescritorioLayout);
        jDPescritorioLayout.setHorizontalGroup(
            jDPescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 741, Short.MAX_VALUE)
        );
        jDPescritorioLayout.setVerticalGroup(
            jDPescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 561, Short.MAX_VALUE)
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

        jMBListarPacientes.setText("Listar pacientes");
        jMBListarPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMBListarPacientesActionPerformed(evt);
            }
        });
        jMenu2.add(jMBListarPacientes);

        jMenuItem4.setText("Registrar dieta");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Modificar dieta");
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Consulta");

        jMenuItem7.setText("Historial de paciente");
        jMenu3.add(jMenuItem7);

        jMenuItem8.setText("Registrar consulta");
        jMenu3.add(jMenuItem8);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Comidas");

        jMenuItem6.setText("Administrar comida");
        jMenu4.add(jMenuItem6);

        jMenuItem9.setText("Buscar comida");
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
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMIformularioPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIformularioPacienteActionPerformed
        FormularioPaciente fp = new FormularioPaciente();
        jDPescritorio.removeAll();
        jDPescritorio.repaint();
        jDPescritorio.add(fp);
        fp.moveToFront();
        fp.setVisible(true);
    }//GEN-LAST:event_jMIformularioPacienteActionPerformed

    private void jMBListarPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMBListarPacientesActionPerformed
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
    }//GEN-LAST:event_jMBListarPacientesActionPerformed

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
    private javax.swing.JMenuItem jMBListarPacientes;
    private javax.swing.JMenuItem jMIformularioPaciente;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables

}
