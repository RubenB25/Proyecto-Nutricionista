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
public class IngredienteComida {
    private int idIngredienteComida;
    private Comida comida;
;    private Ingrediente ingrediente;

    public IngredienteComida() {
    }

    public IngredienteComida(Comida idComida, Ingrediente idIngrediente) {
        this.comida = idComida;
        this.ingrediente = idIngrediente;
    }

    public int getIdIngredienteComida() {
        return idIngredienteComida;
    }

    public void setIdIngredienteComida(int idIngredienteComida) {
        this.idIngredienteComida = idIngredienteComida;
    }

    public Comida getComida() {
        return comida;
    }

    public void setComida(Comida idComida) {
        this.comida = comida;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente idIngrediente) {
        this.ingrediente = ingrediente;
    }
    
    
}
