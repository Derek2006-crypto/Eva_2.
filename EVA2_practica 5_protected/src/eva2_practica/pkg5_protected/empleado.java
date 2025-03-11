/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_practica.pkg5_protected;

/**
 *
 * @author Derek
 */
public class empleado extends persona{
    private String clave;

    public empleado() {
        super();
        this.clave = "SIN CLAVE";
        
    }

    public empleado(String nombre,String apellido,int edad,String clave){
        super(nombre,apellido,edad);
        this.clave = clave;
    }
    

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    public void imprimirdatos(){
        System.out.println("MOSTRAR DATOS DE EMPLEADO");
        System.out.println("Nombre: "+ nombre);
        System.out.println("Apellido: "+ apellido);
        System.out.println("Edad: "+ edad);
        System.out.println("Clave: "+ clave);
    }
}
