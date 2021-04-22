/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ESTACION01
 */
public class Nodo {
    
    String dato;
    int frecuencia = 0;
    Nodo pNext;
    
    public Nodo(String dato){
        
        this.dato = dato;
        this.pNext = null;
        
    }
   
}
