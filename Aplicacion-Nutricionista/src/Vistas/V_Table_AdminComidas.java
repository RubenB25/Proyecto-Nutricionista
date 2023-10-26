
package Vistas;

import Entidades.Comida;
import AccesoDatos.ComidaData;
import AccesoDatos.IngredienteComidaData;
import AccesoDatos.IngredienteData;
import Entidades.Ingrediente;
import com.sun.glass.events.KeyEvent;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class V_Table_AdminComidas extends javax.swing.JInternalFrame {

    //V_Form_ModificarComida vmc = new V_Form_ModificarComida();
    boolean contieneNumero = false;
    
    private static int indiceComida;
    private static int indiceIngrediente;
    private static int indiceIngreComi;
    
    private String tbcIdComida = "";
    private String tbcNombre = "";
    private String tbcDetalle = "";
    private String tbcCalorias = "";
    
    private String tbiIdIngrediente = "";
    private String tbiNombre = "";
    private String tbiCalorias = "";
    
    private String tbicIdingredienteComida = "";
    
    DefaultTableModel modeloComida;
    DefaultTableModel modeloIngre;
    DefaultTableModel modeloIngreComi;

    TableRowSorter<TableModel> TRS;
    TableRowSorter<TableModel> TRSI;
    TableRowSorter<TableModel> TRSIC;
    
    public V_Table_AdminComidas() {
        initComponents();
        
        modeloComida = (DefaultTableModel) jTableComidas.getModel();
        TRS = new TableRowSorter<>(modeloComida);
        jTableComidas.setRowSorter(TRS);
        
        modeloIngre = (DefaultTableModel) jTableIngredientes.getModel();
        TRSI = new TableRowSorter<>(modeloIngre);
        jTableIngredientes.setRowSorter(TRSI);
        
        modeloIngreComi = (DefaultTableModel) jTableIngreComi.getModel();
        TRSIC = new TableRowSorter<>(modeloIngreComi);
        jTableIngreComi.setRowSorter(TRSIC);
        
        refresca();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPbuscarComida = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableIngredientes = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jTextBuscarIngrediente = new javax.swing.JTextField();
        jBtnAgregaComidaIngrediente = new javax.swing.JButton();
        jPcomidas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableComidas = new javax.swing.JTable();
        jTbuscar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jBtnAgregarComida = new javax.swing.JButton();
        jBtnModificar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jBtnRefresca = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableIngreComi = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jTtotalCalorias = new javax.swing.JTextField();
        jBtnEliminar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Administración de comidas");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Tabla de Ingredientes");

        jTableIngredientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idIngrediente", "Nombre", "Calorias"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Short.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableIngredientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableIngredientesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableIngredientes);
        if (jTableIngredientes.getColumnModel().getColumnCount() > 0) {
            jTableIngredientes.getColumnModel().getColumn(0).setPreferredWidth(25);
            jTableIngredientes.getColumnModel().getColumn(1).setPreferredWidth(80);
            jTableIngredientes.getColumnModel().getColumn(2).setPreferredWidth(30);
        }

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Buscar por Nombre");

        jTextBuscarIngrediente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextBuscarIngredienteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextBuscarIngredienteKeyTyped(evt);
            }
        });

        jBtnAgregaComidaIngrediente.setText("Agregar ingrediente a Comida");
        jBtnAgregaComidaIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAgregaComidaIngredienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPbuscarComidaLayout = new javax.swing.GroupLayout(jPbuscarComida);
        jPbuscarComida.setLayout(jPbuscarComidaLayout);
        jPbuscarComidaLayout.setHorizontalGroup(
            jPbuscarComidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPbuscarComidaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPbuscarComidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
                    .addGroup(jPbuscarComidaLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPbuscarComidaLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jBtnAgregaComidaIngrediente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPbuscarComidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTextBuscarIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        jPbuscarComidaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel5, jTextBuscarIngrediente});

        jPbuscarComidaLayout.setVerticalGroup(
            jPbuscarComidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPbuscarComidaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel6)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addGroup(jPbuscarComidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPbuscarComidaLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextBuscarIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPbuscarComidaLayout.createSequentialGroup()
                        .addComponent(jBtnAgregaComidaIngrediente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jTableComidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Detalle", "Calorias"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableComidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableComidasMouseClicked(evt);
            }
        });
        jTableComidas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableComidasKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTableComidas);
        if (jTableComidas.getColumnModel().getColumnCount() > 0) {
            jTableComidas.getColumnModel().getColumn(0).setPreferredWidth(20);
            jTableComidas.getColumnModel().getColumn(1).setPreferredWidth(70);
            jTableComidas.getColumnModel().getColumn(2).setPreferredWidth(50);
            jTableComidas.getColumnModel().getColumn(3).setPreferredWidth(20);
        }

        jTbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTbuscarKeyReleased(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Buscar por Nombre");

        jBtnAgregarComida.setText("Agregar");
        jBtnAgregarComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAgregarComidaActionPerformed(evt);
            }
        });

        jBtnModificar.setText("Modificar");
        jBtnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnModificarMouseClicked(evt);
            }
        });
        jBtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnModificarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Tabla Comidas");

        javax.swing.GroupLayout jPcomidasLayout = new javax.swing.GroupLayout(jPcomidas);
        jPcomidas.setLayout(jPcomidasLayout);
        jPcomidasLayout.setHorizontalGroup(
            jPcomidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPcomidasLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPcomidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPcomidasLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPcomidasLayout.createSequentialGroup()
                        .addComponent(jBtnAgregarComida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnModificar)
                        .addGap(38, 38, 38)
                        .addGroup(jPcomidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jTbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))))
            .addGroup(jPcomidasLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPcomidasLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel4, jTbuscar});

        jPcomidasLayout.setVerticalGroup(
            jPcomidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPcomidasLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel9)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPcomidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPcomidasLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jTbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPcomidasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPcomidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnAgregarComida)
                            .addComponent(jBtnModificar))))
                .addGap(28, 28, 28))
        );

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("3. Click <Agregar Ingrediente a Comida>");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("2. Seleccione un ingrediente");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("1. Seleccione una comida");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Agregar Ingredientes a Comida");

        jBtnRefresca.setText("Refresca");
        jBtnRefresca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRefrescaActionPerformed(evt);
            }
        });

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel8))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBtnRefresca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(56, 56, 56))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnRefresca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        jTableIngreComi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "idComida", "IdIngrediente", "Nombre", "Calorias [x100gr]"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Short.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableIngreComi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableIngreComiMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableIngreComi);
        if (jTableIngreComi.getColumnModel().getColumnCount() > 0) {
            jTableIngreComi.getColumnModel().getColumn(0).setResizable(false);
            jTableIngreComi.getColumnModel().getColumn(0).setPreferredWidth(25);
            jTableIngreComi.getColumnModel().getColumn(1).setResizable(false);
            jTableIngreComi.getColumnModel().getColumn(1).setPreferredWidth(25);
            jTableIngreComi.getColumnModel().getColumn(2).setResizable(false);
            jTableIngreComi.getColumnModel().getColumn(2).setPreferredWidth(25);
            jTableIngreComi.getColumnModel().getColumn(3).setPreferredWidth(70);
            jTableIngreComi.getColumnModel().getColumn(4).setPreferredWidth(45);
        }

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Tabla Comida-Ingredientes");

        jTtotalCalorias.setEditable(false);
        jTtotalCalorias.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jBtnEliminar.setText("Eliminar");
        jBtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jBtnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTtotalCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTtotalCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnEliminar))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPbuscarComida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPcomidas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPcomidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPbuscarComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableComidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableComidasMouseClicked
        indiceComida = jTableComidas.getSelectedRow();
        tbcIdComida = modeloComida.getValueAt(indiceComida,0).toString();
        tbcNombre = modeloComida.getValueAt(indiceComida,1).toString();
        tbcDetalle = modeloComida.getValueAt(indiceComida,2).toString();
        tbcCalorias = modeloComida.getValueAt(indiceComida,3).toString();

        //buscaComida(idComida);
        int idComida = Integer.parseInt(tbcIdComida);
        cargaTablaIngreComi(idComida);

    }//GEN-LAST:event_jTableComidasMouseClicked

    private void jTableComidasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableComidasKeyPressed
        
        
    }//GEN-LAST:event_jTableComidasKeyPressed

    private void jTbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTbuscarKeyReleased
        ComidaData comiData = new ComidaData();
        borrarFilas();
        if (!jTbuscar.getText().isEmpty()) {
            //for (Comida comi : ComidaData.listarComidas()) {
            for (Comida comi : comiData.listarComidas() ) {
                if (comi.getNombre().startsWith(jTbuscar.getText())) {
                    modeloComida.addRow(new Object[]{comi.getIdComida(),comi.getNombre(), comi.getDetalle(),
                        comi.getCantCalorias()});
                }
            }
        } 
    }//GEN-LAST:event_jTbuscarKeyReleased

    private void jBtnAgregarComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAgregarComidaActionPerformed
        V_Form_Comida vmc = new V_Form_Comida();
        vmc.setVisible(true);
        vmc.pack();
        vmc.setLocationRelativeTo(null);
        vmc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vmc.setAccion("Agregar");
        vmc.setTitle("Agregando una Comida...");
    }//GEN-LAST:event_jBtnAgregarComidaActionPerformed

    private void jBtnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnModificarMouseClicked
    }//GEN-LAST:event_jBtnModificarMouseClicked

    
    
    private void jTableIngredientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableIngredientesMouseClicked
        indiceIngrediente = jTableIngredientes.getSelectedRow();

        tbiIdIngrediente = modeloIngre.getValueAt(indiceIngrediente,0).toString();
        tbiNombre  = modeloIngre.getValueAt(indiceIngrediente,1).toString();
        tbiCalorias = modeloIngre.getValueAt(indiceIngrediente,2).toString();

    }//GEN-LAST:event_jTableIngredientesMouseClicked

    private void jTextBuscarIngredienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextBuscarIngredienteKeyReleased
        IngredienteData ingreData = new IngredienteData();
        if (modeloIngre.getRowCount()>0) {
          borrarIngredientes();    
        }
        
        if (!jTextBuscarIngrediente.getText().isEmpty()) {
            for (Ingrediente ingre : ingreData.litarIngredientes()) {
                if (ingre.getNombre().startsWith(jTextBuscarIngrediente.getText())) {
                    modeloIngre.addRow(new Object[]{ingre.getIdIngrediente(),ingre.getNombre(),
                    ingre.getCaloriasPor100GR()});
                }
            }
        } else {
        }
    }//GEN-LAST:event_jTextBuscarIngredienteKeyReleased

    private void jBtnRefrescaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRefrescaActionPerformed
        refresca();
    }//GEN-LAST:event_jBtnRefrescaActionPerformed

    private void jBtnAgregaComidaIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAgregaComidaIngredienteActionPerformed
        insertComidaIngrediente();
    }//GEN-LAST:event_jBtnAgregaComidaIngredienteActionPerformed

    private void jTextBuscarIngredienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextBuscarIngredienteKeyTyped
        IngredienteData ingreData = new IngredienteData();
        if (modeloIngre.getRowCount()>0) {
          borrarIngredientes();    
        }
        
        if (!jTextBuscarIngrediente.getText().isEmpty()) {
            for (Ingrediente ingre : ingreData.litarIngredientes()) {
                if (ingre.getNombre().startsWith(jTextBuscarIngrediente.getText())) {
                    modeloIngre.addRow(new Object[]{ingre.getIdIngrediente(),ingre.getNombre(),
                    ingre.getCaloriasPor100GR()});
                }
            }
        } else {
        }    
    }//GEN-LAST:event_jTextBuscarIngredienteKeyTyped

    private void jBtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnModificarActionPerformed
        if (tbcIdComida!="") {

            V_Form_Comida vmc = new V_Form_Comida();
            vmc.setVisible(true);
            vmc.pack();
            vmc.setLocationRelativeTo(null);
            vmc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            vmc.setjTidComida(tbcIdComida);
            vmc.setjTnombre(tbcNombre);
            vmc.setjTdetalle(tbcDetalle);
            vmc.setjTcalorias(tbcCalorias);

            vmc.setAccion("Modificar");
            String titulo = "Modificando comida: " + tbcNombre;
            vmc.setTitle(titulo);

        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una comida ", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBtnModificarActionPerformed

    private void jTableIngreComiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableIngreComiMouseClicked
        indiceIngreComi = jTableIngreComi.getSelectedRow();
        tbicIdingredienteComida = modeloIngreComi.getValueAt(indiceIngreComi,0).toString();
        
    }//GEN-LAST:event_jTableIngreComiMouseClicked

    private void jBtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarActionPerformed
        eliminaIngreComi();
    }//GEN-LAST:event_jBtnEliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAgregaComidaIngrediente;
    private javax.swing.JButton jBtnAgregarComida;
    private javax.swing.JButton jBtnEliminar;
    private javax.swing.JButton jBtnModificar;
    private javax.swing.JButton jBtnRefresca;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPbuscarComida;
    private javax.swing.JPanel jPcomidas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private static javax.swing.JTable jTableComidas;
    private static javax.swing.JTable jTableIngreComi;
    private javax.swing.JTable jTableIngredientes;
    private javax.swing.JTextField jTbuscar;
    private javax.swing.JTextField jTextBuscarIngrediente;
    private javax.swing.JTextField jTtotalCalorias;
    // End of variables declaration//GEN-END:variables

    //Comida-Ingredientes
    public void insertComidaIngrediente() {
        if (!validaDatos()) {
            int idComida = Integer.parseInt(tbcIdComida);
            int idIngrediente =  Integer.parseInt(tbiIdIngrediente);
            IngredienteComidaData ingreComiData = new IngredienteComidaData();        
            ingreComiData.insertIngredienteComida(idComida, idIngrediente);
            cargaTablaIngreComi(idComida);
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una comida y un ingrediente", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void cargaTablaIngreComi(int idComida) {
        
        DefaultTableModel ingreComiDatos = (DefaultTableModel) jTableIngreComi.getModel();
        ingreComiDatos.setNumRows(0);
        IngredienteComidaData icd = new IngredienteComidaData();
        ArrayList<Object[]> datos = icd.selectIngredienteComida(idComida);
        for (Object[] fila : datos) {
            ingreComiDatos.addRow(fila);
        }
        
        System.out.println("Filas: " + modeloIngreComi.getRowCount());
        
        sumaCalorias();
    }
 
    public void sumaCalorias(){
        int totalCalorias = 0;
        int calorias = 0;
        for (int fila = 0; fila < modeloIngreComi.getRowCount(); fila++) {
            calorias = Integer.parseInt(modeloIngreComi.getValueAt(fila, 4).toString());
            totalCalorias += calorias;
        }    
        jTtotalCalorias.setText(String.valueOf(totalCalorias));
        actualizaCalorias(totalCalorias);
    }
    
    
    
    public void eliminaIngreComi() {
        if (tbicIdingredienteComida != "") {

            modeloIngreComi.removeRow(indiceIngreComi);
            jTableIngreComi.repaint();

            //Elimina registro de la base de datos
            IngredienteComidaData ingreComi = new IngredienteComidaData();
            System.out.println("id: " + Integer.parseInt(tbicIdingredienteComida));
            ingreComi.deleteIngredienteComida(Integer.parseInt(tbicIdingredienteComida));
            sumaCalorias();
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione el ingrediente a eliminar", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void borrarFilasIngreComi() {
        int f = jTableIngreComi.getRowCount() - 1;
        for (; f >= 0; f--) {
            modeloIngreComi.removeRow(f);
        }
    }
    
    //Ingredientes
    public void cargaTablaIngredientes() {
        DefaultTableModel datos = (DefaultTableModel) jTableIngredientes.getModel();
        
        datos.setNumRows(0);
        IngredienteData id = new IngredienteData();
        for (Ingrediente i : id.litarIngredientes()) {
            Object[] fila = new Object[3];
            fila[0] = i.getIdIngrediente();
            fila[1] = i.getNombre();
            fila[2] = i.getCaloriasPor100GR();
            datos.addRow(fila);
        }
    }

    private void borrarIngredientes() {
        int f = modeloIngre.getRowCount() - 1;
        for (; f >= 0; f--) {
            modeloIngre.removeRow(f);
        }
    }
    
    //Comidas
    public static void agregarFilaTablaComidas(Object datosFila){
        DefaultTableModel model = (DefaultTableModel) jTableComidas.getModel();
        model.addRow((Object[]) datosFila);
    }
    
    public static void agregaFilaComidas(Object[] dataFila){
        DefaultTableModel model = (DefaultTableModel) jTableComidas.getModel();
        model.addRow(dataFila);
    }
    
    public void actualizaCalorias(int calorias) {
            //Modifica registro en base de datos
            Comida comi = new Comida(Integer.valueOf(tbcIdComida),
                    tbcNombre, tbcDetalle, calorias);
            ComidaData comiData = new ComidaData();
            comiData.modificarComida(comi);

            //Modifica calorias en Tabla Comida de V_Table_AdminComidas
            DefaultTableModel model = (DefaultTableModel) jTableComidas.getModel();
            model.setValueAt((calorias), indiceComida, 3);
            model.fireTableRowsUpdated(indiceComida, indiceComida);
    }
        
    public static void modificaFilaComidas(Object[] dataFila){
        DefaultTableModel model = (DefaultTableModel) jTableComidas.getModel();
        //model.setValueAt((Integer.parseInt((String) dataFila[0])), indiceComida, 0); 
        model.setValueAt(((String) dataFila[1]), indiceComida, 1); 
        model.setValueAt(((String) dataFila[2]), indiceComida, 2); 
        model.setValueAt((Integer.parseInt((String) dataFila[3])), indiceComida, 3); 
        model.fireTableRowsUpdated(indiceComida, indiceComida);
    }

    public void cargaTablaComida() {
        DefaultTableModel datos = (DefaultTableModel) jTableComidas.getModel();
        datos.setNumRows(0);
        ComidaData cd = new ComidaData();
        cd.listarComidas().forEach((c) -> {
            Object[] fila = new Object[4];
            fila[0] = c.getIdComida();
            fila[1] = c.getNombre();
            fila[2] = c.getDetalle();
            fila[3] = c.getCantCalorias();
            datos.addRow(fila);
        });
    }
    
    private void borrarFilas() {
        int f = jTableComidas.getRowCount() - 1;
        for (; f >= 0; f--) {
            modeloComida.removeRow(f);
        }
    }    
    
    
    //Validaciones
    public void validaNumero(java.awt.event.KeyEvent evt) {
        final char tecla = evt.getKeyChar();
        if (Character.isDigit(tecla)
                || tecla == KeyEvent.VK_BACKSPACE
                || tecla == KeyEvent.VK_DELETE
                || (evt.isControlDown() && evt.getKeyCode() == KeyEvent.VK_V)) {
        } else {
            evt.consume();
        }
    }
    
    public boolean validaDatos() {
        if (tbcIdComida.isEmpty() || tbiIdIngrediente.isEmpty()
                || tbiNombre.isEmpty() || tbiCalorias.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    
     public void refresca(){
        jTextBuscarIngrediente.setText("");
        jTbuscar.setText("");
        cargaTablaIngredientes();
        cargaTablaComida();
        borrarFilasIngreComi();
    }
}
