/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emiliano
 */
public class Metodo {
    
    
    public int valorPalabra(String pal){
    int valor=0;
        for(int i=0; i<pal.length();i++){
                valor+=pal.charAt(i);
 
            }  
    return valor;
    }
}
