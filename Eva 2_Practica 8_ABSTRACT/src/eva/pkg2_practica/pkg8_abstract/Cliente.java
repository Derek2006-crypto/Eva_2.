/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva.pkg2_practica.pkg8_abstract;

/**
 *
 * @author Derek
 */
public class Cliente extends Persona{
    private String tipo_persona;
    
    public Cliente(){
        super();
        this.tipo_persona = "NULL";
        
    }

    public Cliente(String nombre, String apellido, int edad, String tipo_persona) {
        super(nombre, apellido, edad);
        this.tipo_persona = tipo_persona;
    }

    public String getTipo_persona() {
        return tipo_persona;
    }

    public void setTipo_persona(String tipo_persona) {
        this.tipo_persona = tipo_persona;
    }

    @Override
    public void Imprimir_Datos() {
        System.out.println("Cliente");
        System.out.println("Nombre: "+ getNombre());
        System.out.println("Apellido: "+ getApellido());
        System.out.println("Edad: "+ getEdad());
        System.out.println("Persona: "+ getTipo_persona());
        
    }
    
    
}
