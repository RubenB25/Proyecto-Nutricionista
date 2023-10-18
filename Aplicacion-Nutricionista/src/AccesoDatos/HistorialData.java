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

        String sql = "INSERT INTO historial (id_paciente, cuello, busto,cintura,brazo, cadera, pierna, estatura, pesoActual, fechaRegistro)"
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
            ps.setDouble(9, historial.getPesoActual());
            ps.setDate(10, Date.valueOf(historial.getFechaRegistro()));

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

    public void guardarHistorial(int id, LocalDate fecha, double peso) {
        String sql = "Insert into historial (id_paciente, peso_actual, fecha_registro) values (?,?,?)";
        try {
            PreparedStatement ps = conex.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, id);
            ps.setDouble(2, peso);
            ps.setDate(3, Date.valueOf(fecha));
            ps.executeUpdate();
            ResultSet resultado = ps.getGeneratedKeys();

            if (resultado.next()) {
                JOptionPane.showMessageDialog(null, "Historial  agregado con exito");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Historial %%%%%%" + e.getMessage());
        }

    }

    public ArrayList<Historial> obtenerHistorial() {
        ArrayList<Historial> listaHistorial = new ArrayList<>();

        try {
            String sql = "Select * from historial";

            PreparedStatement psm = conex.prepareStatement(sql);
            ResultSet rs = psm.executeQuery();
            while (rs.next()) {
                Historial historial = new Historial();
                Paciente paciente = new Paciente();
                paciente.setIdPaciente(rs.getInt("id_paciente"));
                historial.setIdPaciente(paciente.getIdPaciente());
                historial.setPesoActual(rs.getDouble("peso_actual"));
                historial.setFechaRegistro(rs.getDate("fecha_registro").toLocalDate());
                listaHistorial.add(historial);
            }
            psm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
        return listaHistorial;
    }

    public ArrayList<Historial> obtenerPacientePorHistorial(int idPaciente) {
        ArrayList<Historial> listaHistorial = new ArrayList<>();
        try {
            String sql = "SELECT h.idpaciente, h.cuello, h.busto, h.brazo, h.cintura, h.cadera, h.pierna, h.estatura, h.pesoActual, h.fechaRegistro FROM historial h INNER JOIN pacientes p ON h.idPaciente = p.idPaciente WHERE h.idPaciente = ?";
            PreparedStatement psm = conex.prepareStatement(sql);
            psm.setInt(1, idPaciente); // Establece el valor del parámetro
            ResultSet rs = psm.executeQuery();
            while (rs.next()) {
                Historial pacienteHistorial = new Historial(rs.getInt("id_Paciente"), rs.getDouble("cuello"),
                        rs.getDouble("busto"), rs.getDouble("brazo"), rs.getDouble("cintura"), rs.getDouble("cadera"),
                        rs.getDouble("pierna"), rs.getDouble("estatura"), rs.getInt("idDieta"), rs.getDouble("pesoActual"));
                Date fechaRegistroSQL = rs.getDate("fechaRegistro");
                LocalDate fechaRegistro = fechaRegistroSQL.toLocalDate();

                listaHistorial.add(pacienteHistorial);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla" + ex.getMessage());
        }
        return listaHistorial;
    }
}
