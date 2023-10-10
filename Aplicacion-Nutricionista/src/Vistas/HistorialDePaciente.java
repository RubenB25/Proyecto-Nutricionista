
package Vistas;

import AccesoDatos.PacienteData;
import javax.swing.JOptionPane;

public class HistorialDePaciente extends javax.swing.JInternalFrame {

    private String nombre2,apellido2;

    /**
     * Creates new form Historial
     */
    public HistorialDePaciente() {
        initComponents();
    PacienteABM recibe= new PacienteABM();
    recibe.setVisible(true);}
       /* recibe.jTFnombre.setText(jTFrecibirnombre.getText());
        recibe.jTFapellido.setText(jTFrecibirapellido.getText());
       // NutricionistaEscritorio.jDescritorio.add(HistorialDePaciente);
       jTFrecibirapellido.setText("");
       jTFrecibirnombre.setText("");
           //  PacienteData pacien= new PacienteData();

       
    }
   /* public void setdato(String dato,String dato2){
    this.dato=dato;
    this.dato2=dato2;
}*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jTFrecibirnombre = new javax.swing.JTextField();
        jTFrecibirapellido = new javax.swing.JTextField();
        jTFpeso = new javax.swing.JTextField();
        jTFestatura = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTFedad = new javax.swing.JTextField();
        jRBmujer = new javax.swing.JRadioButton();
        jRBhombre = new javax.swing.JRadioButton();
        jBIMC = new javax.swing.JButton();
        jLresultado = new javax.swing.JLabel();
        jBdieta = new javax.swing.JButton();
        jBguardar = new javax.swing.JButton();
        jBmedidas = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setTitle("Historial");

        jTFrecibirnombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTFrecibirapellido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTFpeso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTFestatura.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Apellido:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Peso:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Altura:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Edad:");

        jTFedad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jRBmujer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRBmujer.setText("Mujer");

        jRBhombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRBhombre.setText("Hombre");

        jBIMC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBIMC.setText("IMC");
        jBIMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIMCActionPerformed(evt);
            }
        });

        jLresultado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jBdieta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBdieta.setText("Dieta");

        jBguardar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBguardar.setText("Guardar");

        jBmedidas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBmedidas.setText("Medidas");

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBIMC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 36, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRBmujer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRBhombre))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTFrecibirnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                            .addComponent(jTFrecibirapellido)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTFpeso, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                        .addComponent(jTFestatura, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTFedad, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBdieta)
                                    .addComponent(jBguardar)
                                    .addComponent(jBmedidas)
                                    .addComponent(jButton1))))
                        .addContainerGap(60, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFrecibirnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jBdieta))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFrecibirapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBguardar)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jTFpeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTFestatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTFedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jBmedidas)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBmujer)
                    .addComponent(jRBhombre))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jBIMC))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBIMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIMCActionPerformed
       double imc, peso,altura;
       peso = Double.parseDouble(jTFpeso.getText());
       altura = Double.parseDouble(jTFestatura.getText());
       imc=peso/altura;
       if (imc <18.5){
           jLresultado.setText("Usted tiene un peso inferior al normal, deberias de comenzar un tratamiento de aumento");
       }if(imc>18.5 && imc<24.5){
           jLresultado.setText("usted tiene un peso normal");
       }if(imc>24.5&& imc<29.9){
           jLresultado.setText("Usted tiene sobrepeso, debe realizar tratamiento");
       }if(imc>30){
           jLresultado.setText("Usted tiene Obesidad, realice el tratamiento con urgencia");
       }
    }//GEN-LAST:event_jBIMCActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jBIMC;
    private javax.swing.JButton jBdieta;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBmedidas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLresultado;
    private javax.swing.JRadioButton jRBhombre;
    private javax.swing.JRadioButton jRBmujer;
    private javax.swing.JTextField jTFedad;
    private javax.swing.JTextField jTFestatura;
    private javax.swing.JTextField jTFpeso;
    public static javax.swing.JTextField jTFrecibirapellido;
    public static javax.swing.JTextField jTFrecibirnombre;
    // End of variables declaration//GEN-END:variables

    
}
