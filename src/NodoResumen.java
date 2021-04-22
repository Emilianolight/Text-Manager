/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ESTACION01
 */
public class NodoResumen {
    
    String titulo;
    String autores;
    String resumen;
    NodoResumen pNext;
    
    public NodoResumen(String titulo, String autores, String resumen){
        
        this.titulo = titulo;
        this.autores = autores;
        this.resumen = resumen;
        
    }    
    
    
}
