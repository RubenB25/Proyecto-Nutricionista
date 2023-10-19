package Vistas;

import AccesoDatos.PacienteData;
import Entidades.Paciente;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 * @author Gabriel
 */
public class BuscarPaciente extends javax.swing.JInternalFrame {

    DefaultTableModel modelo;
    TableRowSorter<TableModel> TRS;

    public BuscarPaciente() {
        initComponents();

        modelo = (DefaultTableModel) jTablePaciente.getModel();
        TRS = new TableRowSorter<>(modelo);
        jTablePaciente.setRowSorter(TRS);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFbuscarPorApellido = new javax.swing.JTextField();
        jTFbuscarPorDni = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePaciente = new javax.swing.JTable();
        jBeditar = new javax.swing.JButton();
        jBbaja = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jBalta = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setText("Buscar por apellido");

        jLabel2.setText("Buscar por DNI:");

        jTFbuscarPorApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFbuscarPorApellidoKeyReleased(evt);
            }
        });

        jTFbuscarPorDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFbuscarPorDniKeyReleased(evt);
            }
        });

        jTablePaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Apellido", "Nombre", "Documento", "Celular", "Activo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTablePaciente);
        if (jTablePaciente.getColumnModel().getColumnCount() > 0) {
            jTablePaciente.getColumnModel().getColumn(0).setResizable(false);
            jTablePaciente.getColumnModel().getColumn(1).setResizable(false);
            jTablePaciente.getColumnModel().getColumn(2).setResizable(false);
            jTablePaciente.getColumnModel().getColumn(3).setResizable(false);
            jTablePaciente.getColumnModel().getColumn(4).setResizable(false);
        }

        jBeditar.setText("Editar");
        jBeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeditarActionPerformed(evt);
            }
        });

        jBbaja.setText("Dar baja");
        jBbaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbajaActionPerformed(evt);
            }
        });

        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jBalta.setText("Dar alta");
        jBalta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBaltaActionPerformed(evt);
            }
        });

        jButton2.setText("Asignar dieta");

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTFbuscarPorApellido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTFbuscarPorDni, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBeditar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBbaja, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBsalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBalta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jBeditar)
                        .addGap(18, 18, 18)
                        .addComponent(jBbaja)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBalta)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jBsalir))
                    .addComponent(jLabel2)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTFbuscarPorApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFbuscarPorDni, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFbuscarPorApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFbuscarPorDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBeditar)
                    .addComponent(jBbaja)
                    .addComponent(jBsalir)
                    .addComponent(jBalta)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeditarActionPerformed
        PacienteData pacienteData = new PacienteData();

        int filaSeleccionada = jTablePaciente.getSelectedRow();
        if (filaSeleccionada != -1) {
            String dni = (String) jTablePaciente.getValueAt(filaSeleccionada, 2);
            Paciente paciente = pacienteData.buscarPacientePorDni(dni);
            FormularioPaciente fp = new FormularioPaciente();
            fp.llenarCampos(paciente);
            jDesktopPane1.add(fp);
            fp.setVisible(true);
            fp.moveToFront();

        }
    }//GEN-LAST:event_jBeditarActionPerformed

    private void jTFbuscarPorDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFbuscarPorDniKeyReleased
        PacienteData pacienteData = new PacienteData();
        borrarFilas();
        jTFbuscarPorApellido.setText("");
        jTFbuscarPorApellido.setEditable(false);
        jTFbuscarPorApellido.setFocusable(false);
        if (!jTFbuscarPorDni.getText().isEmpty()) {
            for (Paciente paciente : pacienteData.listarPaciente()) {
                if (paciente.getDni().startsWith(jTFbuscarPorDni.getText())) {
                    modelo.addRow(new Object[]{paciente.getApellido(), paciente.getNombre(),
                        paciente.getDni(), paciente.getCelular(), paciente.isEstado()});
                }
            }
        } else {
            jTFbuscarPorApellido.setFocusable(true);
            jTFbuscarPorApellido.setEditable(true);
        }
    }//GEN-LAST:event_jTFbuscarPorDniKeyReleased

    private void jTFbuscarPorApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFbuscarPorApellidoKeyReleased
        PacienteData pacienteData = new PacienteData();
        borrarFilas();
        jTFbuscarPorDni.setText("");
        jTFbuscarPorDni.setEditable(false);
        jTFbuscarPorDni.setFocusable(false);
        if (!jTFbuscarPorApellido.getText().isEmpty()) {
            for (Paciente paciente : pacienteData.listarPaciente()) {
                if (paciente.getApellido().startsWith(jTFbuscarPorApellido.getText())) {
                    modelo.addRow(new Object[]{paciente.getApellido(), paciente.getNombre(),
                        paciente.getDni(), paciente.getCelular(), paciente.isEstado()});
                }
            }
        } else {
            jTFbuscarPorDni.setFocusable(true);
            jTFbuscarPorDni.setEditable(true);
        }
    }//GEN-LAST:event_jTFbuscarPorApellidoKeyReleased

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBbajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbajaActionPerformed
        PacienteData pacienteData = new PacienteData();

        int filaSeleccionada = jTablePaciente.getSelectedRow();
        if (filaSeleccionada != -1) {
            String dni = (String) jTablePaciente.getValueAt(filaSeleccionada, 2);

            Paciente paciente = pacienteData.buscarPacientePorDni(dni);
            int id = paciente.getIdPaciente();
            pacienteData.eliminarPaciente(id);
        }
    }//GEN-LAST:event_jBbajaActionPerformed

    private void jBaltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBaltaActionPerformed
        PacienteData pacienteData = new PacienteData();

        int filaSeleccionada = jTablePaciente.getSelectedRow();
        if (filaSeleccionada != -1) {
            String dni = (String) jTablePaciente.getValueAt(filaSeleccionada, 2);

            Paciente paciente = pacienteData.buscarPacientePorDni(dni);
            int id = paciente.getIdPaciente();
            pacienteData.darAltaPaciente(id);
        }
    }//GEN-LAST:event_jBaltaActionPerformed

    private void borrarFilas() {
        int f = jTablePaciente.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBalta;
    private javax.swing.JButton jBbaja;
    private javax.swing.JButton jBeditar;
    private javax.swing.JButton jBsalir;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFbuscarPorApellido;
    private javax.swing.JTextField jTFbuscarPorDni;
    private javax.swing.JTable jTablePaciente;
    // End of variables declaration//GEN-END:variables

}
