/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Entidades.Ingrediente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Ruben
 */
public class IngredienteData {
    private final Connection conex;

    public IngredienteData() {
        conex= Conexion.getConex();
    }
    
    public void guardarIngrediente(Ingrediente ingrediente){
        try{
            String sql = "Insert into ingrediente (nombre,calorias_100gr) values (?,?)";
            PreparedStatement ps = conex.prepareStatement(sql);
            ps.setString(1, ingrediente.getNombre());
            ps.setInt(2, ingrediente.getCaloriasPor100GR());
            ResultSet resultado  = ps.getGeneratedKeys();
            if (resultado.next()) {
                ingrediente.setIdIngrediente(resultado.getInt(1));
                JOptionPane.showMessageDialog(null, "Ingrediente agregado.");
            }
            ps.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al acceder a la table ingrediente"+e.getMessage());
        }
    }
    public void modificarIngrediente(Ingrediente ingrediente){
        try{
            String sql = "Update ingrediente set nombre = ?, calorias_100gr = ? where id_ingrediente = ?";
            PreparedStatement ps = conex.prepareStatement(sql);
            ps.setString(1, ingrediente.getNombre());
            ps.setInt(2, ingrediente.getCaloriasPor100GR());
            ps.setInt(3, ingrediente.getIdIngrediente());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Ingrediente modificado.");
            }
            ps.close();
          
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al acceder a la table ingrediente"+e.getMessage());
        }
    }
    public ArrayList<Ingrediente> litarIngredientes(){
        ArrayList<Ingrediente> listaIngredientes = new ArrayList();
        try{
            String sql = "Select * from ingrediente";
            PreparedStatement ps = conex.prepareStatement(sql);
            ResultSet resultado  = ps.getGeneratedKeys();
            if (resultado.next()){
                Ingrediente ingrediente = new Ingrediente();
                ingrediente.setIdIngrediente(resultado.getInt("id_ingrediente"));
                ingrediente.setNombre(resultado.getString("nombre"));
                ingrediente.setCaloriasPor100GR(resultado.getInt("calorias_100gr"));
                listaIngredientes.add(ingrediente);
            }
            ps.close();
        }catch(SQLException e){
             JOptionPane.showMessageDialog(null, "Error al acceder a la table ingrediente"+e.getMessage());
        }
        return listaIngredientes;
    }
}
