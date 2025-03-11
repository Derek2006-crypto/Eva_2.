/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica.pkg5_protected;

/**
 *
 * @author Derek
 */
public class EVA2_practica5_protected {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        persona pe = new persona();
        System.out.println("------------------");
        empleado em = new empleado("Pedro","Piedra",30,"CLV");
        em.imprimirdatos();
    }
    
}
