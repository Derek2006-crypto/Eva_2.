/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_practica.pkg7_sobreescrita;

/**
 *
 * @author Derek
 */
public class Empleado {
   protected String nombre;
   protected String apellido;
   protected double salario;
   protected int bono;

   public Empleado(){
      this.nombre = "SIN NOMBRE";
      this.apellido = "SIN APPELIDO";
      this.salario = 0.0;
      this.bono = 0;
   }

    public Empleado(String nombre, String apellido, double salario, int bono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.bono = bono;
    }
    
      public int getBono() {
        return bono;
    }

    public void setBono(int bono) {
        this.bono = bono;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
    
    public void Imprimir_EP(){
        System.out.println("MOSTRAR DATOS DE EMPLEADO");
        System.out.println("Nombre: "+ nombre);
        System.out.println("Apellido: "+ apellido);
        System.out.println("Salario: "+ salario);
        System.out.println("Bono: "+ bono);
    }
}
