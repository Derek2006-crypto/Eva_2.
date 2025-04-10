/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_practica.pkg2_herencia;





/**
 *
 * @author Derek
 */
public class Proveedor {
     private String nombre;
     private String apellido_paterno;
     private String apellido_materno;
     private int edad;
     private String rfc;
     private boolean credito;
     
     public Proveedor(){
       this.nombre = "SIN NOMBRE";
       this.apellido_paterno = "SIN APELLIDO";
       this.apellido_materno = "SIN APELLIDO";
       this.edad = 0;
       this.rfc = "SIN RFC";
       this.credito = false;
    }

     
     public Proveedor(String nombre, String apellido_paterno, String apellido_materno, int edad, String rfc, boolean credito) {
        this.nombre = nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.edad = edad;
        this.rfc = rfc;
        this.credito = credito;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public boolean isCredito() {
        return credito;
    }

    public void setCredito(boolean credito) {
        this.credito = credito;
    }

    public void Imprimir_Proovedor(){
         System.out.println("Nombre: "+ nombre);
         System.out.println("Primer apellido: "+ apellido_paterno);
         System.out.println("Segundo apellido: "+ apellido_materno);
         System.out.println("Edad: "+ edad);
         System.out.println("RFC: "+ rfc);
         System.out.println("Credito: "+ credito);
     }
     
    
}
