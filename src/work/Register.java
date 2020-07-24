package work;
import checkServer.connectToServer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame {
    int x, y;
    boolean checkEmail, checkPass, checkConfPass;
    boolean checkPassUpper, checkPassLower, checkPassDigit;
    connectToServer connec = new connectToServer();
    public Register() {
        connec.connect();
        initComponents();
        
        this.setBackground(new Color(0, 0, 0, 0));
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icon/student.png")));
        background.setFocusable(true);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFEmail = new javax.swing.JTextField();
        txtPasPassword = new javax.swing.JPasswordField();
        lblRegister = new javax.swing.JLabel();
        lblNoticeEmail = new javax.swing.JLabel();
        lblNoticePass = new javax.swing.JLabel();
        lblNoticeConfPas = new javax.swing.JLabel();
        txtPasConPas = new javax.swing.JPasswordField();
        pnlClose = new javax.swing.JPanel();
        lblClose = new javax.swing.JLabel();
        pnlMinimize = new javax.swing.JPanel();
        lblMinimize = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Register - School");
        setUndecorated(true);
        setOpacity(0.0F);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        txtFEmail.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtFEmail.setBorder(null);
        txtFEmail.setOpaque(false);
        txtFEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFEmailKeyReleased(evt);
            }
        });
        getContentPane().add(txtFEmail);
        txtFEmail.setBounds(80, 209, 310, 34);

        txtPasPassword.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtPasPassword.setBorder(null);
        txtPasPassword.setOpaque(false);
        txtPasPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasPasswordFocusGained(evt);
            }
        });
        txtPasPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasPasswordKeyReleased(evt);
            }
        });
        getContentPane().add(txtPasPassword);
        txtPasPassword.setBounds(80, 296, 310, 35);

        lblRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/awal2.png"))); // NOI18N
        lblRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegisterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRegisterMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblRegisterMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblRegisterMouseReleased(evt);
            }
        });
        getContentPane().add(lblRegister);
        lblRegister.setBounds(183, 476, 107, 37);

        lblNoticeEmail.setForeground(new java.awt.Color(255, 255, 153));
        getContentPane().add(lblNoticeEmail);
        lblNoticeEmail.setBounds(80, 245, 300, 13);

        lblNoticePass.setForeground(new java.awt.Color(255, 255, 153));
        getContentPane().add(lblNoticePass);
        lblNoticePass.setBounds(80, 332, 300, 13);

        lblNoticeConfPas.setForeground(new java.awt.Color(255, 255, 153));
        getContentPane().add(lblNoticeConfPas);
        lblNoticeConfPas.setBounds(80, 418, 300, 13);

        txtPasConPas.setEditable(false);
        txtPasConPas.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtPasConPas.setBorder(null);
        txtPasConPas.setFocusable(false);
        txtPasConPas.setOpaque(false);
        txtPasConPas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasConPasKeyReleased(evt);
            }
        });
        getContentPane().add(txtPasConPas);
        txtPasConPas.setBounds(80, 382, 310, 35);

        pnlClose.setBackground(new java.awt.Color(101, 46, 14));
        pnlClose.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Delete_25px_1.png"))); // NOI18N
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCloseMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCloseMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblCloseMouseReleased(evt);
            }
        });
        pnlClose.add(lblClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        getContentPane().add(pnlClose);
        pnlClose.setBounds(423, 0, 30, 30);
        pnlClose.setBackground(new Color(0,0,0,0));

        pnlMinimize.setBackground(new java.awt.Color(101, 46, 14));
        pnlMinimize.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Minimize_Window_25px.png"))); // NOI18N
        lblMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseClicked(evt);
            }
        });
        pnlMinimize.add(lblMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        getContentPane().add(pnlMinimize);
        pnlMinimize.setBounds(393, 0, 30, 30);
        pnlMinimize.setBackground(new Color(0,0,0,0));

        jPanel1.setBackground(new java.awt.Color(101, 46, 14));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 453, 30);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Register.png"))); // NOI18N
        background.setToolTipText("");
        background.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                backgroundMouseDragged(evt);
            }
        });
        background.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backgroundMousePressed(evt);
            }
        });
        getContentPane().add(background);
        background.setBounds(0, 0, 453, 573);

        setSize(new java.awt.Dimension(453, 573));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterMouseClicked
        lblRegister.setIcon(new ImageIcon(this.getClass().getResource("/icon/tengah2.png")));
        
        if (checkEmail && checkPass && checkConfPass) {
            try {
                Connection conn = connec.getConnection();
                String syntax = "INSERT INTO login (email, password) VALUES (?,?)";
                PreparedStatement ps = conn.prepareStatement(syntax);
                ps.setString(1, txtFEmail.getText().trim());
                ps.setString(2, txtPasConPas.getText());
                ps.execute();
            } catch (SQLException sql){}            
        } else {
            JOptionPane.showMessageDialog(null, "Enter the blank part","",JOptionPane.INFORMATION_MESSAGE);
        }
        new Login().setVisible(true);
        this.dispose();
        
               
    }//GEN-LAST:event_lblRegisterMouseClicked

    private void lblRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterMouseEntered
        lblRegister.setIcon(new ImageIcon(this.getClass().getResource("/icon/tengah2.png")));
    }//GEN-LAST:event_lblRegisterMouseEntered

    private void lblRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterMouseExited
        lblRegister.setIcon(new ImageIcon(this.getClass().getResource("/icon/awal2.png")));
    }//GEN-LAST:event_lblRegisterMouseExited

    private void lblRegisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterMousePressed
        lblRegister.setIcon(new ImageIcon(this.getClass().getResource("/icon/akhir2.png")));
    }//GEN-LAST:event_lblRegisterMousePressed

    private void lblRegisterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterMouseReleased
        lblRegister.setIcon(new ImageIcon(this.getClass().getResource("/icon/akhir2.png")));
    }//GEN-LAST:event_lblRegisterMouseReleased

    private void txtFEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFEmailKeyReleased
        Connection conn;
        String email = txtFEmail.getText().trim();
        
        String regex = "[A-Za-z0-9_-]+\\@[a-z0-9._-]+\\.[A-Za-z0-9]{2,4}";        
        checkEmail = Pattern.matches(regex, email);
        if (!checkEmail) {
            lblNoticeEmail.setText("Invalid email");
        } else {
            lblNoticeEmail.setText("");
        }
        try{            
            conn = connec.getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM login");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                if (email.equals(rs.getString("email"))) {
                    lblNoticeEmail.setText("Email is already used");
                    checkEmail = false;
                    break;
                }
            }
        } catch (SQLException sql) {}
        
        
    }//GEN-LAST:event_txtFEmailKeyReleased

    private void txtPasPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasPasswordKeyReleased
        Connection conn;
        String pass = txtPasPassword.getText();                
                
        ArrayList <Character> chr = new ArrayList<Character>();
        int i= 0;
        while (i < pass.length()) {
            chr.add(pass.charAt(i));            
            i++;
        }        
        i = 0;
        while (i < chr.size()) {
            if (Character.isDigit(chr.get(i))) {
                checkPassDigit = true;                
                break;
            } else {
                checkPassDigit = false;
            }
            i++;
        }
        // upper
        chr = new ArrayList<Character>();
        i = 0;
        while (i < pass.length()) {
            chr.add(pass.charAt(i));
            i++;
        }
        i = 0;
        while (i < chr.size()) {
            if (Character.isUpperCase(chr.get(i))) {
                checkPassUpper = true;
                break;
            } else {
                checkPassUpper = false;
            }
            i++;
        }
        // lower
        chr = new ArrayList<Character>();
        i = 0;
        while (i < pass.length()) {
            chr.add(pass.charAt(i));
            i++;
        }
        i = 0;
        while (i < chr.size()) {
            if (Character.isLowerCase(chr.get(i))) {
                checkPassLower = true;
                break;
            } else {
                checkPassLower = false;
            }
            i++;
        }
        
        
        if (!checkPassDigit && !checkPassUpper && !checkPassLower) {
            checkPass = false;
            lblNoticePass.setText("There must be lowercase letter, uppercase letter and digit");
        } else if (!checkPassDigit && !checkPassUpper) {
            checkPass = false;
            lblNoticePass.setText("There must be uppercase letter and digit");            
        } else if (!checkPassLower && !checkPassUpper) {
            checkPass = false;
            lblNoticePass.setText("There must be lowercase letter and uppercase letter");
        } else if (!checkPassDigit && !checkPassLower) {
            checkPass = false;
            lblNoticePass.setText("There must be lowercase letter and digit");
        } else if (!checkPassDigit) {
            checkPass = false;
            lblNoticePass.setText("There must be digit");
        } else if (!checkPassUpper) {
            checkPass = false;
            lblNoticePass.setText("There must be uppercase letter");
        } else if (!checkPassLower) {
            checkPass = false;
            lblNoticePass.setText("There must be lowercase letter");
        }        
        if (checkPassDigit && checkPassLower && checkPassUpper) {
            checkPass = true;
            lblNoticePass.setText("");
            try {
                conn = connec.getConnection();
                PreparedStatement ps = conn.prepareStatement("SELECT * FROM login");
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {                    
                    if (pass.equals(rs.getString("password"))) {
                        lblNoticePass.setText("Password is already used");                        
                        checkPass = false;
                        break;
                    }
                }                
            } catch (SQLException sql) {}
        }
        
        if (!(pass.length() >= 8 && pass.length() <= 13) ) {
            checkPass = false;
            lblNoticePass.setText("Minimum length of 8 letters and a maximum of 13 letters");
        }
        // mengatur on/off pada confirm password
        if (checkPass) {
            txtPasConPas.setEditable(true);
            txtPasConPas.setFocusable(true);
        }else {
            txtPasConPas.setEditable(false);
            txtPasConPas.setFocusable(false);
        }
       
        
    }//GEN-LAST:event_txtPasPasswordKeyReleased

    private void txtPasPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasPasswordFocusGained
        
    }//GEN-LAST:event_txtPasPasswordFocusGained

    private void txtPasConPasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasConPasKeyReleased
        String conPas = txtPasConPas.getText();
        if (!conPas.equals(txtPasPassword.getText())) {
            checkConfPass = false;
            lblNoticeConfPas.setText("Confirm password must be the same as the password");
        } else {
            checkConfPass = true;
            lblNoticeConfPas.setText("");
        }
    }//GEN-LAST:event_txtPasConPasKeyReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.0; i < 1; i = i + 0.1) {
            String val = i+"";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try{                
                Thread.sleep(50);
            } catch (Exception ex){}
            
        }
    }//GEN-LAST:event_formWindowOpened

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        pnlClose.setBackground(new Color(226, 11, 11));
        dispose();
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseEntered
        pnlClose.setBackground(new Color(226, 11, 11));
    }//GEN-LAST:event_lblCloseMouseEntered

    private void lblCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseExited
        pnlClose.setBackground(new Color(101, 46, 14));
    }//GEN-LAST:event_lblCloseMouseExited

    private void lblCloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMousePressed
        pnlClose.setBackground(new Color(255, 45, 45));
    }//GEN-LAST:event_lblCloseMousePressed

    private void lblCloseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseReleased
        pnlClose.setBackground(new Color(101, 46, 14));
    }//GEN-LAST:event_lblCloseMouseReleased

    private void lblMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblMinimizeMouseClicked

    private void backgroundMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundMouseDragged
        int koordinatX = evt.getXOnScreen();
        int koordinatY = evt.getYOnScreen();
        
        this.setLocation(koordinatX - x, koordinatY - y);
    }//GEN-LAST:event_backgroundMouseDragged

    private void backgroundMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_backgroundMousePressed

//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Windows".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Register().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JLabel lblNoticeConfPas;
    private javax.swing.JLabel lblNoticeEmail;
    private javax.swing.JLabel lblNoticePass;
    private javax.swing.JLabel lblRegister;
    private javax.swing.JPanel pnlClose;
    private javax.swing.JPanel pnlMinimize;
    private javax.swing.JTextField txtFEmail;
    private javax.swing.JPasswordField txtPasConPas;
    private javax.swing.JPasswordField txtPasPassword;
    // End of variables declaration//GEN-END:variables
}
