/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica16_composicion;

/**
 *
 * @author Derek
 */
public class Eva2_PRACTICA16_Composicion {

    
    public static void main(String[] args) {
        Cliente cl = new Cliente("Derek","Piedra",20,"Olivos","vold",659822,"torreon","Durango");
        System.out.println(cl);
        Direccion dr = new Direccion("Nuevo tiunfo","Hachis",100897,"blon","Zcatecas");
        cl.setDireccion(dr);
        cl.setDireccion(dr);
        System.out.println(cl);
        
        
    }
    
}
