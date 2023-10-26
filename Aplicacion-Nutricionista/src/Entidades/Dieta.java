package Entidades;

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

    public Dieta(String nombre, LocalDate fechaFinal, double pesoFinal, boolean estado) {
        this.nombre = nombre;
        this.fechaFinal = fechaFinal;
        this.pesoFinal = pesoFinal;
        this.estado = estado;
    }

    public Dieta(int idDieta, Paciente paciente, LocalDate fechaFinal, boolean estado) {
        this.idDieta = idDieta;
        this.paciente = paciente;
       
        this.fechaFinal = fechaFinal;
        this.estado = estado;
    }

    public Dieta(String nombre, Paciente paciente, LocalDate fechaInicial, LocalDate fechaFinal, double pesoInicial, double pesoFinal, boolean estado) {
        this.nombre = nombre;
        this.paciente = paciente;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.pesoInicial = pesoInicial;
        this.pesoFinal = pesoFinal;
        this.estado = estado;
    }

    public Dieta(int idDieta, String nombre, Paciente paciente, LocalDate fechaInicial, LocalDate fechaFinal, double pesoInicial, double pesoFinal, boolean estado) {
        this.idDieta = idDieta;
        this.nombre = nombre;
        this.paciente = paciente;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.pesoInicial = pesoInicial;
        this.pesoFinal = pesoFinal;
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
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

    public String getInicioDieta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getFinDieta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setIdComida(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Dieta:" + nombre + paciente;
    }

    
}
