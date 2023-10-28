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
   private double variacion;
    private double pesoActual;

    private LocalDate fechaRegistro;

    public Historial() {
    }

    public Historial(int idPaciente, double pesoActual, LocalDate fechaRegistro) {
        this.idPaciente = idPaciente;
        this.pesoActual = pesoActual;
        this.fechaRegistro = fechaRegistro;
    }

    public Historial(int idPaciente, double cuello, double busto, double cintura, double brazo, double cadera, double pierna, double estatura, double pesoActual) {
        this.idPaciente = idPaciente;
        this.cuello = cuello;
        this.busto = busto;
        this.cintura = cintura;
        this.brazo = brazo;
        this.cadera = cadera;
        this.pierna = pierna;
        this.estatura = estatura;
        
        this.pesoActual = pesoActual;
    }

    public Historial(double pesoActual, LocalDate fechaRegistro) {
 
        this.pesoActual = pesoActual;
        this.fechaRegistro = fechaRegistro;
    }

    public Historial(int idHistorial, int idPaciente, double cuello, double busto, double cintura, double brazo, double cadera, double pierna, double estatura, double pesoActual, LocalDate fechaRegistro) {
        this.idHistorial = idHistorial;
        this.idPaciente = idPaciente;
        this.cuello = cuello;
        this.busto = busto;
        this.cintura = cintura;
        this.brazo = brazo;
        this.cadera = cadera;
        this.pierna = pierna;
        this.estatura = estatura;
       
        this.pesoActual = pesoActual;
        this.fechaRegistro = fechaRegistro;
    }

    public Historial(int idPaciente, double cuello, double busto, double cintura, double brazo, double cadera, double pierna, double estatura, double variacion, double pesoActual) {
        this.idPaciente = idPaciente;
        this.cuello = cuello;
        this.busto = busto;
        this.cintura = cintura;
        this.brazo = brazo;
        this.cadera = cadera;
        this.pierna = pierna;
        this.estatura = estatura;
        this.variacion = variacion;
        this.pesoActual = pesoActual;
    }

    public Historial(int idPaciente, double cuello, double busto, double cintura, double brazo, double cadera, double pierna, double estatura, double variacion, double pesoActual, LocalDate fechaRegistro) {
        this.idPaciente = idPaciente;
        this.cuello = cuello;
        this.busto = busto;
        this.cintura = cintura;
        this.brazo = brazo;
        this.cadera = cadera;
        this.pierna = pierna;
        this.estatura = estatura;
        this.variacion = variacion;
        this.pesoActual = pesoActual;
        this.fechaRegistro = fechaRegistro;
    }

    public Historial(int idPaciente, double cuello, double busto, double cintura, double brazo, double cadera, double pierna, double estatura, double pesoActual, LocalDate fechaRegistro) {
        this.idPaciente = idPaciente;
        this.cuello = cuello;
        this.busto = busto;
        this.cintura = cintura;
        this.brazo = brazo;
        this.cadera = cadera;
        this.pierna = pierna;
        this.estatura = estatura;
       
        this.pesoActual = pesoActual;
        this.fechaRegistro = fechaRegistro;
    }

    public double getVariacion() {
        return variacion;
    }

    public void setVariacion(double variacion) {
        this.variacion = variacion;
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