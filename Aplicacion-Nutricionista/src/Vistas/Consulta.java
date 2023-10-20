package Vistas;

import AccesoDatos.DietaData;
import AccesoDatos.HistorialData;
import AccesoDatos.PacienteData;
import Entidades.Dieta;
import Entidades.Historial;
import Entidades.Historialtest;
import Entidades.Paciente;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Consulta extends javax.swing.JInternalFrame {

    FormularioConsulta envia = new FormularioConsulta();
    DefaultTableModel model;

    public Consulta() {
        initComponents();
        comboDieta();
        llenarTabla();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMedidas = new javax.swing.JTable();
        jDcalendario = new com.toedter.calendar.JDateChooser();
        jBnuevo = new javax.swing.JButton();
        jBagregardatos = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTpesoactual = new javax.swing.JTextField();
        jCbDIETA = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTpaciente = new javax.swing.JTable();

        setTitle("Historial de Consulta");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tablaMedidas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tablaMedidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cuello", "Busto", "Brazo", "Cintura", "Cadera", "Pierna", "Estatura"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaMedidas);
        if (tablaMedidas.getColumnModel().getColumnCount() > 0) {
            tablaMedidas.getColumnModel().getColumn(0).setResizable(false);
            tablaMedidas.getColumnModel().getColumn(1).setResizable(false);
            tablaMedidas.getColumnModel().getColumn(2).setResizable(false);
            tablaMedidas.getColumnModel().getColumn(3).setResizable(false);
            tablaMedidas.getColumnModel().getColumn(4).setResizable(false);
            tablaMedidas.getColumnModel().getColumn(5).setResizable(false);
            tablaMedidas.getColumnModel().getColumn(6).setResizable(false);
        }

        jBnuevo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBnuevo.setText("Nuevo");
        jBnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnuevoActionPerformed(evt);
            }
        });

        jBagregardatos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBagregardatos.setText("AGREGAR DATOS");
        jBagregardatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBagregardatosActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Peso Actual:");

        jLabel7.setText("DIETA");

        jTpesoactual.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel4.setText("Fecha Consulta:");

        jTpaciente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTpaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Nombre", "apellido", "DNI"
            }
        ));
        jScrollPane2.setViewportView(jTpaciente);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCbDIETA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBnuevo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(296, 296, 296))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jDcalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(359, 359, 359)))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jBagregardatos))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTpesoactual, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jDcalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTpesoactual, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(109, 109, 109)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jCbDIETA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jBagregardatos)
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jBnuevo)
                        .addGap(185, 185, 185))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(438, 438, 438)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBagregardatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBagregardatosActionPerformed
        DefaultTableModel model = (DefaultTableModel) tablaMedidas.getModel();

        //  int id = pacienteSeleccionado.getIdPaciente();
        int rowCount = model.getRowCount();
        if (rowCount > 0) {
            HistorialData historialPaciente = new HistorialData();
            Paciente pacienteSeleccionado = new Paciente();
            int idDieta = jCbDIETA.getSelectedIndex();
            int id = pacienteSeleccionado.getIdPaciente();
            LocalDate fechaRegistro = jDcalendario.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            double pesoActual = Double.parseDouble(jTpesoactual.getText());

            // Recorre las filas de la tabla de medidas y guarda los datos en la tabla de historial
            for (int i = 0; i < rowCount; i++) {
                double cuello = (double) model.getValueAt(i, 0);
                double busto = (double) model.getValueAt(i, 1);
                double cintura = (double) model.getValueAt(i, 2);
                double brazo = (double) model.getValueAt(i, 3);
                double cadera = (double) model.getValueAt(i, 4);
                double pierna = (double) model.getValueAt(i, 5);
                double estatura = (double) model.getValueAt(i, 6);

                Historial historial = new Historial(id, cuello, busto, cintura, brazo, cadera, pierna, estatura, idDieta, pesoActual, fechaRegistro);
                // Luego, guarda los datos en la tabla de historial
                historialPaciente.nuevoHistorial(historial);
            }

            // Aquí puedes mostrar un mensaje de éxito o realizar otras acciones necesarias
            JOptionPane.showMessageDialog(null, "Datos guardados con éxito");
        } else {
            JOptionPane.showMessageDialog(null, "La tabla de medidas está vacía.");
        }

    }

    private void comboDieta() {
        DietaData dieta = new DietaData();
        ArrayList<Dieta> dietas = new ArrayList<>();
        dietas = dieta.listarDietas();
        for (Dieta dietaIndice : dietas) {
            jCbDIETA.addItem(dietaIndice);
        }

    }

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }//GEN-LAST:event_jBagregardatosActionPerformed

    private void jBnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevoActionPerformed

        FormularioConsulta envia = new FormularioConsulta();
        envia.setVisible(true);
        this.setVisible(false);
        //NutricionistaEscritorio.jDescritorio.add(envia);
    }//GEN-LAST:event_jBnuevoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBagregardatos;
    private javax.swing.JButton jBnuevo;
    private javax.swing.JComboBox<Dieta> jCbDIETA;
    private com.toedter.calendar.JDateChooser jDcalendario;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTpaciente;
    private javax.swing.JTextField jTpesoactual;
    private javax.swing.JTable tablaMedidas;
    // End of variables declaration//GEN-END:variables

    private void llenarTabla() {
        PacienteData pacienteData = new PacienteData();
        model = (DefaultTableModel) jTpaciente.getModel();
        ArrayList<Paciente> pacientes = new ArrayList<>();
        pacientes = pacienteData.listarPaciente();
        for (Paciente pacientelista : pacientes) {
            model.addRow(new Object[]{pacientelista.getNombre(), pacientelista.getApellido(), pacientelista.getDni()});

        }
    }

    private void llenarTablamedidas() {
        HistorialData medidasData = new HistorialData();
        model = (DefaultTableModel) tablaMedidas.getModel();
        ArrayList<Historial> medidas = new ArrayList<>();
        medidas =(DefaultTableModel) medidasData.obtenerHistorial();
        for (Historial medidaslista : medidas) {
            model.addRow(new Object[]{medidaslista.getCuello(), medidaslista.getBusto(), medidaslista.getBrazo(), medidaslista.getCintura(), medidaslista.getCadera(), medidaslista.getPierna()});

        }
    }
}
