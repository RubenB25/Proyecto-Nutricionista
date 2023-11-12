
package AccesoDatos;

import AccesoDatos.Conexion;
import Entidades.Comida;
import Entidades.Ingrediente;
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

public class IngredienteData {
    private final Connection conex;

    public IngredienteData() {
        conex= Conexion.getConex();
    }
    
    public void guardarIngrediente(Ingrediente ingrediente) {
        try {
            String sql = "INSERT INTO ingrediente (nombre, calorias_100gr) VALUES (?, ?)";
            PreparedStatement ps = conex.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            try {
                ps.setString(1, ingrediente.getNombre());
                ps.setInt(2, ingrediente.getCaloriasPor100GR());
                ps.executeUpdate();
                ResultSet resultado = ps.getGeneratedKeys();
                if (resultado.next()) {
                    ingrediente.setIdIngrediente(resultado.getInt(1));
                    JOptionPane.showMessageDialog(null, "Ingrediente Ingresado Correctamente");
                }
                ps.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Ingrediente Existente", "Atencion", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ComidaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int insertIngrediente(Object[] dataFila) {
        int id=0;
        try {
            String sql = "INSERT INTO ingrediente (nombre, calorias_100gr) VALUES (?, ?)";
            PreparedStatement ps = conex.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            try {
                ps.setString(1, (String) dataFila[1]);
                ps.setInt(2, Integer.parseInt((String) (dataFila[2])));
                ps.executeUpdate();
                ResultSet resultado = ps.getGeneratedKeys();
                if (resultado.next()) {
                    id = (resultado.getInt(1));
                }
                ps.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Ingrediente existente", "Atencion", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ComidaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
    
    public void modificarIngrediente(Ingrediente ingrediente){
        try{
            String sql = "Update ingrediente set nombre = ?, calorias_100gr = ? where id_ingrediente = ?";
            PreparedStatement ps = conex.prepareStatement(sql);
            ps.setString(1, ingrediente.getNombre());
            ps.setInt(2, ingrediente.getCaloriasPor100GR());
            ps.setInt(3, ingrediente.getIdIngrediente());
            ps.executeUpdate();
            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas == 1) {
                //JOptionPane.showMessageDialog(null, "Comida modificada correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar Ingrediente", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            ps.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Código de Ingrediente duplicado", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public ArrayList<Ingrediente> litarIngredientes() {
            ArrayList<Ingrediente> listaIngredientes = new ArrayList();
            String sql = "Select * from ingrediente";
        try {
            PreparedStatement ps = conex.prepareStatement(sql);
            ResultSet resultado = ps.executeQuery();
            while (resultado.next()) {
                Ingrediente ingrediente = new Ingrediente();
                ingrediente.setIdIngrediente(resultado.getInt("id_ingrediente"));
                ingrediente.setNombre(resultado.getString("nombre"));
                ingrediente.setCaloriasPor100GR(resultado.getInt("calorias_100gr"));
                listaIngredientes.add(ingrediente);
            }
            
         }catch(SQLException e){
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ingrediente"+e.getMessage());
        }        
        return listaIngredientes;
    }
    
    public Ingrediente getIngrediente(int id) {

        String sql = "SELECT nombre, calorias_100gr FROM ingrediente WHERE id_ingrediente = " + id;
        System.out.println("SQL: " + sql);
        try {
            PreparedStatement ps = conex.prepareStatement(sql);
            ResultSet resultado = ps.executeQuery();
            if (resultado.next()) {
                Ingrediente i = new Ingrediente(id, resultado.getString("nombre"),
                        Integer.parseInt(resultado.getString("calorias_100gr")));
                return i;
            } else {
                JOptionPane.showMessageDialog(null, "No existe ingrediente");
            }
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de acceso tabla Ingredientes", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
}
