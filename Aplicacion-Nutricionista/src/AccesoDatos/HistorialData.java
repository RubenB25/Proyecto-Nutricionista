package AccesoDatos;

import Entidades.Historial;

import Entidades.Paciente;
import Entidades.historialConNombreyApellido;

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
        LocalDate fechaRegistro = LocalDate.now();
        String sql = "INSERT INTO historial (id_paciente, cuello, busto,cintura,brazo, cadera, pierna,estatura, peso_actual,fecha_registro)"
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
            ps.setInt(8, historial.getEstatura());

            ps.setDouble(9, historial.getPesoActual());
            ps.setDate(10, Date.valueOf(fechaRegistro));

            ps.executeUpdate();
            ResultSet resultado = ps.getGeneratedKeys();
            if (resultado.next()) {
                historial.setIdHistorial(resultado.getInt(1));
                JOptionPane.showMessageDialog(null, "Historial  agregado con exito");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Historial " + e.getMessage());
        }
    }

    public ArrayList<Historial> obtenerHistorialdePaciente(int id) {

        ArrayList<Historial> listaHistorial = new ArrayList();
        try {
            String sql = "SELECT * FROM historial WHERE id_paciente = ? order by fecha_registro desc";
            PreparedStatement psm = conex.prepareStatement(sql);
            psm.setInt(1, id); // Establece el valor del parámetro ? con el ID del paciente.
            ResultSet rs = psm.executeQuery();
            while (rs.next()) {
                
                Historial historial = new Historial();
                Paciente paciente = new Paciente();
                paciente.setIdPaciente(id); // Establece el ID del paciente
                historial.setCuello(rs.getDouble("cuello"));
                historial.setBusto(rs.getDouble("busto"));
               
                historial.setCintura(rs.getDouble("cintura"));
                historial.setBrazo(rs.getDouble("brazo"));
                historial.setCadera(rs.getDouble("cadera"));
                historial.setPierna(rs.getDouble("pierna"));
             
                historial.setPesoActual(rs.getDouble("peso_actual"));
                historial.setEstatura(rs.getInt("estatura"));
                historial.setIdPaciente(rs.getInt("id_paciente"));
               
                historial.setFechaRegistro(rs.getDate("fecha_registro").toLocalDate());
                listaHistorial.add(historial);
           
            }
            psm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos HISTORIAL" + e.getMessage());
        }
        return listaHistorial;
    }

    public ArrayList<Historial> ListaHistorialobtenerHistorialPorID(int ID) {
        ArrayList<Historial> listaHistorial = new ArrayList<>();
        try {
            String sql = "SELECT h.id_paciente, h.peso_actual, h.fecha_registro FROM historial AS h";
            PreparedStatement psm = conex.prepareStatement(sql);
            ResultSet rs = psm.executeQuery();
            while (rs.next()) {

                Historial pacienteHistorial = new Historial(rs.getInt("id_paciente"),
                        rs.getDouble("peso_actual"), rs.getDate("fecha_registro").toLocalDate());
                listaHistorial.add(pacienteHistorial);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla" + ex.getMessage());
        }
        return listaHistorial;
    }
//        

    public ArrayList<historialConNombreyApellido> obtenerHistorialesConNombreApellido() {
        ArrayList<historialConNombreyApellido> listaHistorialConNombreyApellidos = new ArrayList<>();
        try {
            String sql = "SELECT p.nombre, p.apellido, h.peso_actual, h.fecha_registro FROM historial AS h "
                    + "INNER JOIN pacientes AS p ON h.id_paciente = p.id_paciente order by h.fecha_registro desc";
            PreparedStatement psm = conex.prepareStatement(sql);
            ResultSet rs = psm.executeQuery();
            while (rs.next()) {

                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                Double pesoActual = rs.getDouble("peso_actual");
                Date fechaRegistroSQL = rs.getDate("fecha_registro");

                LocalDate fechaRegistro = fechaRegistroSQL.toLocalDate();
               
                historialConNombreyApellido pacienteHistorial = new historialConNombreyApellido(nombre, apellido, rs.getDouble("pesoActual"), fechaRegistro);
                listaHistorialConNombreyApellidos.add(pacienteHistorial);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla" + ex.getMessage());
        }
        return listaHistorialConNombreyApellidos;

    }

    public ArrayList<historialConNombreyApellido> obtenerHistorialesDePaciente(int id) {
        ArrayList<historialConNombreyApellido> listaHistorialConNombreyApellidos = new ArrayList<>();
        try {
            String sql = "SELECT p.nombre, p.apellido, h.peso_actual, h.fecha_registro FROM historial AS h "
                    + "INNER JOIN pacientes AS p ON p.id_paciente = ? order by h.fechaRegistro desc";
            PreparedStatement psm = conex.prepareStatement(sql);
            psm.setInt(1, id);
            ResultSet rs = psm.executeQuery();
            while (rs.next()) {

                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                Double pesoActual = rs.getDouble("peso_actual");
                Date fechaRegistroSQL = rs.getDate("fecha_registro");
                LocalDate fechaRegistro = fechaRegistroSQL.toLocalDate();
               

                historialConNombreyApellido pacienteHistorial = new historialConNombreyApellido(nombre, apellido, rs.getDouble("pesoActual"), fechaRegistro);
                listaHistorialConNombreyApellidos.add(pacienteHistorial);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla" + ex.getMessage());
        }
        return listaHistorialConNombreyApellidos;

    }


}
