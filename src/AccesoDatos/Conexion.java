package AccesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Ruben
 */
public class Conexion {

    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String DATA_BASE = "nutricionista";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    private static Connection conex;

    public Conexion() {
    }

    public static Connection getConex() {
        if (conex == null) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                conex = DriverManager.getConnection(URL + DATA_BASE, USER, PASSWORD);
            } catch (ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, "Error Driver", "ERROR", JOptionPane.ERROR_MESSAGE);
            } catch (SQLException b) {
            JOptionPane.showMessageDialog(null, "Error Base de Datos", "ERROR", JOptionPane.ERROR_MESSAGE);

            }
        }
        return conex;
    }

}
