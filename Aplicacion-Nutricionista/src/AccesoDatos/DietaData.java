package AccesoDatos;

import Entidades.Comida;
import Entidades.Dieta;
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
 * @author User2021SD
 */
public class DietaData {

    private Connection con = null;

    public DietaData() {
        con = Conexion.getConex();
    }

    public void nuevaDieta(Dieta dieta) {
        String sql = "INSERT INTO dietas (id_paciente, inicio_dieta, fin_dieta, "
                + "nombre, peso_inicial,peso_final,  estado)"
                + "VALUES (?, ?, ?, ?, ?, ?, 1)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, dieta.getIdDieta());
            ps.setDate(2, Date.valueOf(dieta.getInicioDieta()));
            ps.setDate(3, Date.valueOf(dieta.getFinDieta()));
            ps.setString(4, dieta.getNombre());
            ps.setDouble(5, dieta.getPesoInicial());
            ps.setDouble(6, dieta.getPesoFinal());
            ps.setBoolean(7, dieta.isEstado());
            ps.executeUpdate();

            ResultSet resultado = ps.getGeneratedKeys();

            if (resultado.next()) {
                dieta.setIdComida(resultado.getInt(1));
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

            PreparedStatement ps = con.prepareStatement(sql);
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

    public Comida buscarDieta(String nombre) {

        String sql = "SELECT * FROM dietas WHERE nombre = " + nombre;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet resultado = ps.executeQuery();            
           /* Dieta dieta = new Dieta( resultado.getInt("id_dieta"), (Paciente))resultado.getString("nombre"), resultado.getInt("idPaciente"), 
                    resultado.getDate("fechaInicial"), resultado.getDate("fechaFinal"),                       
                     resultado.getDouble("pesoInicial"),
                    resultado.getDouble("pesoFinal"), resultado.getBoolean("estado"));
            
            if (resultado.next()) {
                return dieta;
            } else {
                JOptionPane.showMessageDialog(null, "No existe la dieta ");
            }*/
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de acceso tabla Dietas", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public ArrayList<Dieta> listarDieta() {
        ArrayList<Dieta> dietas = new ArrayList<>();

        try {
            String sql = "SELECT * From comidas WHERE estado = 1";
            PreparedStatement psm = con.prepareStatement(sql);
            ResultSet resultado = psm.executeQuery();
            /*while (resultado.next()) {
                Dieta dieta = new Dieta(resultado.getInt("id_dieta"), resultado.getString("nombre"),
                        resultado.getString("detalle"), resultado.getInt("cant_calorias"), resultado.getBoolean("estado"));
                comidas.add(comida);*/
            

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla" + ex.getMessage());
        }
        return dietas;
    }
}
