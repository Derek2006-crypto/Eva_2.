/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva.pkg2_practica.pkg10_banco;

/**
 *
 * @author Derek
 */
public class Ahorro extends Cuenta {
    public double saldo;
    public int agregar_saldo;
    public int quitar_saldo;
    
    
    public Ahorro() {
        this.saldo = 0.0;
        this.agregar_saldo = 0;
        this.quitar_saldo = 0;
    }
    
    public Ahorro(double saldo, int agregar_saldo, int quitar_saldo) {
        this.saldo = saldo;
        this.agregar_saldo = agregar_saldo;
        this.quitar_saldo = quitar_saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgregar() {
        return agregar_saldo;
    }

    public void setAgregar(int agregar_saldo) {
        this.agregar_saldo = agregar_saldo;
    }

    public int getQuitar() {
        return quitar_saldo;
    }

    public void setQuitar(int quitar_saldo) {
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
    
    public String Limite(){
        if(saldo >= saldo){
            System.out.println("Limite de saldo actual.");
        }else{
            
        }return null;
    }
   

    @Override
    public void Imprimir_Saldo() {
        System.out.println("Saldo: "+ saldo);
        Limite();
        System.out.println("Agregar Saldo: "+ agregar_saldo);
        agregar_saldo();
        System.out.println("Quitar Saldo: "+ quitar_saldo);
        quitar_saldo();
        
    }
}
