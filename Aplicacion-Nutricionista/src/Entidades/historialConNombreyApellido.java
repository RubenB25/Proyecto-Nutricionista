package Entidades;

import java.time.LocalDate;

/** @author User2021SD*/
public class historialConNombreyApellido {
private String nombre;
private String apellido;
private double pesoActual;
private LocalDate fechaRegistro;

    public historialConNombreyApellido(String nombre, String apellido, double pesoActual, LocalDate fechaRegistro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pesoActual = pesoActual;
        this.fechaRegistro = fechaRegistro;
    }

}
