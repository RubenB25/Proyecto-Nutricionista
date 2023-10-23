package Vistas;

import AccesoDatos.DietaData;
import AccesoDatos.HistorialData;
import AccesoDatos.PacienteData;
import Entidades.Dieta;
import Entidades.Historial;
import Entidades.Paciente;
import static Vistas.NutricionistaEscritorio.jDPescritorio;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import javax.swing.DefaultCellEditor;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class Consulta extends javax.swing.JInternalFrame {
    
    DefaultTableModel model;
    private Object ch;
    
    public Consulta() {
        initComponents();
//        Consulta con= new Consulta();
//        FormularioConsulta envia=new FormularioConsulta();

        comboDieta();
        String pesoActual = FormularioConsulta.pa;
        jTactualrecibe.setText(FormularioConsulta.pa);
        jLnombre.setText(FormularioConsulta.nya);
        llenarTablaMedidas(FormularioConsulta.idpf);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPConsulta = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMedidas = new javax.swing.JTable();
        jBagregardatos = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jCbDIETA = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jTactualrecibe = new javax.swing.JTextField();
        jBInsertar = new javax.swing.JButton();
        jLnombre = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Medidas de Paciente");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tablaMedidas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tablaMedidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cuello", "Busto", "Brazo", "Cintura", "Cadera", "Pierna", "Estatura", "FechaConsulta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaMedidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMedidasMouseClicked(evt);
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

        jBagregardatos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBagregardatos.setText("Guardar Datos");
        jBagregardatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBagregardatosActionPerformed(evt);
            }
        });

        jLabel7.setText("DIETA");

        jLabel1.setText("Peso Actual:");

        jBInsertar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBInsertar.setText("Insertar datos");
        jBInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInsertarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPConsultaLayout = new javax.swing.GroupLayout(jPConsulta);
        jPConsulta.setLayout(jPConsultaLayout);
        jPConsultaLayout.setHorizontalGroup(
            jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPConsultaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addComponent(jTactualrecibe, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jCbDIETA, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
            .addGroup(jPConsultaLayout.createSequentialGroup()
                .addGroup(jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPConsultaLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jBagregardatos)
                        .addGap(144, 144, 144)
                        .addComponent(jBInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPConsultaLayout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPConsultaLayout.setVerticalGroup(
            jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPConsultaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTactualrecibe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCbDIETA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBInsertar)
                    .addComponent(jBagregardatos))
                .addGap(25, 25, 25))
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
                .addComponent(jPConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBagregardatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBagregardatosActionPerformed
        DefaultTableModel model = (DefaultTableModel) tablaMedidas.getModel();

        // int id = pacienteSeleccionado.getIdPaciente();
        int rowCount = model.getRowCount();
        if (rowCount > 0) {
            HistorialData historialPaciente = new HistorialData();
            Paciente pacienteSeleccionado = new Paciente();
            int idDieta = jCbDIETA.getSelectedIndex();
            int id = pacienteSeleccionado.getIdPaciente();
            double pesoActual = Double.parseDouble(FormularioConsulta.jTpesoActual.getText());
            LocalDate fechaRegistro = LocalDate.now(); // Asigna la fecha actual o la fecha que desees

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
        
        ArrayList<Dieta> dietas = dieta.listarDietas();
        for (Dieta dietaIndice : dietas) {
            jCbDIETA.addItem(dietaIndice);
        }
        
    }
    
    private void jTBcustomersMouseClicked(java.awt.event.MouseEvent evt) {
        
    }
    
    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }//GEN-LAST:event_jBagregardatosActionPerformed

    private void tablaMedidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMedidasMouseClicked

    }//GEN-LAST:event_tablaMedidasMouseClicked

    private void jBInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInsertarActionPerformed

//        DefaultTableModel model = (DefaultTableModel) tablaMedidas.getModel();
//        model.addRow(new Object[]{"", "", "", "", "", "", "", "", ""}); // Agregar fila en blanco
//        for (int i = 0; i < model.getColumnCount(); i++) {
//            TableColumn column = tablaMedidas.getColumnModel().getColumn(i);
//            DefaultCellEditor editor = new DefaultCellEditor(new JTextField());
//            column.setCellEditor(editor);
//            column.getCellEditor();
//            //tablaMedidas.enableInputMethods(true);
         try {
            Medidas mi = new Medidas();
            jDPescritorio.removeAll();
            jDPescritorio.repaint();
            jDPescritorio.add(mi);
            mi.moveToFront();
            mi.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al abrir la vista Consulta: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {
        // Guarda los datos en el historial
        // Después de guardar, deshabilita la tabla
    }//GEN-LAST:event_jBInsertarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBInsertar;
    private javax.swing.JButton jBagregardatos;
    private javax.swing.JComboBox<Dieta> jCbDIETA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLnombre;
    public static javax.swing.JPanel jPConsulta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTactualrecibe;
    public static javax.swing.JTable tablaMedidas;
    // End of variables declaration//GEN-END:variables

    private void llenarTablaMedidas(int id) {
        HistorialData historialData = new HistorialData();
        int idPaciente = id;

        // Obtener el historial de medidas para el paciente con el ID proporcionado
        ArrayList<Historial> medidas = historialData.obtenerHistorialdePaciente(idPaciente);
        
        model = (DefaultTableModel) tablaMedidas.getModel();
        
        for (Historial paHistorial : medidas) {
            model.addRow(new Object[]{
                paHistorial.getCuello(),
                paHistorial.getBusto(),
                paHistorial.getBrazo(),
                paHistorial.getCintura(),
                paHistorial.getCadera(),
                paHistorial.getPierna(),
                paHistorial.getEstatura(),
                paHistorial.getFechaRegistro()
            });
        }
        
    }
}
