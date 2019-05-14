/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;
/**
 * 
 * @author PC16-LAB02
 */
public class PersonaPrueba {
    public static void main(String args[]){
        
       persona p1 =new persona();
       
       System.out.println("valores por default del objeto persona");
       p1.desplegarNombre();
     
       p1.nombre="Mayron";
       p1.apellidoPaterno="Baldarrago";
       p1.apellidoMaterno="Figueroa";
       
       System.out.println("\nNuevos valores del objeto persona");
       p1.desplegarNombre();
    }
}
