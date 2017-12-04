/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControllerAddService;
import Controller.ControllerAddTickets;

/**
 *
 * @author User
 */
public class HPMenuBrand extends javax.swing.JFrame {

    /**
     * Creates new form HPMenuSeller
     */
    public HPMenuBrand() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelService = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanelItem = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        email = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextAreaName = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(173, 215, 246));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelService.setBackground(new java.awt.Color(135, 191, 255));
        jPanelService.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelService.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelServiceMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Service");

        javax.swing.GroupLayout jPanelServiceLayout = new javax.swing.GroupLayout(jPanelService);
        jPanelService.setLayout(jPanelServiceLayout);
        jPanelServiceLayout.setHorizontalGroup(
            jPanelServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelServiceLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanelServiceLayout.setVerticalGroup(
            jPanelServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelServiceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelService, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 190, 70));

        jPanelItem.setBackground(new java.awt.Color(135, 191, 255));
        jPanelItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelItemMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tickets");

        javax.swing.GroupLayout jPanelItemLayout = new javax.swing.GroupLayout(jPanelItem);
        jPanelItem.setLayout(jPanelItemLayout);
        jPanelItemLayout.setHorizontalGroup(
            jPanelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelItemLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(29, 29, 29))
        );
        jPanelItemLayout.setVerticalGroup(
            jPanelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelItemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 190, 70));

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Brand Option");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, -1, -1));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("View Our Product");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, -1, -1));

        email.setBackground(new java.awt.Color(135, 191, 255));
        email.setToolTipText("");
        email.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/price-tag.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        email.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 130, -1));

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Name :");
        email.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jTextAreaName.setBackground(new java.awt.Color(135, 191, 255));
        jTextAreaName.setColumns(20);
        jTextAreaName.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jTextAreaName.setForeground(new java.awt.Color(255, 255, 255));
        jTextAreaName.setRows(5);
        email.add(jTextAreaName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 180, 20));

        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 490));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelItemMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new ControllerAddTickets();
        
    }//GEN-LAST:event_jPanelItemMouseClicked

    private void jPanelServiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelServiceMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new ControllerAddService();
    }//GEN-LAST:event_jPanelServiceMouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(HPMenuSeller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(HPMenuSeller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(HPMenuSeller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(HPMenuSeller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new HPMenuSeller().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelItem;
    private javax.swing.JPanel jPanelService;
    private javax.swing.JTextArea jTextAreaName;
    // End of variables declaration//GEN-END:variables
    
    public void getjTextAreaName(String user) {
        jTextAreaName.append(user);
    }


}
