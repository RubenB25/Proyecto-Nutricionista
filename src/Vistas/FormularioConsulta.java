package Vistas;

import AccesoDatos.DietaData;
import AccesoDatos.HistorialData;
import AccesoDatos.PacienteData;
import Entidades.Dieta;
import Entidades.Historial;
import Entidades.Paciente;

import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormularioConsulta extends javax.swing.JInternalFrame {

    Double cuellopS, bustopS, brazoS, cinturaS, caderaS, piernaS, pesoActualS, variacionS;
    int idDieta, estaturaS;
    LocalDate fechaActual, fechaObtenida;
    boolean estado;

    private DefaultTableModel model;

    public FormularioConsulta() {
        initComponents();
        model = (DefaultTableModel) tablaMedidas.getModel();
        comboPaciente();

        SimpleDateFormat fechaFormateada = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaActual = new Date();
        String fecha = fechaFormateada.format(fechaActual);
        jTfechaActual1.setText(fecha);
        Paciente pacienteSeleccionado = (Paciente) jCbpaciente.getSelectedItem();
        idpaciente = pacienteSeleccionado.getIdPaciente();

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
        jCbpaciente = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTpesoActual = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTestatura = new javax.swing.JTextField();
        jTBusto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMedidas = new javax.swing.JTable();
        jBguardar = new javax.swing.JButton();
        jCbDIETA = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jTfechaActual1 = new javax.swing.JTextField();
        jTBrazo = new javax.swing.JTextField();
        jTCuello = new javax.swing.JTextField();
        jTCadera = new javax.swing.JTextField();
        jTPierna = new javax.swing.JTextField();
        jTCintura = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jBSalir = new javax.swing.JButton();

        setTitle("Formulario Consulta");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Fecha consulta:");

        jCbpaciente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCbpaciente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCbpacienteItemStateChanged(evt);
            }
        });
        jCbpaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbpacienteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Paciente");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Peso Actual:");

        jTpesoActual.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTpesoActual.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTpesoActualFocusLost(evt);
            }
        });
        jTpesoActual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTpesoActualKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTpesoActualKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Estatura:");

        jTestatura.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTestatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTestaturaActionPerformed(evt);
            }
        });
        jTestatura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTestaturaKeyTyped(evt);
            }
        });

        jTBusto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTBusto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTBustoKeyTyped(evt);
            }
        });

        tablaMedidas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tablaMedidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cuello", "Busto", "Brazo", "Cintura", "Cadera", "Pierna", "Fecha Registro", "Peso", "Estatura"
            }
        ));
        jScrollPane1.setViewportView(tablaMedidas);

        jBguardar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBguardar.setText("Guardar Consulta");
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });

        jCbDIETA.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCbDIETAItemStateChanged(evt);
            }
        });
        jCbDIETA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbDIETAActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Dietas del paciente");

        jTfechaActual1.setEditable(false);
        jTfechaActual1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTBrazo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTBrazo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTBrazoKeyTyped(evt);
            }
        });

        jTCuello.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTCuello.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTCuelloKeyTyped(evt);
            }
        });

        jTCadera.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTCadera.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTCaderaKeyTyped(evt);
            }
        });

        jTPierna.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTPierna.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTPiernaKeyTyped(evt);
            }
        });

        jTCintura.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTCintura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTCinturaKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Cuello:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Busto:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Brazo:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Cadera:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Pierna:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Cintura:");

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(1, 1, 1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTfechaActual1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTestatura, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                    .addComponent(jTpesoActual))
                                .addGap(86, 86, 86)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jTBrazo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(jCbpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(74, 74, 74)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCbDIETA, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTBusto, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTCuello, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(44, 44, 44)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10)))
                                    .addGap(44, 44, 44)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTCintura, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTPierna, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTCadera, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(48, 48, 48))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jBguardar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCbpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jCbDIETA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTfechaActual1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTCuello, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jTCadera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTpesoActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTBusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTPierna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTestatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTBrazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11)
                    .addComponent(jTCintura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBguardar)
                    .addComponent(jBSalir))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTCinturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCinturaKeyTyped
        validacionMedidas(evt, jTCintura.getText());
    }//GEN-LAST:event_jTCinturaKeyTyped

    private void jTPiernaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTPiernaKeyTyped
        validacionMedidas(evt, jTPierna.getText());

    }//GEN-LAST:event_jTPiernaKeyTyped

    private void jTCaderaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCaderaKeyTyped

        validacionMedidas(evt, jTCadera.getText());
    }//GEN-LAST:event_jTCaderaKeyTyped

