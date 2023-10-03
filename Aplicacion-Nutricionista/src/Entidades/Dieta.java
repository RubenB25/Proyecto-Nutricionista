package Entidades;

import java.security.PrivateKey;
import java.time.LocalDate;

/**
 * @author User2021SD
 */
public class Dieta {

    private int idDieta;
    private String nombre;
    private Paciente paciente;
    private LocalDate fechaInicial;
    private LocalDate fechaFinal;
    private double pesoInicial;
    private double pesoFinal;
    private boolean estado;

    public Dieta() {
    }

    public boolean getEstado() {
        return estado;
    }

    public void IsEstado(boolean estado) {
        this.estado = estado;
    }

    public int getIdDieta() {
        return idDieta;
    }

    public void setIdDieta(int idDieta) {
        this.idDieta = idDieta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public LocalDate getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(LocalDate fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public double getPesoInicial() {
        return pesoInicial;
    }

    public void setPesoInicial(double pesoInicial) {
        this.pesoInicial = pesoInicial;
    }

    public double getPesoFinal() {
        return pesoFinal;
    }

    public void setPesoFinal(double pesoFinal) {
        this.pesoFinal = pesoFinal;
    }

}
