
package Vistas;



import AccesoDatos.DietaData;
import AccesoDatos.HistorialData;
import AccesoDatos.PacienteData;
import Entidades.Dieta;
import Entidades.Historialtest;
import Entidades.Paciente;
import java.util.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FormularioConsulta extends javax.swing.JInternalFrame {
//
//    public static String texto;
//    public static String texto2;
//    public static String texto3;
    private Object modelo;
    private int id;

    private Historialtest Historial;

    public FormularioConsulta() {
        initComponents();
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBbuscar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jDCfechaConsulta = new com.toedter.calendar.JDateChooser();
        jBmedida = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBimc = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBdieta = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jCbpaciente = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setTitle("Consulta");

        jBbuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBbuscar.setText("BUSCAR");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

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

        jCbpaciente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Paciente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBGuardar)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(39, 39, 39)
                                .addComponent(jDCfechaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(343, 343, 343)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBmedida)
                                    .addComponent(jBsalir)))
                            .addComponent(jBdieta)
                            .addComponent(jBimc)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(52, 52, 52)
                        .addComponent(jCbpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBbuscar)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(jCbpaciente, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDCfechaConsulta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addComponent(jBmedida)
                .addGap(34, 34, 34)
                .addComponent(jBGuardar)
                .addGap(18, 18, 18)
                .addComponent(jBimc)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jBsalir))
                .addGap(18, 18, 18)
                .addComponent(jBdieta)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
//                try {
//                        double peso = Double.parseDouble(jTpesoinicio.getText());
//                        double altura = Double.parseDouble(jTaltura.getText());
//                        double imc = peso / altura;
//            
//                        if (imc < 18.9) {
//                
//                                //jLresultado.setText("Tiene Delgadez");
//                                jLresultado1.setText("Delgadez");
//                            } else if (imc > 18.9 && imc < 25) {
//                
//                                //jLresultado.setText("Tiene peso Normal");
//                                jLresultado1.setText("Normal");
//                            } else if (imc > 25 && imc < 29.99) {
//                
//                                // jLresultado.setText("Sobrepeso");
//                                jLresultado1.setText("Sobrepeso");
//                            } else if (imc > 30 && imc < 45) {
//                
//                                //jLresultado.setText("Tiene Obesidad morbida");
//                                jLresultado1.setText("Obesidad");
//                            }
//                        if (imc > 45) {
//                
//                                // jLresultado.setText("Tiene Obesidad, se recomienda comenzar con dieta de descenso de peso inmediato para cuidar su salud");
//                                jLresultado1.setText("Obesidad Morbida");
//                            }
//                    } catch (NumberFormatException e) {
//                        JOptionPane.showMessageDialog(null, "tiene un error por no ingresar valor numerico en las opciones de altura y peso," + e);
//                    }
    }//GEN-LAST:event_jBimcActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
//        HistorialData historialPaciente = new HistorialData();
//        //double pesoActual = Double.parseDouble(jTpesoinicio.getText());
//        LocalDate fechaConsulta = jDCfechaConsulta.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//        
//        historialPaciente.guardarHistorial(id, fechaConsulta, pesoActual);
    }//GEN-LAST:event_jBGuardarActionPerformed
private void comboPaciente() {
     PacienteData pd = new PacienteData();
    ArrayList<Paciente> pacientes = pd.listarPaciente();
    for (Paciente pacI : pacientes) {
        jCbpaciente.addItem(pacI);
    }
     
   
        }
    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
//        PacienteData pacienteData = new PacienteData();
//        HistorialData historial = new HistorialData();
//        String[] datos = new String[2];
//
//        try {
//            String dni = jTrecibedni.getText();
//            Paciente paciente = pacienteData.buscarPacientePorDni(dni);
//            id = paciente.getIdPaciente();
//            if (!"".equals(jTrecibedni.getText()) && paciente != null) {
//                jTrecibeapellido.setText(paciente.getApellido());
//                jTrecibenombre.setText(paciente.getNombre());
//                //jTaltura.setText(historial.obtenerPacientePorHistorial(id));
//                //jTpesoinicio.setText(String.valueOf(paciente.getPesoActual()));
//                //jTpesodeseado.setText(String.valueOf(paciente.getPesoDeseado()));
//                datos[0] = paciente.getNombre();
//                datos[1] = paciente.getApellido();
//
//            }
//        } catch (NumberFormatException e) {
//            JOptionPane.showMessageDialog(this, "Verifique los datos", "ERROR", JOptionPane.ERROR_MESSAGE);
//        }
    }//GEN-LAST:event_jBbuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBdieta;
    public static javax.swing.JButton jBimc;
    private javax.swing.JButton jBmedida;
    private javax.swing.JButton jBsalir;
    private javax.swing.JComboBox<String> jCbpaciente;
    private com.toedter.calendar.JDateChooser jDCfechaConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
