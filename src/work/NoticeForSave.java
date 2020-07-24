package work;

import java.awt.Color;

public class NoticeForSave extends javax.swing.JFrame {

    public NoticeForSave() {
        
        initComponents();
        this.setBackground(new Color(0,0,0,0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlYes = new javax.swing.JPanel();
        lblYes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(376, 220));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(101, 46, 14));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_System_Information_80px.png"))); // NOI18N
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("You have saved your profile");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        pnlYes.setBackground(new java.awt.Color(204, 0, 51));

        lblYes.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblYes.setForeground(new java.awt.Color(255, 255, 255));
        lblYes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblYes.setText("Yes");
        lblYes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
            .addComponent(lblYes, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        pnlYesLayout.setVerticalGroup(
            pnlYesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblYes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(pnlYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 70, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 376, 220));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblYesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblYesMouseClicked
        pnlYes.setBackground(new Color(204, 0, 51));
        try{            
            Thread.sleep(1500);            
        }catch(Exception ex){}
        dispose();
    }//GEN-LAST:event_lblYesMouseClicked

    private void lblYesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblYesMouseEntered
        pnlYes.setBackground(new Color(230, 36, 81));
    }//GEN-LAST:event_lblYesMouseEntered

    private void lblYesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblYesMouseExited
        pnlYes.setBackground(new Color(204, 0, 51));
    }//GEN-LAST:event_lblYesMouseExited

    private void lblYesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblYesMousePressed
        pnlYes.setBackground(new Color(230, 36, 81));

    }//GEN-LAST:event_lblYesMousePressed

    private void lblYesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblYesMouseReleased
        pnlYes.setBackground(new Color(204, 0, 51));
    }//GEN-LAST:event_lblYesMouseReleased

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
//            java.util.logging.Logger.getLogger(NoticeForSave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(NoticeForSave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(NoticeForSave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(NoticeForSave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//
//
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new NoticeForSave().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblYes;
    private javax.swing.JPanel pnlYes;
    // End of variables declaration//GEN-END:variables
}
