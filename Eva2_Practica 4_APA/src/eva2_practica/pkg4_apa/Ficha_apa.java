/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_practica.pkg4_apa;

/**
 *
 * @author Derek
 */
public class Ficha_apa {
    private String titulo;
    private int year;
    public String ciudad;
    private String editorial;
    
    public Ficha_apa(){
        this.titulo = "SIN TITULO";
        this.year = 0;
        this.ciudad = "SIN CIUDAD";
        this.editorial = "SIN EDITORIAL";
    }
    


    public Ficha_apa(String titulo, int year, String ciudad, String editorial) {
        this.titulo = titulo;
        this.year = year;
        this.ciudad = ciudad;
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
     
    
}