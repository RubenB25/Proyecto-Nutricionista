package Entidades;

import java.time.LocalDate;

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
    private LocalDate fechaNac;
    private String edad;
    private double pesoActual;
    private double pesoDeseado;
    private int idPaciente;
    private boolean estado;

    public Paciente() {
    }

    public Paciente(String nombre, String apellido, int dni, String domicilio, String celular,
            LocalDate fechaNac, String edad, double pesoActual, double pesoDeseado, boolean estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.domicilio = domicilio;
        this.celular = celular;
        this.fechaNac = fechaNac;
        this.edad = edad;
        this.pesoActual = pesoActual;
        this.pesoDeseado = pesoDeseado;
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

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }

    public double getPesoDeseado() {
        return pesoDeseado;
    }

    public void setPesoDeseado(double pesoDeseado) {
        this.pesoDeseado = pesoDeseado;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
