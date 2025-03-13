/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_practica.pkg7_sobreescrita;

/**
 *
 * @author Derek
 */
public class Empleado_tem extends Empleado {
    private int num_contrato;
    private int horas;
    private double salario_hr;
    
    public Empleado_tem(){
        super();
        this.num_contrato = 0;
        this.horas = 0;
           
    }

    public Empleado_tem( String nombre, String apellido, double salario, int bono, int num_contrato,int horas) {
        super(nombre, apellido, salario, bono);
        this.num_contrato = num_contrato;
           
    }
    
     public double getSalario_hr() {
        return salario_hr;
    }

    public void setSalario_hr(double salario_hr) {
        this.salario_hr = salario_hr;
    }
    
    
    public int getNum_contrato() {
        return num_contrato;
    }

    public void setNum_contrato(int num_contrato) {
        this.num_contrato = num_contrato;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    public double calcular_salario(){
        int horas = 8;
        double salario = 120.00;
        double salario_hr = salario * horas;
        return(salario*horas);
        
    }
    
    public void Imprimir_tem(){
        super.Imprimir_EP();
        System.out.println("Numero de contrato: "+ num_contrato);
        System.out.println("Horas trabajas: "+ horas);
        System.out.println("Salario total: "+ salario_hr);
    }

    
    
    
}