//    }
    private void jTCuelloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCuelloKeyTyped
        validacionMedidas(evt, jTCuello.getText());
    }//GEN-LAST:event_jTCuelloKeyTyped

    private void jTBrazoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBrazoKeyTyped
        validacionMedidas(evt, jTBrazo.getText());
    }//GEN-LAST:event_jTBrazoKeyTyped


    private void jCbDIETAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbDIETAActionPerformed

    }//GEN-LAST:event_jCbDIETAActionPerformed

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
//       try {g
        DietaData dieta = new DietaData();
        Dieta dietaseleccionada = (Dieta) jCbDIETA.getSelectedItem();
        if ((dietaseleccionada.isEstado() == true) && dietaseleccionada != null) {
            int id = dietaseleccionada.getIdDieta();
            System.out.println(" id dieta" + id);

            // System.out.println(dieta.obtenerDietaDelPaciente(idpaciente));
            HistorialData historialData = new HistorialData();
            if (validaciones()) {
                Historial historialguarda = new Historial(id, cuellopS, bustopS, cinturaS, brazoS,
                        caderaS, piernaS, estaturaS, pesoActualS);
                //System.out.println(historialguarda.toString());
                historialData.nuevoHistorial(historialguarda);
                limpiarTabla();
                llenarTablaMedidas(id);
                limpiarTField();
            }
            if (fechaObtenida.isEqual(LocalDate.now()) && dietaseleccionada.isEstado()) {
                dieta.modificarDietaPorID(idDieta, pesoActualS);
                dieta.modificarEstadoDietaPorID(idDieta);
                JOptionPane.showMessageDialog(null, "Culminó la dieta.");
            }

        }


    }//GEN-LAST:event_jBguardarActionPerformed

    private void jTBustoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBustoKeyTyped
        validacionMedidas(evt, jTBusto.getText());
    }//GEN-LAST:event_jTBustoKeyTyped


    private void jTestaturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTestaturaKeyTyped

        validacionMedidas(evt, jTestatura.getText());
    }//GEN-LAST:event_jTestaturaKeyTyped

    private void jTestaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTestaturaActionPerformed
        // if (tablaMedidas.)
    }//GEN-LAST:event_jTestaturaActionPerformed

    private void jTpesoActualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTpesoActualKeyTyped
        String pesoInicial = jTpesoActual.getText();
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != '.' && !Character.isWhitespace(c)) {
            evt.consume(); // Consumir caracteres no válidos
        }
        if (c == ' ' || (c == '.' && jTpesoActual.getText().contains("."))) {
            evt.consume();
        }
        if ((!pesoInicial.contains(".") && pesoInicial.length() >= 3) || (pesoInicial.contains(".") && pesoInicial.length() >= 5)) {
            evt.consume();
        }

    }//GEN-LAST:event_jTpesoActualKeyTyped

    private void jCbpacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbpacienteActionPerformed


    }//GEN-LAST:event_jCbpacienteActionPerformed

    private void jCbpacienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCbpacienteItemStateChanged
        limpiarCombo();

        Paciente pacienteSeleccionado = (Paciente) jCbpaciente.getSelectedItem();
        idpaciente = pacienteSeleccionado.getIdPaciente();

        comboDieta();
        limpiarTField();
        limpiarTabla();

