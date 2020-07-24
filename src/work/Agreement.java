package work;

import java.awt.Color;

public class Agreement extends javax.swing.JFrame {
    public static int i = 0;
//    MainWork mainWork;
    public Agreement() {
//        mainWork = new MainWork();
//        mainWork.setVisible(true);
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        lblIcon = new javax.swing.JLabel();
        pnlYes = new javax.swing.JPanel();
        lblYes = new javax.swing.JLabel();
        pnlNo = new javax.swing.JPanel();
        lblNo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnlBackground.setBackground(new java.awt.Color(101, 46, 14));
        pnlBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Exit_Sign_80px.png"))); // NOI18N
        pnlBackground.add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 97));

        pnlYes.setBackground(new java.awt.Color(204, 0, 51));

        lblYes.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        lblYes.setForeground(new java.awt.Color(255, 255, 255));
        lblYes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblYes.setText("Yes");
        lblYes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblYes.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblYesMouseDragged(evt);
            }
        });
        lblYes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblYesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblYesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblYesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblYesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblYesMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlYesLayout = new javax.swing.GroupLayout(pnlYes);
        pnlYes.setLayout(pnlYesLayout);
        pnlYesLayout.setHorizontalGroup(
            pnlYesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlYesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblYes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlYesLayout.setVerticalGroup(
            pnlYesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlYesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblYes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlBackground.add(pnlYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, -1, 30));

        pnlNo.setBackground(new java.awt.Color(204, 0, 51));

        lblNo.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        lblNo.setForeground(new java.awt.Color(255, 255, 255));
        lblNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNo.setText("No");
        lblNo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblNoMouseDragged(evt);
            }
        });
        lblNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblNoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblNoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblNoMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlNoLayout = new javax.swing.GroupLayout(pnlNo);
        pnlNo.setLayout(pnlNoLayout);
        pnlNoLayout.setHorizontalGroup(
            pnlNoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblNo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlNoLayout.setVerticalGroup(
            pnlNoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlBackground.add(pnlNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, 30));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Are you sure you're ");
        pnlBackground.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("leaving?");
        pnlBackground.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNoMouseClicked
        pnlNo.setBackground(new Color(204, 0, 51));
        i = 2;
        this.dispose();
    }//GEN-LAST:event_lblNoMouseClicked

    private void lblNoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNoMouseEntered
        pnlNo.setBackground(new Color(230, 36, 81));
    }//GEN-LAST:event_lblNoMouseEntered

    private void lblNoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNoMouseExited
        pnlNo.setBackground(new Color(204, 0, 51));
    }//GEN-LAST:event_lblNoMouseExited

    private void lblNoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNoMouseReleased
        pnlNo.setBackground(new Color(204, 0, 51));
    }//GEN-LAST:event_lblNoMouseReleased

    private void lblNoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNoMousePressed
        pnlNo.setBackground(new Color(230, 36, 81));
    }//GEN-LAST:event_lblNoMousePressed

    private void lblNoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNoMouseDragged
        pnlNo.setBackground(new Color(230, 36, 81));
    }//GEN-LAST:event_lblNoMouseDragged

    private void lblYesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblYesMouseClicked
        pnlYes.setBackground(new Color(204, 0, 51));                
        i = 1;
//        mainWork.setVisible(false);
        this.dispose();        
    }//GEN-LAST:event_lblYesMouseClicked

    private void lblYesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblYesMouseEntered
        pnlYes.setBackground(new Color(230, 36, 81));
    }//GEN-LAST:event_lblYesMouseEntered

    private void lblYesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblYesMouseExited
        pnlYes.setBackground(new Color(204, 0, 51));
    }//GEN-LAST:event_lblYesMouseExited

    private void lblYesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblYesMouseReleased
        pnlYes.setBackground(new Color(204, 0, 51));
    }//GEN-LAST:event_lblYesMouseReleased

    private void lblYesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblYesMousePressed
        pnlYes.setBackground(new Color(230, 36, 81));
    }//GEN-LAST:event_lblYesMousePressed

    private void lblYesMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblYesMouseDragged
        pnlYes.setBackground(new Color(230, 36, 81));
    }//GEN-LAST:event_lblYesMouseDragged

//    public static void main(String args[]) {
//      
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Agreement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Agreement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Agreement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Agreement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Agreement().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblNo;
    private javax.swing.JLabel lblYes;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlNo;
    private javax.swing.JPanel pnlYes;
    // End of variables declaration//GEN-END:variables
}

