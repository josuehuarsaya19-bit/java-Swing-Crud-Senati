package com.josue.crud.presentacion;

import com.josue.crud.datos.Persona;
import com.josue.crud.persistencia.PersonaDAO;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JInternalFrameCrudPersona extends javax.swing.JInternalFrame { 
    int idPersona;
    int validaGuardarActualizar = 0;

    public JInternalFrameCrudPersona() {
        initComponents();
        this.setSize(new Dimension(800,650));
        this.setTitle("Gestión Persona");
        listarPersona();
    }
    
    private DefaultTableModel modeloTabla;
    public void listarPersona(){
        PersonaDAO pdao = new PersonaDAO();
        List<Persona> listaPersonas = pdao.listarPersona();
        
        modeloTabla = new DefaultTableModel(new String[]{"ID","NOMBRES","APELLIDOS","NUMERO_DOC", "DIRECCION", "FECHA_NACIMIENTO"},0);
        tablePersona.setModel(modeloTabla);
        
        for( Persona p : listaPersonas){
            modeloTabla.addRow(new Object[]{
                p.getIDPersona(),
                p.getNombres(),
                p.getApellidos(),
                p.getNumeroDocumetos(),
                p.getDireccion(),
                p.getFechaNacimiento()
            });
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textNombres = new javax.swing.JTextField();
        textApellidos = new javax.swing.JTextField();
        textFechaNacimiento = new javax.swing.JTextField();
        textDocumento = new javax.swing.JTextField();
        textDireccion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePersona = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        labelErrorNombre = new javax.swing.JLabel();
        labelErrorFecha = new javax.swing.JLabel();
        labelErrorDoc = new javax.swing.JLabel();
        labelErrorDirec = new javax.swing.JLabel();
        labelErrorApellidos = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Gestion de personas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));
        getContentPane().add(textNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 210, 30));
        getContentPane().add(textApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 210, 30));
        getContentPane().add(textFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 210, 30));
        getContentPane().add(textDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 210, 30));
        getContentPane().add(textDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 210, -1));

        tablePersona.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablePersona);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, -1));

        btnActualizar.setText("ACTULIZAR");
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarMouseClicked(evt);
            }
        });
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 530, 180, 40));

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 530, 180, 40));

        btnGuardar.setText("GUARDAR");
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 180, 40));

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 527, 180, 40));

        labelErrorNombre.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        labelErrorNombre.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(labelErrorNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        labelErrorFecha.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        labelErrorFecha.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(labelErrorFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        labelErrorDoc.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        labelErrorDoc.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(labelErrorDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        labelErrorDirec.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        labelErrorDirec.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(labelErrorDirec, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        labelErrorApellidos.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        labelErrorApellidos.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(labelErrorApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel2.setText("Apellidos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 70, 20));

        jLabel3.setText("Fecha Nacimiento");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 70, 20));

        jLabel4.setText("Documento");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 70, 20));

        jLabel5.setText("Dirección");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 70, 20));

        jLabel6.setText("Nombre");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 70, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        // TODO add your handling code here:
        boolean valida = validaFormulario ();

        if(valida){
          System.out.println("Nombre: " + textNombres.getText());
        System.out.println("Apellidos: " + textApellidos.getText());
        System.out.println("Direccion: "+textDireccion.getText());
        System.out.println("Dcumento: "+textDocumento.getText());
        System.out.println("Fecha Nacimiento: "+textFechaNacimiento.getText());
        
        Persona p = new Persona();
        p.setIDPersona(idPersona);
        p.setNombres(textNombres.getText());
        p.setApellidos(textApellidos.getText());
        p.setFechaNacimiento(textFechaNacimiento.getText());
        p.setDireccion(textDireccion.getText());
        p.setNumeroDocumetos(Integer.parseInt(textDocumento.getText()));

        PersonaDAO personaDAO = new PersonaDAO();
        String mensaje = "";
        if (this.validaGuardarActualizar ==0){
            System.out.println("aqui va guardar");
             mensaje = personaDAO.insertarPersona(p);
       }else{
            System.out.println("Aqui va actualizar");
            mensaje = personaDAO.actualizarPersona(p);      
        }

        JOptionPane.showMessageDialog(this, mensaje);
        listarPersona();
        System.out.println(mensaje);
        
        textNombres.setText("");
        textNombres.setText("");
        textApellidos.setText("");
        textDireccion.setText("");
        textDocumento.setText("");
        textFechaNacimiento.setText("");  
        }                                     
    }//GEN-LAST:event_btnGuardarMouseClicked
    
    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
          System.out.println("aqui el boton eliminar persona");
        
        int filaSeleccionada = tablePersona.getSelectedRow();
        int idPersona = Integer.parseInt(modeloTabla.getValueAt(filaSeleccionada, 0).toString());
        
        PersonaDAO pdao = new PersonaDAO();
        String mensaje = pdao.eliminarPerseona(idPersona);
        listarPersona();
        JOptionPane.showMessageDialog(this, mensaje);
    }//GEN-LAST:event_btnEliminarMouseClicked

    
    
    private boolean validaFormulario(){
        boolean valida = true ;

         if(String.valueOf(textNombres.getText()).isEmpty()){
             valida = false;
             labelErrorNombre.setText("campo Nombre obligatorio");
            }else{
             labelErrorNombre.setText("");
         }
         
         if(String.valueOf(textApellidos.getText()).isEmpty()){
             valida = false;
             labelErrorApellidos.setText("campo Apellido obligatorio");
            }else{
             labelErrorApellidos.setText("");
         }
         
         if(String.valueOf(textFechaNacimiento.getText()).isEmpty()){
             valida = false;
             labelErrorFecha.setText("campo Apellido obligatorio");
            }else{
             labelErrorFecha.setText("");
         }
         
         if(String.valueOf(textDocumento.getText()).isEmpty()){
             valida = false;
             labelErrorDoc.setText("campo Apellido obligatorio");
            }else{
             labelErrorDoc.setText("");
         }
         
         if(String.valueOf(textDireccion.getText()).isEmpty()){
             valida = false;
             labelErrorDirec.setText("campo Apellido obligatorio");
            }else{
             labelErrorDirec.setText("");
         }
         return valida;
    }
    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseClicked
        // TODO add your handling code here:

        this.validaGuardarActualizar =1;
        
        int filaSeleccionada = tablePersona.getSelectedRow();
        int idPersona = Integer.parseInt(modeloTabla.getValueAt(filaSeleccionada, 0).toString());
        String nombre = modeloTabla.getValueAt(filaSeleccionada, 1).toString();
        String apellidos = modeloTabla.getValueAt(filaSeleccionada, 2).toString();
        int numero = Integer.parseInt(modeloTabla.getValueAt(filaSeleccionada, 3).toString());
        String direcion = modeloTabla.getValueAt(filaSeleccionada, 4).toString();
        String fechaNacimiento = (modeloTabla.getValueAt(filaSeleccionada, 5).toString());
        
        textNombres.setText(nombre);
        textApellidos.setText(apellidos);
        textDocumento.setText(numero+"");
        textDireccion.setText(direcion);
        textFechaNacimiento.setText(fechaNacimiento);
        
         
         
         
        

    }//GEN-LAST:event_btnActualizarMouseClicked

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        // TODO add your handling code here:
        textNombres.setText("");
        textApellidos.setText("");
        textDireccion.setText("");
        textDocumento.setText("");
        textFechaNacimiento.setText(""); 
        validaGuardarActualizar = 0;
        
        
        
    }//GEN-LAST:event_btnLimpiarMouseClicked
                  
                            
                  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelErrorApellidos;
    private javax.swing.JLabel labelErrorDirec;
    private javax.swing.JLabel labelErrorDoc;
    private javax.swing.JLabel labelErrorFecha;
    private javax.swing.JLabel labelErrorNombre;
    private javax.swing.JTable tablePersona;
    private javax.swing.JTextField textApellidos;
    private javax.swing.JTextField textDireccion;
    private javax.swing.JTextField textDocumento;
    private javax.swing.JTextField textFechaNacimiento;
    private javax.swing.JTextField textNombres;
    // End of variables declaration//GEN-END:variables
}