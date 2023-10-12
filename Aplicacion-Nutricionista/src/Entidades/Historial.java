package Entidades;

import java.time.LocalDate;

/**
 * @author Gabriel
 */
public class Historial {

    private int idHistorial;
    private int dniPaciente;
    private int idPaciente;
    private double estatura;
    private double pesoInicial;
    private double peso;
    private double pesoDeseado;
    private int idDieta;
    private LocalDate fechaFin;
    private LocalDate fechaRegistro;

    public Historial() {
    }

    public Historial(int dniPaciente, double estatura, double pesoInicial, double peso, double pesoDeseado, int idDieta, LocalDate fechaFin, LocalDate fechaRegistro) {
        this.dniPaciente = dniPaciente;
        this.estatura = estatura;
        this.pesoInicial = pesoInicial;
        this.peso = peso;
        this.pesoDeseado = pesoDeseado;
        this.idDieta = idDieta;
        this.fechaFin = fechaFin;
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public String toString() {
        return "Historial{" + "idHistorial=" + idHistorial + ", dniPaciente=" + dniPaciente + ", idPaciente=" + idPaciente + ", estatura=" + estatura + ", pesoInicial=" + pesoInicial + ", peso=" + peso + ", pesoDeseado=" + pesoDeseado + ", idDieta=" + idDieta + ", fechaFin=" + fechaFin + ", fechaRegistro=" + fechaRegistro + '}';
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPesoInicial() {
        return pesoInicial;
    }

    public void setPesoInicial(double pesoInicial) {
        this.pesoInicial = pesoInicial;
    }

    public double getPesoDeseado() {
        return pesoDeseado;
    }

    public void setPesoDeseado(double pesoDeseado) {
        this.pesoDeseado = pesoDeseado;
    }

    public int getIdDieta() {
        return idDieta;
    }

    public void setIdDieta(int idDieta) {
        this.idDieta = idDieta;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(int idHistorial) {
        this.idHistorial = idHistorial;
    }

    public int getDniPaciente() {
        return dniPaciente;
    }

    public void setDniPaciente(int dniPaciente) {
        this.dniPaciente = dniPaciente;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

}
