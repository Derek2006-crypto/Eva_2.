/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_practica19_libro;

/**
 *
 * @author Derek
 */
public class Autor extends Material_Bibliografico{
    private String nombre;
    private String nacionalidad;
    
    public Autor() {
        super();
        this.nombre = "---";
        this.nacionalidad = "---";
    }

    public Autor(String nombre, String nacionalidad, String titulo, int año_public, String editorial, String lugar_public, int num_edition) {
        super(titulo, año_public, editorial, lugar_public, num_edition);
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    @Override
    public void Imprimir_Libro(){
       System.out.println("Datos del libro.");
       System.out.println("Nombre del autor: "+ nombre);
       System.out.println("Nacionalidad del autor: "+ nacionalidad); 
       super.Imprimir_Libro();
       
    }
    
    
    
}
