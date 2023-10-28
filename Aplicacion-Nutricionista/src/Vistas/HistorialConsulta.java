package Vistas;

import AccesoDatos.HistorialData;
import AccesoDatos.PacienteData;
import Entidades.Historial;
import Entidades.Paciente;
import Entidades.historialConNombreyApellido;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ruben
 */
public class HistorialConsulta extends javax.swing.JInternalFrame {

    private DefaultTableModel model;

    /**
     * Creates new form HistorialConsulta
     */
    public HistorialConsulta() {
        initComponents();
        model = (DefaultTableModel) jTHistorialConsulta.getModel();
        comboPaciente();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTHistorialConsulta = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jCbpaciente = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);

        jTHistorialConsulta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTHistorialConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Peso ", "Fecha Registro", "Variaciones"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTHistorialConsulta.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTHistorialConsultaPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(jTHistorialConsulta);
        if (jTHistorialConsulta.getColumnModel().getColumnCount() > 0) {
            jTHistorialConsulta.getColumnModel().getColumn(0).setResizable(false);
            jTHistorialConsulta.getColumnModel().getColumn(1).setResizable(false);
            jTHistorialConsulta.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel1.setText("Historial Consultas");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jLabel2)
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(jCbpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(253, 253, 253)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(149, 149, 149)))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCbpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTHistorialConsultaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTHistorialConsultaPropertyChange
        // TODO add your handling code here:
       // llenarTabla();
    }//GEN-LAST:event_jTHistorialConsultaPropertyChange

    private void jCbpacienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCbpacienteItemStateChanged
        try {
            Paciente pacienteSeleccionado = (Paciente) jCbpaciente.getSelectedItem();
            int idpaciente = pacienteSeleccionado.getIdPaciente();
            System.out.println(" el id elegido es "+ idpaciente);
            if (idpaciente== -1 ){
                limpiar();
                llenarTabla(idpaciente);
                
            }else {
                limpiar();
                llenarTabla();
            }
           
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "no puedo acceder al paciente seleccionado" + e);
        }
    }//GEN-LAST:event_jCbpacienteItemStateChanged

    private void jCbpacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbpacienteActionPerformed
        Paciente pacienteSeleccionado = (Paciente) jCbpaciente.getSelectedItem();
        int idnuevo = pacienteSeleccionado.getIdPaciente();  
        if(idnuevo!=0){
            limpiar();
            llenarTabla();
        }
        limpiar();
        llenarTabla(idnuevo);
        
    }//GEN-LAST:event_jCbpacienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Paciente> jCbpaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTHistorialConsulta;
    // End of variables declaration//GEN-END:variables

    private void llenarTabla() {
        try {
            HistorialData hd = new HistorialData();
            
            for (historialConNombreyApellido historial : hd.obtenerHistorialesConNombreApellido()) {
                model.addRow(new Object[]{historial.getNombre(), historial.getApellido(),
                    historial.getPesoActual(), historial.getFechaRegistro(),historial.getDiferencias()});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar la tabla " + e);
        }
    }
     private void llenarTabla(int id) {
        try {
            int idelegido=id;
            HistorialData hd = new HistorialData(); 
            
            for (historialConNombreyApellido historial : hd.obtenerHistorialesDePaciente(idelegido)) {
                model.addRow(new Object[]{historial.getNombre(), historial.getApellido(),
                    historial.getPesoActual(), historial.getFechaRegistro(),historial.getDiferencias()});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar la tabla " + e);
        }
    }
    public void limpiar() {
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
    }
   private void comboPaciente() {
      
             try {
            PacienteData pd = new PacienteData();
            ArrayList<Paciente> pacientes = pd.listarPaciente();
            Paciente seleccionarPaciente = new Paciente("-1" , "- Seleccione un Paciente -");
            jCbpaciente.insertItemAt(seleccionarPaciente, 0);
            for (Paciente pac : pacientes) {

                jCbpaciente.addItem(pac);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "no se puede cargar el combo Box" + e);

        }

   }}
