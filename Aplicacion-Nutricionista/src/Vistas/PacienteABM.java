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

        buttonGroup1 = new javax.swing.ButtonGroup();
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
        jLabel5 = new javax.swing.JLabel();
        jRActivoSi = new javax.swing.JRadioButton();
        jRActivoNo = new javax.swing.JRadioButton();
        jBeliminar = new javax.swing.JButton();

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
        jBhistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBhistorialActionPerformed(evt);
            }
        });

        jBmodificar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBmodificar.setText("Modificar");
        jBmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmodificarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Activo:");

        jRActivoSi.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(jRActivoSi);
        jRActivoSi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRActivoSi.setText("Si");

        jRActivoNo.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(jRActivoNo);
        jRActivoNo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRActivoNo.setText("No");

        jBeliminar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBeliminar.setText("Eliminar");
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel5)
                                .addGap(125, 125, 125)
                                .addComponent(jRActivoSi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRActivoNo)
                                .addGap(46, 46, 46))
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
                                    .addComponent(jTFdocumento))))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jBhistorial)
                        .addGap(34, 34, 34)
                        .addComponent(jBmodificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBeliminar)
                        .addGap(28, 28, 28)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jBnuevo, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jBbuscar, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jBsalir))
                .addGap(77, 77, 77))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLdni))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLnombre)
                    .addComponent(jTFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
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
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRActivoNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRActivoSi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBhistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBeliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
        PacienteData pacientedata = new PacienteData();
        String[] datos=new String[2];
        
        try {
            dni = Integer.parseInt(jTFdocumento.getText());
            paciente = pacientedata.buscarPacientePorDni(dni);
            if (!"".equals(jTFdocumento.getText()) && paciente != null) {
                jTFapellido.setText(paciente.getApellido());
                jTFnombre.setText(paciente.getNombre());
                jTFdireccion.setText(paciente.getDomicilio());
                jTFcelular.setText(Integer.toString(paciente.getCelular()));
               datos[0]=paciente.getNombre();
                datos[1]=paciente.getApellido();
                if (paciente.isEstado()) {
                    jRActivoSi.setSelected(true);
                } else {
                    jRActivoNo.setSelected(true);
                }

            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Verifique los datos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jBnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevoActionPerformed
        //if (!validarString()) {
        PacienteData pacienteData = new PacienteData();
        if (!"".equals(jTFdocumento.getText()) && !"".equals(jTFnombre.getText()) && !"".equals(jTFapellido.getText()) && jTFdireccion != null) {

            try {
                dni = Integer.parseInt(jTFdocumento.getText());
                int celular = Integer.parseInt(jTFcelular.getText());
                if (jRActivoSi.isSelected()) {
                    Paciente pacienteNuevo = new Paciente(jTFnombre.getText(), jTFapellido.getText(), dni, jTFdireccion.getText(), celular, true);
                    pacienteData.guardarPaciente(pacienteNuevo);
                }
                if (jRActivoNo.isSelected()) {
                    Paciente pacienteNuevo = new Paciente(jTFnombre.getText(), jTFapellido.getText(), dni, jTFdireccion.getText(), celular, true);
                    pacienteData.guardarPaciente(pacienteNuevo);
                }

                limpiarCampos();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Datos invalidos.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos.");
        }
        //} else {
        //    JOptionPane.showMessageDialog(this, "Verifique los datos", "ERROR", JOptionPane.ERROR_MESSAGE);
        // }
    }//GEN-LAST:event_jBnuevoActionPerformed

    private void jBhistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBhistorialActionPerformed
        // TODO add your handling code here:
        HistorialDePaciente  envia = new HistorialDePaciente();
        envia.setVisible(true);
        String info= jTFnombre.getText();
        String info2=jTFapellido.getText();
        envia.jTFrecibirnombre.setText(info);
        envia.jTFrecibirapellido.setText(info2);
       // HistorialDePaciente recibir = new HistorialDePaciente();
        NutricionistaEscritorio.jDescritorio.add(envia);
       
        
         //envia.setVisible(true);
      // jTFnombre.setText("");
       //jTFapellido.setText("");
      
        

    }//GEN-LAST:event_jBhistorialActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        // TODO add your handling code here:
        PacienteData pacienteData = new PacienteData();
        try {
            Paciente pacienteAEliminar = pacienteData.buscarPacientePorDni(Integer.parseInt(jTFdocumento.getText()));

            int idPaciente = pacienteAEliminar.getIdPaciente();

            int opcion = JOptionPane.showConfirmDialog(null, "Se dara de baja el alumno seleccionado", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                pacienteData.eliminarPaciente(idPaciente);
            }

            limpiarCampos();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un documento y buscar el alumno para eliminar.");
        }
    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jBmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmodificarActionPerformed
        PacienteData pacienteData = new PacienteData();

        // if (!validarString()) {
        if (verificarCampos()) {

            paciente.setDni(Integer.parseInt(jTFdocumento.getText()));
            paciente.setApellido(jTFapellido.getText());
            paciente.setNombre(jTFnombre.getText());
            paciente.setDomicilio(jTFdireccion.getText());
            paciente.setCelular(Integer.parseInt(jTFcelular.getText()));
            if (jRActivoSi.isSelected()) {
                paciente.setEstado(true);
            } else if (jRActivoNo.isSelected()) {
                paciente.setEstado(false);
            }
            pacienteData.modificarPaciente(paciente);

            limpiarCampos();

            JOptionPane.showMessageDialog(this, "Verifique los datos", "ERROR", JOptionPane.ERROR_MESSAGE);
        } // TODO add your handling code here:
    }//GEN-LAST:event_jBmodificarActionPerformed
    public boolean verificarCampos() {
        //boolean bm = getSelection();
        try {
            dni = Integer.parseInt(jTFdocumento.getText());
            int celular = Integer.parseInt(jTFcelular.getText());
            if ((!"".equals(jTFapellido.getText()) && !"".equals(jTFnombre.getText()))
                    && jTFdireccion.getText() != null && dni != 0 && celular != 0) { //(jRActivoNo.isSelected() || jRActivoSi.isSelected())
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Debe completar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un documento valido");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    /*  public boolean validarString() {
        boolean vacio;
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

            //JOptionPane.showMessageDialog(null," debes ingresar los datos correctamente");
        }
        return vacio = true;
    }*/
    public void limpiarCampos() {
        jTFdocumento.setText("");
        jTFapellido.setText("");
        jTFnombre.setText("");
        jTFcelular.setText("");
        jTFdireccion.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBhistorial;
    private javax.swing.JButton jBmodificar;
    private javax.swing.JButton jBnuevo;
    private javax.swing.JButton jBsalir;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLapellido;
    private javax.swing.JLabel jLcelular;
    private javax.swing.JLabel jLdireccion;
    private javax.swing.JLabel jLdni;
    private javax.swing.JLabel jLnombre;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRActivoNo;
    private javax.swing.JRadioButton jRActivoSi;
    public static javax.swing.JTextField jTFapellido;
    private javax.swing.JTextField jTFcelular;
    private javax.swing.JTextField jTFdireccion;
    private javax.swing.JTextField jTFdocumento;
    public static javax.swing.JTextField jTFnombre;
    // End of variables declaration//GEN-END:variables
}
