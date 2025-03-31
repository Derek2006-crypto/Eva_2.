/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_practica19_libro;

/**
 *
 * @author Derek
 */
public class Material_Bibliografico {
  private String titulo;
  private int año_public;
  private String editorial;
  private String lugar_public;
  private int num_edition;
  
  public Material_Bibliografico() {
        this.titulo = "---";
        this.año_public = 0;
        this.editorial = "---";
        this.lugar_public = "---";
        this.num_edition = 0;
    }

    public Material_Bibliografico(String titulo, int año_public, String editorial, String lugar_public, int num_edition) {
        this.titulo = titulo;
        this.año_public = año_public;
        this.editorial = editorial;
        this.lugar_public = lugar_public;
        this.num_edition = num_edition;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAño_public() {
        return año_public;
    }

    public void setAño_public(int año_public) {
        this.año_public = año_public;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getLugar_public() {
        return lugar_public;
    }

    public void setLugar_public(String lugar_public) {
        this.lugar_public = lugar_public;
    }

    public int getNum_edition() {
        return num_edition;
    }

    public void setNum_edition(int num_edition) {
        this.num_edition = num_edition;
    }
    
    public void Imprimir_Libro(){
        System.out.println("Titulo: "+ titulo);
        System.out.println("Año de publicacion: "+ año_public);
        System.out.println("Editroial: "+ editorial);
        System.out.println("Lugar de publiacion: "+ lugar_public);
        System.out.println("Numero de edicion: "+ num_edition);
    }
  
   
    }
