

package AccesoDatos;

import Entidades.Comida;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ComidaData {

    private Connection con = null;

    public ComidaData() {
        con = Conexion.getConex();
    }

    public int nuevaComida(Comida comida) {
        int id=0;
        try {
            String sql = "INSERT INTO comidas (nombre, detalle, cant_Calorias)"
                    + "VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            try {
                ps.setString(1, comida.getNombre());
                ps.setString(2, comida.getDetalle());
                ps.setInt(3, comida.getCantCalorias());
                ps.executeUpdate();
                ResultSet resultado = ps.getGeneratedKeys();
                if (resultado.next()) {
                    comida.setIdComida(resultado.getInt(1));
                    id = (resultado.getInt(1));
                    
                }
                ps.close();
                
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Comida existente", "Atencion", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ComidaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    public int insertComida(Object[] dataFila) {
        int id=0;
        try {
            String sql = "INSERT INTO comidas (nombre, detalle, cant_Calorias)"
                    + "VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            try {
                ps.setString(1, (String) dataFila[1]);
                ps.setString(2, (String) dataFila[2]);
                ps.setInt(3, Integer.parseInt((String) (dataFila[3])));
                ps.executeUpdate();
                ResultSet resultado = ps.getGeneratedKeys();
                if (resultado.next()) {
                    //dataFila.setIdComida(resultado.getInt(1));
                    id = (resultado.getInt(1));
                }
                ps.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Comida existente", "Atencion", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ComidaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
        
    public void modificarComida(Comida comida) {

        try {
            String sql = "UPDATE comidas SET nombre = ?, detalle = ?,"
                    + "cant_calorias = ? "
                    + "WHERE id_comida = ?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, comida.getNombre());
            ps.setString(2, comida.getDetalle());
            ps.setInt(3, comida.getCantCalorias());
            ps.setInt(4, comida.getIdComida());
            ps.executeUpdate();

            int filasAfectadas = ps.executeUpdate();
            
            if (filasAfectadas == 1) {
                //JOptionPane.showMessageDialog(null, "Comida modificada correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar comida", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Código de comida duplicado", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public Comida buscarComida(String nombre) {

        String sql = "SELECT nombre, detalle, cant_calorias "
                + "FROM comidas WHERE nombre = " + nombre;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);

            ResultSet resultado = ps.executeQuery();
            if (resultado.next()) {
                Comida comida = new Comida(resultado.getString("nombre"), resultado.getString("detalle"),
                    resultado.getInt("cant_calorias"));
                return comida;
            } else {
                JOptionPane.showMessageDialog(null, "No existe la Comida");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de acceso tabla Comidas", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public Comida buscarComida(int id) {
        
        String sql = "SELECT nombre, detalle, cant_calorias "
                + "FROM comidas WHERE id_comida = " + id;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resultado = ps.executeQuery();
            if (resultado.next()) {
                Comida c = new Comida(id, resultado.getString("nombre"),
                        resultado.getString("detalle"),
                        resultado.getInt("cant_calorias"));
                return c;
            } else {
                JOptionPane.showMessageDialog(null, "No existe la Comida");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de acceso tabla Comidas", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public ArrayList<Comida> listarComidas() {
        ArrayList<Comida> comidas = new ArrayList<>();
        String sql = "SELECT * From comidas";
        try {
            PreparedStatement psm = con.prepareStatement(sql);
            ResultSet res = psm.executeQuery();
            while (res.next()) {
                Comida c = new Comida();
                c.setIdComida(res.getInt("id_comida"));
                c.setNombre(res.getString("nombre"));
                c.setDetalle(res.getString("detalle"));
                c.setCantCalorias(res.getInt("cant_calorias"));
                comidas.add(c);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla" + ex.getMessage());
        }
        return comidas;
    }

}
