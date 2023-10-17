package Vistas;

import AccesoDatos.HistorialData;
import AccesoDatos.PacienteData;
import Entidades.Historial;
import Entidades.Paciente;
import static Vistas.FormularioPaciente.texto;
import static Vistas.FormularioPaciente.texto2;
import static Vistas.FormularioPaciente.texto3;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class HistorialDePaciente extends javax.swing.JInternalFrame {

    public static String texto;
    public static String texto2;
    public static String texto3;
    private Object modelo;

    private Historial Historial;

    public HistorialDePaciente() {
        initComponents();
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jTrecibenombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTrecibeapellido = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTrecibedni = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTpesoinicio = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTaltura = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTpesodeseado = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTfechafin = new javax.swing.JTextField();
        jBimc = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jBmedida = new javax.swing.JButton();
        jBdieta = new javax.swing.JButton();
        jLresultado = new javax.swing.JLabel();
        jLresultado1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLFecha = new javax.swing.JLabel();
        jBGuardar = new javax.swing.JButton();
        jBbuscar = new javax.swing.JButton();

        setTitle("Consulta");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Nombre:");

        jTrecibenombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Apellido:");

        jTrecibeapellido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("D.N.I.:");

        jTrecibedni.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Peso Inicial:");

        jTpesoinicio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Altura:");

        jTaltura.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Peso Deseado:");

        jTpesodeseado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Fecha Fin:");

        jTfechafin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jBimc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBimc.setText("IMC");
        jBimc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBimcActionPerformed(evt);
            }
        });

        jBsalir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBsalir.setText("SALIR");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jBmedida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBmedida.setText("MEDIDA");
        jBmedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmedidaActionPerformed(evt);
            }
        });

        jBdieta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBdieta.setText("DIETA");
        jBdieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBdietaActionPerformed(evt);
            }
        });

        jLresultado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLresultado1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Usted tiene ");

        jLFecha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jBGuardar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBGuardar.setText("GUARDAR");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBbuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBbuscar.setText("BUSCAR");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jBimc)
                    .addComponent(jLabel14)
                    .addComponent(jLabel12)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel13)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTfechafin, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                        .addComponent(jTpesodeseado, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                        .addComponent(jTaltura, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLresultado1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBdieta)
                                        .addGap(29, 29, 29)
                                        .addComponent(jBsalir))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(jBGuardar))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(jLFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTrecibedni, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTrecibenombre, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTpesoinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTrecibeapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBmedida)
                            .addComponent(jBbuscar))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTrecibedni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBbuscar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTrecibenombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTrecibeapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBmedida))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTpesoinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTaltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jTpesodeseado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jTfechafin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 27, Short.MAX_VALUE)
                                .addComponent(jBimc))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLresultado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(2, 2, 2)))
                        .addGap(48, 48, 48))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jBGuardar)
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jBsalir)
                                        .addGap(26, 26, 26))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jBdieta)
                                        .addGap(27, 27, 27))))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBimcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBimcActionPerformed
        try {
            double peso = Double.parseDouble(jTpesoinicio.getText());
            double altura = Double.parseDouble(jTaltura.getText());
            double imc = peso / altura;

            if (imc < 18.9) {

                //jLresultado.setText("Tiene Delgadez");
                jLresultado1.setText("Delgadez");
            } else if (imc > 18.9 && imc < 25) {

                //jLresultado.setText("Tiene peso Normal");
                jLresultado1.setText("Normal");
            } else if (imc > 25 && imc < 29.99) {

                // jLresultado.setText("Sobrepeso");
                jLresultado1.setText("Sobrepeso");
            } else if (imc > 30 && imc < 45) {

                //jLresultado.setText("Tiene Obesidad morbida");
                jLresultado1.setText("Obesidad");
            }
            if (imc > 45) {

                // jLresultado.setText("Tiene Obesidad, se recomienda comenzar con dieta de descenso de peso inmediato para cuidar su salud");
                jLresultado1.setText("Obesidad Morbida");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "tiene un error por no ingresar valor numerico en las opciones de altura y peso," + e);
        }
    }//GEN-LAST:event_jBimcActionPerformed


    private void jBdietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBdietaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBdietaActionPerformed

    private void jBmedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmedidaActionPerformed

        texto = jTrecibenombre.getText();
        texto2 = jTrecibeapellido.getText();
        texto3 = jTrecibedni.getText();
        Consulta envia = new Consulta();
        envia.setVisible(true);
        this.setVisible(false);
        NutricionistaEscritorio.jDescritorio.add(envia);

    }//GEN-LAST:event_jBmedidaActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        // TODO add your handling code here:
        HistorialData pacien = new HistorialData();
        pacien.guardarHistorial(Historial);

    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
        PacienteData pacientedata = new PacienteData();
        HistorialData historial = new HistorialData();
        String[] datos = new String[2];

        try {
            int dni = Integer.parseInt(jTrecibedni.getText());
            Paciente paciente = pacientedata.buscarPacientePorDni(dni);
            int id = paciente.getIdPaciente();
            if (!"".equals(jTrecibedni.getText()) && paciente != null) {
                jTrecibeapellido.setText(paciente.getApellido());
                jTrecibenombre.setText(paciente.getNombre());
                //jTaltura.setText(historial.obtenerPacientePorHistorial(id));
                jTpesoinicio.setText(paciente.getPesoActual() + "");
                jTpesodeseado.setText(paciente.getPesoDeseado() + "");
                datos[0] = paciente.getNombre();
                datos[1] = paciente.getApellido();

            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Verifique los datos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jBbuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBdieta;
    public static javax.swing.JButton jBimc;
    private javax.swing.JButton jBmedida;
    private javax.swing.JButton jBsalir;
    private javax.swing.JLabel jLFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLresultado;
    private javax.swing.JLabel jLresultado1;
    private javax.swing.JTextField jTaltura;
    private javax.swing.JTextField jTfechafin;
    private javax.swing.JTextField jTpesodeseado;
    private javax.swing.JTextField jTpesoinicio;
    private javax.swing.JTextField jTrecibeapellido;
    private javax.swing.JTextField jTrecibedni;
    private javax.swing.JTextField jTrecibenombre;
    // End of variables declaration//GEN-END:variables
}
