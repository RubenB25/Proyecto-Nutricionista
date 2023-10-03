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
    private int celular;
    private int idPaciente;
    private boolean estado;

    public Paciente() {
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
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

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public boolean IsEstado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
