/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_practica.pkg6_;

/**
 *
 * @author Derek
 */
public class maestro extends empleado{
    private String puesto;

    public maestro( String nombre, String apellido, int edad, String clave,String puesto) {
        super(nombre, apellido, edad, clave);
        this.puesto = puesto;
    }
    
    public maestro(){
        super();
        this.puesto = "SIN PUESTO";
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    
    @Override
    public void imprimirdatos(){
        super.imprimirdatos();
        System.out.println("Puesto: "+ puesto);
    }

    
    
}
