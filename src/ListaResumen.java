
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
public class ListaResumen {
    
    private NodoResumen pInicio, pFin;
    private int cantidad;
    
    public ListaResumen(){
        
        pInicio = null;
        pFin = null;
        cantidad = 0;
        
    }

    public boolean esVacio(){

        return pInicio == null;

    }
    
    public String buscarCuerpoResumen(String titulo){
        
        NodoResumen pAux = pInicio;
        
        do{
            if(pAux.titulo.equalsIgnoreCase(titulo)){
                return pAux.resumen;
            }
            pAux = pAux.pNext;
            
        }while(pAux != null);
        
        return "";
    }
    
    public String buscarAutoresResumen(String titulo){
        
        NodoResumen pAux = pInicio;
        
        do{
            if(pAux.titulo.equalsIgnoreCase(titulo)){
                return pAux.autores;
            }
            pAux = pAux.pNext;
            
        }while(pAux != null);
        
        return "";
        
    }
    
    public String insertarAlFinal(String titulo, String autores, String resumen){

        if(!esVacio()){

            if(!elTituloYaFueAgregado(titulo)){

                NodoResumen aux = pFin;
                pFin = new NodoResumen(titulo, autores, resumen);
                aux.pNext = pFin;
                cantidad++;
                return titulo;
            }else{
                
                JOptionPane.showMessageDialog(null, "¡Este resumen ya fue agregado!");
                return ("");
            }

        }else{

            pInicio = new NodoResumen(titulo, autores, resumen);
            pFin = pInicio;
            cantidad++;
            return titulo;
            
        }
        
    }
    
    public String investigacionesDisponibles(String informacion, String palabraClave){
        
        NodoResumen pAux = pInicio;
        
        while(pAux != null){
            
            String[] vector = pAux.titulo.split("[, . ? ¡¿! ()   ]");
            for(int i = 0; i<vector.length; i++){
                if(palabraClave.equalsIgnoreCase(vector[i])){
                informacion = informacion + "\n" + pAux.titulo;
                }
            }
            pAux = pAux.pNext;
        }
        
        return informacion;
    }
    
    public boolean elTituloYaFueAgregado(String titulo){
        
        NodoResumen pAux = pInicio;
        
        while(pAux != null){
            
           if(titulo.equalsIgnoreCase(pAux.titulo)){
               return true;
           }
           
           pAux = pAux.pNext;
            
        }
        
        return false;
        
    }
    
    
    public int nroNodos(){
        return cantidad;
    }
    
    
    public String recorrer(){
        
        String titulo = "";
        String autor = "";
        String resumen = "";
        String total = "";
        
        if(esVacio()){
            
            total = "Vacio";
            
        }else{
            
            if(!esVacio()){
                
                NodoResumen pAux;
                pAux = pInicio;
                int num = cantidad;
                
                while(num>0){
                    
                    titulo = titulo + pAux.titulo;
                    autor = autor + pAux.autores;
                    resumen = resumen + pAux.resumen;
                    pAux = pAux.pNext;
                    num--;
                    
                }

            }
        }
        
        total = titulo + "\n" + autor + "\n" + resumen;
        
        return total;
        
    }
    
//    public void imprimirLista(){
//        
//        String texto = "";
//        
//        if(esVacio()){
//            
//            texto = "Vacio";
//            
//        }else{
//            
//            if(!esVacio()){
//                
//                NodoResumen pAux;
//                pAux = pInicio;
//                texto = "";
//                int num = cantidad;
//                
//                while(num>0){
//                    
//                    texto = texto + pAux.dato;
//                    texto = texto + " -> ";
//                    pAux = pAux.pNext;
//                    num--;
//                    
//                }
//                
//                System.out.println(texto);
//
//            }
//        }
//        
//    }
    
}
