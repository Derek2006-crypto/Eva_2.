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
    private String autor;
    private int year;
    
    public Ficha_apa(){
        this.titulo = "SIN TITULO";
        this.autor = "SIN AUTOR";
        this.year = 0;
       
    }
    
    public Ficha_apa(String titulo,String autor, int year) {
        this.titulo = titulo;
        this.autor = autor;
        this.year = year;
        
        
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
    public String getAutor(){
        return autor;
    }

   
    public void setAutor(String autor) {
        this.autor = autor;
    }

  
    
     
    
}