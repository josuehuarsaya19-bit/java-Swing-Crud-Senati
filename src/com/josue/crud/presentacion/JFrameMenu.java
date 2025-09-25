package com.josue.crud.presentacion;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JDesktopPane;

public class JFrameMenu extends javax.swing.JFrame {

    public static JDesktopPane JDesktopPane_Menu;
    public JFrameMenu() {
        initComponents();
        
        this.setSize(new Dimension(1000,700));
        this.setTitle("Menu principal josue huarsaya");
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.darkGray);
        
        // configuracion para manejar multiples  JFremeInternla
        JDesktopPane_Menu = new JDesktopPane();   
        
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width ;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.JDesktopPane_Menu.setBounds(0,0,ancho,(alto - 110));
        this.add(JDesktopPane_Menu);
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuperfil1 = new javax.swing.JMenu();
        jMenuCRUDpersona2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuperfil1.setText("perfil");
        jMenuperfil1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuperfil1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuperfil1);

        jMenuCRUDpersona2.setText("CRUD persona");
        jMenuCRUDpersona2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuCRUDpersona2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuCRUDpersona2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 677, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuperfil1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuperfil1MouseClicked
        // TODO add your handling code here:
        
        System.out.println("fgslfdkngslfdng");
        
        // instanciar 
         JInternalFramePerfil perfil = new JInternalFramePerfil();
        JDesktopPane_Menu.add(perfil);
        perfil.setVisible(true);
        
    
    }//GEN-LAST:event_jMenuperfil1MouseClicked

    private void jMenuCRUDpersona2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuCRUDpersona2MouseClicked
        // TODO add your handling code here:
        
        JInternalFrameCrudPersona persona = new JInternalFrameCrudPersona();
        JDesktopPane_Menu.add(persona);
        persona.setVisible(true);
    }//GEN-LAST:event_jMenuCRUDpersona2MouseClicked

    /**
     * @param args the command line arguments
     * 
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
            java.util.logging.Logger.getLogger(JFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCRUDpersona2;
    private javax.swing.JMenu jMenuperfil1;
    // End of variables declaration//GEN-END:variables
}
