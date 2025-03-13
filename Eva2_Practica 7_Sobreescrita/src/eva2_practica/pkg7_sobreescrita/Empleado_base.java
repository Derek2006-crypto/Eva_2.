/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_practica.pkg7_sobreescrita;

/**
 *
 * @author Derek
 */
public class Empleado_base extends Empleado{
    private int num_empleado;
    private double salario_bono;

    public Empleado_base(){
        super();
        this.num_empleado = 0;
    }

    public Empleado_base(int num_empleado, String nombre, String apellido, double salario, int bono) {
        super(nombre, apellido, salario, bono);
        this.num_empleado = num_empleado;
    }
   
    public int getNum_empleado() {
        return num_empleado;
    }

    public void setNum_empleado(int num_empleado) {
        this.num_empleado = num_empleado;
    }
    
     public double getSalario_bono() {
        return salario_bono;
    }

    public void setSalario_bono(double salario_bono) {
        this.salario_bono = salario_bono;
    }
    
    
    public double calcular_salario(){
        int bono = 500;
        double salario = 1000.00;
        double salario_bono = salario + bono;
        return(salario+bono);
        
    }
    
    public void Imprimir_Base(){
        super.Imprimir_EP();
        System.out.println("Numero de empleado: "+ num_empleado);
        System.out.println("Salario total: "+ salario_bono);
        
    
    }

    

    

   
    

    
    
  
    
    
    
    
}
