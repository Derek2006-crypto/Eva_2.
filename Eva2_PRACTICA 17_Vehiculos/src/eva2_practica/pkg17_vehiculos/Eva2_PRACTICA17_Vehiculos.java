/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica.pkg17_vehiculos;

/**
 *
 * @author Derek
 */
public class Eva2_PRACTICA17_Vehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vehiculo Vh = new Vehiculo("Chrevolet","Vid",1999);
        System.out.println(Vh);
        
        Motor mo = new Motor(100,500,500);
        Vh.setMotor(mo);
        System.out.println(Vh);
        
        
        
    }
    
}
