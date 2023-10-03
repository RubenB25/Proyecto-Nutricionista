package Entidades;

/**
 * @author User2021SD
 */
public class DietaComida {

    private int idDietaComida;
    private Comida comida;
    private Dieta dieta;
    private boolean estado;

    public DietaComida() {
    }

    public boolean getEstado() {
        return estado;
    }

    public void IsEstado(boolean estado) {
        this.estado = estado;
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

}
