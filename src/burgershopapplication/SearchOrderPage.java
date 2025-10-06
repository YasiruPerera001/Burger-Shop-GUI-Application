package burgershopapplication;

import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import javax.swing.border.*;

public class SearchOrderPage extends javax.swing.JFrame {

    private BurgerCollection b1;
    private boolean allSetClicked = false;
    private DefaultTableModel dtm;
    private Burger[] temp;

    public SearchOrderPage(BurgerCollection b1) {
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
        orderIDLabel = new javax.swing.JLabel();
        orderIDField = new javax.swing.JTextField();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        cusIDLabel = new javax.swing.JLabel();
        cusIDValue = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        nameValue = new javax.swing.JLabel();
        burgerQtyLabel = new javax.swing.JLabel();
        burgerQtyValue = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        totalValue = new javax.swing.JLabel();
        statusValue = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();

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

        banner.setBackground(new java.awt.Color(99, 0, 244));
        banner.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        banner.setForeground(new java.awt.Color(255, 255, 255));
        banner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        banner.setLabelFor(mainPanel);
        banner.setText("Search Order");
        banner.setOpaque(true);
        banner.setPreferredSize(new java.awt.Dimension(800, 80));

        orderIDLabel.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        orderIDLabel.setForeground(new java.awt.Color(255, 255, 255));
        orderIDLabel.setText("Enter Order ID  :  ");

        orderIDField.setBackground(new java.awt.Color(27, 0, 82));
        orderIDField.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        orderIDField.setForeground(new java.awt.Color(255, 255, 255));
        orderIDField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        orderIDField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        orderIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderIDFieldActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(99, 0, 244));
        btn2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("Go Back");
        btn2.setActionCommand("");
        btn2.setBorderPainted(false);
        btn2.setFocusable(false);
        btn2.setMargin(new java.awt.Insets(8, 14, 2, 14));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(99, 0, 244));
        btn1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("Go Back To Main menu");
        btn1.setActionCommand("");
        btn1.setFocusable(false);
        btn1.setMargin(new java.awt.Insets(8, 14, 2, 14));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        cusIDLabel.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        cusIDLabel.setForeground(new java.awt.Color(255, 255, 255));
        cusIDLabel.setText("Customer ID  :  ");

        cusIDValue.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        cusIDValue.setForeground(new java.awt.Color(255, 255, 255));

        nameLabel.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("Name  :  ");

        nameValue.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        nameValue.setForeground(new java.awt.Color(255, 255, 255));

        burgerQtyLabel.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        burgerQtyLabel.setForeground(new java.awt.Color(255, 255, 255));

        burgerQtyValue.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        burgerQtyValue.setForeground(new java.awt.Color(255, 255, 255));
        burgerQtyValue.setText("Burger QTY  :  ");

        totalLabel.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        totalLabel.setForeground(new java.awt.Color(235, 0, 0));

        totalValue.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        totalValue.setForeground(new java.awt.Color(255, 255, 255));
        totalValue.setText("Total  :  ");

        statusValue.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        statusValue.setForeground(new java.awt.Color(255, 255, 255));

        statusLabel.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        statusLabel.setForeground(new java.awt.Color(255, 255, 255));
        statusLabel.setText("Status  :  ");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(banner, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(orderIDLabel)
                        .addGap(3, 3, 3)
                        .addComponent(orderIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(cusIDLabel)
                        .addGap(28, 28, 28)
                        .addComponent(cusIDValue))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(nameLabel)
                        .addGap(70, 70, 70)
                        .addComponent(nameValue))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(burgerQtyValue)
                        .addGap(35, 35, 35)
                        .addComponent(burgerQtyLabel))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(totalValue)
                        .addGap(78, 78, 78)
                        .addComponent(totalLabel))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(statusLabel)
                        .addGap(71, 71, 71)
                        .addComponent(statusValue)))
                .addContainerGap(473, Short.MAX_VALUE))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(banner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderIDLabel)
                    .addComponent(orderIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cusIDLabel)
                    .addComponent(cusIDValue))
                .addGap(23, 23, 23)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameValue))
                .addGap(23, 23, 23)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(burgerQtyValue)
                    .addComponent(burgerQtyLabel))
                .addGap(23, 23, 23)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalValue)
                    .addComponent(totalLabel))
                .addGap(23, 23, 23)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusLabel)
                    .addComponent(statusValue))
                .addGap(47, 47, 47)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(213, Short.MAX_VALUE))
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

    private void orderIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderIDFieldActionPerformed
        //System.err.println("Hello");

        String st = "";
        int index = b1.findIndexOf2(orderIDField.getText());
        if (index != -1) {
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
            cusIDValue.setText(b1.getBurgersArray()[index].getCustomerID());
            nameValue.setText(b1.getBurgersArray()[index].getName());
            burgerQtyLabel.setText("" + b1.getBurgersArray()[index].getQuantity());
            totalLabel.setText("" + (int) b1.getBurgersArray()[index].getTotal() + ".00");
            statusValue.setText(st);
        } else {
            JOptionPane.showMessageDialog(this, "Invalid Order ID!");
            orderIDField.setText("");
            cusIDValue.setText("");
            nameValue.setText("");
            burgerQtyLabel.setText("");
            totalLabel.setText("");
            statusValue.setText("");
        }
        orderIDField.setText("");
    }//GEN-LAST:event_orderIDFieldActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        dispose();
        new SearchPage(b1).setVisible(true);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        dispose();
        new BurgerShopMainFrame(b1).setVisible(true);
    }//GEN-LAST:event_btn1ActionPerformed


    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BurgerCollection b1 = new BurgerCollection();
                new SearchOrderPage(b1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel banner;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JLabel burgerQtyLabel;
    private javax.swing.JLabel burgerQtyValue;
    private javax.swing.JLabel cusIDLabel;
    private javax.swing.JLabel cusIDValue;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameValue;
    private javax.swing.JTextField orderIDField;
    private javax.swing.JLabel orderIDLabel;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JLabel statusValue;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JLabel totalValue;
    // End of variables declaration//GEN-END:variables
}
