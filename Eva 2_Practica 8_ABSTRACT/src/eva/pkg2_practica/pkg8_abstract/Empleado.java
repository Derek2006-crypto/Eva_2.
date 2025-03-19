/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva.pkg2_practica.pkg8_abstract;

/**
 *
 * @author Derek
 */
public class Empleado extends Persona  {
    private double sueldo;
    
    public Empleado(){
        super();
        this.sueldo = 0.0;
        
    }

    public Empleado(double sueldo, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public void Imprimir_Datos() {
        System.out.println("Empleado");
        System.out.println("Nombre: "+ getNombre());
        System.out.println("Apellido: "+ getApellido());
        System.out.println("Edad: "+ getEdad());
        System.out.println("Salario: "+ getSueldo());
        
    }
    
    
}
