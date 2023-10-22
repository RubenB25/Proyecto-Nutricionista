package AccesoDatos;

import Entidades.Historial;
import Entidades.Historialtest;
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

        String sql = "INSERT INTO historial (id_paciente, cuello, busto,cintura,brazo, cadera, pierna, estatura, id_dieta, pesoActual, fechaRegistro)"
                + "VALUES (?, ?, ?, ?,?,?,?,?,?,?,?)";
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
            ps.setDouble(9, historial.getIdDieta());
            ps.setDouble(10, historial.getPesoActual());
            ps.setDate(11, Date.valueOf(historial.getFechaRegistro()));

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

    public ArrayList<Historial> obtenerHistorialdePaciente(int id) {
      
       ArrayList<Historial> listaHistorial = new ArrayList();
    try {
        String sql = "SELECT * FROM historial WHERE id_paciente = ?";
        PreparedStatement psm = conex.prepareStatement(sql);
        psm.setInt(1, id); // Establece el valor del parámetro ? con el ID del paciente.
        System.out.println("Esta en el try");
        ResultSet rs = psm.executeQuery();
        while (rs.next()) {
            System.out.println("Estoy en el while");
            Historial historial = new Historial();
            Paciente paciente = new Paciente();
            paciente.setIdPaciente(id); // Establece el ID del paciente
            historial.setCuello(rs.getDouble("cuello"));
            historial.setBusto(rs.getDouble("busto"));
            historial.setCintura(rs.getDouble("cintura"));
            historial.setBrazo(rs.getDouble("brazo"));
            historial.setCadera(rs.getDouble("cadera"));
            historial.setPierna(rs.getDouble("pierna"));
//            historial.setPesoActual(rs.getDouble("peso_Actual"));
            historial.setEstatura(rs.getDouble("estatura"));
            historial.setIdDieta(rs.getInt("id_dieta"));
//            historial.setFechaRegistro(rs.getDate("fecha_registro").toLocalDate());
//            
//            
            System.out.println(rs.getDouble("cuello"));
            System.out.println(rs.getDouble("busto"));
            
            listaHistorial.add(historial);
        }
        psm.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error");
        System.out.println("Esta en catch");
        System.out.println(e.getCause());
    }
    return listaHistorial;
}  
    public ArrayList<Historial> obtenerPacientePorHistorialPorID(int ID) {
    ArrayList<Historial> listaHistorial = new ArrayList<>();
    try {
        String sql = "SELECT h.id_paciente, h.pesoActual, h.fechaRegistro FROM historial AS h";
        PreparedStatement psm = conex.prepareStatement(sql);
        ResultSet rs = psm.executeQuery();
        while (rs.next()) {
            Date fechaRegistroSQL = rs.getDate("fechaRegistro");
            LocalDate fechaRegistro = fechaRegistroSQL.toLocalDate();
            Historial pacienteHistorial = new Historial(rs.getInt("id_paciente"), 
                    rs.getDouble("pesoActual"), fechaRegistro);
            listaHistorial.add(pacienteHistorial);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla" + ex.getMessage());
    }
    return listaHistorial;
}     
//        

//    public void guardarHistorial(Historial rs) {
//        try {
//            String sql = "INSERT INTO historial (id_Paciente) "
//    + "VALUES (rs.getIdPaciente(),rs.getCuello(),rs.getBusto(),rs.getBrazo(), rs.getCintura(), rs.getCadera(), rs.getPierna() rs.getEstatura(), rs.getIdDieta()";
//            PreparedStatement ps = conex.prepareStatement(sql);
//           
//            int filasAfectadas = ps.executeUpdate ();
//
//            if (filasAfectadas > 0) {
//                JOptionPane.showMessageDialog(null, "Historial guardado con éxito.");
//            } else {
//                System.out.println("No se pudo insertar ningún dato.");
//            }
//        } catch (SQLException e) {
//
//        }
   public ArrayList<historialConNombreyApellido> obtenerHistorialesConNombreApellido() { 
    ArrayList<historialConNombreyApellido> listaHistorial = new ArrayList<>();
    try {
        String sql = "SELECT p.nombre, p.apellido, h.pesoActual, h.fechaRegistro FROM historial AS h " +
                     "INNER JOIN pacientes AS p ON h.id_paciente = p.id";
        PreparedStatement psm = conex.prepareStatement(sql);
        ResultSet rs = psm.executeQuery();
        while (rs.next()) {
            Date fechaRegistroSQL = rs.getDate("fechaRegistro");
            LocalDate fechaRegistro = fechaRegistroSQL.toLocalDate();
            String nombre = rs.getString("nombre");
            String apellido = rs.getString("apellido");
            Double pesoActual=rs.getDouble("pesoActual");
            historialConNombreyApellido pacienteHistorial = new historialConNombreyApellido(nombre, apellido, rs.getDouble("pesoActual"), fechaRegistro);
            listaHistorial.add(pacienteHistorial);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla" + ex.getMessage());
    }
    return listaHistorial;

    }
   
   public ArrayList<Historial> obtenerPacientePorHistorial() {
    ArrayList<Historial> listaHistorial = new ArrayList<>();
    try {
        String sql = "SELECT h.id_paciente, h.pesoActual, h.fechaRegistro FROM historial AS h";
        PreparedStatement psm = conex.prepareStatement(sql);
        ResultSet rs = psm.executeQuery();
        while (rs.next()) {
            Date fechaRegistroSQL = rs.getDate("fechaRegistro");
            LocalDate fechaRegistro = fechaRegistroSQL.toLocalDate();
            Historial pacienteHistorial = new Historial(rs.getInt("id_paciente"), 
                    rs.getDouble("pesoActual"), fechaRegistro);
            listaHistorial.add(pacienteHistorial);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla" + ex.getMessage());
    }
    return listaHistorial;
}
   
}
