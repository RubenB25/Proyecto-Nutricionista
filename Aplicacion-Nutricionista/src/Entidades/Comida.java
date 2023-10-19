package Entidades;

/**
 * @author User2021SD
 */
public class Comida {

    private int idComida;
    private String nombre;
    private String detalle;
    private int cantCaloriasCada100Gms;
    private boolean estado;

    public Comida() {
    }

    public Comida(String nombre, String detalle, int cantCalorias, boolean estado) {
        this.nombre = nombre;
        this.detalle = detalle;
        this.cantCaloriasCada100Gms = cantCalorias;
        this.estado = estado;
    }

    public Comida(int idComida, String nombre, String detalle, int cantCalorias, boolean estado) {
        this.idComida = idComida;
        this.nombre = nombre;
        this.detalle = detalle;
        this.cantCaloriasCada100Gms = cantCalorias;
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
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
        return cantCaloriasCada100Gms;
    }

    public void setCantCalorias(int cantCalorias) {
        this.cantCaloriasCada100Gms = cantCalorias;
    }

    public int getIdComida() {
        return idComida;
    }

    public void setIdComida(int idComida) {
        this.idComida = idComida;
    }

}
