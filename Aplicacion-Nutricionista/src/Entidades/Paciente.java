package Entidades;

/**
 *
 * @author User2021SD
 */
public class Paciente {

    private String nombre;
    private String apellido;
    private int dni;
    private String domicilio;
    private String celular;
    private int idPaciente;

    public Paciente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int id_paciente) {
        this.idPaciente = id_paciente;
    }
    
}
