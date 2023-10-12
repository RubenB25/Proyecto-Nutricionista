package AccesoDatos;

import Entidades.Historial;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

/** @author Gabriel */
public class HistorialData {
 private Connection conex = null;

    public HistorialData() {
        conex = Conexion.getConex();
    }
   
   public void nuevoHistorial(Historial historial) {
       
   
        String sql = "INSERT INTO historial (id_paciente, pesoInicial, peso, pesoDeseado, estatura, fechaFin, fechaConsulta)"
                + "VALUES (?, ?, ?, ?,?;?,?)";
        try {
            PreparedStatement ps = conex.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, historial.getIdPaciente());
            ps.setDouble(2, historial.getPesoInicial());
            ps.setDouble(3, historial.getPeso());
            ps.setDouble(4, historial.getPesoDeseado());
            ps.setDouble(5, historial.getEstatura());
            ps.setDate(6, historial.getFechaFin());
            ps.setDate(7, historial.getFechaConsulta());
               
            ps.executeUpdate();
            ResultSet resultado = ps.getGeneratedKeys();
            if (resultado.next()) {
                historial.setIdPaciente(resultado.getInt(1));
                JOptionPane.showMessageDialog(null, "Historial  agregado con exito");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Historial " + e.getMessage());
        }
        
//        
       public void guardarHistorial( insc) {
        try {
            String sql = "INSERT INTO inscripcion (nota,idAlumno,idMateria) VALUES (" + insc.getNota() + "," + insc.getAlumno().getIdAlumno() + "," + insc.getMateria().getIdMateria() + ")";
            PreparedStatement ps = con.prepareStatement(sql);
            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Inscripción realizada con éxito.");
            } else {
                System.out.println("No se pudo insertar ningún dato.");
            }
        } catch (SQLException e) {
//
        }
//
    }
    }

