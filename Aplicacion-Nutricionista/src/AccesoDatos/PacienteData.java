package AccesoDatos;

import Entidades.Paciente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
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
        String sql = "INSERT INTO pacientes (nombre, apellido, dni, "
                + "domicilio, celular, fecha_nacimiento, edad, peso_actual, peso_deseado, estado) "
                + "VALUES (?,?,?,?,?,?,?,?,?,1)";
        try {
            PreparedStatement ps = conex.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.getApellido());
            ps.setString(3, paciente.getDni());
            ps.setString(4, paciente.getDomicilio());
            ps.setString(5, paciente.getCelular());
            ps.setDate(6, Date.valueOf(paciente.getFechaNac()));
            ps.setInt(7, paciente.getEdad());
            ps.setDouble(8, paciente.getPesoActual());
            ps.setDouble(9, paciente.getPesoDeseado());
            ps.setBoolean(10, paciente.isEstado());
            
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

    public Paciente buscarPacientePorDni(String dni) {
        Paciente paciente = null;
        String sql = "select id_paciente, nombre, apellido, dni, domicilio, celular, fecha_nacimiento, edad, peso_actual, peso_deseado, estado "
                + "from pacientes where dni= ?";
        PreparedStatement ps = null;
        try {
            ps = conex.prepareStatement(sql);
            ps.setString(1, dni);
            ResultSet resultado = ps.executeQuery();

            if (resultado.next()) {
                paciente = new Paciente();
                paciente.setIdPaciente(resultado.getInt("id_paciente"));
                paciente.setNombre(resultado.getString("nombre"));
                paciente.setApellido(resultado.getString("apellido"));
                paciente.setDni(resultado.getString("dni"));
                paciente.setDomicilio(resultado.getString("domicilio"));
                paciente.setCelular(resultado.getString("celular"));
                paciente.setFechaNac(resultado.getDate("fecha_nacimiento").toLocalDate());
                paciente.setEdad(resultado.getInt("edad"));
                paciente.setPesoActual(resultado.getDouble("peso_actual"));
                paciente.setPesoDeseado(resultado.getDouble("peso_deseado"));
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

    public Paciente buscarPacientePorID(int id) {
        Paciente paciente = null;
        String sql = "select  nombre, apellido, peso_actual, peso_deseado, estado "
                + "from pacientes where id_paciente= ?";
        PreparedStatement ps = null;
        try {
            ps = conex.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet resultado = ps.executeQuery();

            if (resultado.next()) {
                paciente = new Paciente();
                paciente.setNombre(resultado.getString("nombre"));
                paciente.setApellido(resultado.getString("apellido"));

                paciente.setPesoActual(resultado.getDouble("peso_actual"));
                paciente.setPesoDeseado(resultado.getDouble("peso_deseado"));
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
        String sql = "update pacientes set nombre = ?, apellido = ?, dni = ?, celular = ?, domicilio = ?,"
                + "fecha_nacimiento = ?, edad = ?, peso_actual = ?, peso_deseado = ?, estado = ? "
                + "where dni = " + paciente.getDni();
        try {
            PreparedStatement ps = conex.prepareStatement(sql);
            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.getApellido());
            ps.setString(3, paciente.getDni());
            ps.setString(4, paciente.getCelular());
            ps.setString(5, paciente.getDomicilio());
            ps.setDate(6, Date.valueOf(paciente.getFechaNac()));
            ps.setInt(7, paciente.getEdad());
            ps.setDouble(8, paciente.getPesoActual());
            ps.setDouble(9, paciente.getPesoDeseado());
            ps.setBoolean(10, paciente.isEstado());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Paciente  modificado con exito.");
            } else {
                JOptionPane.showMessageDialog(null, "El paciente no existe.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla paciente " + e.getMessage());
        }
    }

    public void eliminarPaciente(int id) {
        String sql = "update pacientes set estado = 0 where id_paciente = ?";
        try {
            PreparedStatement ps = conex.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Paciente dado de baja correctamente.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pacientes " + e.getMessage());

        }
    }

    public void darAltaPaciente(int id) {
        String sql = "update pacientes set estado = 1 where id_paciente = ?";
        try {
            PreparedStatement ps = conex.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Paciente dado de alta correctamente.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pacientes " + e.getMessage());

        }
    }

    public ArrayList<Paciente> listarPaciente() {
        ArrayList<Paciente> pacientes = new ArrayList<>();
        try {
            String sql = "SELECT * FROM pacientes";
            PreparedStatement psa = conex.prepareStatement(sql);
            ResultSet rs = psa.executeQuery();
            while (rs.next()) {
                Paciente paciente = new Paciente();

                paciente.setIdPaciente(rs.getInt("id_paciente"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setApellido(rs.getString("apellido"));
                paciente.setDni(rs.getString("dni"));
                paciente.setCelular(rs.getString("celular"));
                paciente.setEstado(rs.getBoolean("estado"));
              
                pacientes.add(paciente);
            }
            psa.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Pacientes" + ex.getMessage());
        }
        return pacientes;
    }
}
