package AccesoDatos;

import Entidades.Dieta;
import Entidades.Paciente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

/**
 * @author User2021SD
 */
public class DietaData {

    private Connection conex = null;

    public DietaData() {
        conex = Conexion.getConex();
    }

    public void nuevaDieta(Dieta dieta) {
        String sql = "INSERT INTO dietas (id_paciente, inicio_dieta, fin_dieta, "
                + "nombre, peso_inicial,peso_final,  estado)"
                + "VALUES (?, ?, ?, ?, ?, ?, 1)";
        try {
            PreparedStatement ps = conex.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, dieta.getPaciente().getIdPaciente());
            ps.setDate(2, Date.valueOf(dieta.getFechaInicial()));
            ps.setDate(3, Date.valueOf(dieta.getFechaFinal()));
            ps.setString(4, dieta.getNombre());
            ps.setDouble(5, dieta.getPesoInicial());
            ps.setDouble(6, dieta.getPesoFinal());
            ps.setBoolean(7, dieta.isEstado());
            ps.executeUpdate();

            ResultSet resultado = ps.getGeneratedKeys();

            if (resultado.next()) {
                dieta.setIdDieta(resultado.getInt(1));
                JOptionPane.showMessageDialog(null, "Dieta ingresada correctamente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Dieta existente", "Atencion", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void modificarDieta(Dieta dieta) {

        try {
            String sql = "UPDATE dietas SET (id_paciente, inicio_dieta, fin_dieta, "
                    + "nombre, peso_inicial,peso_final,  estado)"
                    + "VALUES (?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = conex.prepareStatement(sql);
            ps.setInt(1, dieta.getIdDieta());
            ps.setDate(2, Date.valueOf(dieta.getFechaInicial()));
            ps.setDate(3, Date.valueOf(dieta.getFechaFinal()));
            ps.setString(4, dieta.getNombre());
            ps.setDouble(5, dieta.getPesoInicial());
            ps.setDouble(6, dieta.getPesoFinal());
            ps.setBoolean(7, dieta.isEstado());
            ps.executeUpdate();

            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas == 1) {
                JOptionPane.showMessageDialog(null, "Dieta modificada correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar dieta", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Código de dieta duplicado", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }

    public int comprobacionDieta(int id) {
        int dietaVigente = 0;
        try {
            String sql = "SELECT COUNT(*) FROM dietas WHERE estado = 1 and id_paciente= ?";
            PreparedStatement psm = conex.prepareStatement(sql);
            psm.setInt(1, id);
            ResultSet resultado = psm.executeQuery();

            if (resultado.next()) {
                dietaVigente = resultado.getInt(1);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla" + ex.getMessage());
        }
        return dietaVigente;
    }

    public ArrayList<Dieta> buscarDieta(String nombre) {
        ArrayList<Dieta> listaDietas = new ArrayList<>();
        try {
            String sql = "SELECT * FROM dietas WHERE nombre = " + nombre;
            PreparedStatement ps = conex.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet resultado = ps.executeQuery();
            while (resultado.next()) {
                Paciente paciente = new Paciente();
                paciente.setIdPaciente(resultado.getInt("id_paciente"));
                Dieta dieta = new Dieta(resultado.getInt("id_dieta"), resultado.getString("nombre"), paciente, resultado.getDate("fechaInicial").toLocalDate(), resultado.getDate("fechaFinal").toLocalDate(), resultado.getDouble("pesoInicial"), resultado.getDouble("pesoFinal"), resultado.getBoolean("estado"));
                listaDietas.add(dieta);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de acceso tabla Dietas", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return listaDietas;
    }

    public ArrayList<Dieta> listarDietas() {
        ArrayList<Dieta> listaDietas = new ArrayList<>();
        try {
            String sql = "Select  * from dietas d Inner join pacientes p on d.id_paciente =  p.id_paciente";
            PreparedStatement ps = conex.prepareStatement(sql);
            ResultSet resultado = ps.executeQuery();
            while (resultado.next()) {
                Paciente paciente = new Paciente();
                paciente.setIdPaciente(resultado.getInt("id_paciente"));
                paciente.setApellido(resultado.getString("p.apellido"));
                paciente.setNombre(resultado.getString("p.nombre"));
                paciente.setDni(resultado.getString("dni"));
                paciente.setPesoDeseado(resultado.getInt("p.peso_deseado"));
                Dieta dieta = new Dieta(resultado.getInt("id_dieta"), resultado.getString("nombre"), paciente, resultado.getDate("inicio_dieta").toLocalDate(), resultado.getDate("fin_dieta").toLocalDate(), resultado.getDouble("d.peso_inicial"), resultado.getDouble("peso_final"), resultado.getBoolean("d.estado"));
                listaDietas.add(dieta);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de acceso tabla Dietas", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return listaDietas;
    }

    public ArrayList<String> listarDieta() {
        ArrayList<String> dietas = new ArrayList<>();
        try {
            String sql = "SELECT * From comidas WHERE estado = 1";
            PreparedStatement psm = conex.prepareStatement(sql);
            ResultSet resultado = psm.executeQuery();
            while (resultado.next()) {

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla" + ex.getMessage());
        }
        return dietas;
    }

    public ArrayList<Dieta> obtenerDietaDelPaciente(int id) {
        ArrayList<Dieta> listaDieta = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Dietas where id_paciente = " + id;

            PreparedStatement psm = conex.prepareStatement(sql);
            ResultSet resultado = psm.executeQuery();
            while (resultado.next()) {

                Paciente paciente = new Paciente();
                paciente.setIdPaciente(resultado.getInt("id_paciente"));
                Dieta dieta = new Dieta(resultado.getInt("id_dieta"), resultado.getString("nombre"), paciente,
                        resultado.getDate("inicio_dieta").toLocalDate(), resultado.getDate("fin_dieta").toLocalDate(),
                        resultado.getDouble("peso_Inicial"), resultado.getDouble("peso_Final"), resultado.getBoolean("estado"));
                listaDieta.add(dieta);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla" + ex.getMessage());
}
        return listaDieta;
    }
public void modificarDietaPorID(int id,double pesoActual) {

        try {
            String sql = "UPDATE dietas SET peso_final=? where id_dieta="+id ;

            PreparedStatement ps = conex.prepareStatement(sql);
           
            ps.setDouble(1,pesoActual);
            ps.executeUpdate();

            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas == 1) {
                JOptionPane.showMessageDialog(null, "Dieta culminada");
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar dieta", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Código de dieta duplicado", "ERROR", JOptionPane.ERROR_MESSAGE);
        }}
        public void modificarEstadoDietaPorID(int id) {

        try {
            String sql = "UPDATE dietas SET estado=? where id_dieta="+id ;

            PreparedStatement ps = conex.prepareStatement(sql);
           
            ps.setBoolean(1,false);
            ps.executeUpdate();

            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas == 1) {
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar dieta", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Código de dieta duplicado", "ERROR", JOptionPane.ERROR_MESSAGE);
        }}
//        public ArrayList<Dieta> obtenerDietaDelPaciente(int id) {
//        ArrayList<Dieta> listaDieta = new ArrayList<>();
//        try {
//            String sql = "SELECT * FROM Dietas where id_paciente = " + id;
//
//            PreparedStatement psm = conex.prepareStatement(sql);
//            ResultSet resultado = psm.executeQuery();
//            while (resultado.next()) {
//
//                Paciente paciente = new Paciente();
//                paciente.setIdPaciente(resultado.getInt("id_paciente"));
//                Dieta dieta = new Dieta(resultado.getInt("id_dieta"), resultado.getString("nombre"), paciente,
//                        resultado.getDate("inicio_dieta").toLocalDate(), resultado.getDate("fin_dieta").toLocalDate(),
//                        resultado.getDouble("peso_Inicial"), resultado.getDouble("peso_Final"), resultado.getBoolean("estado"));
//                listaDieta.add(dieta);
//            }
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla" + ex.getMessage());
//}
//        return listaDieta;
//        
//}
}