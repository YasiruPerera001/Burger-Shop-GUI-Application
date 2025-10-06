package burgershopapplication;

import javax.swing.JFrame;
import javax.swing.*;

public class UpdateOrderDetailsPage extends javax.swing.JFrame {

    private BurgerCollection b1;
    private boolean allSetClicked = false;

    public UpdateOrderDetailsPage(BurgerCollection b1) {
        initComponents();
        setSize(800, 500);
        setLocationRelativeTo(null);
        this.b1 = b1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        banner = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        orderID = new javax.swing.JLabel();
        orderIDField = new javax.swing.JTextField();
        customerID = new javax.swing.JLabel();
        customerIDField = new javax.swing.JTextField();
        name = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        qty = new javax.swing.JLabel();
        qtyField = new javax.swing.JTextField();
        totalField = new javax.swing.JTextField();
        total = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        statusField = new javax.swing.JTextField();
        errorMessageLabel = new javax.swing.JLabel();

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
        banner.setText("Update Orders Details");
        banner.setOpaque(true);
        banner.setPreferredSize(new java.awt.Dimension(800, 80));

        jButton1.setBackground(new java.awt.Color(40, 176, 0));
        jButton1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Update Status");
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);
        jButton1.setMargin(new java.awt.Insets(8, 14, 2, 14));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(99, 0, 244));
        jButton2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Go Back");
        jButton2.setBorderPainted(false);
        jButton2.setFocusPainted(false);
        jButton2.setMargin(new java.awt.Insets(8, 14, 2, 14));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(40, 176, 0));
        jButton3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Update QTY");
        jButton3.setBorderPainted(false);
        jButton3.setFocusPainted(false);
        jButton3.setMargin(new java.awt.Insets(8, 14, 2, 14));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        orderID.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        orderID.setForeground(new java.awt.Color(255, 255, 255));
        orderID.setText("Enter Order ID");

        orderIDField.setBackground(new java.awt.Color(27, 0, 82));
        orderIDField.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        orderIDField.setForeground(new java.awt.Color(255, 255, 255));
        orderIDField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        orderIDField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        orderIDField.setMargin(new java.awt.Insets(10, 0, 0, 0));
        orderIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderIDFieldActionPerformed(evt);
            }
        });

        customerID.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        customerID.setForeground(new java.awt.Color(255, 255, 255));
        customerID.setText("Customer ID");

        customerIDField.setEditable(false);
        customerIDField.setBackground(new java.awt.Color(27, 0, 82));
        customerIDField.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        customerIDField.setForeground(new java.awt.Color(255, 255, 255));
        customerIDField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        customerIDField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        customerIDField.setMargin(new java.awt.Insets(20, 0, 0, 0));
        customerIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerIDFieldActionPerformed(evt);
            }
        });

        name.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("Name");

        nameField.setEditable(false);
        nameField.setBackground(new java.awt.Color(27, 0, 82));
        nameField.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        nameField.setForeground(new java.awt.Color(255, 255, 255));
        nameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        nameField.setMargin(new java.awt.Insets(20, 0, 0, 0));
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        qty.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        qty.setForeground(new java.awt.Color(255, 255, 255));
        qty.setText("Burger QTY");

        qtyField.setEditable(false);
        qtyField.setBackground(new java.awt.Color(27, 0, 82));
        qtyField.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        qtyField.setForeground(new java.awt.Color(255, 255, 255));
        qtyField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        qtyField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        qtyField.setMargin(new java.awt.Insets(20, 0, 0, 0));
        qtyField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyFieldActionPerformed(evt);
            }
        });

        totalField.setEditable(false);
        totalField.setBackground(new java.awt.Color(27, 0, 82));
        totalField.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        totalField.setForeground(new java.awt.Color(221, 0, 0));
        totalField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalField.setBorder(null);
        totalField.setMargin(new java.awt.Insets(8, 0, 0, 0));
        totalField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalFieldActionPerformed(evt);
            }
        });

        total.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        total.setForeground(new java.awt.Color(255, 255, 255));
        total.setText("Total");

        status.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        status.setForeground(new java.awt.Color(255, 255, 255));
        status.setText("Status");

        statusField.setEditable(false);
        statusField.setBackground(new java.awt.Color(27, 0, 82));
        statusField.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        statusField.setForeground(new java.awt.Color(255, 255, 255));
        statusField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        statusField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        statusField.setMargin(new java.awt.Insets(20, 0, 0, 0));
        statusField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusFieldActionPerformed(evt);
            }
        });

        errorMessageLabel.setForeground(new java.awt.Color(241, 0, 0));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(banner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(orderID)
                            .addComponent(name)
                            .addComponent(qty)
                            .addComponent(total)
                            .addComponent(status))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(statusField, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalField, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qtyField, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(orderIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(errorMessageLabel))
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(nameField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(customerIDField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))))
                    .addComponent(customerID, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(banner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderID)
                    .addComponent(orderIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errorMessageLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerID)
                    .addComponent(customerIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qty)
                    .addComponent(qtyField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total)
                    .addComponent(totalField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(status)
                    .addComponent(statusField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!orderIDField.getText().equals("")) {
            dispose();
            String val = orderIDField.getText();
            System.out.println(val);
            new UpdateStatusPage(b1, val).setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(this, "Please enter a Order ID first!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void orderIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderIDFieldActionPerformed
        errorMessageLabel.setText("");
        String st = "";
        int index = b1.findIndexOf2(orderIDField.getText());
        //System.out.println(index);
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "Invalid Order ID!");
            orderIDField.setText("");
            customerIDField.setText("");
            nameField.setText("");
            qtyField.setText("");
            totalField.setText("");
            statusField.setText("");
        } else {
            if (b1.getBurgersArray()[index].getStatus() == Burger.DELIVERED) {
                errorMessageLabel.setText("This Order has been delivered!");
            } else if (b1.getBurgersArray()[index].getStatus() == Burger.CANCEL) {
                errorMessageLabel.setText("This Order has been canceled!");
            } else if (b1.getBurgersArray()[index].getStatus() == Burger.PREPARING) {

                switch (b1.getBurgersArray()[index].getStatus()) {
                    case 0:
                        st = "Preparing";
                        break;
                    case 1:
                        st = "Dilivered";
                        break;
                    case 2:
                        st = "Canceled";
                        break;
                }
                customerIDField.setText(b1.getBurgersArray()[index].getCustomerID());
                nameField.setText(b1.getBurgersArray()[index].getName());
                qtyField.setText("" + b1.getBurgersArray()[index].getQuantity());
                totalField.setText("" + (int) b1.getBurgersArray()[index].getTotal() + ".00");
                statusField.setText(st);
            }
        }
    }//GEN-LAST:event_orderIDFieldActionPerformed

    private void customerIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerIDFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerIDFieldActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void qtyFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtyFieldActionPerformed

    private void totalFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalFieldActionPerformed

    private void statusFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusFieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        new BurgerShopMainFrame(b1).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (!orderIDField.getText().equals("")) {
            dispose();
            String val = orderIDField.getText();
            System.out.println(val);
            new UpdateQtyPage(b1, val).setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(this, "Please enter a Order ID first!");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateOrderDetailsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateOrderDetailsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateOrderDetailsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateOrderDetailsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BurgerCollection b1 = new BurgerCollection();
                new UpdateOrderDetailsPage(b1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel banner;
    private javax.swing.JLabel customerID;
    private javax.swing.JTextField customerIDField;
    private javax.swing.JLabel errorMessageLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel orderID;
    private javax.swing.JTextField orderIDField;
    private javax.swing.JLabel qty;
    private javax.swing.JTextField qtyField;
    private javax.swing.JLabel status;
    private javax.swing.JTextField statusField;
    private javax.swing.JLabel total;
    private javax.swing.JTextField totalField;
    // End of variables declaration//GEN-END:variables
}
