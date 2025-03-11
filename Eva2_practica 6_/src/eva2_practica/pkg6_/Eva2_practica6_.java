/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica.pkg6_;

/**
 *
 * @author Derek
 */
public class Eva2_practica6_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        empleado em = new empleado("SOFIA","rosa",30,"CLV");
        em.imprimirdatos();
        System.out.println("/////////////");
        
        
        maestro ma = new maestro("rosa","flores",35,"slb","Gerente");
        ma.imprimirdatos();
    }
    
}
