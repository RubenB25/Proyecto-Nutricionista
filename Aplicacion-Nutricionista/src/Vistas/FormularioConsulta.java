package Vistas;

import AccesoDatos.DietaData;
import AccesoDatos.HistorialData;
import AccesoDatos.PacienteData;
import Entidades.Dieta;
import Entidades.Historial;
import Entidades.Historialtest;
import Entidades.Paciente;
import static Vistas.NutricionistaEscritorio.jDPescritorio;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.plaf.TableUI;
import javax.swing.table.DefaultTableModel;

public class FormularioConsulta extends javax.swing.JInternalFrame {

    Consulta consultaHistorial;
private DefaultTableModel model;


    public FormularioConsulta() {
        initComponents();
        consultaHistorial = new Consulta();
        comboPaciente();
        SimpleDateFormat fechaFormateada = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaActual = new Date();
        String fecha = fechaFormateada.format(fechaActual);
        jTfechaActual.setText(fecha);
     
    }

    public static double pesoActual, estatura;
    public static int idpaciente;
    public static String nombreyApellido;
    public static LocalDate fecha;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jBmedida = new javax.swing.JButton();
        jBimc = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBNuevo = new javax.swing.JButton();
        jCbpaciente = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTpesoActual = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTestatura = new javax.swing.JTextField();
        jLresultado1 = new javax.swing.JLabel();
        jLid = new javax.swing.JLabel();
        jTfechaActual = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMedidas = new javax.swing.JTable();

        setClosable(true);
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

        tablaMedidas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(tablaMedidas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTestatura, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                    .addComponent(jTpesoActual)
                                    .addComponent(jTfechaActual))
                                .addGap(89, 89, 89)
                                .addComponent(jBNuevo))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(272, 272, 272)
                                        .addComponent(jBmedida))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(120, 120, 120)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jBimc)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLresultado1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(20, 20, 20))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(52, 52, 52)
                        .addComponent(jCbpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBNuevo)
                        .addComponent(jTfechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTpesoActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBmedida)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTestatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLid, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBimc)
                            .addComponent(jLabel1)))
                    .addComponent(jLresultado1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        FormularioPaciente fp = new FormularioPaciente();
        jDPescritorio.removeAll();
        jDPescritorio.repaint();
        jDPescritorio.add(fp);
        fp.moveToFront();
        fp.setVisible(true);
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBmedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmedidaActionPerformed
        HistorialData hd = new HistorialData();
        Paciente pacienteSeleccionado = (Paciente) jCbpaciente.getSelectedItem();
        idpaciente = pacienteSeleccionado.getIdPaciente();
        pesoActual = Double.parseDouble(jTpesoActual.getText());
        nombreyApellido = pacienteSeleccionado.getNombre() + " " + pacienteSeleccionado.getApellido();
        if (jTpesoActual.getText().isEmpty() || jTestatura.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debes cargar los datos en todos los campos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                Consulta cons = new Consulta();
                jDPescritorio.removeAll();
                jDPescritorio.repaint();
                jDPescritorio.add(cons);
                cons.moveToFront();
                cons.setVisible(true);
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
                jLresultado1.setText("Delgadez");
            } else if (imc > 18.9 && imc < 25) {
                jLresultado1.setText("Normal");
            } else if (imc > 25 && imc < 29.99) {
                jLresultado1.setText("Sobrepeso");
            } else if (imc > 30 && imc < 45) {
                jLresultado1.setText("Obesidad");
            } else if (imc > 45) {
                jLresultado1.setText("Obesidad Morbida");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "tiene un error por no ingresar valor numerico en las opciones de altura y peso," + e);
        }
    }//GEN-LAST:event_jBimcActionPerformed

    private void comboPaciente() {
        PacienteData pd = new PacienteData();
        ArrayList<Paciente> pacientes = pd.listarPaciente();
        Paciente seleccionarPaciente = new Paciente("-1", "- Seleccione un Paciente -");
        jCbpaciente.insertItemAt(seleccionarPaciente, 0);
        for (Paciente pac : pacientes) {
            jCbpaciente.addItem(pac);
        }
    }

    private void jCbpacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbpacienteActionPerformed
     
        if (jCbpaciente.getItemCount() > 0) {
            Paciente pacienteSeleccionado = (Paciente) jCbpaciente.getSelectedItem();
            if (pacienteSeleccionado != null) {
                idpaciente = pacienteSeleccionado.getIdPaciente();
                llenarTablaMedidas(idpaciente);
                try {
                   
                } catch (Exception e) {
                }
            } else {
                JOptionPane.showMessageDialog(null, "No pudiste acceder a la base para traer los datos ");
            }
        }
    }//GEN-LAST:event_jCbpacienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBNuevo;
    public static javax.swing.JButton jBimc;
    private javax.swing.JButton jBmedida;
    private javax.swing.JComboBox<Paciente> jCbpaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLid;
    private javax.swing.JLabel jLresultado1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTestatura;
    private javax.swing.JTextField jTfechaActual;
    public static javax.swing.JTextField jTpesoActual;
    public static javax.swing.JTable tablaMedidas;
    // End of variables declaration//GEN-END:variables
 
    
    private void llenarTablaMedidas(int id) {
    HistorialData historialData = new HistorialData();
 ArrayList<Historial> historialPaciente = historialData.obtenerHistorialdePaciente(idpaciente);
        for (Historial paHistorial : historialPaciente ) {
            model.addRow(new Object[]{
                paHistorial.getCuello(),
                paHistorial.getBusto(),
                paHistorial.getBrazo(),
                paHistorial.getCintura(),
                paHistorial.getCadera(),
                paHistorial.getPierna(),
                paHistorial.getFechaRegistro()
            });
        }

        JScrollPane scrollPane = new JScrollPane(tablaMedidas);

    }
}

//     DefaultTableModel model = new DefaultTableModel();
//     JTable = new JTable().getModel(tablaMedidas);
// }
//        HistorialData historialData = new HistorialData();
//        int idPaciente = id;
//        // Obtener el historial de medidas para el paciente con el ID proporcionado
//        ArrayList<Historial> medidas = historialData.obtenerHistorialdePaciente(idPaciente);
//        
//        tablaMedidas.getModel();
//        
//        for (Historial paHistorial : medidas) {
//            model.addRow(new Object[]{
//                paHistorial.getCuello(),
//                paHistorial.getBusto(),
//                paHistorial.getBrazo(),
//                paHistorial.getCintura(),
//                paHistorial.getCadera(),
//                paHistorial.getPierna(),
//                paHistorial.getFechaRegistro()
//            });
//        }
//        
//}
