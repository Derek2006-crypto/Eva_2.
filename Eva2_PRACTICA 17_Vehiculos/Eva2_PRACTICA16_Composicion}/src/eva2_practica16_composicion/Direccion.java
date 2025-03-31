/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_practica16_composicion;

/**
 *
 * @author Derek
 */
public class Direccion {
    private String calle;
    private String colonia;
    private int c_postal;
    private String ciudad;
    private String estado;
    
     public Direccion() {
        this.calle = "--";
        this.colonia = "--";
        this.c_postal = 0;
        this.ciudad = "---";
        this.estado = "----";
    }

    public Direccion(String calle, String colonia, int c_postal, String ciudad, String estado) {
        this.calle = calle;
        this.colonia = colonia;
        this.c_postal = c_postal;
        this.ciudad = ciudad;
        this.estado = estado;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public int getC_postal() {
        return c_postal;
    }

    public void setC_postal(int c_postal) {
        this.c_postal = c_postal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
