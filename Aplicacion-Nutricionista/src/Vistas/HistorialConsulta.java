package Vistas;


import AccesoDatos.HistorialData;
import Entidades.Historial;
import Entidades.historialConNombreyApellido;
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
       
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTHistorialConsulta = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);

        jTHistorialConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Peso ", "Fecha Registro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
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
            jTHistorialConsulta.getColumnModel().getColumn(0).setHeaderValue("Nombre");
            jTHistorialConsulta.getColumnModel().getColumn(1).setResizable(false);
            jTHistorialConsulta.getColumnModel().getColumn(1).setHeaderValue("Apellido");
            jTHistorialConsulta.getColumnModel().getColumn(2).setResizable(false);
            jTHistorialConsulta.getColumnModel().getColumn(2).setHeaderValue("Peso ");
            jTHistorialConsulta.getColumnModel().getColumn(3).setHeaderValue("Fecha Registro");
        }

        jLabel1.setText("Historial Consultas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
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
        llenarTabla();
    }//GEN-LAST:event_jTHistorialConsultaPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTHistorialConsulta;
    // End of variables declaration//GEN-END:variables

    private void llenarTabla() {
        HistorialData hd = new HistorialData();
       
        for (historialConNombreyApellido historial : hd.obtenerHistorialesConNombreApellido()){ 
            model.addRow(new Object[]{historial.getNombre(), historial.getApellido(),
                historial.getPesoActual(), historial.getFechaRegistro()});
    }
}}
