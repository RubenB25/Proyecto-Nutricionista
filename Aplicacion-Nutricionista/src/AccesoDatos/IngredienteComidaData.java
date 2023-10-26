
package AccesoDatos;

import Entidades.Comida;
import Entidades.Ingrediente;
import Entidades.IngredienteComida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class IngredienteComidaData {
    private final Connection conex;

    public IngredienteComidaData() {
        conex= Conexion.getConex();
    }
    
    public void guardarIngredienteComida(IngredienteComida ingredienteComida){
        try{
            String sql = "Insert into ingredienteComida (id_comida,id_ingrediente) values (?,?)";
            System.out.println("sql: " + sql);
            System.out.println("Id Comida: " + ingredienteComida.getComida().getIdComida());
            System.out.println("Id Ingrediente: " + ingredienteComida.getIngrediente().getIdIngrediente());
            PreparedStatement ps = conex.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, ingredienteComida.getComida().getIdComida());
            ps.setInt(2, ingredienteComida.getIngrediente().getIdIngrediente());
            ps.executeUpdate();
            ResultSet resultado = ps.getGeneratedKeys();
            if (resultado.next()) {
                ingredienteComida.setIdIngredienteComida(resultado.getInt(1));
                JOptionPane.showMessageDialog(null, "Ingrediente agregado.");
            }
            ps.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al acceder a la table ingrediente"+e.getMessage());
        }
    }
    
    public void insertIngredienteComida(int idComida, int idIngrediente){
        try{
            String sql = "Insert into ingrediente_comida (id_comida,id_ingrediente) "
                    + "values (?,?)";
            PreparedStatement ps = conex.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            //int RETURN_GENERATED_KEYS = Statement.RETURN_GENERATED_KEYS;
            try {
                ps.setInt(1, idComida);
                ps.setInt(2, idIngrediente);
                ps.executeUpdate();
                ResultSet resultado = ps.getGeneratedKeys();
                if (resultado.next()) {
                    //ingredienteComida.setIdIngredienteComida(resultado.getInt(1));
                    JOptionPane.showMessageDialog(null, "Ingrediente agregado.");
                }
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Error al acceder a la table ingrediente"+e.getMessage());
            }
        } catch (SQLException ex) {
            Logger.getLogger(ComidaData.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    
    public void eliminarIngredienteComida(IngredienteComida ingredienteComida){
        try{
            String sql = "Delete from ingrediente_Comida where id_ingrediente_comida = ?";
            PreparedStatement ps = conex.prepareStatement(sql);
            ps.setInt(1, ingredienteComida.getIdIngredienteComida());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Ingrediente eliminado correctamente.");
            }
            ps.close();
          
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al acceder a la table ingrediente"+e.getMessage());
        }
    }
    
    public void deleteIngredienteComida(int idIngreComi){
        try{
            String sql = "Delete from ingrediente_Comida where id_ingrediente_comida = " + idIngreComi;
            System.out.println("SQL: " + sql);
            PreparedStatement ps = conex.prepareStatement(sql);
            ps.setInt(1, idIngreComi);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Ingrediente eliminado correctamente.");
            }
            ps.close();
          
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al acceder a la table ingrediente"+e.getMessage());
        }
    }
    
    public ArrayList<IngredienteComida> litarIngredienteComida(){
        ArrayList<IngredienteComida> listaIngredienteComida = new ArrayList();
        try{
            String sql = "Select * from ingrediente";
            PreparedStatement ps = conex.prepareStatement(sql);
            ResultSet resultado  = ps.getGeneratedKeys();
            if (resultado.next()){
                IngredienteComida ingredienteComida = new IngredienteComida();
                ingredienteComida.setIdIngredienteComida(resultado.getInt("id_ingrediente_comida"));
                ingredienteComida.getComida().setIdComida(resultado.getInt("id_comida"));
                ingredienteComida.getIngrediente().setIdIngrediente(resultado.getInt("id_ingrediente"));
                listaIngredienteComida.add(ingredienteComida);
            }
            ps.close();
        }catch(SQLException e){
             JOptionPane.showMessageDialog(null, "Error al acceder a la table ingrediente"+e.getMessage());
        }
        return listaIngredienteComida;
    }
    
    public ArrayList<Object[]> selectIngredienteComida(int idComida){
        ArrayList<Object[]> listaIngredienteComida = new ArrayList<>();
            String sql = "SELECT ic.id_ingrediente_comida, ic.id_comida, ic.id_ingrediente,"
                    + " i.id_ingrediente, i.nombre, i.calorias_100gr "
                    + "FROM ingrediente_comida AS ic INNER JOIN ingrediente AS i "
                    + "ON ic.id_ingrediente = i.id_ingrediente  WHERE ic.id_comida = " + idComida;
        try {
            PreparedStatement psm = conex.prepareStatement(sql);
            ResultSet res = psm.executeQuery();
            while (res.next()) {
                int id_ingrediente_comida = res.getInt("id_ingrediente_comida");
                int id_comida = res.getInt("id_comida");
                int id_ingrediente = res.getInt("id_ingrediente");
                String nombre = res.getString("nombre");
                String calorias = res.getString("calorias_100gr");
                Object[] ic = {id_ingrediente_comida,id_comida,id_ingrediente,nombre,calorias};
                listaIngredienteComida.add(ic);                
            }
            psm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ingrediente" + e.getMessage());
        }
        return listaIngredienteComida;
    }
}
