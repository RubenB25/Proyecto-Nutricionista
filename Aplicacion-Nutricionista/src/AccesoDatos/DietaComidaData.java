package AccesoDatos;

import Entidades.Comida;
import Entidades.DietaComida;
import Enums.HorarioComida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Ruben
 */
public class DietaComidaData {

    private Connection conex;

    public DietaComidaData() {
        conex = Conexion.getConex();
    }

    public void nuevaDieta(DietaComida dietaComida) {
        try {
            String sql = "INSERT INTO dieta_comida (id_comida,id_dieta,porcion,horario,estado) VALUES(?, ?, ?, ?,1)";
            PreparedStatement ps = conex.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, dietaComida.getComida().getIdComida());
            ps.setInt(2, dietaComida.getDieta().getIdDieta());
            ps.setInt(3, dietaComida.getPorcion());
            ps.setString(4, String.valueOf(dietaComida.getHorarioComida()));
            ps.setBoolean(5, true);
            ps.executeUpdate();
            ResultSet resultado = ps.getGeneratedKeys();

            if (resultado.next()) {
                dietaComida.setIdDietaComida(resultado.getInt(1));
                JOptionPane.showMessageDialog(null, "Comida agregada correctamente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Dieta existente", "Atencion", JOptionPane.ERROR_MESSAGE);
        }
    }

    public ArrayList<DietaComida> listaDietaComida(int id) {
        ArrayList<DietaComida> listaDietaComida = new ArrayList<>();

        PreparedStatement ps;

        String sql = "Select d.id_dieta_comida, d.porcion, c.nombre, d.horario from dieta_comida d"
                + " Inner join comidas c on d.id_comida = c.id_comida where id_dieta=" + id;

        try {
            ps = conex.prepareStatement(sql);

            ResultSet resultado = ps.executeQuery();

            while (resultado.next()) {
                DietaComida dc = new DietaComida();
                Comida comida = new Comida();
                dc.setIdDietaComida(resultado.getInt("id_dieta_comida"));
                dc.setPorcion(resultado.getInt("porcion"));
                dc.setHorarioComida(HorarioComida.valueOf(resultado.getString("d.horario")));
                comida.setNombre(resultado.getString("nombre"));
                dc.setComida(comida);
                listaDietaComida.add(dc);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de acceso tabla Dietas", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return listaDietaComida;
    }

    public void eliminarDietaComida(int id) {
        try {
            String sql = "Delete from dieta_comida where id_dieta_comida =" + id;
            PreparedStatement ps = conex.prepareStatement(sql);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Comida eliminada de la dieta.");
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la table ingrediente" + e.getMessage());
        }
    }

}
