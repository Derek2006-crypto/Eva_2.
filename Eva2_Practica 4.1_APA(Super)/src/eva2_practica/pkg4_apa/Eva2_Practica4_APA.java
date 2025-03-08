/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica.pkg4_apa;

/**
 *
 * @author Derek
 */
public class Eva2_Practica4_APA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("--------------------");
        Ficha_apa fa = new Ficha_apa();
        Libro li = new Libro();
        //////
        System.out.println("---/Libro/-------");
        fa.setTitulo("Pinocho");
        fa.setYear(1940);
        li.setPaginas(140);
        li.setEditorila("Disney");
        fa.setAutor("Walt Disney");
        System.out.println("Titulo: "+ fa.getTitulo());
        System.out.println("Año de publicacion: "+ fa.getYear());
        System.out.println("Page: "+ li.getPaginas());
        System.out.println("Editorial: "+ li.getEditorila());
        System.out.println("Autor del libro: "+ fa.getAutor());
        ////////
        Sitio_web se = new Sitio_web();
        System.out.println("---/Grabacion/---------");
        fa.setTitulo("Spotify");
        fa.setYear(2006);
        se.setMes("Marzo");
        se.setDia(1);
        fa.setAutor("Daniel EK");
        System.out.println("Sitio Web: "+ fa.getTitulo());
        System.out.println("Fecha de lanzamiento: "+ fa.getYear());
        System.out.println("Mes de lanzamiento: "+ se.getMes());
        System.out.println("Dia de lanzamiento: "+ se.getDia());
        System.out.println("Creador del Sitio Web: "+ fa.getAutor());
        /////
        Grabacion gr = new Grabacion();
        System.out.println("---/Grabacion/---------");
        fa.setTitulo("Thunderstruck");
        fa.setYear(1990);
        gr.setInterprete("Dave Evans");
        System.out.println("Cancion: "+ fa.getTitulo());
        System.out.println("lanzamiento: "+ fa.getYear());
        System.out.println("Vocalista: "+ gr.getInterprete());
        ////
        Enciclopedia en = new Enciclopedia();
        System.out.println("---/Enciclopedia/-------");
        en.setAutor("Pepe");
        System.out.println("Autor: "+ en.getAutor());
        System.out.println("Titulo: "+ en.getTitulo());
        System.out.println("Año: "+ en.getYear());
        
        
        
        
        
        
    
     
     }
}
