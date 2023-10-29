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
    int idDieta,estaturaS;
    LocalDate fechaActual, fechaObtenida;
    boolean estado;

    private DefaultTableModel model;

    public FormularioConsulta() {
        initComponents();
        comboPaciente();
        comboDieta();
        SimpleDateFormat fechaFormateada = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaActual = new Date();
        String fecha = fechaFormateada.format(fechaActual);
        jTfechaActual1.setText(fecha);
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

        setClosable(true);
        setTitle("Formulario Consulta");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Fecha consulta:");

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
        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

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

        jCbDIETA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbDIETAActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Dietas ya Realizadas");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jBimc)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTfechaActual1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 11, Short.MAX_VALUE)
                                .addComponent(jCbpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTCuello, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTBusto, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBNuevo))
                        .addGap(288, 288, 288))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(270, 270, 270)
                                .addComponent(jTBrazo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTestatura, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                        .addComponent(jTpesoActual))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLresultado1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(jBguardar)
                        .addGap(121, 121, 121)
                        .addComponent(jCbDIETA, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addComponent(jLabel15))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(85, 85, 85)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(373, 373, 373))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(383, 383, 383)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10)))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTCintura, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTPierna, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTCadera, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCbpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBNuevo)
                    .addComponent(jLabel2))
                .addGap(31, 31, 31)
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
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBimc)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLresultado1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                .addGap(17, 17, 17)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBguardar)
                    .addComponent(jCbDIETA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        try {

            Dieta dietaSeleccionada = (Dieta) jCbDIETA.getSelectedItem();
            idDieta = dietaSeleccionada.getIdDieta();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "no se puede obtener la seleccion de la dieta" + e);
        }
    }//GEN-LAST:event_jCbDIETAActionPerformed

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
//       try {g
        DietaData dieta = new DietaData();
        Dieta dietaseleccionada = (Dieta) jCbDIETA.getSelectedItem();
        
        int id = dietaseleccionada.getIdDieta();
        System.out.println(" id dieta"+id);

       // System.out.println(dieta.obtenerDietaDelPaciente(idpaciente));
        HistorialData historialData = new HistorialData();
        fechaObtenida = dietaseleccionada.getFechaFinal();
        if (fechaObtenida.isEqual(LocalDate.now())) {
            dieta.modificarDietaPorID(id, pesoActualS);
            JOptionPane.showMessageDialog(null, "llegaste al final de tu dieta");
        }

        if (validaciones()) {
            Historial historialguarda = new Historial(idpaciente, cuellopS, bustopS, cinturaS, brazoS,
                    caderaS, piernaS, estaturaS, pesoActualS);
            //System.out.println(historialguarda.toString());
            historialData.nuevoHistorial(historialguarda);
        }llenarTablaMedidas(idpaciente);
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

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        FormularioPaciente fp = new FormularioPaciente();
        jDPescritorio.removeAll();
        jDPescritorio.repaint();
        jDPescritorio.add(fp);
        fp.moveToFront();
        fp.setVisible(true);
    }//GEN-LAST:event_jBNuevoActionPerformed

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
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese Valores Validos ya que esta fuera del limite para poder calcular el IMC");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "tiene un error por no ingresar valor numerico en las opciones de altura y peso," + e);
        }
    }//GEN-LAST:event_jBimcActionPerformed

    private void jCbpacienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCbpacienteItemStateChanged
        try {

            Paciente pacienteSeleccionado = (Paciente) jCbpaciente.getSelectedItem();
            idpaciente = pacienteSeleccionado.getIdPaciente();
//            limpiarCombo();
            comboDieta();
            limpiarTabla();
            llenarTablaMedidas(idpaciente);

//            if (fechaObtenida.isEqual(LocalDate.now())) {
//                JOptionPane.showMessageDialog(null, "llegaste al final de tu dieta , guarda los datos ");
//
//            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "no puedo acceder al paciente seleccionado" + e);
        }
    }//GEN-LAST:event_jCbpacienteItemStateChanged

    private void jTpesoActualKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTpesoActualKeyReleased

    }//GEN-LAST:event_jTpesoActualKeyReleased

    private void jTpesoActualFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTpesoActualFocusLost

    }//GEN-LAST:event_jTpesoActualFocusLost

    private void comboPaciente() {
        try {
            PacienteData pd = new PacienteData();
            ArrayList<Paciente> pacientes = pd.listarPaciente();
            Paciente seleccionarPaciente = new Paciente("-1", "- Seleccione un Paciente -");
            jCbpaciente.insertItemAt(seleccionarPaciente, 0);
            for (Paciente pac : pacientes) {

                jCbpaciente.addItem(pac);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "no se puede cargar el combo Box" + e);

        }

    }

    private void comboDieta() {
        try {

            DietaData dieta = new DietaData();
            ArrayList<Dieta> dietas = dieta.obtenerDietaDelPaciente(idpaciente);
            for (Dieta dietaIndice : dietas) {

                jCbDIETA.addItem(dietaIndice);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede cargar el combo box de dieta" + e);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBguardar;
    public static javax.swing.JButton jBimc;
    private javax.swing.JComboBox<Dieta> jCbDIETA;
    private javax.swing.JComboBox<Paciente> jCbpaciente;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLresultado1;
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
        try {

            HistorialData historialData = new HistorialData();
            int idPaciente = id;
            model = (DefaultTableModel) tablaMedidas.getModel();

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
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar los datos en la tabla" + e);
        }
    }

    private void limpiarTabla() {
        model = (DefaultTableModel) tablaMedidas.getModel();
        model.setRowCount(0);
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

                JOptionPane.showMessageDialog(null, "tiene error en las medidas ingresadas Verifique");
                return false;
            } else {

            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "error de tipo numerico" + e);
        }
        return true;
    }

    public void limpiarCombo() {
        jCbDIETA.removeAll();
    }
}
