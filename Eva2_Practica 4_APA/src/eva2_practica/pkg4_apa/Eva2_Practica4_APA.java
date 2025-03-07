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
        Ficha_apa fa = new Ficha_apa();
        fa.setTitulo("Nuevo Toledo");
        fa.setEditorial("Pearl Grimm");
        fa.setYear(2025);
        System.out.println("Titulo: "+ fa.getTitulo());
        System.out.println("Editorial: "+ fa.getEditorial());
        System.out.println("Año: "+ fa.getYear());        
        //////
       Libro li = new Libro();
       li.setNombre_libro("Blancanieves");
       li.setPaginas(150);
       li.setYear(1999);
       li.setEditorial("Disney");
       li.setCiudad("New york");
       System.out.println("Titulo: "+ li.getNombre_libro());
       System.out.println("Pag: "+ li.getPaginas());
       System.out.println("Año: "+ li.getYear());
       System.out.println("Editorial: "+ li.getEditorial());
       System.out.println("Ciudad: "+ li.getCiudad());
       //////
       Sitio_web sw = new Sitio_web();
       sw.setNombre_sitioweb("Amazon");
       sw.setYear(2014);
       sw.setMes("Enero");
       sw.setDia("Martes");
       sw.setCiudad("Texas");
       System.out.println("Sitio web: "+ sw.getNombre_sitioweb());
       System.out.println("Año: "+ sw.getYear());
       System.out.println("Mes: "+ sw.getMes());
       System.out.println("Dia: "+ sw.getDia());
       System.out.println("Ciudad: "+ sw.getCiudad());
       ///////
       Grabacion gr = new Grabacion();
       gr.setTitulo("Sinfonia N.*9");
       gr.setCompositor("Bethoveen");
       gr.setInterprete("Mike");
       gr.setPais("Reino Unido");
       gr.setEstado("Gran Londres");
       gr.setYear(1470);
       System.out.println("Sinfonia: "+ gr.getTitulo());
       System.out.println("Compositor: "+ gr.getCompositor());
       System.out.println("Interprete: "+ gr.getInterprete());
       System.out.println("Pais: "+ gr.getPais());
       System.out.println("Estado: "+ gr.getEstado());
       System.out.println("Año: "+ gr.getYear());
       
    }
    
}
