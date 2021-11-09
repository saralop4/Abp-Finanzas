package Login;

import java.awt.event.KeyEvent;
import javax.swing.*;
import java.sql.*;

public class IniciarSesion extends javax.swing.JFrame {

    public IniciarSesion() {
        initComponents();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtClave = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnCheck = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar Sesion");
        setMinimumSize(new java.awt.Dimension(601, 363));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(249, 249, 249));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(595, 363));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(36, 36, 36));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri Light", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BIENVENIDO ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("GRUPO BANK S.M");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("INICIO DE SESION AUTORIZADO");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bann.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 360));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 360));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/verified-userr.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        txtUser.setBackground(new java.awt.Color(166, 166, 166));
        txtUser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtUser.setForeground(new java.awt.Color(0, 0, 0));
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        jPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 270, 30));

        txtClave.setBackground(new java.awt.Color(166, 166, 166));
        txtClave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtClave.setForeground(new java.awt.Color(0, 0, 0));
        txtClave.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtClaveKeyPressed(evt);
            }
        });
        jPanel1.add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 270, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/password.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, -1));

        btnIniciar.setBackground(new java.awt.Color(156, 39, 175));
        btnIniciar.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar.setText("Iniciar Sesion");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 150, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/userr.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, -1));

        btnCheck.setBackground(new java.awt.Color(249, 249, 249));
        btnCheck.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCheck.setForeground(new java.awt.Color(51, 51, 51));
        btnCheck.setText("Mostrar Contraseña");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });
        jPanel1.add(btnCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, -1, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed

        String usuario = txtUser.getText();
        String pass = txtClave.getText();
        try {
            if (pass.isEmpty() || usuario.isEmpty()) { //omprueba si la cadena de entrada o campo de texto está vacía 
                JOptionPane.showMessageDialog(null, "Ambos Campos Son Obligatorios");
            } else {
                Statement sql = Conexion.getConexion().createStatement();

            }
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex);
        }

        try {

            Statement sql = Conexion.getConexion().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);

            ResultSet rs = sql.executeQuery("SELECT * FROM login Where usuario='" + usuario + "'and contraseña='" + pass + "'");
            rs.last();
            int encontrado = rs.getRow();

            if (encontrado == 1) {
                Icon icono = new ImageIcon(getClass().getResource("exito.png"));
                JOptionPane.showMessageDialog(rootPane, "Login Exitoso", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono);
                Index ir = new Index();
                ir.setVisible(true);
                hide();
            } else {

                txtUser.setText("");
                txtClave.setText("");
                Icon icono = new ImageIcon(getClass().getResource("multiplicar.png"));
                JOptionPane.showMessageDialog(rootPane, "Usuario o Contraseña Invalido", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono);
            }

        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex);

        }

    }//GEN-LAST:event_btnIniciarActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed

    }//GEN-LAST:event_txtUserActionPerformed

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        if (btnCheck.isSelected()) {

            txtClave.setEchoChar((char) 0);
        } else {
            txtClave.setEchoChar('*');

        }
    }//GEN-LAST:event_btnCheckActionPerformed

    private void txtClaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClaveKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            String usuario = txtUser.getText();
            String pass = txtClave.getText();
            try {
                if (pass.isEmpty() || usuario.isEmpty()) { //omprueba si la cadena de entrada o campo de texto está vacía 
                    JOptionPane.showMessageDialog(null, "Ambos Campos Son Obligatorios");
                } else {

                    Statement sql = Conexion.getConexion().createStatement();
                }
            } catch (SQLException ex) {
                JOptionPane.showConfirmDialog(null, ex);
            }

            try {

                Statement sql = Conexion.getConexion().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);

                ResultSet rs = sql.executeQuery("SELECT * FROM login Where usuario='" + usuario + "'and contraseña='" + pass + "'");
                rs.last();
                int encontrado = rs.getRow();

                if (encontrado == 1) {
                    Icon icono = new ImageIcon(getClass().getResource("exito.png"));
                    JOptionPane.showMessageDialog(rootPane, "Login Exitoso", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono);
                    JOptionPane.showMessageDialog(null, "Login Exitoso");
                    Index ir = new Index();
                    ir.setVisible(true);
                    hide();
                } else {

                    txtUser.setText("");
                    txtClave.setText("");
                    Icon icono = new ImageIcon(getClass().getResource("multiplicar.png"));
                    JOptionPane.showMessageDialog(rootPane, "Usuario o Contraseña Invalido", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono);
                }

            } catch (SQLException ex) {
                JOptionPane.showConfirmDialog(null, ex);

            }

        }
    }//GEN-LAST:event_txtClaveKeyPressed

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
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox btnCheck;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
