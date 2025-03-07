/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica.pkg3_generalizacion;

/**
 *
 * @author Derek
 */
public class Eva2_Practica3_Generalizacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado ep = new Empleado();
        ep.setNombre("Pedro");
        System.out.println("Nombre: "+ ep.getNombre());
        ep.setNum_empleado(200789);
        ////
        Proovedor pr = new Proovedor();
        pr.setNombre("Alsuper");
        pr.setCredito(false);
         System.out.println("Nombre: "+ pr.getNombre());
         System.out.println("Credito: "+ pr.isCredito());
         /////
         Cliente cl = new Cliente();
         cl.setNombre("Pedro");
         cl.setRazon_social("Cucaracha");
         System.out.println("Nombre: "+ cl.getRazon_social());
         System.out.println("Razon social: "+ cl.getRazon_social());
        
    }
    
}
