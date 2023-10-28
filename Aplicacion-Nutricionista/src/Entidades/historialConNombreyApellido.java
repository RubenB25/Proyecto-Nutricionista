package Entidades;

import java.time.LocalDate;

/**
 * @author User2021SD
 */
public class historialConNombreyApellido {

    private String nombre;
    private String apellido;
    private double pesoActual;
    private LocalDate fechaRegistro;
    private double variaciones;

    public historialConNombreyApellido(String nombre, String apellido, double pesoActual, LocalDate fechaRegistro, double variaciones) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pesoActual = pesoActual;
        this.fechaRegistro = fechaRegistro;
        this.variaciones = variaciones;
    }

    public historialConNombreyApellido() {
    }

    public historialConNombreyApellido(String nombre, String apellido, double pesoActual, LocalDate fechaRegistro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pesoActual = pesoActual;
        this.fechaRegistro = fechaRegistro;
    }

    public double getDiferencias() {
        return variaciones;
    }

    public void setDiferencias(double diferencias) {
        this.variaciones = variaciones;
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

    public double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

}
