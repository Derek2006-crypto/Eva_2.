/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_practica16_composicion;

/**
 *
 * @author Derek
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private int edad;
    private Direccion direccion;//Esto simboliza que un cliente tien una direccion
    
    public Cliente() {
        this.nombre = "-----";
        this.apellido = "----";
        this.edad = 0;
        this.direccion = new Direccion();
    }

    public Cliente(String nombre, String apellido, int edad,String calle, String colonia,int c_postal, String ciudad, String estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = new Direccion(calle,colonia,c_postal,ciudad,estado);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    public String toStrin(){
        return "DATOS DEL CLIENTE: \n" +
                "Nombre: " + nombre + "\n" +
                "Apellido: " + apellido + "\n" +
                "Edad: " + edad + "\n" +
                "Calle: " + direccion.getCalle() + "\n" +
                "Colonia: " + direccion.getColonia() + "\n" +
                "CP: " + direccion.getC_postal() + "\n" +
                "Estado: " + direccion.getEstado();
                
    }
    
}
