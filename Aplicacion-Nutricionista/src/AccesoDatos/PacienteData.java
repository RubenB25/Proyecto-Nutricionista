package AccesoDatos;

import Entidades.Paciente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 * @author User2021SD
 */
public class PacienteData {

    private Connection conex = null;

    public PacienteData() {
        conex = Conexion.getConex();
    }

    public void guardarPaciente(Paciente paciente) {
        String sql = "INSERT INTO `pacientes`( `nombre`, `apellido`, `dni`, "
                + "`domicilio`, `celular`) "
                + "VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = conex.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.getApellido());
            ps.setInt(3, paciente.getDni());
            ps.setString(4, paciente.getDomicilio());
            ps.setInt(5, paciente.getCelular());
            ps.executeUpdate();
            ResultSet resultado = ps.getGeneratedKeys();
            if (resultado.next()) {
                paciente.setIdPaciente(resultado.getInt(1));
                JOptionPane.showMessageDialog(null, "Paciente agregado con exito");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Paciente " + e.getMessage());
        }
    }
  

    public Paciente buscarPacientePorDni(int dni) {
        Paciente paciente = null;
        String sql = "select estado,id_paciente, nombre, apellido ,dni, celular "
                + "from pacientes where dni= ?";
        PreparedStatement ps = null;
        try {
            ps = conex.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet resultado = ps.executeQuery();

            if (resultado.next()) {
            paciente = new Paciente();

                paciente.setIdPaciente(resultado.getInt("id_paciente"));
                paciente.setDni(resultado.getInt("dni"));
                paciente.setApellido(resultado.getString("apellido"));
                paciente.setNombre(resultado.getString("nombre"));
                paciente.setCelular(resultado.getInt("celular"));
                paciente.setEstado(resultado.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe el Paciente");
                ps.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pacientes " + e.getMessage());
        }
        return paciente;
    }
     public void modificarPaciente(Paciente paciente) {
        String sql = "update pacientes set nombre = ?, apellido = ?, dni = ?,celular = ?, estado = ? "
                + "where id_paciente = ?";
        try {
            PreparedStatement ps = conex.prepareStatement(sql);
            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.getApellido());
            ps.setInt(3, paciente.getDni());
            ps.setInt(4, paciente.getCelular());
            ps.setBoolean(5, paciente.isEstado());
            ps.setInt(6, paciente.getIdPaciente());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Paciente  modificado con exito.");
            } else {
                JOptionPane.showMessageDialog(null, "El paciente no existe.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla paciente " + e.getMessage());
        }}
     public void eliminarPaciente(int id) {
        String sql = "update pacientes set estado = 0 where idAlumno = ?";
        try {
            PreparedStatement ps = conex.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Alumno dado de baja correctamente.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno 5" + e.getMessage());

        }
    }
}
