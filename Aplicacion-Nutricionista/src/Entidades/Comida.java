package Entidades;

/**
 * @author User2021SD
 */
public class Comida {

    private String nombre;
    private String detalle;
    private int cantCalorias;
    private int idComida;
    private boolean estado;

    public Comida() {
    }

    public boolean getEstado() {
        return estado;
    }

    public void IsEstado(boolean estado) {
        this.estado = estado;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getCantCalorias() {
        return cantCalorias;
    }

    public void setCantCalorias(int cantCalorias) {
        this.cantCalorias = cantCalorias;
    }

    public int getIdComida() {
        return idComida;
    }

    public void setIdComida(int idComida) {
        this.idComida = idComida;
    }

}
