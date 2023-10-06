package AccesoDatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

/** @author Gabriel */
public class HistorialData {
 private Connection conex = null;

    public HistorialData() {
        conex = Conexion.getConex();
    }
    
//    public void nuevoHistorial(Paciente paciente) {
//        String sql = "INSERT INTO historial (id_paciente, peso, fecha_registro)"
//                + "VALUES (?, ?, ?, ?)";
//        
        
//        
//       public void guardarInscripcion(Inscripcion insc) {
//        try {
//            String sql = "INSERT INTO inscripcion (nota,idAlumno,idMateria) VALUES (" + insc.getNota() + "," + insc.getAlumno().getIdAlumno() + "," + insc.getMateria().getIdMateria() + ")";
//            PreparedStatement ps = con.prepareStatement(sql);
//            int filasAfectadas = ps.executeUpdate();
//
//            if (filasAfectadas > 0) {
//                JOptionPane.showMessageDialog(null, "Inscripción realizada con éxito.");
//            } else {
//                System.out.println("No se pudo insertar ningún dato.");
//            }
//        } catch (SQLException e) {
//
//        }
//
//    }
//    }
}
