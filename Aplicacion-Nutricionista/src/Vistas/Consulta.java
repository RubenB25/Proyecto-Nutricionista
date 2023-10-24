package Vistas;

import AccesoDatos.DietaData;
import AccesoDatos.HistorialData;
import AccesoDatos.PacienteData;
import Entidades.Dieta;
import Entidades.Historial;
import Entidades.Paciente;
import static Vistas.NutricionistaEscritorio.jDPescritorio;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class Consulta extends javax.swing.JInternalFrame {
    
    DefaultTableModel model;
    private Object consultaHis;
    
    public Consulta() {
        initComponents();
//        comboDieta();
//        double pesoActual = FormularioConsulta.pesoActual;
//        jTactualrecibe.setText(String.valueOf(FormularioConsulta.estatura));
//        jLnombre.setText(FormularioConsulta.nombreyApellido);
//        llenarTablaMedidas(FormularioConsulta.idpacientef);   
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
                "Cuello", "Busto", "Brazo", "Cintura", "Cadera", "Pierna", "FechaConsulta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
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
                .addGroup(jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPConsultaLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jBagregardatos)
                        .addGap(144, 144, 144)
                        .addComponent(jBInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPConsultaLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTactualrecibe, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPConsultaLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jCbDIETA, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPConsultaLayout.setVerticalGroup(
            jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPConsultaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addGroup(jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCbDIETA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTactualrecibe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
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
//        DefaultTableModel model = (DefaultTableModel) tablaMedidas.getModel();
//        int rowCount = model.getRowCount();
//        if (rowCount > 0) {
//            HistorialData historialPaciente = new HistorialData();
//            Paciente pacienteSeleccionado = new Paciente();
//            int idDieta = jCbDIETA.getSelectedIndex();
//            LocalDate fechaRegistro = LocalDate.now();
//            String idPaciente = FormularioConsulta.idPaciente;
//double pesoActual = FormularioConsulta.pesoActual;
//double estatura = FormularioConsulta.estatura;
//for()
//double cuello = Double.parseDouble(textFieldCuello.getText());
//double busto = Double.parseDouble(textFieldBusto.getText());
//double brazo = Double.parseDouble(textFieldBrazo.getText());
//double cintura = Double.parseDouble(textFieldCintura.getText());
//double cadera = Double.parseDouble(textFieldCadera.getText());
//double pierna = Double.parseDouble(textFieldPierna.getText();
//Date fechaRegistroMedidas = new Date();  // Obtener la fecha actual para las medidas
//
//// Paso 3: Crear una nueva instancia de Historial
//Historial historial = new Historial(idPaciente, cuello, busto, brazo, cintura, cadera, pierna, estatura, idDieta, pesoActual, fechaRegistro);
//
//// Paso 4: Agregar el nuevo historial al paciente
//historialPaciente.nuevoHistorial(historial);
//            
//            
//            
//            for(tablaMedidas.)
//               Historial historial = new Historial(FormularioConsulta.idpacientef ,medidas.cuello,medidas.busto,
//                       medidas.cintura,medidas.brazo,
//                       medidas.cadera, medidas.pierna,FormularioConsulta.estatura,idDieta,
//                       FormularioConsulta.pesoActual,fechaRegistro);
//             
//               historialPaciente.nuevoHistorial(historial);
//
//            JOptionPane.showMessageDialog(null, "Datos guardados con éxito");
//        } else {
//            JOptionPane.showMessageDialog(null, "La tabla de medidas está vacía.");
//        }
//        
//    }
//    
//    private void comboDieta() {
//        DietaData dieta = new DietaData();
//        
//        ArrayList<Dieta> dietas = dieta.listarDietas();
//        for (Dieta dietaIndice : dietas) {
//            jCbDIETA.addItem(dietaIndice);
//        }
//        
//    }
//    
//    private void jTBcustomersMouseClicked(java.awt.event.MouseEvent evt) {
//        
//    }
//    
//    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {
//        dispose();
    }//GEN-LAST:event_jBagregardatosActionPerformed

    private void tablaMedidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMedidasMouseClicked

    }//GEN-LAST:event_tablaMedidasMouseClicked

    private void jBInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInsertarActionPerformed

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


}
