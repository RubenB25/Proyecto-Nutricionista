/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Dietas;

import AccesoDatos.Comparador;
import AccesoDatos.DietaData;
import Entidades.Dieta;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ruben
 */
public class ListarPacientes extends javax.swing.JInternalFrame {

    private final DefaultTableModel model;
    private String estado;
    private final DietaData dietas = new DietaData();
    private int indice = 0;

    public ListarPacientes() {
        initComponents();
        model = (DefaultTableModel) jTListarPacientes.getModel();
        jRBListarTodoActionPerformed(null);
        jRBListarTodo.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BGListarPacientes = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTListarPacientes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jRBListarTodo = new javax.swing.JRadioButton();
        jRBNoLLegoPeso = new javax.swing.JRadioButton();
        jBVigentes = new javax.swing.JButton();
        jBNoVigentes = new javax.swing.JButton();
        jRBInvisible = new javax.swing.JRadioButton();
        jRBInvisible.setVisible(false);

        jTListarPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Paciente", "Dieta", "Fecha finalización", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTListarPacientes);
        if (jTListarPacientes.getColumnModel().getColumnCount() > 0) {
            jTListarPacientes.getColumnModel().getColumn(0).setResizable(false);
            jTListarPacientes.getColumnModel().getColumn(1).setResizable(false);
            jTListarPacientes.getColumnModel().getColumn(2).setResizable(false);
            jTListarPacientes.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel1.setText("Lista de pacientes");

        BGListarPacientes.add(jRBListarTodo);
        jRBListarTodo.setText("Listar todos los pacientes");
        jRBListarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBListarTodoActionPerformed(evt);
            }
        });

        BGListarPacientes.add(jRBNoLLegoPeso);
        jRBNoLLegoPeso.setText("No llegaron al peso");
        jRBNoLLegoPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBNoLLegoPesoActionPerformed(evt);
            }
        });

        jBVigentes.setText("Vigentes");
        jBVigentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVigentesActionPerformed(evt);
            }
        });

        jBNoVigentes.setText("No vigentes");
        jBNoVigentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNoVigentesActionPerformed(evt);
            }
        });

        BGListarPacientes.add(jRBInvisible);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBVigentes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRBInvisible)
                                .addGap(119, 119, 119)
                                .addComponent(jBNoVigentes))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jRBListarTodo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRBNoLLegoPeso))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel1)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBNoLLegoPeso)
                    .addComponent(jRBListarTodo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRBInvisible)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBVigentes)
                        .addComponent(jBNoVigentes)))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRBNoLLegoPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBNoLLegoPesoActionPerformed
        indice = 2;
        cambiarValores(indice);
        ArrayList<Dieta> listaDietasObtenidas = dietas.listarDietas();
        for (Dieta DietaObtenida : listaDietasObtenidas) {
            if (DietaObtenida.getPesoFinal() > DietaObtenida.getPaciente().getPesoDeseado() && !DietaObtenida.isEstado()) {
                model.addRow(new Object[]{DietaObtenida.getPaciente().getNombre() + " " + DietaObtenida.getPaciente().getApellido(), DietaObtenida.getNombre(), DietaObtenida.getPaciente().getPesoDeseado(), DietaObtenida.getPesoFinal()});
            }
        }
    }//GEN-LAST:event_jRBNoLLegoPesoActionPerformed

    private void jRBListarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBListarTodoActionPerformed
        // TODO add your handling code here:
        indice = 1;
        cambiarValores(indice);
        ArrayList<Dieta> listaDietasObtenidas = dietas.listarDietas();
        Collections.sort(listaDietasObtenidas, new Comparador());
        for (Dieta DietaObtenida : listaDietasObtenidas) {
            llenarLista(DietaObtenida);
            
        }


    }//GEN-LAST:event_jRBListarTodoActionPerformed

    private void jBVigentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVigentesActionPerformed
        // TODO add your handling code here:
        indice = 3;
        cambiarValores(indice);
        ArrayList<Dieta> listaDietasObtenidas = dietas.listarDietas();
        for (Dieta DietaObtenida : listaDietasObtenidas) {
            if (DietaObtenida.isEstado()) {
                llenarLista(DietaObtenida);
            }
        }
    }//GEN-LAST:event_jBVigentesActionPerformed

    private void jBNoVigentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNoVigentesActionPerformed
        // TODO add your handling code here:
        indice = 3;
        cambiarValores(indice);
        ArrayList<Dieta> listaDietasObtenidas = dietas.listarDietas();
        for (Dieta DietaObtenida : listaDietasObtenidas) {
            if (!DietaObtenida.isEstado()) {
                llenarLista(DietaObtenida);
            }
        }

    }//GEN-LAST:event_jBNoVigentesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BGListarPacientes;
    private javax.swing.JButton jBNoVigentes;
    private javax.swing.JButton jBVigentes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBInvisible;
    private javax.swing.JRadioButton jRBListarTodo;
    private javax.swing.JRadioButton jRBNoLLegoPeso;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTListarPacientes;
    // End of variables declaration//GEN-END:variables
     
    private void llenarLista(Dieta DietaObtenida) {

        if (DietaObtenida.isEstado()) {
            estado = "Vigente";
        }
        model.addRow(new Object[]{DietaObtenida.getPaciente().getNombre() + " " + DietaObtenida.getPaciente().getApellido(), DietaObtenida.getNombre(), DietaObtenida.getFechaFinal(), estado});

        estado = "No vigente";
    }
      
    private void cambiarValores(int indice) {
        switch (indice) {
            case 1:
                jBVigentes.setEnabled(true);
                jBNoVigentes.setEnabled(true);
                model.setColumnCount(2);
                model.addColumn("Fecha finalización");
                model.addColumn("Estado");
                limpiar();
                break;
            case 2:
                jBVigentes.setEnabled(false);
                jBNoVigentes.setEnabled(false);
                limpiar();
                model.setColumnCount(2);
                model.addColumn("Peso Deseado");
                model.addColumn("Peso Final");
                limpiar();
                break;
            case 3:
                jRBInvisible.setSelected(true);
                limpiar();
                break;
        }

    }

    public void limpiar() {
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
    }
}
