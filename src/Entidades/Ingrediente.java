
package Entidades;

/**
 *
 * @author Ruben
 */
public class Ingrediente {
    private int idIngrediente;
    private String nombre;
    private int caloriasPor100GR;

    public Ingrediente() {
    }
    
    public Ingrediente(int idIngrediente) {
        this.idIngrediente = idIngrediente;
    }
    
    public Ingrediente(String nombre, int caloriasPor100GR) {
        this.nombre = nombre;
        this.caloriasPor100GR = caloriasPor100GR;
    }

    
    public Ingrediente(int idIngrediente, String nombre, int caloriasPor100GR) {
        this.idIngrediente = idIngrediente;
        this.nombre = nombre;
        this.caloriasPor100GR = caloriasPor100GR;
    }

    public int getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(int idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCaloriasPor100GR() {
        return caloriasPor100GR;
    }

    public void setCaloriasPor100GR(int caloriasPor100GR) {
        this.caloriasPor100GR = caloriasPor100GR;
    }

    @Override
    public String toString() {
        return "Ingrediente{" + "idIngrediente=" + idIngrediente + ", nombre=" + nombre + ", caloriasPor100GR=" + caloriasPor100GR + '}';
    }
    
     
}
