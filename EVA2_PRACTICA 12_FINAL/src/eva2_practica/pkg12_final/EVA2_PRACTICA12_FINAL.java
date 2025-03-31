/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica.pkg12_final;

/**
 *
 * @author Derek
 */
public class EVA2_PRACTICA12_FINAL {
final static int VALOR = 100;
    
    public static void main(String[] args) {
       System.out.println("Valor: "+ VALOR);
       docente doc = new docente();
       
    }
    
}
class Persona{}
class empleado extends Persona{}
final class docente extends empleado{}//ESTA YA NO SE PUEDE HEREDAR POR FINAL
//CON FINAL NO SE HEREDAN PERO SI PUEDES CREAR OBJETOS