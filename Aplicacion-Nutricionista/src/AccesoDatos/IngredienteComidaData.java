/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Entidades.Ingrediente;
import Entidades.IngredienteComida;
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
public class IngredienteComidaData {
    private final Connection conex;

    public IngredienteComidaData() {
        conex= Conexion.getConex();
    }
    
    public void guardarIngredienteComida(IngredienteComida ingredienteComida){
        try{
            String sql = "Insert into ingredienteComida (id_comida,id_ingrediente) values (?,?)";
            PreparedStatement ps = conex.prepareStatement(sql);
            ps.setInt(1, ingredienteComida.getComida().getIdComida());
            ps.setInt(2, ingredienteComida.getIngrediente().getIdIngrediente());
            ResultSet resultado  = ps.getGeneratedKeys();
            if (resultado.next()) {
                ingredienteComida.setIdIngredienteComida(resultado.getInt(1));
                JOptionPane.showMessageDialog(null, "Ingrediente agregado.");
            }
            ps.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al acceder a la table ingrediente"+e.getMessage());
        }
    }
    public void eliminarIngredienteComida(IngredienteComida ingredienteComida){
        try{
            String sql = "Update ingredienteComida set nombre = ?, calorias_100gr = ? where id_ingrediente = ?";
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
}
