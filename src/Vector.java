
import java.util.Arrays;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Vector {

    String palabraActual = "";
    ListaSimple[] TablaHash = new ListaSimple[53];
    ListaResumen[] ResumenHash = new ListaResumen[53];
    int tamaño = 102, contador;
    
    public void cargarInfoInicial(){
        
        cargarPalabrasClaves();
        cargarResumenes();
        
    }
    
    public void cargarPalabrasClaves() {
        palabraActual = "";
        try {
            String separadores = File.separator;//De esta forma las barras separadoras seran las apropiadas
            //para cualquier sistema operativo. Por ello, el programa es mas integral y puede 
            //Ejecutarse en multiples SO como Windows y Linux.
            String ruta = System.getProperty("user.dir") + separadores + "BDclaves.txt";
            FileReader fileR = new FileReader(ruta);
            BufferedReader lector = new BufferedReader(fileR);
            String[] Palabras = null;
            String linea = "";
            String Acumulador = "";
            String delimitadores = "[' ,]()";

            while ((linea = lector.readLine()) != null) {
                Acumulador += linea;
            }

            Palabras = Acumulador.split(delimitadores);

            for (int i = 0; i < Palabras.length; i++) {

                if (!Palabras[i].equals("")) {

                    InsertarEnTablaHash(Key(valorPalabra(Palabras[i])), Palabras[i]);

                }

            }

        } catch (IOException e) {

        }

    }

    public void cargarResumenes() {

        try {
            String separadores = File.separator;//De esta forma las barras separadoras seran las apropiadas
            //para cualquier sistema operativo. Por ello, el programa es mas integral y puede 
            //Ejecutarse en multiples SO como Windows y Linux.
            FileReader fileR = new FileReader(System.getProperty("user.dir") + separadores + "BDinvestigaciones.txt");
            BufferedReader lector = new BufferedReader(fileR);
            String[] Palabras = null;
            String linea = "";
            String Acumulador = "";
            String delimitadores = "[' ,]()";

            while ((linea = lector.readLine()) != null) {
                Acumulador += linea;
            }

            Palabras = Acumulador.split(delimitadores);
            
            for(int i = 0; i<Palabras.length;i++){
                
                if(!Palabras[i].equalsIgnoreCase("")){
                    cargarResumenPorDefecto(Palabras[i]);
                }
            }
            
        } catch (IOException e) {

        }

    }
    
    public void cargarResumenPorDefecto(String nombreArchivo) {

        try {
            String separadores = File.separator;
            FileReader fileR = new FileReader(System.getProperty("user.dir") + separadores + nombreArchivo + ".txt");
            BufferedReader lector = new BufferedReader(fileR);

            String linea = "";
            String delimitadores = "[' ,]()";

            String titulo = "", autores = "", cuerpoResumen = "";

            //Metodo que recorre el archivo de texto para guardar el titulo
            while ((linea = lector.readLine()) != null) {
                //                System.out.println(linea);

                if (!linea.equalsIgnoreCase("Autores")) {

                    if (titulo.equalsIgnoreCase("")) {
                        titulo = titulo + linea;
                    } else {
                        titulo = titulo + " " + linea;
                    }
                    //                String[] vector = linea.split(delimitadores);
                } else {

                    break;

                }

            }

            //Metodo que recorre el archivo de texto para guardar los Autores
            while ((linea = lector.readLine()) != null) {
                //                System.out.println(linea);

                if (!linea.equalsIgnoreCase("Resumen")) {

                    autores = autores + linea + "\n";

                } else {

                    break;

                }
                //                String[] vector = linea.split(delimitadores);

            }

            //Metodo que recorre el archivo de texto para guardar los el resumen
            while ((linea = lector.readLine()) != null) {
                //                System.out.println(linea);

                cuerpoResumen = cuerpoResumen + linea;
                //                String[] vector = linea.split(delimitadores);

            }

            insertarEnResumenHashInicio(Key(valorPalabra(titulo)), titulo, autores, cuerpoResumen);
//            palabraActual = palabraActual + titulo;

        } catch (IOException e) {

        }

    }

    public void agregarPalabrasTeclado(){
        
        boolean seguir = true;
        boolean sePuedeAgregar = true;
        String palabra = "";
        String[] opcion = new String[2];
        opcion[0] = "Seguir Agregando pals.";
        opcion[1] = "Salir.";
        
        do{
                    
            try{

                palabra = JOptionPane.showInputDialog(null, "Ingrese la palabra");

                
                if(palabra.equals(null)){
                    
                    sePuedeAgregar = false;
                    
                }

            
            
                if(palabra.equals("")){

                    sePuedeAgregar = false;

                }
                
            
            
                if(sePuedeAgregar = true){

                    InsertarEnTablaHash(Key(valorPalabra(palabra)), palabra);
                    
                }            
            
            }catch(NullPointerException e){
                
                JOptionPane.showMessageDialog(null, "No se ha guardado ninguna palabra");
                
            }

            int resultado = JOptionPane.showOptionDialog(null, "¿Que desea hacer?", "Ingreso de palabras", 2, 1, null, opcion, null);                    

            if(resultado == 1){
                
                seguir = false;
            
            }else{
                
                seguir = true;
                sePuedeAgregar = true;
                
            }
            
        }while(seguir);
        
    }

    public void agregarPalabrasClaveArchivo() {
        ChooserX Elector = new ChooserX();
        try{
            try {
                FileReader fileR = new FileReader(Elector.AbrirChooser());
                BufferedReader lector = new BufferedReader(fileR);
                String[] Palabras = null;
                String linea = "";
                String Acumulador = "";
                String delimitadores = "[' ,]()";

                while ((linea = lector.readLine()) != null) {
                    Acumulador += linea;
                }

                Palabras = Acumulador.split(delimitadores);

                for(int i = 0; i<Palabras.length;i++){

                    if(!Palabras[i].equals("")){

                        InsertarEnTablaHash(Key(valorPalabra(Palabras[i])), Palabras[i]);

                    }

                }

                //Ciclos de prueba para validar que el vector y listas se confirmar
                //como deberian

    //            for(int i = 0; i < TablaHash.length; i++){
    //                
    //                if(TablaHash[i] != null){
    //                    TablaHash[i].imprimirLista();
    //                }
    //                
    //            }


    //            for (int i = 0; i < Palabras.length; i++) {
    //                System.out.println(i + "" + Palabras[i]);
    //            }

            } catch (IOException e) {

//            System.out.println("Error " + e);//

            }
        } catch (NullPointerException e){
            
//            System.out.println("Error " + e);//            
            
        }

    }
    
    
    
    public void agregarResumen() {
        
        ChooserX Elector = new ChooserX();
        
        JOptionPane.showMessageDialog(null, "Elija el archivo que quiere utilizar");
        try {
            try {
                String nombre = Elector.AbrirChooser().getName();
                FileReader fileR = new FileReader(Elector.AbrirChooser());
                BufferedReader lector = new BufferedReader(fileR);

                String linea = "";
                String delimitadores = "[, . ? ¡¿! ()   ]";

                String titulo = "", autores = "", cuerpoResumen = "";

                //Metodo que recorre el archivo de texto para guardar el titulo
                while ((linea = lector.readLine()) != null) {
    //                System.out.println(linea);

                    if(!linea.equalsIgnoreCase("Autores")){

                        if(titulo.equalsIgnoreCase("")){
                            titulo = titulo + linea;
                        }else{
                            titulo = titulo + " " + linea;
                        }
    //                String[] vector = linea.split(delimitadores);
                    }else{

                        break;

                    }


                }

                //Metodo que recorre el archivo de texto para guardar los Autores
                while ((linea = lector.readLine()) != null) {
    //                System.out.println(linea);

                    if(!linea.equalsIgnoreCase("Resumen")){                

                        autores = autores + linea + "\n";

                    }else{

                        break;

                    }
    //                String[] vector = linea.split(delimitadores);


                }


                //Metodo que recorre el archivo de texto para guardar los el resumen
                while ((linea = lector.readLine()) != null) {
    //                System.out.println(linea);


                    cuerpoResumen = cuerpoResumen + linea;
    //                String[] vector = linea.split(delimitadores);


                }

                InsertarEnResumenHash(Key(valorPalabra(titulo)), titulo, autores, cuerpoResumen);
                palabraActual = titulo;

            }catch(IOException e){

            }
        } catch (NullPointerException e){
            
        }
        
    }    

    public int valorPalabra(String pal) {//Asigna un valor númerico a la palabra
        int valor = 0;
        pal = pal.toLowerCase();
        for (int i = 0; i < pal.length(); i++) {
            valor += pal.charAt(i);

        }
        return valor;
    }

    public int Key(int valorPalabra) {//Encuentra el valor para la tabla Hash
        int indicePalabra = valorPalabra % (TablaHash.length - 1);
        return indicePalabra;
    }

    public void InsertarEnTablaHash(int indice, String palabra) {//Inserta en la tabla Hash y ademas trata las colisiones

        if (TablaHash[indice] != null) {//Si ya hay una lista creada en esa posicion
            //del vector puedo insertar el valor
            
            if(!palabraActual.equalsIgnoreCase("")){
                palabraActual = palabraActual + "\n" + TablaHash[indice].insertarAlFinal(palabra);
            }else{
                palabraActual = TablaHash[indice].insertarAlFinal(palabra);
            }
            
        } else { // Si no hay una lista creada en esa posicion del vector
            //Se crea y posteriormente se inserta un elemento

            TablaHash[indice] = new ListaSimple();
            if(!palabraActual.equalsIgnoreCase("")){
                palabraActual = palabraActual + "\n" + TablaHash[indice].insertarAlFinal(palabra);
            }else{
                palabraActual = TablaHash[indice].insertarAlFinal(palabra);
            }
        }

    }
    
    public void InsertarEnResumenHash(int indice, String titulo, String autores, String resumen) {//Inserta en la tabla Hash y ademas trata las colisiones

        if (ResumenHash[indice] != null) {//Si ya hay una lista creada en esa posicion
            //del vector puedo insertar el valor
            
            
            palabraActual = ResumenHash[indice].insertarAlFinal(titulo, autores, resumen);
            
        } else { // Si no hay una lista creada en esa posicion del vector
            //Se crea y posteriormente se inserta un elemento

            ResumenHash[indice] = new ListaResumen();
                  
            palabraActual = ResumenHash[indice].insertarAlFinal(titulo, autores, resumen);
        }

    }
    
    public void insertarEnResumenHashInicio(int indice, String titulo, String autores, String resumen){
        
        if (ResumenHash[indice] != null) {//Si ya hay una lista creada en esa posicion
            //del vector puedo insertar el valor
            
            if(!palabraActual.equalsIgnoreCase("")){
                palabraActual = palabraActual + "\n" + ResumenHash[indice].insertarAlFinal(titulo, autores, resumen);
            }else{
                palabraActual = ResumenHash[indice].insertarAlFinal(titulo, autores, resumen);
            }
                        
        } else { // Si no hay una lista creada en esa posicion del vector
            //Se crea y posteriormente se inserta un elemento

            ResumenHash[indice] = new ListaResumen();

            if(!palabraActual.equalsIgnoreCase("")){
                palabraActual = palabraActual + "\n" + ResumenHash[indice].insertarAlFinal(titulo, autores, resumen);
            }else{
                palabraActual = ResumenHash[indice].insertarAlFinal(titulo, autores, resumen);
            }            

        }        
        
    }

    public void eliminarPalabra(String palabra){
        
        int clave = Key(valorPalabra(palabra));
        if(TablaHash[clave] != null){
            TablaHash[clave].eliminarPalabra(palabra);
            if(TablaHash[clave].getCantidad() == 0){
                TablaHash[clave] = null;
            }
        }
        
    }

    public void MostrarTabla() {

        System.out.println("Tabla Hash");
        for (int i = 0; i < TablaHash.length; i++) {

            if (TablaHash[i] != null) {
                System.out.println("Posición " + i + " = " + TablaHash[i].recorrer());
            }
        }

    }
    
    public void MostrarTablaResumen() {

        System.out.println("Resumen Hash");
        for (int i = 0; i < ResumenHash.length; i++) {

            if (ResumenHash[i] != null) {
                System.out.println("Posición " + i + " = " + ResumenHash[i].recorrer());
            }
        }

    }

    public void Buscar(String palabra) {//Todavia hay que seguir trabajando en el 

        contador = 0;
        int indice = valorPalabra(palabra) % (TablaHash.length - 1);

        if (TablaHash[indice] != null) {//Si existe un elemento en esa posicion del vector

            if (TablaHash[indice].seEncuentraEnLista(palabra)) {//Buscar en la lista

                JOptionPane.showMessageDialog(null, "El elemento " + palabra + " ha sido encontrado.");

            } else {

                JOptionPane.showMessageDialog(null, "El elemento " + palabra + " no ha sido encontrado.");

            }

        } else {//Si no hay ningun elemento en esa posicion del Vector

            JOptionPane.showMessageDialog(null, "El elemento " + palabra + " no ha sido encontrado.");

        }
        
    }
    
    public String cuerpoResumen(String titulo){
        int valor = Key(valorPalabra(titulo));
        String cuerpoR = ResumenHash[Key(valorPalabra(titulo))].buscarCuerpoResumen(titulo);
        return cuerpoR;
    }
    
    public String autoresResumen(String titulo){
        int valor = Key(valorPalabra(titulo));
        String tituloR = ResumenHash[Key(valorPalabra(titulo))].buscarAutoresResumen(titulo);
        return tituloR;
    }
    
    //-----------------------------METODO PRINCIPAL--------------------------------
    //--------------------------------- ANALISIS ----------------------------------

    public String analizarResumen(String[] cuerpoDividido, String[] vectorKeys, String titulo, String autores) throws InterruptedException{

        long inicio = System.currentTimeMillis();        
        int posicionVK = 0;
        int palabrasDelResumen = 0;
        for(int i = 0; i<cuerpoDividido.length; i++){
            
            if(!cuerpoDividido[i].equalsIgnoreCase("") && !cuerpoDividido[i].equalsIgnoreCase(" ")){
                
                int valor = Key(valorPalabra(cuerpoDividido[i]));
                palabrasDelResumen++;
                if(TablaHash[valor] != null){
                    TablaHash[valor].aumentarFrecuencia(cuerpoDividido[i]);
                    vectorKeys[posicionVK] = String.valueOf(valor);
                    posicionVK++;
                }
                
            }
            
        }//Fin bucle for
        
        
//        System.out.println(titulo);
//        System.out.println(autores);
        String informacion = "";
        for(int i = 0; i<TablaHash.length; i++){
            if(TablaHash[i] != null){
                informacion = TablaHash[i].imprimirFrecuencia(informacion);
            }
        }
//        System.out.println("");
//        System.out.println(informacion);
        Thread.sleep(2000);
        long finTiempo = System.currentTimeMillis();
        double tiempo = (double) ((finTiempo - inicio)/1000);
        String cadenaTotal = titulo + "\n" + autores + "\n" + informacion + "\n" + "Palabras del resumen: " + palabrasDelResumen + "\n" + "Tiempo empleado en el analisis: " + tiempo + " segundos.";
        return cadenaTotal;
    }
    
    
}
