
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
public class Repositorio {
    
        public void guardarRepositorio(ListaSimple[] vector){
        
        String nombreArchivo = "";
        FileWriter escritor;
        do{
            nombreArchivo = JOptionPane.showInputDialog("Ingrese el nombre del archivo repositorio a guardar (palabras claves utilizadas). Tome en cuenta que si guarda valores nulos o vacios esta operacion se repetira.");
        }while(nombreArchivo == null || nombreArchivo.length() == 0);
        
        File archivo = new File(nombreArchivo+".txt");
        try{
            
            archivo.createNewFile();//Se crea el nuevo archivo en las carpetas
            escritor = new FileWriter(archivo, false);//El archivo elimina toda informacion anterior y guarda solo la nueva        
            BufferedWriter buffer = new BufferedWriter(escritor);//Se instancia la clase BufferedWiter
            
            
            //------Se agrega toda la informacion referente a Ciudades en el aplicativo------
            
            //----------------
            
            buffer.write("'");
            String info = "";
            for(int i = 0; i<vector.length; i++){
                
                if(vector[i] != null){
                    
                    info = vector[i].recolectarInfoPClave(info);
                    
                }
                
                buffer.write(info);
                buffer.newLine();

            }
            buffer.close();
            JOptionPane.showMessageDialog(null, "El archivo ha sido creado satisfactoriamente en la carpeta del proyecto bajo el nombre de: "+nombreArchivo+".txt");
            
        }catch(IOException e){
            JOptionPane.showMessageDialog(null,"Error: " + e);
        }
    }
        
    public void guardarRepositorioPorDefecto(String[] vector){
        
        String nombreArchivo = "";
        FileWriter escritor;
        nombreArchivo = "BDclaves";
        
        File archivo = new File(nombreArchivo+".txt");
        try{
            
            archivo.createNewFile();//Se crea el nuevo archivo en las carpetas
            escritor = new FileWriter(archivo, false);//El archivo elimina toda informacion anterior y guarda solo la nueva        
            BufferedWriter buffer = new BufferedWriter(escritor);//Se instancia la clase BufferedWiter
            
            
            //------Se agrega toda la informacion referente a Ciudades en el aplicativo------
            
            //----------------
            
            String info = "";
            for(int i = 0; i<vector.length; i++){
                
                if(!info.equalsIgnoreCase("")){
                    buffer.write(",");
                }
                
                if(vector[i] != null){
                    buffer.write("'");
                    info = vector[i] + "'";
                    
                }
                
                buffer.write(info);

            }
            buffer.close();
            JOptionPane.showMessageDialog(null, "El archivo ha sido creado satisfactoriamente en la carpeta del proyecto bajo el nombre de: "+nombreArchivo+".txt");
            
        }catch(IOException e){
            JOptionPane.showMessageDialog(null,"Error: " + e);
        }
    }
    
}
