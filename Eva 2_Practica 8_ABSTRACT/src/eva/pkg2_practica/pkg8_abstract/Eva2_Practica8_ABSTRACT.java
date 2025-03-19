/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva.pkg2_practica.pkg8_abstract;

/**
 *
 * @author Derek
 */
public class Eva2_Practica8_ABSTRACT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente Cl = new Cliente("Pedro","Piedra",30,"Moral");
        Cl.Imprimir_Datos();
        
        System.out.println("/////////////////////////");
        Empleado EM = new Empleado(1300.0,"Julio","Ave",40);
        EM.Imprimir_Datos();
    }
    
}
