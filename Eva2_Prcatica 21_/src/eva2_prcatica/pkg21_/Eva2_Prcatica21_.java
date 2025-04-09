/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_prcatica.pkg21_;

/**
 *
 * @author Derek
 */
public class Eva2_Prcatica21_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       System.out.println("Polimorfismo:----------");
       Reptil re = new Serpiente();
       re.Sangre_Fria();
       
    }
    
}

class Animal{
    public Animal(){
        System.out.println("Animal.");
    }
    public void Oxigeno(){
         System.out.println("La mayoria de animales respiran Oxigeno.");
    }
}
class Mamifero extends Animal{
    public Mamifero(){
     System.out.println("Mamifero.");
    }
    public void Pelo(){
       System.out.println("Los mamiferos tienen Pelo.");
    }
    public void Sangre_Caliente(){
         System.out.println("Los mamiferos tienen sangre Caliente.");
    }
}
class Reptil extends Animal{
   public Reptil(){
     System.out.println("Reptil");   
   }
   public void Sangre_Fria(){
        System.out.println("Los reptiles tienen sangre Fria.");
   }
}
class Gato extends Mamifero{
    public Gato(){
         System.out.println("Gato");
    }
    public void Garras_Retractiles(){
         System.out.println("Tiene Garras Retractiles.");
    }   
}
class Serpiente extends Reptil{
    public Serpiente(){
         System.out.println("Serpiente");
    }
    public void Arrastra(){
         System.out.println("La serpiente se arrastra.");
    }
}









