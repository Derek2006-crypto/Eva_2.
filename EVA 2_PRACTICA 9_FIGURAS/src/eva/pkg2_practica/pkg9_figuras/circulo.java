/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva.pkg2_practica.pkg9_figuras;

/**
 *
 * @author Derek
 */
public class circulo extends figuras{
    private double radio;
    
    public circulo(){
        this.radio = 0;
    }

    public circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcular_area() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcular_perimetro() {
        return Math.PI * radio * 2;
    }
    
}
