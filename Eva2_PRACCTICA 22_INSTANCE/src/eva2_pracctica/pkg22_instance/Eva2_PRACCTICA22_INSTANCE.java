/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_pracctica.pkg22_instance;

/**
 *
 * @author Derek
 */
public class Eva2_PRACCTICA22_INSTANCE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Gato kyting = new Gato();
        Serpiente se = new Serpiente();
        Imprimir(kyting);
        Imprimir(se);
    }
    public static void Imprimir(Animal animal){
        animal.Oxigeno();
        if(animal instanceof Gato){
            System.out.println("Objeto tipo gato");
        }else if (animal instanceof Serpiente){
            System.out.println("Objeto tipo Serpiente.");
        }
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