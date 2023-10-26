
package Vistas;



import AccesoDatos.HistorialData;
import AccesoDatos.PacienteData;
import Entidades.Historial;
import Entidades.Paciente;
import java.util.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class FormularioConsulta extends javax.swing.JInternalFrame {

    public static String texto;
    public static String texto2;
    public static String texto3;
    private Object modelo;
    private int id;

    private Historial Historial;

    public FormularioConsulta() {
        initComponents();
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTrecibedni = new javax.swing.JTextField();
        jBbuscar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTrecibenombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTrecibeapellido = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTpesoinicio = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jDCfechaConsulta = new com.toedter.calendar.JDateChooser();
        jBmedida = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBimc = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBdieta = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();

        setTitle("Consulta");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Documento");

        jTrecibedni.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTrecibedni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTrecibedniActionPerformed(evt);
            }
        });

        jBbuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBbuscar.setText("BUSCAR");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Nombre:");

        jTrecibenombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Apellido:");

        jTrecibeapellido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Peso actual:");

        jTpesoinicio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Fecha consulta:");

        jBmedida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBmedida.setText("MEDIDA");
        jBmedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmedidaActionPerformed(evt);
            }
        });

        jBGuardar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBGuardar.setText("GUARDAR");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBimc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBimc.setText("IMC");
        jBimc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBimcActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Usted tiene ");

        jBdieta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBdieta.setText("DIETA");
        jBdieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBdietaActionPerformed(evt);
            }
        });

        jBsalir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBsalir.setText("SALIR");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBGuardar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel15))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTpesoinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTrecibeapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTrecibedni, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTrecibenombre, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jBbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jBimc)
                                        .addComponent(jDCfechaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jBsalir))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jBdieta)
                                        .addGap(40, 40, 40)
                                        .addComponent(jBmedida)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTrecibedni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTrecibenombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTrecibeapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTpesoinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jDCfechaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBdieta)
                    .addComponent(jBmedida)
                    .addComponent(jBimc))
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGuardar)
                    .addComponent(jBsalir))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jBdietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBdietaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBdietaActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBmedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmedidaActionPerformed

//        texto = jTrecibenombre.getText();
//        texto2 = jTrecibeapellido.getText();
//        texto3 = jTrecibedni.getText();
//        HistorialConsulta envia = new HistorialConsulta();
//        envia.setVisible(true);
//        this.setVisible(false);
//        NutricionistaEscritorio.jDescritorio.add(envia);
    }//GEN-LAST:event_jBmedidaActionPerformed

    private void jBimcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBimcActionPerformed
        //        try {
            //            double peso = Double.parseDouble(jTpesoinicio.getText());
            //            double altura = Double.parseDouble(jTaltura.getText());
            //            double imc = peso / altura;
            //
            //            if (imc < 18.9) {
                //
                //                //jLresultado.setText("Tiene Delgadez");
                //                jLresultado1.setText("Delgadez");
                //            } else if (imc > 18.9 && imc < 25) {
                //
                //                //jLresultado.setText("Tiene peso Normal");
                //                jLresultado1.setText("Normal");
                //            } else if (imc > 25 && imc < 29.99) {
                //
                //                // jLresultado.setText("Sobrepeso");
                //                jLresultado1.setText("Sobrepeso");
                //            } else if (imc > 30 && imc < 45) {
                //
                //                //jLresultado.setText("Tiene Obesidad morbida");
                //                jLresultado1.setText("Obesidad");
                //            }
            //            if (imc > 45) {
                //
                //                // jLresultado.setText("Tiene Obesidad, se recomienda comenzar con dieta de descenso de peso inmediato para cuidar su salud");
                //                jLresultado1.setText("Obesidad Morbida");
                //            }
            //        } catch (NumberFormatException e) {
            //            JOptionPane.showMessageDialog(null, "tiene un error por no ingresar valor numerico en las opciones de altura y peso," + e);
            //        }
    }//GEN-LAST:event_jBimcActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        HistorialData historialPaciente = new HistorialData();
        double pesoActual = Double.parseDouble(jTpesoinicio.getText());
        LocalDate fechaConsulta = jDCfechaConsulta.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
        historialPaciente.guardarHistorial(id, fechaConsulta, pesoActual);
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
        PacienteData pacienteData = new PacienteData();
        HistorialData historial = new HistorialData();
        String[] datos = new String[2];

        try {
            String dni = jTrecibedni.getText();
            Paciente paciente = pacienteData.buscarPacientePorDni(dni);
            id = paciente.getIdPaciente();
            if (!"".equals(jTrecibedni.getText()) && paciente != null) {
                jTrecibeapellido.setText(paciente.getApellido());
                jTrecibenombre.setText(paciente.getNombre());
                //jTaltura.setText(historial.obtenerPacientePorHistorial(id));
                //jTpesoinicio.setText(String.valueOf(paciente.getPesoActual()));
                //jTpesodeseado.setText(String.valueOf(paciente.getPesoDeseado()));
                datos[0] = paciente.getNombre();
                datos[1] = paciente.getApellido();

            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Verifique los datos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jTrecibedniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTrecibedniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTrecibedniActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBdieta;
    public static javax.swing.JButton jBimc;
    private javax.swing.JButton jBmedida;
    private javax.swing.JButton jBsalir;
    private com.toedter.calendar.JDateChooser jDCfechaConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTpesoinicio;
    private javax.swing.JTextField jTrecibeapellido;
    private javax.swing.JTextField jTrecibedni;
    private javax.swing.JTextField jTrecibenombre;
    // End of variables declaration//GEN-END:variables
}
