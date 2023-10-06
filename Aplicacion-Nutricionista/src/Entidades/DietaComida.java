package Entidades;

import EnumDietaComida.FranjaHoraria;

/**
 * @author User2021SD
 */
public class DietaComida {

    private int idDietaComida;
    private Comida comida;
    private Dieta dieta;
    private FranjaHoraria horario;
    private int porcion;
    private boolean estado;

    public DietaComida() {
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

    public FranjaHoraria getHorario() {
        return horario;
    }

    public void setHorario(FranjaHoraria horario) {
        this.horario = horario;
    }

    public int getPorcion() {
        return porcion;
    }

    public void setPorcion(int porcion) {
        this.porcion = porcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
