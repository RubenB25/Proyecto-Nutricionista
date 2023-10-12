/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Ruben
 */
public class Ingrediente {
    private int idIngrediente;
    private String nombre;
    private int caloriasPor100GR;

    public Ingrediente() {
    }
    
    public Ingrediente(String nombre, int caloriasPor100GR) {
        this.nombre = nombre;
        this.caloriasPor100GR = caloriasPor100GR;
    }

    
    public Ingrediente(int idIngrediente, String nombre, int caloriasPor100GR) {
        this.idIngrediente = idIngrediente;
        this.nombre = nombre;
        this.caloriasPor100GR = caloriasPor100GR;
    }

    public int getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(int idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCaloriasPor100GR() {
        return caloriasPor100GR;
    }

    public void setCaloriasPor100GR(int caloriasPor100GR) {
        this.caloriasPor100GR = caloriasPor100GR;
    }
    
     
}
