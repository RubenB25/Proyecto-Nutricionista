package Vistas;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author Gabriel
 */
public class NutricionistaEscritorio extends javax.swing.JFrame {
public static PacienteABM JIPacienteABM = new PacienteABM();
    public NutricionistaEscritorio() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDescritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMformularioPaciente = new javax.swing.JMenuItem();
        jMbuscarPaciente = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMlistarPacientes = new javax.swing.JMenuItem();
        jMregistrarDieta = new javax.swing.JMenuItem();
        jMmodificarDieta = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMhistorialPaciente = new javax.swing.JMenuItem();
        jMregistrarConsulta = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMadministrarComida = new javax.swing.JMenuItem();
        jMbuscarComida = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDescritorioLayout = new javax.swing.GroupLayout(jDescritorio);
        jDescritorio.setLayout(jDescritorioLayout);
        jDescritorioLayout.setHorizontalGroup(
            jDescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 757, Short.MAX_VALUE)
        );
        jDescritorioLayout.setVerticalGroup(
            jDescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
        );

        jMenu1.setText("Pacientes");

        jMformularioPaciente.setText("Formulario paciente");
        jMformularioPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMformularioPacienteActionPerformed(evt);
            }
        });
        jMenu1.add(jMformularioPaciente);

        jMbuscarPaciente.setText("Buscar paciente");
        jMbuscarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMbuscarPacienteActionPerformed(evt);
            }
        });
        jMenu1.add(jMbuscarPaciente);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Dietas");

        jMlistarPacientes.setText("Listar pacientes");
        jMenu2.add(jMlistarPacientes);

        jMregistrarDieta.setText("Registrar dieta");
        jMenu2.add(jMregistrarDieta);

        jMmodificarDieta.setText("Modificar dieta");
        jMenu2.add(jMmodificarDieta);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Consulta");

        jMhistorialPaciente.setText("Historial de paciente");
        jMenu3.add(jMhistorialPaciente);

        jMregistrarConsulta.setText("Registrar consulta");
        jMregistrarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMregistrarConsultaActionPerformed(evt);
            }
        });
        jMenu3.add(jMregistrarConsulta);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Comidas");

        jMadministrarComida.setText("Administrar comida");
        jMenu4.add(jMadministrarComida);

        jMbuscarComida.setText("Buscar comida");
        jMenu4.add(jMbuscarComida);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDescritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDescritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMbuscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMbuscarPacienteActionPerformed
        jDescritorio.removeAll();
        jDescritorio.repaint();
        PacienteABM fp = new PacienteABM();
        fp.setVisible(true);
        jDescritorio.add(fp);
        Dimension desktopSize = jDescritorio.getSize();
        Dimension frameSize = fp.getSize();
        fp.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);
        jDescritorio.moveToFront(fp);
    }//GEN-LAST:event_jMbuscarPacienteActionPerformed

    private void jMformularioPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMformularioPacienteActionPerformed
        jDescritorio.removeAll();
        jDescritorio.repaint();
        PacienteABM fp = new PacienteABM();
        fp.setVisible(true);
        jDescritorio.add(fp);
        Dimension desktopSize = jDescritorio.getSize();
        Dimension frameSize = fp.getSize();
        fp.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);
        jDescritorio.moveToFront(fp); 
    }//GEN-LAST:event_jMformularioPacienteActionPerformed

    private void jMregistrarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMregistrarConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMregistrarConsultaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NutricionistaEscritorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane jDescritorio;
    private javax.swing.JMenuItem jMadministrarComida;
    private javax.swing.JMenuItem jMbuscarComida;
    private javax.swing.JMenuItem jMbuscarPaciente;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMformularioPaciente;
    private javax.swing.JMenuItem jMhistorialPaciente;
    private javax.swing.JMenuItem jMlistarPacientes;
    private javax.swing.JMenuItem jMmodificarDieta;
    private javax.swing.JMenuItem jMregistrarConsulta;
    private javax.swing.JMenuItem jMregistrarDieta;
    // End of variables declaration//GEN-END:variables

}
