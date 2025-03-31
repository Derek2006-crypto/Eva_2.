package eva2_practica.pkg17_vehiculos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Derek
 */
public class Motor {
    private int tipo;
    private int potencia;
    private double velocidad;
    
    public Motor() {
        this.tipo = 0;
        this.potencia = 0;
        this.velocidad = 0.0;
    }

    public Motor(int tipo, int potencia, double velocidad) {
        this.tipo = tipo;
        this.potencia = potencia;
        this.velocidad = velocidad;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
}
