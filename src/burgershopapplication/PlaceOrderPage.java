package burgershopapplication;

import javax.swing.JFrame;
import javax.swing.*;

public class PlaceOrderPage extends javax.swing.JFrame {

    private BurgerCollection b1;  
    private boolean allSetClicked = false;

    public PlaceOrderPage(BurgerCollection b1) {
        initComponents();
        setSize(800, 500);
        setLocationRelativeTo(null);
        this.b1=b1;
        orderIDField.setText(b1.generateOrderID());
        customerIDField.setText(b1.generateCustomerID());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        banner = new javax.swing.JLabel();
        detailPanel = new javax.swing.JPanel();
        orderID = new javax.swing.JLabel();
        orderIDField = new javax.swing.JTextField();
        customerID = new javax.swing.JLabel();
        customerIDField = new javax.swing.JTextField();
        name = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        burgerQty = new javax.swing.JLabel();
        burgerQtyField = new javax.swing.JTextField();
        allSetBtn = new javax.swing.JButton();
        placeOrderBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        backToHomeBtn = new javax.swing.JButton();
        totalValue = new javax.swing.JLabel();
        netTotalLabel = new javax.swing.JLabel();

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
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(27, 0, 82));

        banner.setBackground(new java.awt.Color(99, 0, 244));
        banner.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        banner.setForeground(new java.awt.Color(255, 255, 255));
        banner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        banner.setLabelFor(mainPanel);
        banner.setText("Place Order");
        banner.setOpaque(true);
        banner.setPreferredSize(new java.awt.Dimension(800, 80));

        detailPanel.setBackground(new java.awt.Color(27, 0, 82));
        detailPanel.setDoubleBuffered(false);
        detailPanel.setPreferredSize(new java.awt.Dimension(500, 300));

        orderID.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        orderID.setForeground(new java.awt.Color(255, 255, 255));
        orderID.setText("Order ID");
        orderID.setPreferredSize(new java.awt.Dimension(10, 10));

        orderIDField.setEditable(false);
        orderIDField.setBackground(new java.awt.Color(27, 0, 82));
        orderIDField.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        orderIDField.setForeground(new java.awt.Color(255, 255, 255));
        orderIDField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        orderIDField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        orderIDField.setMinimumSize(new java.awt.Dimension(5, 10));
        orderIDField.setPreferredSize(new java.awt.Dimension(57, 15));
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
        customerIDField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        customerIDField.setMinimumSize(new java.awt.Dimension(5, 15));
        customerIDField.setPreferredSize(new java.awt.Dimension(60, 19));

        name.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("Name");

        nameField.setBackground(new java.awt.Color(27, 0, 82));
        nameField.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        nameField.setForeground(new java.awt.Color(255, 255, 255));
        nameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        nameField.setPreferredSize(new java.awt.Dimension(47, 15));
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        burgerQty.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        burgerQty.setForeground(new java.awt.Color(255, 255, 255));
        burgerQty.setText("Burger QTY");

        burgerQtyField.setBackground(new java.awt.Color(27, 0, 82));
        burgerQtyField.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        burgerQtyField.setForeground(new java.awt.Color(255, 255, 255));
        burgerQtyField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        burgerQtyField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        burgerQtyField.setPreferredSize(new java.awt.Dimension(47, 15));

