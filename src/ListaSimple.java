
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ESTACION01
 */

public class ListaSimple {
    
    private Nodo pInicio, pFin;
    private int cantidad;
    
    public ListaSimple(){
        
        pInicio = null;
        pFin = null;
        cantidad = 0;
        
    }

    public boolean esVacio(){

        return pInicio == null;

    }
    
    public int getCantidad(){
        return cantidad;
    }
    
    public void aumentarFrecuencia(String palabra){
        
        Nodo pAux = pInicio;
        do{
            if(pAux.dato.equalsIgnoreCase(palabra)){
                pAux.frecuencia++;
                break;
            }
            pAux = pAux.pNext;
        }while(pAux != null);
        
    }
    
    public String recolectarInfoPClave(String informacion){
            
        Nodo pAux = pInicio;
        while(pAux != null){
            
            if(informacion.equalsIgnoreCase("")){
                informacion = "'" + pAux.dato + "'";
            }else{
                informacion = informacion + "," + "'" + pAux.dato + "'";
            }
            pAux = pAux.pNext;
            
        };
        
        return informacion;
        
    }
    
    public void corregirFrecuencia(){
        Nodo pAux = pInicio;
        do{
            pAux.frecuencia = 0;
            pAux = pAux.pNext;
            
        }while(pAux != null);        
    }
    
    public String imprimirFrecuencia(String informacion){
        
        Nodo pAux = pInicio;
        do{
            
            if(informacion.equalsIgnoreCase("")){
                informacion = pAux.dato + ": frecuencia de " + pAux.frecuencia + "\n";
            }else{
                informacion = informacion + pAux.dato + ": frecuencia de " + pAux.frecuencia + "\n";
            }
            pAux = pAux.pNext;
        }while(pAux != null);
        
        return informacion;
        
    } 
    
    public String insertarAlFinal(String dato){

        if(!esVacio()){

            if(!seEncuentraEnLista(dato)){

                Nodo aux = pFin;
                pFin = new Nodo(dato);
                aux.pNext = pFin;
                cantidad++;
                return dato;
                
            }else{
                
//                JOptionPane.showMessageDialog(null, "¡Esta palabra clave ya fue agregada!");                
                
            }

        }else{

            pInicio = new Nodo(dato);
            pFin = pInicio;
            cantidad++;
            return dato;
            
        }
        
        return ("");
        
    }
    
    public boolean seEncuentraEnLista(String palabra){
        
        Nodo pAux = pInicio;
        
        while(pAux != null){
            
           if(palabra.equalsIgnoreCase(pAux.dato)){
               return true;
           }
           
           pAux = pAux.pNext;
            
        }
        
        return false;
        
    }
    
    
    public int nroNodos(){
        return cantidad;
    }
    
    public void eliminarPalabra(String palabraClave){
        Nodo pAnt = null;
        Nodo pAux = pInicio;
        while (pAux != null){
            
            if(pAux.dato.equalsIgnoreCase(palabraClave)){
                
                if(pAux == pInicio){
                    
                    pInicio = pAux.pNext;
                    cantidad--;
                    break;
                    
                }else if (pAux == pFin){
                    
                    pFin = pAnt;
                    pFin.pNext = null;
                    cantidad--;
                    break;
                    
                }else{
                    
                    pAnt.pNext = pAux.pNext;
                    cantidad--;
                    break;
                }
                
            }else{
                
                pAnt = pAux;
                pAux = pAux.pNext;
                
            }
            
        }
        
    }
    
    //METODOS PARA EVALUAR EL COMPORTAMIENTO DE LA LISTA
    public String recorrer(){
        
        String texto = "";
        
        if(esVacio()){
            
            texto = "Vacio";
            
        }else{
            
            if(!esVacio()){
                
                Nodo pAux;
                pAux = pInicio;
                texto = "";
                int num = cantidad;
                
                while(num>0){
                    
                    texto = texto + pAux.dato;
                    texto = texto + " -> ";
                    pAux = pAux.pNext;
                    num--;
                    
                }

            }
        }
        
        return texto;
        
    }
    
    public void imprimirLista(){
        
        String texto = "";
        
        if(esVacio()){
            
            texto = "Vacio";
            
        }else{
            
            if(!esVacio()){
                
                Nodo pAux;
                pAux = pInicio;
                texto = "";
                int num = cantidad;
                
                while(num>0){
                    
                    texto = texto + pAux.dato;
                    texto = texto + " -> ";
                    pAux = pAux.pNext;
                    num--;
                    
                }
                
                System.out.println(texto);

            }
        }
        
    }
    
}
