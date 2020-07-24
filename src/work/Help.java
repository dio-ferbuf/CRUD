package work;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class Help extends javax.swing.JFrame {
    boolean check;
    public Help() {
        initComponents();
        System.out.println(check);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextArea2 = new javax.swing.JTextArea();
        jTextArea3 = new javax.swing.JTextArea();
        lblOk = new javax.swing.JLabel();
        lblElips = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setOpacity(0.0F);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(220, 139, 17));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(220, 139, 17));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Before you edit the data, first enter the student ID");
        jTextArea1.setBorder(null);
        jTextArea1.setOpaque(false);
        jPanel1.add(jTextArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 330, 20));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel1.setText("Change ID");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel2.setText("Change Data");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(220, 139, 17));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("You can change the data as you wish, thank you :)");
        jTextArea2.setBorder(null);
        jTextArea2.setOpaque(false);
        jPanel1.add(jTextArea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 330, 20));

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(220, 139, 17));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setText("If you want to edit the student ID, click on the word \n\"Change ID\"");
        jTextArea3.setBorder(null);
        jTextArea3.setOpaque(false);
        jPanel1.add(jTextArea3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 410, 40));

        lblOk.setFont(new java.awt.Font("Fira Sans", 1, 14)); // NOI18N
        lblOk.setForeground(new java.awt.Color(255, 255, 255));
        lblOk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOk.setText("OK");
        lblOk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblOk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOkMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblOkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblOkMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblOkMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblOkMouseReleased(evt);
            }
        });
        jPanel1.add(lblOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 50, 50));

        lblElips.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblElips.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Filled_Circle_50px.png"))); // NOI18N
        jPanel1.add(lblElips, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 50, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 230));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblOkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOkMouseClicked
        
        lblElips.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Filled_Circle_50px.png")));            
        this.dispose();                           
    }//GEN-LAST:event_lblOkMouseClicked

    private void lblOkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOkMouseEntered
        lblElips.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Filled_Circle_50px_1.png")));
    }//GEN-LAST:event_lblOkMouseEntered

    private void lblOkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOkMouseExited
        lblElips.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Filled_Circle_50px.png")));
    }//GEN-LAST:event_lblOkMouseExited

    private void lblOkMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOkMousePressed
        lblElips.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Filled_Circle_50px_1.png")));
    }//GEN-LAST:event_lblOkMousePressed

    private void lblOkMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOkMouseReleased
        lblElips.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Filled_Circle_50px.png")));
    }//GEN-LAST:event_lblOkMouseReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for(double i = 0; i < 1; i = i+ 0.1) {
            String val = i+"";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            
            try{
                Thread.sleep(40);
            } catch (Exception e){}
        }
    }//GEN-LAST:event_formWindowOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JLabel lblElips;
    private javax.swing.JLabel lblOk;
    // End of variables declaration//GEN-END:variables
}
