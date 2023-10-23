package Vistas;

import AccesoDatos.DietaData;
import AccesoDatos.HistorialData;
import AccesoDatos.PacienteData;
import Entidades.Dieta;
import Entidades.Historialtest;
import Entidades.Paciente;
import static Vistas.NutricionistaEscritorio.jDPescritorio;
import java.awt.Dimension;
import java.util.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class FormularioConsulta extends javax.swing.JInternalFrame {

 Consulta  ch;

    public FormularioConsulta() {
        initComponents();
        ch=new Consulta();
        comboPaciente();    
    }
    
    public static String pa;
    public static int idpf;
public static String nya;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jDCfechaConsulta = new com.toedter.calendar.JDateChooser();
        jBmedida = new javax.swing.JButton();
        jBimc = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBNuevo = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jCbpaciente = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTpesoActual = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTestatura = new javax.swing.JTextField();
        jLresultado1 = new javax.swing.JLabel();
        jLid = new javax.swing.JLabel();

        setTitle("Formulario Consulta");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Fecha consulta:");

        jBmedida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBmedida.setText("MEDIDA");
        jBmedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmedidaActionPerformed(evt);
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

        jBNuevo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBNuevo.setText("NUEVA");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
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
        jCbpaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbpacienteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Paciente");

        jLabel3.setText("Peso Actual:");

        jLabel4.setText("Estatura:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBimc)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLresultado1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBsalir))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(39, 39, 39)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jDCfechaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jBNuevo))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTestatura, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                            .addComponent(jTpesoActual, javax.swing.GroupLayout.Alignment.LEADING))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(272, 272, 272)
                                    .addComponent(jBmedida)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(52, 52, 52)
                        .addComponent(jCbpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jCbpaciente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(jDCfechaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBNuevo))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTpesoActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBmedida)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTestatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jLid, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBimc)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLresultado1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(jBsalir)
                        .addGap(117, 117, 117))))
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


    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
     FormularioPaciente fp= new FormularioPaciente();
     
        jDPescritorio.removeAll();
        jDPescritorio.repaint();
        jDPescritorio.add(fp);
        fp.moveToFront();
        fp.setVisible(true);
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBmedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmedidaActionPerformed
        HistorialData hd = new HistorialData();
        Paciente pacienteSeleccionado = (Paciente) jCbpaciente.getSelectedItem();
        idpf = pacienteSeleccionado.getIdPaciente();
        pa = jTpesoActual.getText();
        nya=pacienteSeleccionado.getNombre() + " " + pacienteSeleccionado.getApellido();
        if (pa.isEmpty() || jTestatura.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Debes cargar los datos en todos los campos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
    } else {
        try {
            Consulta ch = new Consulta();
            jDPescritorio.removeAll();
            jDPescritorio.repaint();
            jDPescritorio.add(ch);
            ch.moveToFront();
            ch.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al abrir la vista Consulta: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_jBmedidaActionPerformed
    
    private void jBimcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBimcActionPerformed
        try {
            double peso = Double.parseDouble(jTpesoActual.getText());
            double altura = Double.parseDouble(jTestatura.getText());
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
    private void comboPaciente() {
        PacienteData pd = new PacienteData();
        ArrayList<Paciente> pacientes = pd.listarPaciente();
    Paciente seleccionarPaciente = new Paciente("-1","- Seleccione un Paciente -");
    jCbpaciente.insertItemAt(seleccionarPaciente,0);

        for (Paciente pac : pacientes) {
            jCbpaciente.addItem(pac);
        }    }
    private void jCbpacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbpacienteActionPerformed

        Paciente pacienteSeleccionado = (Paciente) jCbpaciente.getSelectedItem();
     int    idps = pacienteSeleccionado.getIdPaciente();
   String dato= String.valueOf(pacienteSeleccionado.getEstatura());
     jTestatura.setText(dato);
        System.out.println(" paciente seleccionado " + idps + " y la estatura es  "+ dato);
    }//GEN-LAST:event_jCbpacienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBNuevo;
    public static javax.swing.JButton jBimc;
    private javax.swing.JButton jBmedida;
    private javax.swing.JButton jBsalir;
    private javax.swing.JComboBox<Paciente> jCbpaciente;
    private com.toedter.calendar.JDateChooser jDCfechaConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLid;
    private javax.swing.JLabel jLresultado1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTestatura;
    public static javax.swing.JTextField jTpesoActual;
    // End of variables declaration//GEN-END:variables
}
