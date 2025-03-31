/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva.pkg2_practica.pkg9_figuras;

/**
 *
 * @author Derek
 */
public class Rectangulo extends figuras {
    private double base;
    private double altura;
    
    public Rectangulo() {
        
        this.base = 0.0;
        this.altura = 0.0;
    }


    public Rectangulo( double base, double altura) {
        
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
  
    @Override
    public double calcular_area() {
        return  base * altura;
    }

    @Override
    public double calcular_perimetro() {
        return base * 2 + altura * 2;
    }
    
    
    
    
    
    
    
    
}
