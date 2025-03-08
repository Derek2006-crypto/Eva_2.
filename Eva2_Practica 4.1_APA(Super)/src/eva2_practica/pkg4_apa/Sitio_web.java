/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_practica.pkg4_apa;

/**
 *
 * @author Derek
 */
public class Sitio_web extends Ficha_apa{
    private String mes;
    private int dia;
    
    public Sitio_web(){
        super();//llama a la SUPERCLASE
        mes = "SIN mes";
        dia = 0;
    }
    
    public Sitio_web(String titulo,String autor, int year,String mes,int dia){
        super(titulo,autor,year);
        this.mes = mes;
        this.dia = dia;
    }


    

    
    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    
}
