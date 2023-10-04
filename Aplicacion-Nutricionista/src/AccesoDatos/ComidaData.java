package AccesoDatos;

import Entidades.Comida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

/**
 * @author User2021SD
 */
public class ComidaData {

    private Connection con = null;

    public ComidaData() {
        con = Conexion.getConex();
    }

    public void nuevaComida(Comida comida) {
        String sql = "INSERT INTO comidas (nombre, detalle, cantCalorias, estado)"
                + "VALUES (?, ?, ?,1)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, comida.getNombre());
            ps.setString(2, comida.getDetalle());
            ps.setInt(3, comida.getCantCalorias());
            ps.setBoolean(4, comida.isEstado());
            ps.executeUpdate();

            ResultSet resultado = ps.getGeneratedKeys();

            if (resultado.next()) {
                comida.setIdComida(resultado.getInt(1));
                JOptionPane.showMessageDialog(null, "Comida Ingresada Correctamente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Comida existente", "Atencion", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void modificarComida(Comida comida) {

        try {
            String sql = "UPDATE comidas SET nombre = ?, detalle = ?,"
                    + "cant_calorias = ? , estado = ? "
                    + "WHERE id_comida = ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, comida.getNombre());
            ps.setString(2, comida.getDetalle());
            ps.setBoolean(3, comida.isEstado());
            ps.setInt(4, comida.getIdComida());
            ps.executeUpdate();

            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas == 1) {
                JOptionPane.showMessageDialog(null, "Comida modificada correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar comida", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Código de comida duplicado", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }

    public Comida buscarComida(String nombre) {

        String sql = "SELECT nombre, detalle, cant_calorias, estado "
                + "FROM comidas WHERE nombre = " + nombre;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);

            ResultSet resultado = ps.executeQuery();
            Comida comida = new Comida(resultado.getString("nombre"), resultado.getString("detalle"),
                    resultado.getInt("cant_calorias"), resultado.getBoolean("estado"));
            if (resultado.next()) {

                return comida;
            } else {
                JOptionPane.showMessageDialog(null, "No existe la Comida");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de acceso tabla Comidas", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public ArrayList<Comida> listarComidas() {
        ArrayList<Comida> comidas = new ArrayList<>();

        try {
            String sql = "SELECT * From comidas WHERE estado = 1";
            PreparedStatement psm = con.prepareStatement(sql);
            ResultSet resultado = psm.executeQuery();
            while (resultado.next()) {
                Comida comida = new Comida(resultado.getInt("id_comida"), resultado.getString("nombre"),
                        resultado.getString("detalle"), resultado.getInt("cant_calorias"), resultado.getBoolean("estado"));
                comidas.add(comida);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla" + ex.getMessage());
        }
        return comidas;
    }

}