        allSetBtn.setBackground(new java.awt.Color(99, 0, 244));
        allSetBtn.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        allSetBtn.setForeground(new java.awt.Color(255, 255, 255));
        allSetBtn.setText("All Set");
        allSetBtn.setFocusPainted(false);
        allSetBtn.setMargin(new java.awt.Insets(7, 14, 2, 14));
        allSetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allSetBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout detailPanelLayout = new javax.swing.GroupLayout(detailPanel);
        detailPanel.setLayout(detailPanelLayout);
        detailPanelLayout.setHorizontalGroup(
            detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailPanelLayout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(customerID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(orderID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(burgerQty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(detailPanelLayout.createSequentialGroup()
                        .addComponent(burgerQtyField, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(allSetBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerIDField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(orderIDField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46))
        );
        detailPanelLayout.setVerticalGroup(
            detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderID, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerID, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(burgerQty, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(burgerQtyField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(allSetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        placeOrderBtn.setBackground(new java.awt.Color(40, 176, 0));
        placeOrderBtn.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        placeOrderBtn.setForeground(new java.awt.Color(255, 255, 255));
        placeOrderBtn.setText("Place Order");
        placeOrderBtn.setBorderPainted(false);
        placeOrderBtn.setFocusPainted(false);
        placeOrderBtn.setMargin(new java.awt.Insets(7, 14, 2, 14));
        placeOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderBtnActionPerformed(evt);
            }
        });

        cancelBtn.setBackground(new java.awt.Color(237, 17, 17));
        cancelBtn.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelBtn.setText("Cancel");
        cancelBtn.setBorderPainted(false);
        cancelBtn.setFocusPainted(false);
        cancelBtn.setMargin(new java.awt.Insets(7, 14, 2, 14));
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        backToHomeBtn.setBackground(new java.awt.Color(99, 0, 244));
        backToHomeBtn.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        backToHomeBtn.setForeground(new java.awt.Color(255, 255, 255));
        backToHomeBtn.setText("Back to Home");
        backToHomeBtn.setBorderPainted(false);
        backToHomeBtn.setFocusPainted(false);
        backToHomeBtn.setMargin(new java.awt.Insets(7, 14, 2, 14));
        backToHomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToHomeBtnActionPerformed(evt);
            }
        });

        totalValue.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        totalValue.setForeground(new java.awt.Color(243, 0, 0));
        totalValue.setMinimumSize(new java.awt.Dimension(30, 10));

        netTotalLabel.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        netTotalLabel.setForeground(new java.awt.Color(255, 255, 255));
        netTotalLabel.setText("Net Total  :  ");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(banner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(detailPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(placeOrderBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backToHomeBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(netTotalLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(8, 8, 8)))
                .addGap(30, 30, 30))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(banner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(detailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(placeOrderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(backToHomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addComponent(netTotalLabel)
                                .addGap(18, 18, 18))
                            .addComponent(totalValue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
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

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void orderIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderIDFieldActionPerformed

    }//GEN-LAST:event_orderIDFieldActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        nameField.setText("");
        burgerQtyField.setText("");
        JOptionPane.showMessageDialog(this, "Order details are not added to the system!");
        allSetClicked = false;
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void backToHomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToHomeBtnActionPerformed
        dispose();
        new BurgerShopMainFrame(b1).setVisible(true);
    }//GEN-LAST:event_backToHomeBtnActionPerformed

    private void placeOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderBtnActionPerformed
        if (allSetClicked) {
            //System.out.println(b1.getBurgersArray().length);
            String orID = b1.generateOrderID();
            String cusID = b1.generateCustomerID();
            String name = nameField.getText();
            int qty = Integer.parseInt(burgerQtyField.getText());
            double total = (double) qty * Burger.burgerPrice;
            int status = Burger.PREPARING;

            Burger order = new Burger(orID, cusID, name, qty, total, status);
            boolean isAdded = b1.addOrder(order);

            if (isAdded) {
                JOptionPane.showMessageDialog(this, "Order details are added to the system Successfully!");
            }
            allSetClicked = false;
            nameField.setText("");
            burgerQtyField.setText("");
            orderIDField.setText(b1.generateOrderID());
            customerIDField.setText(b1.generateCustomerID());
            totalValue.setText("");
        } else {
            JOptionPane.showInternalMessageDialog(null, "Please click the All Set Button first!");
        }
    }//GEN-LAST:event_placeOrderBtnActionPerformed

    private void allSetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allSetBtnActionPerformed
        if (nameField.getText().equals("") || burgerQtyField.getText().equals("")) {
            allSetClicked = false;
            JOptionPane.showInternalMessageDialog(null, "Please fill the required fields!");
        }
        else if(Integer.parseInt(burgerQtyField.getText())<1){
            allSetClicked = false;
            JOptionPane.showInternalMessageDialog(null, "Invalid Burger Quantity!");
        }
        else if (!(nameField.getText().equals("") && burgerQtyField.getText().equals("") && Integer.parseInt(burgerQtyField.getText())>0)) {
            int qty = Integer.parseInt(burgerQtyField.getText());
            double total = (double) qty * Burger.burgerPrice;
            allSetClicked = true;
            totalValue.setText(""+(int)total+".00");
        }
    }//GEN-LAST:event_allSetBtnActionPerformed

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
            java.util.logging.Logger.getLogger(PlaceOrderPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlaceOrderPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlaceOrderPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlaceOrderPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BurgerCollection b1 = new BurgerCollection();
                new PlaceOrderPage(b1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton allSetBtn;
    private javax.swing.JButton backToHomeBtn;
    private javax.swing.JLabel banner;
    private javax.swing.JLabel burgerQty;
    private javax.swing.JTextField burgerQtyField;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel customerID;
    private javax.swing.JTextField customerIDField;
    private javax.swing.JPanel detailPanel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel netTotalLabel;
    private javax.swing.JLabel orderID;
    private javax.swing.JTextField orderIDField;
    private javax.swing.JButton placeOrderBtn;
    private javax.swing.JLabel totalValue;
    // End of variables declaration//GEN-END:variables
}
