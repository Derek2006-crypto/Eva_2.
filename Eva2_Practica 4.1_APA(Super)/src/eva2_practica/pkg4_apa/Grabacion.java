/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_practica.pkg4_apa;

/**
 *
 * @author Derek
 */
public class Grabacion extends Ficha_apa{
   
    private String interprete;
    
    
    public Grabacion(){
        super();//llama a la SUPERCLASE
        interprete = "SIN Interprete";
    }
    
    public Grabacion(String titulo,String autor, int year, String interprete){
        super(titulo,autor,year);
        this.interprete = interprete;
    }


   

    public String getInterprete() {
        return interprete;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    
}
