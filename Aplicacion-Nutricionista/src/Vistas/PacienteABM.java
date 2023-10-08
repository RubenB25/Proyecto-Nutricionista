package Vistas;

import AccesoDatos.PacienteData;
import Entidades.Paciente;
import java.sql.Date;
import java.time.ZoneId;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;

/**
 *
 * @author User2021SD
 */
public class PacienteABM extends javax.swing.JInternalFrame {

    boolean contieneNumero = false;
    private Paciente paciente;
    private int dni;

    public PacienteABM() {
        initComponents();
        paciente = new Paciente();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLdni = new javax.swing.JLabel();
        jLnombre = new javax.swing.JLabel();
        jLapellido = new javax.swing.JLabel();
        jLdireccion = new javax.swing.JLabel();
        jLcelular = new javax.swing.JLabel();
        jTFcelular = new javax.swing.JTextField();
        jTFdireccion = new javax.swing.JTextField();
        jTFapellido = new javax.swing.JTextField();
        jTFnombre = new javax.swing.JTextField();
        jTFdocumento = new javax.swing.JTextField();
        jBsalir = new javax.swing.JButton();
        jBnuevo = new javax.swing.JButton();
        jBbuscar = new javax.swing.JButton();
        jBhistorial = new javax.swing.JButton();
        jBmodificar = new javax.swing.JButton();

        setTitle("Formulario Paciente");
        setPreferredSize(new java.awt.Dimension(500, 477));

        jPanel1.setForeground(new java.awt.Color(0, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 477));

        jLdni.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLdni.setText("DNI:");

        jLnombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLnombre.setText("Nombre:");

        jLapellido.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLapellido.setText("Apellido:");

        jLdireccion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLdireccion.setText("Direccion:");

        jLcelular.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLcelular.setText("Celular:");

        jTFcelular.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTFdireccion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTFapellido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTFnombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTFdocumento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jBsalir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jBnuevo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBnuevo.setText("Nuevo");
        jBnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnuevoActionPerformed(evt);
            }
        });

        jBbuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBbuscar.setText("Buscar");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jBhistorial.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBhistorial.setText("Historial");

        jBmodificar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBmodificar.setText("Modificar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLcelular)
                    .addComponent(jLdireccion)
                    .addComponent(jLapellido)
                    .addComponent(jLnombre)
                    .addComponent(jLdni))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFnombre)
                    .addComponent(jTFapellido)
                    .addComponent(jTFdireccion)
                    .addComponent(jTFcelular)
                    .addComponent(jTFdocumento))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBnuevo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBbuscar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(77, 77, 77))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jBhistorial)
                .addGap(73, 73, 73)
                .addComponent(jBmodificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(jBsalir)
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLdni))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLnombre)
                    .addComponent(jTFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLapellido)
                    .addComponent(jTFapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLdireccion)
                    .addComponent(jTFdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLcelular)
                    .addComponent(jTFcelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBhistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed

        PacienteData paciente = new PacienteData();
        try {
            dni = Integer.parseInt(jTFdocumento.getText());

            Paciente pacienteObtenido = paciente.buscarPacientePorDni(dni);
            if (pacienteObtenido != null) {
                if (!"".equals(jTFdocumento.getText()) && paciente != null) {
                    jTFapellido.setText(pacienteObtenido.getApellido());
                    jTFnombre.setText(pacienteObtenido.getNombre());
                    // jTFdireccion.setText(pacienteObtenido.getDomicilio());
                    jTFcelular.setText(pacienteObtenido.getCelular() + "");
                    jTFdireccion.setText(pacienteObtenido.getDomicilio());
                    /*   Integer.parseInt.(jTFcelular.g;
                if (paciente.isEstado() == true) {
                }*/
                }
            }
            JOptionPane.showMessageDialog(null, " No hay ningun paciente con ese dni, cree un formulario para el nuevo paciente");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El dni no es valido coloque uno vigente " + e);
        }
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jBnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevoActionPerformed
        if (!validarString()) {
            PacienteData paciente = new PacienteData();
            if (!"".equals(jTFdocumento.getText()) && !"".equals(jTFnombre.getText()) && !"".equals(jTFapellido.getText()) != null) {

                try {
                    dni = Integer.parseInt(jTFdocumento.getText());
                    if (jRActivoSi.isSelected()) {
                        Alumno alumnoNuevo = new Alumno(dni, jTFapellido.getText(), jTFnombre.getText(), jDCfechaNacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), true);
                        alumnoData.guardarAlumno(alumnoNuevo);
                    }
                    if (jRActivoNo.isSelected()) {
                        Alumno alumnoNuevo = new Alumno(dni, jTFapellido.getText(), jTFnombre.getText(), jDCfechaNacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), false);
                        alumnoData.guardarAlumno(alumnoNuevo);
                    }

                    limpiarCampos();
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Datos invalidos.");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos.");

        }else {
            JOptionPane.showMessageDialog(this, "Verifique los datos", "ERROR", JOptionPane.ERROR_MESSAGE);
      }      // TODO add your handling code here:
    }//GEN-LAST:event_jBnuevoActionPerformed
    public boolean validarString() {

        String inputA = jTFapellido.getText();
        String inputN = jTFnombre.getText() + inputA;
        if (!inputN.isEmpty()) {
            for (char c : inputN.toCharArray()) {
                if (Character.isDigit(c)) {
                    contieneNumero = true;
                    break;
                } else {
                    contieneNumero = false;

                }

            }
        }
    }

    public void limpiarCampos() {
        jTFdocumento.setText("");
        jTFapellido.setText("");
        jTFnombre.setText("");
        jTFcelular.set jLFecha
        .setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBhistorial;
    private javax.swing.JButton jBmodificar;
    private javax.swing.JButton jBnuevo;
    private javax.swing.JButton jBsalir;
    private javax.swing.JLabel jLapellido;
    private javax.swing.JLabel jLcelular;
    private javax.swing.JLabel jLdireccion;
    private javax.swing.JLabel jLdni;
    private javax.swing.JLabel jLnombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFapellido;
    private javax.swing.JTextField jTFcelular;
    private javax.swing.JTextField jTFdireccion;
    private javax.swing.JTextField jTFdocumento;
    private javax.swing.JTextField jTFnombre;
    // End of variables declaration//GEN-END:variables
}
