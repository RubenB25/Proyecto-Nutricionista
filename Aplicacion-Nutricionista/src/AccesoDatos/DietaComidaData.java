/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Entidades.DietaComida;
import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
    
}
