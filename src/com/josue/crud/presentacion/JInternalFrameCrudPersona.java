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
        jTextField1 = new javax.swing.JTextField();
        textNombres = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        textApellidos = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        textFechaNacimiento = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        textDocumento = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        textDireccion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePersona = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Gestion de personas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        jTextField1.setText("Nombre");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));
        getContentPane().add(textNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 210, 30));

        jTextField3.setText("Apellidos");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));
        getContentPane().add(textApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 210, 30));

        jTextField5.setText("fecha Nacimiento");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 120, -1));
        getContentPane().add(textFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 210, 30));

        jTextField7.setText("documeto");
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));
        getContentPane().add(textDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 210, 30));

        jTextField9.setText("Direccion");
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTable tablePersona;
    private javax.swing.JTextField textApellidos;
    private javax.swing.JTextField textDireccion;
    private javax.swing.JTextField textDocumento;
    private javax.swing.JTextField textFechaNacimiento;
    private javax.swing.JTextField textNombres;
    // End of variables declaration//GEN-END:variables
}