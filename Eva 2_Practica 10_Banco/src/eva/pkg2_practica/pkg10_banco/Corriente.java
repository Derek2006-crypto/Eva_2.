/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva.pkg2_practica.pkg10_banco;

/**
 *
 * @author Derek
 */
public class Corriente extends Cuenta {
    public double saldo;
    public double agregar_saldo;
    public double quitar_saldo;
    
     public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public double getAgregar_saldo() {
        return agregar_saldo;
    }

    public void setAgregar_saldo(double agregar_saldo) {
        this.agregar_saldo = agregar_saldo;
    }

    public double getQuitar_saldo() {
        return quitar_saldo;
    }

    public void setQuitar_saldo(double quitar_saldo) {
        this.quitar_saldo = quitar_saldo;
    }
    
    
    public Corriente() {
        this.saldo = 0.0;
        this.agregar_saldo = 0.0;
        this.quitar_saldo = 0.0;
    }
    
    public Corriente(double saldo, double agregar_saldo, double quitar_saldo) {
        this.saldo = saldo;
        this.agregar_saldo = agregar_saldo;
        this.quitar_saldo = quitar_saldo;
    }

   

    @Override
    public double saldo() {
        return saldo;
    }

    @Override
    public double agregar_saldo() {
        return saldo + agregar_saldo;
        
    }

    @Override
    public double quitar_saldo() {
        return saldo - quitar_saldo;
        
        
    }
    
   

    @Override
    public void Imprimir_Saldo() {
       System.out.println("Cuenta");
       System.out.println("Saldo: "+ saldo);
       System.out.println("Retirar dinero: "+ quitar_saldo());
       quitar_saldo();
       System.out.println("Depositar: "+ agregar_saldo);
       agregar_saldo();
    }
   
}
