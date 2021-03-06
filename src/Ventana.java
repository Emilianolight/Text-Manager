
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emiliano
 */
public class Ventana extends javax.swing.JFrame {

    Vector vec = new Vector();
    
    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        
        //Se cargan las palabras claves y resumenes de la BD por defecto
        vec.cargarPalabrasClaves();
        String[] palabra = vec.palabraActual.split("\n");
        for(int i = 0; i<palabra.length; i++){
            if (!vec.palabraActual.equalsIgnoreCase("")) {
                cmbClaves.addItem(palabra[i]);
            }
        }
        vec.palabraActual = "";
        vec.cargarResumenes();
        palabra = vec.palabraActual.split("\n");
        for(int i = 0; i<palabra.length; i++){
            if (!vec.palabraActual.equalsIgnoreCase("")) {
                cmbResumen.addItem(palabra[i]);
            }
        }
        vec.palabraActual = "";
        //Fin de la carga de archivos por defecto
        JOptionPane.showMessageDialog(null, "Bienvenido a tu asistente y gestor de Resumenes.\nToma en cuenta que cada operacion que quieras realizar con alguna palabra clave o resumen, debes seleccionar ese valor en el comboBox.\n"
                + "Si no lo haces no obtendras la informacion que deseas. Disfruta tu estadia!");
        setLocationRelativeTo(null);
        cmbResumen.setVisible(false);
        lblResumen.setVisible(false);
        btnAnalizar.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregarPalClave = new javax.swing.JButton();
        btnAggResumen = new javax.swing.JButton();
        btnAnalisisResumen = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnBuscarInvestigaciones = new javax.swing.JButton();
        btnEliminarPalClave = new javax.swing.JButton();
        cmbClaves = new javax.swing.JComboBox<>();
        cmbResumen = new javax.swing.JComboBox<>();
        lblResumen = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaPlus = new javax.swing.JTextArea();
        lblClaves = new javax.swing.JLabel();
        lblInformacionGeneral = new javax.swing.JLabel();
        btnBuscarPalabra = new javax.swing.JButton();
        btnAnalizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));
        setResizable(false);

        btnAgregarPalClave.setText("Agregar palabras clave");
        btnAgregarPalClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPalClaveActionPerformed(evt);
            }
        });

        btnAggResumen.setText("Agregar resumen");
        btnAggResumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggResumenActionPerformed(evt);
            }
        });

        btnAnalisisResumen.setText("Analisis de resumen");
        btnAnalisisResumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalisisResumenActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir(Metodo)");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnBuscarInvestigaciones.setText("Buscar investigaciones");
        btnBuscarInvestigaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarInvestigacionesActionPerformed(evt);
            }
        });

        btnEliminarPalClave.setText("Eliminar Palabra Clave");
        btnEliminarPalClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPalClaveActionPerformed(evt);
            }
        });

        lblResumen.setText("Operaciones con Resumen");

        jLabel2.setText("Resultado Analisis");

        jTextAreaPlus.setEditable(false);
        jTextAreaPlus.setColumns(20);
        jTextAreaPlus.setRows(5);
        jScrollPane1.setViewportView(jTextAreaPlus);

        lblClaves.setText("Operaciones con palabras Clave:");

        lblInformacionGeneral.setFont(new java.awt.Font("Microsoft JhengHei", 1, 11)); // NOI18N
        lblInformacionGeneral.setForeground(new java.awt.Color(51, 51, 255));
        lblInformacionGeneral.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInformacionGeneral.setText("GESTOR DE RESUMENES");

        btnBuscarPalabra.setText("Buscar Palabra Clave");
        btnBuscarPalabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPalabraActionPerformed(evt);
            }
        });

        btnAnalizar.setText("Comenzar Analisis");
        btnAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblInformacionGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(29, 29, 29)
                        .addComponent(btnSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnEliminarPalClave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAgregarPalClave, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(btnBuscarPalabra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbClaves, 0, 171, Short.MAX_VALUE)
                                    .addComponent(lblClaves, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(cmbResumen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAnalisisResumen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAggResumen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBuscarInvestigaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAnalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblResumen, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lblInformacionGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAggResumen)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarInvestigaciones))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgregarPalClave)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblClaves, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminarPalClave)
                            .addComponent(cmbClaves, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnalisisResumen)
                    .addComponent(btnBuscarPalabra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(lblResumen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbResumen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnalizar))
                .addGap(11, 11, 11)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalir)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarPalClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPalClaveActionPerformed

        vec.palabraActual = "";//Se reinicia el valor de palabra actual

        String[] opcion = new String[3];

        opcion[0] = "Introducir palabra";
        opcion[1] = "Cargar de Archivo";
        opcion[2] = "Cancelar";

        int resultado = JOptionPane.showOptionDialog(null, "?Como desea agregar las palabras claves?", "", 2, 1, null, opcion, null);

        if (resultado == 0) {

            vec.agregarPalabrasTeclado();

            if (!vec.palabraActual.equals("")) {
                String[] vectorSplit = vec.palabraActual.split("\n");
                for (int i = 0; i < vectorSplit.length; i++) {
                    if (!vectorSplit[i].equalsIgnoreCase("")) {
                        cmbClaves.addItem(vectorSplit[i]);
                        vec.palabraActual = "";
                    }
                }
            }

        } else if (resultado == 1) {

            vec.agregarPalabrasClaveArchivo();

            if (!vec.palabraActual.equals("")) {
                String[] vectorSplit = vec.palabraActual.split("\n");
                for (int i = 0; i < vectorSplit.length; i++) {
                    if (!vectorSplit[i].equalsIgnoreCase("")) {
                        cmbClaves.addItem(vectorSplit[i]);
                        vec.palabraActual = "";
                    }
                }
            }

        }

    }//GEN-LAST:event_btnAgregarPalClaveActionPerformed

    private void btnEliminarPalClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPalClaveActionPerformed

        if (cmbClaves.getItemCount() > 0) {
            String palabraEliminar = cmbClaves.getSelectedItem().toString();
            cmbClaves.removeItemAt(cmbClaves.getSelectedIndex());
            vec.eliminarPalabra(palabraEliminar);
        } else {
            JOptionPane.showMessageDialog(null, "No hay palabras claves agregadas");
        }
    }//GEN-LAST:event_btnEliminarPalClaveActionPerformed

    private void btnAggResumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggResumenActionPerformed

        vec.palabraActual = "";
        vec.agregarResumen();
        if (!vec.palabraActual.equalsIgnoreCase("")) {
            cmbResumen.addItem(vec.palabraActual);
        }

    }//GEN-LAST:event_btnAggResumenActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        if(cmbClaves.getItemCount()>0){
            
            Repositorio repo = new Repositorio();
            String[] vector = new String[cmbClaves.getItemCount()];
            for(int i = 0; i<vector.length; i++){
                
                vector[i] = cmbClaves.getItemAt(i);
                
            }
            repo.guardarRepositorioPorDefecto(vector);

        }else{
            
            JOptionPane.showMessageDialog(null, "Puesto que no hay palabras claves no se guardara ninguna informacion.");
        
        }
        System.exit(0);

    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAnalisisResumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalisisResumenActionPerformed

        if(cmbResumen.getItemCount()>0){
            
            btnAgregarPalClave.setVisible(false);
            btnEliminarPalClave.setVisible(false);
            btnBuscarPalabra.setVisible(false);
            cmbClaves.setVisible(false);
            lblClaves.setVisible(false);
            btnAggResumen.setVisible(false);
            btnBuscarInvestigaciones.setVisible(false);
            btnAnalisisResumen.setVisible(false);

            lblResumen.setVisible(true);
            cmbResumen.setVisible(true);
            btnAnalizar.setVisible(true);
        
        }else{
            
            JOptionPane.showMessageDialog(null, "No hay resumenes registrados.");
            
        }
    }//GEN-LAST:event_btnAnalisisResumenActionPerformed

    private void btnBuscarInvestigacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarInvestigacionesActionPerformed

        if(cmbResumen.getItemCount()>0){
            String palabraClave = cmbClaves.getSelectedItem().toString();
            String investigacionesDisponibles = "";
            for (int i = 0; i < vec.ResumenHash.length; i++) {
                if (vec.ResumenHash[i] != null) {
                    investigacionesDisponibles = vec.ResumenHash[i].investigacionesDisponibles(investigacionesDisponibles, palabraClave);
                }
            }

            if (!investigacionesDisponibles.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Prueba con consultar las siguientes investigaciones: " + investigacionesDisponibles);
            } else {
                JOptionPane.showMessageDialog(null, "No se han encontrado resultados");
            }
        }else{
            JOptionPane.showMessageDialog(null, "No hay investigaciones agregadas.");
        }
    }//GEN-LAST:event_btnBuscarInvestigacionesActionPerformed

    private void btnBuscarPalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPalabraActionPerformed
        
        String palabraBusqueda = JOptionPane.showInputDialog("Ingrese la palabra que quiere confirmar si esta en el registro de palabras Claves.\nTambien puede verificar por medio del comboBox");
        if(palabraBusqueda == null){
            JOptionPane.showMessageDialog(null, "No ha introducido ninguna palabra.");
        }else if(palabraBusqueda.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "No ha introducido ninguna palabra.");
        }else{
            vec.Buscar(palabraBusqueda);
        }
    }//GEN-LAST:event_btnBuscarPalabraActionPerformed

    private void btnAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarActionPerformed
        
       
        jTextAreaPlus.setText("");
        String tituloResumen = cmbResumen.getSelectedItem().toString();
        String autoresResumen = vec.autoresResumen(tituloResumen);
        String cuerpoResumen = vec.cuerpoResumen(tituloResumen);
        String delimitadores = "[, . ? ??! ()   ]";
        String[] cuerpoDividido = cuerpoResumen.split(delimitadores);
        String[] vectorKeys = new String[cuerpoDividido.length];
        String cadena = "";
        try {
            cadena = vec.analizarResumen(cuerpoDividido, vectorKeys, tituloResumen, autoresResumen);
        } catch (InterruptedException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTextAreaPlus.setText(cadena);
        for (int i = 0; i < vectorKeys.length; i++) {
            if (vectorKeys[i] != null) {
                vec.TablaHash[Integer.parseInt(vectorKeys[i])].corregirFrecuencia();
            } else {
                break;
            }
        }
        
        btnAgregarPalClave.setVisible(true);
        btnEliminarPalClave.setVisible(true);
        btnBuscarPalabra.setVisible(true);
        cmbClaves.setVisible(true);
        lblClaves.setVisible(true);
        btnAggResumen.setVisible(true);
        btnBuscarInvestigaciones.setVisible(true);
        btnAnalisisResumen.setVisible(true);

        lblResumen.setVisible(false);
        cmbResumen.setVisible(false);
        btnAnalizar.setVisible(false);
            
    }//GEN-LAST:event_btnAnalizarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAggResumen;
    private javax.swing.JButton btnAgregarPalClave;
    private javax.swing.JButton btnAnalisisResumen;
    private javax.swing.JButton btnAnalizar;
    private javax.swing.JButton btnBuscarInvestigaciones;
    private javax.swing.JButton btnBuscarPalabra;
    private javax.swing.JButton btnEliminarPalClave;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbClaves;
    private javax.swing.JComboBox<String> cmbResumen;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaPlus;
    private javax.swing.JLabel lblClaves;
    private javax.swing.JLabel lblInformacionGeneral;
    private javax.swing.JLabel lblResumen;
    // End of variables declaration//GEN-END:variables
}
