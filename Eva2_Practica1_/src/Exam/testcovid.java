/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exam;

/**
 *
 * @author Derek
 */
public class testcovid {
    private String nombre;
    private String apellido;
    private int edad;
    private double peso;
    private double altura;
    private boolean enfermedad;
    private double imts;
    
   public testcovid(){
       this.nombre = "SIN NOMBRE";
       this.apellido = "SIN APELLIDO";
       this.edad = 0;
       this.peso = 0.0;
       this.altura = 0.0;
   }
   public testcovid(String nombre,String apellido,int edad,double peso,double altura,boolean enfermedad){
       this.nombre = nombre;
       this.apellido= apellido;
       this.edad = edad;
       this.peso = peso;
       this.altura = altura;
       this.enfermedad = enfermedad;
        
   }
   public String get_Nombre(){
       return this.nombre;
   }
   public void set_Nombre(String nombre){
       this.nombre = nombre;
   }
   public String get_Apellido(){
       return this.apellido;
   }
   public void set_Apellido(String apellido){
       this.apellido = apellido;
   }
   public int get_edad(){
       return this.edad;
   }
   public void set_edad(int edad){
       this.edad = edad;
   }
   public double get_Peso(){
       return this.peso;
   }
   public void set_Peso(double peso){
       this.peso = peso;
   }
   public double get_Altura(){
       return this.altura;
   }
   public void set_Altura(double altura){
       this.altura = altura;
   }
   public boolean get_Enfermedad(){
       return this.enfermedad;
   }
   public void set_Enfermedad(){
       this.enfermedad = enfermedad;
   }
   private double calcular_IMC(){
       double ims = altura / 100.0;
       return (peso / (imts * imts));
   }
   public String calcularPersonaRiesgo(){
       if (edad >= 65){
         System.out.println("PERSONA DE RIESGO");  
       }else if (enfermedad == true){
           System.out.println("PERSONA DE RIESGO");
       }else if (calcular_IMC() >= 30){
           System.out.println("PERSONA DE RISGO");
       }else {
           System.out.println("PERSONA SIN RIESGO");
       }
           return null;
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
