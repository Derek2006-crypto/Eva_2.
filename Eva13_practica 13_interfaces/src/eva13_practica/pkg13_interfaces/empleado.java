/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva13_practica.pkg13_interfaces;

/**
 *
 * @author Derek
 */
public class empleado extends PERSONA implements MostrarDatos {
    private String clave;

    public empleado() {
        super();
        this.clave = "-----------";
    }

    public empleado(String clave, String nombre, String apellido) {
        super(nombre, apellido);
        this.clave = clave;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public void Imprimridatos() {
         System.out.println("CLAVE: "+ clave);
        System.out.println("NOMBRE: "+ getNombre());
        System.out.println("APELLIDO: "+ getApellido());

                
        
        
        
        
        
    }
}
