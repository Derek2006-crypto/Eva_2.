/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_practica.pkg6_;

/**
 *
 * @author Derek
 */
public class empleado extends persona {
   private String clave;
   
   public empleado(){
       this.clave = "SIN CLAVE";
   }

    public empleado(String clave) {
        super();
        this.clave = "SIN CLAVE";
    }

    public empleado( String nombre, String apellido, int edad,String clave) {
        super(nombre, apellido, edad);
        this.clave = clave;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    @Override
    public void imprimirdatos(){
        super.imprimirdatos();
        System.out.println("Clave: "+ clave);
    }

}
