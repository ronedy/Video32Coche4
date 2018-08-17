/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video32Coche4Kev;

import javax.swing.JOptionPane;

/**
 *
 * @author KEVIN MOSCOSO
 */
public class Video32Coche4Kev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Coche car = new Coche();
        
        car.establecer_color(JOptionPane.showInputDialog("Introduce el color"));
     
        System.out.println(car.dime_datos_generales());
        
        System.out.println(car.dime_color());
        
        car.establecer_color(JOptionPane.showInputDialog("¿Tiene asientos de cuero? (si/no)"));
        
        System.out.println(car.dime_asientos());
        
        car.establecer_color(JOptionPane.showInputDialog("¿Tiene climatizador? (si/no)"));
        
        System.out.println(car.dime_climatizador());
        
        System.out.println(car.dime_peso_coche());
        
        System.out.println("El precio final del automovil es de: " + car.precio_coche());
        
        
    }
    
}
