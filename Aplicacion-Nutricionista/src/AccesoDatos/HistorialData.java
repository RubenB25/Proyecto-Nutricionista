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

        String sql = "INSERT INTO historial (id_paciente, cuello, busto,cintura,brazo, cadera, pierna, estatura,fechaConsulta, pesoActual)"
                + "VALUES (?, ?, ?, ?,?,?,?,?,?,?)";
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
              ps.setDouble(10, historial.getPesoActual());
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
            String sql = "INSERT INTO historial (id_Paciente) "
    + "VALUES (rs.getIdPaciente(),rs.getCuello(),rs.getBusto(),rs.getBrazo(), rs.getCintura(), rs.getCadera(), rs.getPierna() rs.getEstatura(), rs.getIdDieta()";
            PreparedStatement ps = conex.prepareStatement(sql);
           
            int filasAfectadas = ps.executeUpdate ();

            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Historial guardado con éxito.");
            } else {
                System.out.println("No se pudo insertar ningún dato.");
            }
        } catch (SQLException e) {
//
        }
//
    }

    public ArrayList<Historial> obtenerPacientePorHistorial(int idPaciente) {
        ArrayList<Historial> listaHistorial = new ArrayList<>();
        try {
            String sql = "SELECT h.idpaciente, h.cuello, h.busto, h.brazo, h.cintura, h.cadera, h.pierna, h.estatura, h.pesoActual FROM historial h INNER JOIN pacientes p ON h.idPaciente = p.idPaciente WHERE h.idPaciente = ?";
            PreparedStatement psm = conex.prepareStatement(sql);
            psm.setInt(1, idPaciente); // Establece el valor del parámetro
            ResultSet rs = psm.executeQuery();
            while (rs.next()) {
                Historial pacienteHistorial = new Historial(rs.getInt("id_Paciente"), rs.getDouble("cuello"), rs.getDouble("busto"), rs.getDouble("brazo"), rs.getDouble("cintura"), rs.getDouble("cadera"), rs.getDouble("pierna"), rs.getDouble("estatura"), rs.getInt("idDieta"), rs.getDouble("pesoActual"));

                listaHistorial.add(pacienteHistorial);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla" + ex.getMessage());
        }
        return listaHistorial;
    }
}