//            if (fechaObtenida.isEqual(LocalDate.now())) {
//                JOptionPane.showMessageDialog(null, "llegaste al final de tu dieta , guarda los datos ");
//
//            }

    }//GEN-LAST:event_jCbpacienteItemStateChanged

    private void jTpesoActualKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTpesoActualKeyReleased

    }//GEN-LAST:event_jTpesoActualKeyReleased

    private void jTpesoActualFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTpesoActualFocusLost

    }//GEN-LAST:event_jTpesoActualFocusLost

    private void jCbDIETAItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCbDIETAItemStateChanged

        System.out.println("1");
        limpiarTField();
        if ((jCbDIETA.getSelectedIndex() > 0)) {
            DietaData dietaData = new DietaData();
            Dieta dieta = (Dieta) jCbDIETA.getSelectedItem();
            int idDieta = dieta.getIdDieta();
            limpiarTabla();
            llenarTablaMedidas(idDieta);
//                System.out.println(id);
            fechaObtenida = dieta.getFechaFinal();
            if (fechaObtenida.isBefore(LocalDate.now()) || (dieta.isEstado() == false)) {
                dietaData.modificarEstadoDietaPorID(idDieta);
                boolean valor = false;
                editable(valor);
            } else {
                boolean valor = true;
                editable(valor);
            }
        } else {
            limpiarTabla();
        }
    }//GEN-LAST:event_jCbDIETAItemStateChanged

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void comboPaciente() {

        PacienteData pd = new PacienteData();
        ArrayList<Paciente> pacientes = pd.listarPaciente();
        for (Paciente pac : pacientes) {

            jCbpaciente.addItem(pac);
        }

    }

    private void comboDieta() {

        DietaData dieta = new DietaData();
        ArrayList<Dieta> dietas = dieta.obtenerDietaDelPaciente(idpaciente);
        jCbDIETA.addItem(new Dieta("Seleccione una dieta"));
        for (Dieta dietaIndice : dietas) {

            jCbDIETA.addItem(dietaIndice);
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBguardar;
    private javax.swing.JComboBox<Dieta> jCbDIETA;
    private javax.swing.JComboBox<Paciente> jCbpaciente;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTBrazo;
    private javax.swing.JTextField jTBusto;
    private javax.swing.JTextField jTCadera;
    private javax.swing.JTextField jTCintura;
    private javax.swing.JTextField jTCuello;
    private javax.swing.JTextField jTPierna;
    private javax.swing.JTextField jTestatura;
    private javax.swing.JTextField jTfechaActual1;
    public static javax.swing.JTextField jTpesoActual;
    public static javax.swing.JTable tablaMedidas;
    // End of variables declaration//GEN-END:variables

    private void llenarTablaMedidas(int id) {
        HistorialData historialData = new HistorialData();
        ArrayList<Historial> medidas = historialData.obtenerHistorialdePaciente(id);
        for (Historial paHistorial : medidas) {
            model.addRow(new Object[]{
                paHistorial.getCuello(),
                paHistorial.getBusto(),
                paHistorial.getBrazo(),
                paHistorial.getCintura(),
                paHistorial.getCadera(),
                paHistorial.getPierna(),
                paHistorial.getFechaRegistro(),
                paHistorial.getPesoActual(),
                paHistorial.getEstatura()});

        }

    }
//

    public void limpiarTabla() {
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
    }

    private void validacionMedidas(KeyEvent evt, String medida) {
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57;// TODO add your handling code here:
        if (!numero) {
            evt.consume();
        }
        if (medida.trim().length() == 3) {
            evt.consume();   // TODO add your handling code here:
            // TODO add your handling code here:
        }
    }

    private boolean validaciones() {
        try {
            cuellopS = Double.parseDouble(jTCuello.getText());
            bustopS = Double.parseDouble(jTBusto.getText());
            brazoS = Double.parseDouble(jTBrazo.getText());
            cinturaS = Double.parseDouble(jTCintura.getText());
            caderaS = Double.parseDouble(jTCadera.getText());
            piernaS = Double.parseDouble(jTPierna.getText());
            estaturaS = Integer.parseInt(jTestatura.getText());
            pesoActualS = Double.parseDouble(jTpesoActual.getText());
            if (cuellopS < 20 || cuellopS > 70 || bustopS < 50 || bustopS > 150 || brazoS < 30 || brazoS > 70 || cinturaS < 50 || cinturaS > 150
                    || caderaS < 50 || caderaS > 200 || piernaS < 50 || piernaS > 130 || estaturaS < 50 || estaturaS > 210 || pesoActualS < 3 || pesoActualS > 500 || jTpesoActual.getText().startsWith(".") || jTpesoActual.getText().startsWith("0")) {
                JOptionPane.showMessageDialog(null, "Valores fuera de rango", "Error", JOptionPane.ERROR_MESSAGE);

                return false;
            } else {

            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public void limpiarCombo() {
        jCbDIETA.removeAllItems();

    }

    private void editable(boolean valor) {
        jTBrazo.setEditable(valor);
        jTBusto.setEditable(valor);
        jTCadera.setEditable(valor);
        jTCintura.setEditable(valor);
        jTCuello.setEditable(valor);
        jTPierna.setEditable(valor);
        jTestatura.setEditable(valor);
        jTpesoActual.setEditable(valor);
    }
    
    public void limpiarTField(){
           jTBrazo.setText("");
        jTBusto.setText("");
        jTCadera.setText("");
        jTCintura.setText("");
        jTCuello.setText("");
        jTPierna.setText("");
        jTestatura.setText("");
        jTpesoActual.setText("");
        
    }
}
