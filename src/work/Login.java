package work;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import checkServer.connectToServer;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Login extends javax.swing.JFrame {
    public static String EMAIL;
    int x, y;
    connectToServer connec = new connectToServer();
    public Login() {
        initComponents();
        this.setBackground(new Color(0,0,0,0));
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icon/student.png")));
        jPanel1.setFocusable(true);        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblRegister = new javax.swing.JLabel();
        txtFEmail = new javax.swing.JTextField();
        pnlClose = new javax.swing.JPanel();
        lblClose = new javax.swing.JLabel();
        pnlMinimize = new javax.swing.JPanel();
        lblMinimize = new javax.swing.JLabel();
        txtPasPassword = new javax.swing.JPasswordField();
        lblLogin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login - School");
        setUndecorated(true);
        setOpacity(0.0F);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowIconified(java.awt.event.WindowEvent evt) {
                formWindowIconified(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRegister.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        lblRegister.setForeground(new java.awt.Color(255, 255, 255));
        lblRegister.setText("Register");
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
        jPanel1.add(lblRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 417, 50, 30));

        txtFEmail.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtFEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFEmail.setBorder(null);
        txtFEmail.setOpaque(false);
        jPanel1.add(txtFEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 199, 190, 31));

        pnlClose.setBackground(new java.awt.Color(101, 46, 14));

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

        javax.swing.GroupLayout pnlCloseLayout = new javax.swing.GroupLayout(pnlClose);
        pnlClose.setLayout(pnlCloseLayout);
        pnlCloseLayout.setHorizontalGroup(
            pnlCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlCloseLayout.setVerticalGroup(
            pnlCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(pnlClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 30, 30));

        pnlMinimize.setBackground(new java.awt.Color(101, 46, 14));

        lblMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Minimize_Window_25px.png"))); // NOI18N
        lblMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout pnlMinimizeLayout = new javax.swing.GroupLayout(pnlMinimize);
        pnlMinimize.setLayout(pnlMinimizeLayout);
        pnlMinimizeLayout.setHorizontalGroup(
            pnlMinimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMinimizeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlMinimizeLayout.setVerticalGroup(
            pnlMinimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMinimizeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(pnlMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 30, 30));

        txtPasPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPasPassword.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPasPassword.setBorder(null);
        txtPasPassword.setOpaque(false);
        jPanel1.add(txtPasPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 268, 190, 30));

        lblLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/awal.png"))); // NOI18N
        lblLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLoginMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblLoginMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblLoginMouseReleased(evt);
            }
        });
        jPanel1.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 371, -1, -1));

        jPanel2.setBackground(new java.awt.Color(101, 46, 14));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 409, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 409, 30));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Log In.png"))); // NOI18N
        lblBackground.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblBackgroundMouseDragged(evt);
            }
        });
        lblBackground.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBackgroundMousePressed(evt);
            }
        });
        jPanel1.add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, -1));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 413, 477);

        setSize(new java.awt.Dimension(409, 477));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseClicked
        lblLogin.setIcon(new ImageIcon(getClass().getResource("/icon/tengah.png")));
        Connection conn = null;
        try {                    
            conn = connec.getConnection();            
        } catch (SQLException ex) {}
        
        String syntax1 = "SELECT * FROM login where email = ? && password = ?";        
        
        if (txtFEmail.getText().trim().equals("") && txtPasPassword.getText().equals("")) { 
            JOptionPane.showMessageDialog(null, "Please, input Email and Password!");
        } else if (txtPasPassword.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please, input Password!");
        } else if (txtFEmail.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Please, input Email!");
        } else {
            try {
                PreparedStatement ps = conn.prepareStatement(syntax1);                
                ps.setString(1, txtFEmail.getText().trim());
                ps.setString(2, txtPasPassword.getText());
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {                    
                    EMAIL = rs.getString(2);
                    new MainWork().setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Email or Password Invalid");
                }
            } catch (SQLException ex) {}
            
            
        }
        
    }//GEN-LAST:event_lblLoginMouseClicked

    private void lblLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseEntered
        lblLogin.setIcon(new ImageIcon(getClass().getResource("/icon/tengah.png")));
    }//GEN-LAST:event_lblLoginMouseEntered

    private void lblLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseExited
        lblLogin.setIcon(new ImageIcon(getClass().getResource("/icon/awal.png")));
    }//GEN-LAST:event_lblLoginMouseExited

    private void lblLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMousePressed
        lblLogin.setIcon(new ImageIcon(getClass().getResource("/icon/akhir.png")));
    }//GEN-LAST:event_lblLoginMousePressed

    private void lblLoginMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseReleased
        lblLogin.setIcon(new ImageIcon(getClass().getResource("/icon/tengah.png")));
    }//GEN-LAST:event_lblLoginMouseReleased

    private void lblRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterMouseClicked
        lblRegister.setForeground(new Color(166, 166, 165));
        new Register().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblRegisterMouseClicked

    private void lblRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterMouseEntered
        lblRegister.setForeground(new Color(166, 166, 165));
    }//GEN-LAST:event_lblRegisterMouseEntered

    private void lblRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterMouseExited
        lblRegister.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_lblRegisterMouseExited

    private void lblRegisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterMousePressed
        lblRegister.setForeground(new Color(135, 135, 132));
    }//GEN-LAST:event_lblRegisterMousePressed

    private void lblRegisterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterMouseReleased
        lblRegister.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_lblRegisterMouseReleased

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        pnlClose.setBackground(new Color(226, 11, 11));
        // EXIT
        int a = JOptionPane.showConfirmDialog(null, "Are you sure you're \nleaving", "",
                JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE,                
                new ImageIcon("src/icon/icons8_Exit_Sign_80px_1.png"));
        if (a == JOptionPane.YES_OPTION) {
            this.dispose();
        }        
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
        
        this.setExtendedState(JFrame.ICONIFIED);
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblMinimizeMouseClicked

    private void lblMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblMinimizeMouseEntered

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0; i < 1; i = i + 0.1) {
            String val = i+"";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try{
                Thread.sleep(50);
            } catch (Exception ex){
                
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowIconified(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowIconified
        
    }//GEN-LAST:event_formWindowIconified

    private void lblBackgroundMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackgroundMouseDragged
        
        int koordinatX = evt.getXOnScreen();
        int koordinatY = evt.getYOnScreen();
        
        this.setLocation(koordinatX - x, koordinatY - y);
    }//GEN-LAST:event_lblBackgroundMouseDragged

    private void lblBackgroundMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackgroundMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_lblBackgroundMousePressed

//    public static void main(String args[]) {
//
//        
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JLabel lblRegister;
    private javax.swing.JPanel pnlClose;
    private javax.swing.JPanel pnlMinimize;
    private javax.swing.JTextField txtFEmail;
    private javax.swing.JPasswordField txtPasPassword;
    // End of variables declaration//GEN-END:variables
}
