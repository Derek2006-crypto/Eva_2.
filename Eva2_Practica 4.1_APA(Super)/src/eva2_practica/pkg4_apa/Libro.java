/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_practica.pkg4_apa;

/**
 *
 * @author Derek
 */
public class Libro extends Ficha_apa{
    private int paginas;
    private String editorila;
    
    public Libro(){
        super();//llama a la SUPERCLASE
        paginas = 0;
        editorila = "FICHA EDITORIAL";
    }
    
    public Libro(String titulo,String autor, int year, int paginas, String editorila){
        super(titulo,autor,year);
        this.paginas = paginas;
        this.editorila = editorila;
    }

    public String getEditorila() {
        return editorila;
    }

    public void setEditorila(String editorila) {
        this.editorila = editorila;
    }
    

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
     
     
    
}
