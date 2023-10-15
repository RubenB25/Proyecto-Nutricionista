package AccesoDatos;

import Entidades.Historial;
import Entidades.Paciente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

/**
 * @author Gabriel
 */
public class HistorialData {

    private Connection conex = null;

    public HistorialData() {
        conex = Conexion.getConex();
    }

    public void nuevoHistorial(Historial historial) {

        String sql = "INSERT INTO historial (id_paciente, cuello, busto,cintura,brazo, cadera, pierna, estatura,fechaConsulta)"
                + "VALUES (?, ?, ?, ?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conex.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, historial.getIdPaciente());
            ps.setDouble(2, historial.getCuello());
            ps.setDouble(3, historial.getBusto());
            ps.setDouble(4, historial.getCintura());
            ps.setDouble(5, historial.getBrazo());
            ps.setDouble(6, historial.getCadera());
            ps.setDouble(7, historial.getPierna());
            ps.setDouble(8, historial.getEstatura());
            ps.setDate(9, Date.valueOf(historial.getFechaRegistro()));

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
    }
//        

    public void guardarHistorial(Historial rs) {
        try {
            String sql = "INSERT INTO Historial (idPaciente) VALUES (" + rs.getIdPaciente() + "," + rs.getDouble().getCuello() + "," + insc.getMateria().getIdMateria() + ")";
            PreparedStatement ps = conex.prepareStatement(sql);
            int filasAfectadas = ps.executeUpdate ();

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

    public ArrayList<Paciente> obtenerPacientePorHistorial(int idPaciente) {
        ArrayList<Paciente> listaPacientes = new ArrayList<>();
        try {
            String sql = "SELECT p.idpaciente, p.dni, p.apellido, p.nombre FROM paciente p INNER JOIN historial h ON p.idPaciente = h.idPaciente WHERE h.idPaciente = ?";
            PreparedStatement psm = conex.prepareStatement(sql);
            psm.setInt(1, idPaciente); // Establece el valor del parámetro
            ResultSet rs = psm.executeQuery();
            while (rs.next()) {
                Paciente pacienteObtenido = new Paciente(rs.getInt("idPaciente"), rs.getInt("dni"), rs.getString("apellido"), rs.getString("nombre"));

                listaPacientes.add(pacienteObtenido);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla" + ex.getMessage());
        }
        return listaPacientes;
    }
}
