package Entidades;

import java.time.LocalDate;

/**
 * @author Gabriel
 */
public class Historial {

    private int idHistorial;
    private int idPaciente;
    private double cuello;
    private double busto;
    private double cintura;
    private double brazo;
    private double cadera;
    private double pierna;
    private double estatura;
    private int idDieta;
    private double pesoActual;

    private LocalDate fechaRegistro;

    public Historial() {
    }

    public Historial(int idPaciente, double pesoActual, LocalDate fechaRegistro) {
        this.idPaciente = idPaciente;
        this.pesoActual = pesoActual;
        this.fechaRegistro = fechaRegistro;
    }

    public Historial(double pesoActual, LocalDate fechaRegistro) {
 
        this.pesoActual = pesoActual;
        this.fechaRegistro = fechaRegistro;
    }

    public Historial(int idHistorial, int idPaciente, double cuello, double busto, double cintura, double brazo, double cadera, double pierna, double estatura, int idDieta, double pesoActual, LocalDate fechaRegistro) {
        this.idHistorial = idHistorial;
        this.idPaciente = idPaciente;
        this.cuello = cuello;
        this.busto = busto;
        this.cintura = cintura;
        this.brazo = brazo;
        this.cadera = cadera;
        this.pierna = pierna;
        this.estatura = estatura;
        this.idDieta = idDieta;
        this.pesoActual = pesoActual;
        this.fechaRegistro = fechaRegistro;
    }

    public Historial(int idPaciente, double cuello, double busto, double cintura, double brazo, double cadera, double pierna, double estatura, int idDieta, double pesoActual, LocalDate fechaRegistro) {
        this.idPaciente = idPaciente;
        this.cuello = cuello;
        this.busto = busto;
        this.cintura = cintura;
        this.brazo = brazo;
        this.cadera = cadera;
        this.pierna = pierna;
        this.estatura = estatura;
        this.idDieta = idDieta;
        this.pesoActual = pesoActual;
        this.fechaRegistro = fechaRegistro;
    }

    public Historial(int aInt, double aDouble, double aDouble0, double aDouble1, double aDouble2, double aDouble3, double aDouble4, double aDouble5, int aInt0, double aDouble6) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }

    public int getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(int idHistorial) {
        this.idHistorial = idHistorial;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public double getCuello() {
        return cuello;
    }

    public void setCuello(double cuello) {
        this.cuello = cuello;
    }

    public double getBusto() {
        return busto;
    }

    public void setBusto(double busto) {
        this.busto = busto;
    }

    public double getCintura() {
        return cintura;
    }

    public void setCintura(double cintura) {
        this.cintura = cintura;
    }

    public double getBrazo() {
        return brazo;
    }

    public void setBrazo(double brazo) {
        this.brazo = brazo;
    }

    public double getCadera() {
        return cadera;
    }

    public void setCadera(double cadera) {
        this.cadera = cadera;
    }

    public double getPierna() {
        return pierna;
    }

    public void setPierna(double pierna) {
        this.pierna = pierna;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public int getIdDieta() {
        return idDieta;
    }

    public void setIdDieta(int idDieta) {
        this.idDieta = idDieta;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

}
