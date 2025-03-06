/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica.pkg2_herencia;
import java.util.Scanner;
/**
 *
 * @author Derek
 */
public class Eva2_Practica2_Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cl = new Cliente("Jose","Piedra","Aledo",30,"TRL200");
        cl.Imprrimir_Cliente();
        
        Proveedor pr = new Proveedor("Pedro","Agua","Salada",25,"KLR300",true);
        pr.Imprimir_Proovedor();
        
        Empleado em = new Empleado("Jhon","Alado","Pluma",18,"CVH560",24003451);
        em.Imprimir_Empleado();
                
    }
    
}
