/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_practica.pkg20_vehiculo;

/**
 *
 * @author Derek
 */
public class vehiculo {
    private String marca;
    private String modelo;
    private int año;
    private motor motor;
    
    public vehiculo() {
        this.marca = "---";
        this.modelo = "---";
        this.año = 0;
        this.motor = null;
    }


    public vehiculo(String marca, String modelo, int año, motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public motor getMotor() {
        return motor;
    }

    public void setMotor(motor motor) {
        this.motor = motor;
    }
    
    @Override
    public String toString(){
       String cade = "Marca: " + marca + "\n" +
               "Modelo: " + modelo + "\n" +
               "Añ0: " + año + "\n" + "Motor: " + motor.tipo_motor();
       
       return cade;
    }
}
