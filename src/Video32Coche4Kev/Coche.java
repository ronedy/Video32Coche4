/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video32Coche4Kev;

import java.util.*;

public class Coche {
    
     private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso;
    
    private String color;
    private int pesototal;
    private boolean asientos_cuero,climatizador;
    
    public Coche(){
        
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso = 500;
    }
    
    public String dime_datos_generales(){ //metodo getter
        
        return "La plataforma del vehiculo tiene " + ruedas + 
               " ruedas " + ". mide " + largo/1000 + " metros con un ancho de " +
               ancho + " cm y un peso de la plataforma de " + peso + " Kg "; 
    }
    
    public void establecer_color(String color_coche){//metodo setter
        
        color = color_coche;
        
    }
    
    public String dime_color(){
        
        return "El color del automovil es " + color;
    }
    
    public void configura_asientos(String asientos_cuero){

    if(asientos_cuero.equalsIgnoreCase("si")){
        
        this.asientos_cuero=true;
        
    }else{
        
        this.asientos_cuero=false;
    }
        
    }
    
    public String dime_asientos(){
        
        if(asientos_cuero==true){
            
            return "El automovil tiene asientos de cuero";
            
        }else{
            
            return "El automovil tiene asientos de serie";
        }
    }

    public void configura_climatizador(String climatizador){
    
    if(climatizador.equalsIgnoreCase("si")){
        
        this.climatizador=true;
        
    }else{
        
        this.climatizador=false;
        
    }   
    
    }
    
    public String dime_climatizador(){
        
        if(climatizador==true){
            
            return "El automovil incorpora climatizador";
            
        }else{
            
            return "El coche lleva aire acondicionado";
        }
    }
  
    public String dime_peso_coche(){
        
        int peso_carroseria = 500;
        
        pesototal = peso+peso_carroseria;
                
        if(asientos_cuero==true){   
            pesototal=pesototal+50;
        }
        if(climatizador==true){
            pesototal = pesototal+20;
        }
        
        return "El peso del automovil es " + pesototal;
    }
    
    public int precio_coche(){
        
        int precio_final = 10000;
        
        if(asientos_cuero==true){
            
            precio_final =10000 + 2000;
        }
        
        if(climatizador==true){
            
            precio_final= 10000 + 1500;
        }
        
        return precio_final;
    }
}
