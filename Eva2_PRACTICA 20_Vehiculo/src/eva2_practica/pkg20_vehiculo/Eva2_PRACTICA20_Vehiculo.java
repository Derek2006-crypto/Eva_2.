/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica.pkg20_vehiculo;

/**
 *
 * @author Derek
 */
public class Eva2_PRACTICA20_Vehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        vehiculo vh = new vehiculo();
        vh.setMarca("Mercedes");
        vh.setModelo("Mercedes-Benz 300 SLR");
        vh.setAño(1955);
        
        electrico electry = new electrico();
        diesel fosil = new diesel();
        gasolina gas = new gasolina();
        vh.setMotor(gas);
        System.out.println(vh);
               
        
    }
    
}
