/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva.pkg2_practica.pkg9_figuras;

/**
 *
 * @author Derek
 */
public class EVA2_PRACTICA9_FIGURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      circulo C = new circulo(100);
      System.out.println("CIRCULO: ");
      System.out.println("AREA: "+ C.calcular_area());
      System.out.println("PERIMETRO: "+ C.calcular_perimetro());
      System.out.println("//////////////");
      
      Rectangulo R = new Rectangulo(10,100);
       System.out.println("AREA: "+ R.calcular_area());
      System.out.println("PERIMETRO: "+ R.calcular_perimetro());
     
      
      
      
      
    }
    
}
