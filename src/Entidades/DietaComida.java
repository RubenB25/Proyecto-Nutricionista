package Entidades;

import Enums.HorarioComida;

/**
 * @author User2021SD
 */
public class DietaComida {

    private int idDietaComida;
    private Comida comida;
    private Dieta dieta;
    private int porcion;
    private HorarioComida horarioComida;

    public DietaComida() {
    }

    public DietaComida(Comida comida, Dieta dieta, int porcion, boolean estado, HorarioComida horarioComida) {
        this.comida = comida;
        this.dieta = dieta;
        this.porcion = porcion;
        this.horarioComida = horarioComida;
    }

    public int getIdDietaComida() {
        return idDietaComida;
    }

    public void setIdDietaComida(int idDietaComida) {
        this.idDietaComida = idDietaComida;
    }

    public Comida getComida() {
        return comida;
    }

    public void setComida(Comida comida) {
        this.comida = comida;
    }

    public Dieta getDieta() {
        return dieta;
    }

    public void setDieta(Dieta dieta) {
        this.dieta = dieta;
    }

    public int getPorcion() {
        return porcion;
    }

    public void setPorcion(int porcion) {
        this.porcion = porcion;
    }

    public HorarioComida getHorarioComida() {
        return horarioComida;
    }

    public void setHorarioComida(HorarioComida horarioComida) {
        this.horarioComida = horarioComida;
    }

    @Override
    public String toString() {
        return "DietaComida{" + "comida=" + comida + ", dieta=" + dieta + ", porcion=" + porcion + ", horarioComida=" + horarioComida + '}';
    }
    
    
    
}
