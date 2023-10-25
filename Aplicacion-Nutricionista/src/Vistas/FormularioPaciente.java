package Vistas;

import AccesoDatos.PacienteData;
import Entidades.Paciente;
import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 * @author Gabriel
 */
public class FormularioPaciente extends javax.swing.JInternalFrame {

    private Paciente paciente;

    public FormularioPaciente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTnombre = new javax.swing.JTextField();
        jTapellido = new javax.swing.JTextField();
        jTdocumento = new javax.swing.JTextField();
        jTdomicilio = new javax.swing.JTextField();
        jTcelular = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTpesoActual = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTFedad = new javax.swing.JTextField();
        jDCfechaNacimiento = new com.toedter.calendar.JDateChooser();
        jBguardar = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jBguardarCambios = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTPesoDeseado1 = new javax.swing.JTextField();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel2.setText("Apellido:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel3.setText("Documento:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel4.setText("Domicilio:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel5.setText("Celular:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));
        jPanel1.add(jTnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 32, 200, -1));
        jPanel1.add(jTapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 72, 200, -1));
        jPanel1.add(jTdocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 112, 200, -1));
        jPanel1.add(jTdomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 152, 200, -1));
        jPanel1.add(jTcelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 192, 200, -1));

        jLabel6.setText("Peso actual:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));
        jPanel1.add(jTpesoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 312, 60, -1));

        jLabel8.setText("Fecha nacimiento:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel9.setText("Edad:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));
        jPanel1.add(jTFedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 272, 60, -1));
        jPanel1.add(jDCfechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 232, 130, -1));

        jBguardar.setText("Guardar");
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });
        jPanel1.add(jBguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });
        jPanel1.add(jBsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 390, -1, -1));

        jBguardarCambios.setText("Guardar");
        jBguardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarCambiosActionPerformed(evt);
            }
        });
        jPanel1.add(jBguardarCambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        jLabel10.setText("Peso deseado:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));
        jPanel1.add(jTPesoDeseado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 352, 60, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean validarNombre(String nombre) {
        return Pattern.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$", nombre) && nombre.length() <= 50;
    }

    public boolean validarApellido(String apellido) {
        return Pattern.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$", apellido) && apellido.length() <= 50;
    }

    public boolean validarDocumento(String dni) {
        try {
            int dniInt = Integer.parseInt(dni);
            return dniInt >= 1 && dniInt <= 99999999;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean validarEdad(int edad) {
        try {
            return edad >= 1 && edad <= 150;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean validarDomicilio(String domicilio) {
        return Pattern.matches("^[a-zA-Z0-9áéíóúÁÉÍÓÚñÑ\\s]+$", domicilio) && domicilio.length() <= 100;
    }

    public static boolean validarCelular(String celular) {
        return Pattern.matches("^[0-9]+$", celular) && celular.length() <= 15;
    }

    public boolean validarFechNac(LocalDate fechaNac) {
        LocalDate fechaActual = LocalDate.now();
        return fechaNac.isBefore(fechaActual);
    }

    public boolean validarPesoActual(double pesoAct) {
        try {
            return pesoAct >= 0 && pesoAct <= 500;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
    }

    public boolean validarPesoDeseado(double pesoDes) {
        try {
            return pesoDes >= 0 && pesoDes <= 500;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
    }

    public boolean validarEdadYFecha(LocalDate fechaNacimiento, int edad) {
        if (validarFechNac(fechaNacimiento)) {
            LocalDate fechaActual = LocalDate.now();

            Period periodo = Period.between(fechaNacimiento, fechaActual);
            int edadCalculada = periodo.getYears();

            return edadCalculada == edad;
        }
        return false;
    }

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        PacienteData pacienteData = new PacienteData();
        if (verificarCamposVacios()) {
            String nombre = (jTnombre.getText().trim()).replaceAll("\\s+", " ");
            String apellido = (jTapellido.getText().trim()).replaceAll("\\s+", " ");
            String documento = (jTdocumento.getText().trim()).replaceAll("\\s+", " ");
            String domicilio = (jTdomicilio.getText().trim()).replaceAll("\\s+", " ");
            String celular = (jTcelular.getText().trim()).replaceAll("\\s+", " ");
            int edad = Integer.parseInt(jTFedad.getText());
            LocalDate fechaNac = jDCfechaNacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            double pesoAct = Double.parseDouble(jTpesoActual.getText());
           double pesoDes= Double.parseDouble(jTPesoDeseado1.getText());
            if (validarNombre(nombre) && validarApellido(apellido) && validarDocumento(documento)
                    && validarDomicilio(domicilio) && validarCelular(celular) && validarEdadYFecha(fechaNac, edad)
                    && validarEdad(edad) && validarPesoActual(pesoAct) && validarPesoDeseado(pesoDes)) {
              //  paciente = new Paciente(nombre, apellido, documento, domicilio, celular,
               //         fechaNac, edad, pesoAct, pesoDes, true, estatura);
                pacienteData.guardarPaciente(paciente);
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(null, "Verifique los datos");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos");
        }
    }//GEN-LAST:event_jBguardarActionPerformed

    private void jBguardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarCambiosActionPerformed
        PacienteData pacienteData = new PacienteData();
        if (verificarCamposVacios()) {
            String nombre = (jTnombre.getText().trim()).replaceAll("\\s+", " ");
            String apellido = (jTapellido.getText().trim()).replaceAll("\\s+", " ");
            String documento = (jTdocumento.getText().trim()).replaceAll("\\s+", " ");
            String domicilio = (jTdomicilio.getText().trim()).replaceAll("\\s+", " ");
            String celular = (jTcelular.getText().trim()).replaceAll("\\s+", " ");
            int edad = Integer.parseInt(jTFedad.getText());
            LocalDate fechaNac = jDCfechaNacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            double pesoAct = Double.parseDouble(jTpesoActual.getText());
            double pesoDes = Double.parseDouble(jTPesoDeseado1.getText());

            if (validarNombre(nombre) && validarApellido(apellido) && validarDocumento(documento)
                    && validarDomicilio(domicilio) && validarCelular(celular) && validarEdadYFecha(fechaNac, edad)
                    && validarEdad(edad) && validarPesoActual(pesoAct) && validarPesoDeseado(pesoDes)) {
            paciente = new Paciente(nombre, apellido, documento, domicilio, celular,
                        fechaNac, edad, pesoAct, pesoDes, true);
                pacienteData.modificarPaciente(paciente);
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(null, "Verifique los datos");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos");
        }
    }//GEN-LAST:event_jBguardarCambiosActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    public boolean verificarCamposVacios() {
        try {
            return !(jTFedad.getText().isEmpty() || jTapellido.getText().isEmpty()
                    || jTcelular.getText().isEmpty() || jTdocumento.getText().isEmpty() || jTdomicilio.getText().isEmpty()
                    || jTnombre.getText().isEmpty() || jTapellido.getText().isEmpty() || jDCfechaNacimiento.getDate() == null);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un dato valido");
            return false;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un documento valido");
            return false;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
    }

    public void limpiarCampos() {
        jTFedad.setText("");
        jTdocumento.setText("");
        jTdomicilio.setText("");
        jTapellido.setText("");
        jTnombre.setText("");
        jTcelular.setText("");
        jTpesoActual.setText("");
        jDCfechaNacimiento.setDate(null);
    }

    public void llenarCampos(Paciente paciente) {
        jTFedad.setText(String.valueOf(paciente.getEdad()));
        jTdocumento.setText(paciente.getDni());
        jTPesoDeseado1.setText(String.valueOf(paciente.getPesoDeseado()));
        jTdomicilio.setText(paciente.getDomicilio());
        jTapellido.setText(paciente.getApellido());
        jTnombre.setText(paciente.getNombre());
        jTcelular.setText(paciente.getCelular());
        jTpesoActual.setText(String.valueOf(paciente.getPesoActual()));
        jDCfechaNacimiento.setDate(Date.valueOf(paciente.getFechaNac()));
        jBguardar.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBguardarCambios;
    private javax.swing.JButton jBsalir;
    private com.toedter.calendar.JDateChooser jDCfechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFedad;
    private javax.swing.JTextField jTPesoDeseado1;
    private javax.swing.JTextField jTapellido;
    private javax.swing.JTextField jTcelular;
    private javax.swing.JTextField jTdocumento;
    private javax.swing.JTextField jTdomicilio;
    private javax.swing.JTextField jTnombre;
    private javax.swing.JTextField jTpesoActual;
    // End of variables declaration//GEN-END:variables
}
