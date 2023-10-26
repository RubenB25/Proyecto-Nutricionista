/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoDatos.DietaData;
import AccesoDatos.PacienteData;
import Entidades.Dieta;
import Entidades.Paciente;
import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import jdk.nashorn.internal.ir.ContinueNode;

/**
 *
 * @author Ruben
 */
public class RegistrarDieta extends javax.swing.JInternalFrame {

    private DietaData dieta = new DietaData();
    private ArrayList<Paciente> listaPacientes;
    private PacienteData pacienteData = new PacienteData();
    int contadorDePuntos = 0;
    char espacioAnterior = ' ';

    /**
     * Creates new form RegistrarDieta
     */
    public RegistrarDieta() {
        initComponents();
        llenarCB();

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBAgregarDieta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLNombreDieta = new javax.swing.JLabel();
        jLFechaInicio = new javax.swing.JLabel();
        jLFechaFinalizacion = new javax.swing.JLabel();
        jLPesoInicial = new javax.swing.JLabel();
        jDCInicio = new com.toedter.calendar.JDateChooser();
        JTextField textField = (JTextField) jDCInicio.getDateEditor().getUiComponent();

        textField.setEditable(false);
        textField.setFocusable(false);
        jDCFinalizacion = new com.toedter.calendar.JDateChooser();
        jTFNombreDieta = new javax.swing.JTextField();
        jTFPesoInicial = new javax.swing.JTextField();
        jCBListaPaciente = new javax.swing.JComboBox<>();
        jLPaciente = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jBAgregarDieta.setText("Agregar dieta");
        jBAgregarDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarDietaActionPerformed(evt);
            }
        });

        jLabel1.setText("Registrar dieta");

        jLNombreDieta.setText("Nombre Dieta:");

        jLFechaInicio.setText("Fecha Inicio:");

        jLFechaFinalizacion.setText("Fecha finalización:");

        jLPesoInicial.setText("Peso Inicial:");

        JTextField textFieldF = (JTextField) jDCFinalizacion.getDateEditor().getUiComponent();

        textFieldF.setEditable(false);
        textFieldF.setFocusable(false);

        jTFNombreDieta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFNombreDietaKeyTyped(evt);
            }
        });

        jTFPesoInicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFPesoInicialKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFPesoInicialKeyTyped(evt);
            }
        });

        jLPaciente.setText("Paciente");

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBAgregarDieta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLFechaInicio)
                                    .addComponent(jLNombreDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLFechaFinalizacion)
                                    .addComponent(jLPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLPesoInicial))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jCBListaPaciente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTFNombreDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jDCInicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jDCFinalizacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jTFPesoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBListaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFNombreDieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNombreDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jDCInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jDCFinalizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLFechaFinalizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFPesoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLPesoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAgregarDieta)
                    .addComponent(jButton1))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAgregarDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarDietaActionPerformed
        try {
            if (comprobaciones()) {
                Paciente pacienteCB = (Paciente) jCBListaPaciente.getSelectedItem();
                String nombre = jTFNombreDieta.getText();
                jTFPesoInicial.setText(jTFPesoInicial.getText().replaceAll(" ", ""));
                LocalDate fechaInicio = jDCInicio.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                LocalDate fechaFin = jDCFinalizacion.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                if (esTextoValido(nombre, jTFPesoInicial.getText())) {
                    double pesoInicial = Double.parseDouble(jTFPesoInicial.getText());
                    nombre.trim();
                    
                    Dieta nuevaDieta = new Dieta(nombre, pacienteCB, fechaInicio, fechaFin, pesoInicial, 0, true);
                    dieta.nuevaDieta(nuevaDieta);
                    limpiarCampos();
                } else {
                    throw new IllegalArgumentException("Valores no permitidos.");
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Los datos no coinciden.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException b) {
            JOptionPane.showMessageDialog(this, b.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBAgregarDietaActionPerformed


    private void jTFPesoInicialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFPesoInicialKeyReleased
        String stringPeso = jTFPesoInicial.getText();

        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_DELETE) {
            // Tecla de borrar detectada, restaura el contenido original
            jTFPesoInicial.setText(stringPeso);
        }


    }//GEN-LAST:event_jTFPesoInicialKeyReleased

    private void jTFNombreDietaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNombreDietaKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (!Character.isLetter(c) && !Character.isDigit(c) && c != ' ') {
            evt.consume(); // Consumir caracteres no válidos
        } else if (c == ' ' && espacioAnterior == ' ') {
            evt.consume(); // Consumir espacio adicional
        }

        espacioAnterior = c;
    }//GEN-LAST:event_jTFNombreDietaKeyTyped

    private void jTFPesoInicialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFPesoInicialKeyTyped
        // TODO add your handling code here:
        String pesoInicial = jTFPesoInicial.getText();
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != '.' && !Character.isWhitespace(c)) {
            evt.consume(); // Consumir caracteres no válidos
        }
        if (c == ' ' || (c == '.' && jTFPesoInicial.getText().contains("."))) {
            evt.consume();
        }
        if ((!pesoInicial.contains(".") && pesoInicial.length() >= 3) || (pesoInicial.contains(".") && pesoInicial.length() >= 5)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTFPesoInicialKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregarDieta;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<Paciente> jCBListaPaciente;
    private com.toedter.calendar.JDateChooser jDCFinalizacion;
    private com.toedter.calendar.JDateChooser jDCInicio;
    private javax.swing.JLabel jLFechaFinalizacion;
    private javax.swing.JLabel jLFechaInicio;
    private javax.swing.JLabel jLNombreDieta;
    private javax.swing.JLabel jLPaciente;
    private javax.swing.JLabel jLPesoInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFNombreDieta;
    private javax.swing.JTextField jTFPesoInicial;
    // End of variables declaration//GEN-END:variables

    private void llenarCB() {
        listaPacientes = pacienteData.listarPaciente();
        for (Paciente paciente : listaPacientes) {
            jCBListaPaciente.addItem(paciente);
        }
    }

    private boolean comprobaciones() {
        boolean todoCorrecto = true;

        try {
            String nombreDieta = jTFNombreDieta.getText();
            String pesoInicial = jTFPesoInicial.getText();
            Date fechaInicio = jDCInicio.getDate();
            Date fechaFinalizacion = jDCFinalizacion.getDate();

            if (nombreDieta.isEmpty() || pesoInicial.isEmpty() || fechaInicio == null || fechaFinalizacion == null) {
                throw new IllegalArgumentException("Verifique los campos.");
            } else if (nombreDieta.length() > 50 || pesoInicial.length() > 5) {
                throw new IllegalArgumentException("Valores fuera de limite.");
            }

            if (fechaInicio.after(fechaFinalizacion)) {
                throw new IllegalArgumentException("La fecha de inicio no puede ser posterior a la fecha de finalización.");
            }

            if (pesoInicial.startsWith(".") || pesoInicial.startsWith("0")) {
                throw new IllegalArgumentException("Verifique el campo peso inicial.");
            }

        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            todoCorrecto = false;
        }

        return todoCorrecto;
    }

    private void limpiarCampos() {
        jTFNombreDieta.setText("");
        jTFPesoInicial.setText("");
        jDCFinalizacion.setDate(null);
        jDCInicio.setDate(null);
    }

    private boolean esTextoValido(String nombreDieta, String pesoInicial) {
        boolean esNombreDietaValido = nombreDieta.matches("[a-zA-Z0-9 ]+");
        boolean esPesoInicialValido = pesoInicial.matches("[0-9]+(\\.[0-9]+)?");

        return esNombreDietaValido && esPesoInicialValido;
    }

}
