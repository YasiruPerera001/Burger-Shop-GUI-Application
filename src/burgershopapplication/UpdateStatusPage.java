package burgershopapplication;

import javax.swing.JFrame;
import javax.swing.*;

public class UpdateStatusPage extends javax.swing.JFrame {

    private BurgerCollection b1;
    private UpdateOrderDetailsPage updatePage;
    private boolean preparingChecked = false;
    private boolean deliveredChecked = false;
    private boolean canceledChecked = false;
    private String orderID;

    public UpdateStatusPage(BurgerCollection b1, String orderID) {
        initComponents();
        setSize(800, 500);
        setLocationRelativeTo(null);
        this.b1 = b1;
        this.orderID = orderID;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        banner = new javax.swing.JLabel();
        goBackBtn = new javax.swing.JButton();
        statusLabel = new javax.swing.JLabel();
        preparingBox = new javax.swing.JCheckBox();
        deliveredBox = new javax.swing.JCheckBox();
        canceledBox = new javax.swing.JCheckBox();
        setBtn = new javax.swing.JButton();
        updatedStatus = new javax.swing.JLabel();
        statusValue = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 239, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(27, 0, 82));
        mainPanel.setForeground(new java.awt.Color(255, 255, 255));

        banner.setBackground(new java.awt.Color(99, 0, 244));
        banner.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        banner.setForeground(new java.awt.Color(255, 255, 255));
        banner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        banner.setLabelFor(mainPanel);
        banner.setText("Update Status");
        banner.setOpaque(true);
        banner.setPreferredSize(new java.awt.Dimension(800, 80));

        goBackBtn.setBackground(new java.awt.Color(99, 0, 244));
        goBackBtn.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        goBackBtn.setForeground(new java.awt.Color(255, 255, 255));
        goBackBtn.setText("Go Back");
        goBackBtn.setBorderPainted(false);
        goBackBtn.setFocusPainted(false);
        goBackBtn.setMargin(new java.awt.Insets(8, 14, 2, 14));
        goBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackBtnActionPerformed(evt);
            }
        });

        statusLabel.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        statusLabel.setForeground(new java.awt.Color(255, 255, 255));
        statusLabel.setText("Choose the Status");

        preparingBox.setBackground(new java.awt.Color(27, 0, 82));
        preparingBox.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        preparingBox.setForeground(new java.awt.Color(255, 255, 255));
        preparingBox.setText("Preparing");
        preparingBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preparingBoxActionPerformed(evt);
            }
        });

        deliveredBox.setBackground(new java.awt.Color(27, 0, 82));
        deliveredBox.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        deliveredBox.setForeground(new java.awt.Color(255, 255, 255));
        deliveredBox.setText("Dilivered");
        deliveredBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deliveredBoxActionPerformed(evt);
            }
        });

        canceledBox.setBackground(new java.awt.Color(27, 0, 82));
        canceledBox.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        canceledBox.setForeground(new java.awt.Color(255, 255, 255));
        canceledBox.setText("Canceled");
        canceledBox.setFocusable(false);
        canceledBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canceledBoxActionPerformed(evt);
            }
        });

        setBtn.setBackground(new java.awt.Color(99, 0, 244));
        setBtn.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        setBtn.setForeground(new java.awt.Color(255, 255, 255));
        setBtn.setText("Set");
        setBtn.setBorderPainted(false);
        setBtn.setFocusable(false);
        setBtn.setMargin(new java.awt.Insets(8, 14, 2, 14));
        setBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setBtnActionPerformed(evt);
            }
        });

        updatedStatus.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        updatedStatus.setForeground(new java.awt.Color(255, 255, 255));
        updatedStatus.setText("Updated Status");

        statusValue.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        statusValue.setForeground(new java.awt.Color(235, 0, 0));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(banner, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(goBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(statusLabel)
                            .addComponent(updatedStatus))
                        .addGap(18, 18, 18)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(preparingBox, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(deliveredBox, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(canceledBox, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(setBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(statusValue, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 79, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(banner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusLabel)
                    .addComponent(preparingBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deliveredBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(canceledBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statusValue, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatedStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 276, Short.MAX_VALUE)
                .addComponent(goBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackBtnActionPerformed
        dispose();
        new UpdateOrderDetailsPage(b1).setVisible(true);
    }//GEN-LAST:event_goBackBtnActionPerformed

    private void deliveredBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deliveredBoxActionPerformed
        if (!preparingBox.isSelected() && !canceledBox.isSelected()) {
            deliveredChecked = true;
            preparingChecked=false;
            canceledChecked=false;
        } else {
            JOptionPane.showMessageDialog(this, "Please only select One Option!");
            preparingBox.setSelected(false);
            canceledBox.setSelected(false);
            deliveredBox.setSelected(false);
        }
    }//GEN-LAST:event_deliveredBoxActionPerformed

    private void preparingBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preparingBoxActionPerformed
        if (!deliveredBox.isSelected() && !canceledBox.isSelected()) {
            preparingChecked = true;
            deliveredChecked = false;
            canceledChecked=false;
        } else {
            JOptionPane.showMessageDialog(this, "Please only select One Option!");
            preparingBox.setSelected(false);
            canceledBox.setSelected(false);
            deliveredBox.setSelected(false);
        }
    }//GEN-LAST:event_preparingBoxActionPerformed

    private void canceledBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canceledBoxActionPerformed
        if (!preparingBox.isSelected() && !deliveredBox.isSelected()) {
            canceledChecked = true;
            preparingChecked = false;
            deliveredChecked = false;
        } else {
            JOptionPane.showMessageDialog(this, "Please only select One Option!");
            preparingBox.setSelected(false);
            canceledBox.setSelected(false);
            deliveredBox.setSelected(false);
        }
    }//GEN-LAST:event_canceledBoxActionPerformed

    private void setBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setBtnActionPerformed
            if (preparingBox.isSelected()) {
                statusValue.setText("Preparing");
                for (int i = 0; i < b1.getBurgersArray().length; i++) {
                    if (orderID.equalsIgnoreCase(b1.getBurgersArray()[i].getOrderID())) {
                        b1.getBurgersArray()[i].setStatus(Burger.PREPARING);
                        break;
                    }
                }
            }

            if (deliveredBox.isSelected()) {
                statusValue.setText("Delivered");
                for (int i = 0; i < b1.getBurgersArray().length; i++) {
                    if (orderID.equalsIgnoreCase(b1.getBurgersArray()[i].getOrderID())) {
                        b1.getBurgersArray()[i].setStatus(Burger.DELIVERED);
                        break;
                    }
                }
            }


            if (canceledBox.isSelected()) {
                statusValue.setText("Canceled");
                for (int i = 0; i < b1.getBurgersArray().length; i++) {
                    if (orderID.equalsIgnoreCase(b1.getBurgersArray()[i].getOrderID())) {
                        b1.getBurgersArray()[i].setStatus(Burger.CANCEL);
                        break;
                    }
                }
            }
            JOptionPane.showMessageDialog(this, "Order status has changed successfully!");
    }//GEN-LAST:event_setBtnActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateStatusPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateStatusPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateStatusPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateStatusPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BurgerCollection b1 = new BurgerCollection();
                //new UpdateStatusPage(b1,index).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel banner;
    private javax.swing.JCheckBox canceledBox;
    private javax.swing.JCheckBox deliveredBox;
    private javax.swing.JButton goBackBtn;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JCheckBox preparingBox;
    private javax.swing.JButton setBtn;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JLabel statusValue;
    private javax.swing.JLabel updatedStatus;
    // End of variables declaration//GEN-END:variables
}
