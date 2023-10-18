package AccesoDatos;

import Entidades.Paciente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

/** @author Gabriel */
public class HistorialData {
 private Connection conex = null;

    public HistorialData() {
        conex = Conexion.getConex();
    }
   
     public void guardarHistorial(int id_paciente, String fechaConsulta, double pesoActual) {
    try {
        String sql = "INSERT INTO historial (id_paciente, fechaConsulta, pesoActual) VALUES (?, ?, ?)";
        PreparedStatement ps = conex.prepareStatement(sql);

        // Establece los valores de los parámetros
        ps.setInt(1, id_paciente);
        ps.setString(2, fechaConsulta);
        ps.setDouble(3, pesoActual);

        int filasAfectadas = ps.executeUpdate();

        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(null, "Historial guardado con éxito.");
        } else {
            System.out.println("No se pudo insertar ningún dato.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        // Maneja la excepción adecuadamente, por ejemplo, mostrando un mensaje de error.
    }}
  
      public Paciente buscarHistorialPorDni(String dni) {
        Paciente paciente = null;
        PacienteData dato= new PacienteData();
        
        int id= dato.buscarPacientePorDni(dni);
        String sql = "select  pesoActual, fechaRegistro from historial where id=? "
                + "from pacientes where id_paciente= ?";
        PreparedStatement ps = null;
        try {
            ps = conex.prepareStatement(sql);
            ps.setString(1,id );
            ResultSet resultado = ps.executeQuery();

            if (resultado.next()) {
                historial = new Historial();
                
                historial.setPesoActual(resultado.getDouble("peso_actual"));
                historial.setFechaNac(resultado.getDate("fechaRegistro").toLocalDate());
               
            } else {
                JOptionPane.showMessageDialog(null, "No hay historial de paciente");
                ps.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Historial " + e.getMessage());
        }
        return paciente;
    }}

 