package burgershopapplication;

import java.awt.*;
import javax.swing.*;


public class BurgerShopMainFrame extends javax.swing.JFrame {

    private BurgerCollection b1;

    public BurgerShopMainFrame(BurgerCollection b1) {
        initComponents();
        setSize(800, 500);
        setLocationRelativeTo(null);
        
        this.b1=b1;
        
        ImageIcon icon = new ImageIcon(getClass().getResource("/burger.png"));
        Image img = icon.getImage();
        Image scaled = img.getScaledInstance(300, 250, Image.SCALE_SMOOTH);

        JLabel imageLabel = new JLabel(new ImageIcon(scaled));
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        imageLabel.setVerticalAlignment(JLabel.CENTER);

        imagePanel.add("Center", imageLabel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        imagePanel = new javax.swing.JPanel();
        mainTitle = new javax.swing.JLabel();
        btnPanel = new javax.swing.JPanel();
        homeBtn1 = new javax.swing.JButton();
        homeBtn2 = new javax.swing.JButton();
        homeBtn3 = new javax.swing.JButton();
        homeBtn4 = new javax.swing.JButton();
        homeBtn5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 500));

        imagePanel.setBackground(new java.awt.Color(255, 255, 255));
        imagePanel.setLayout(new java.awt.BorderLayout());

        mainTitle.setFont(new java.awt.Font("Calibri", 3, 36)); // NOI18N
        mainTitle.setForeground(new java.awt.Color(53, 0, 122));
        mainTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainTitle.setText("Welcome to Burgers");
        mainTitle.setPreferredSize(new java.awt.Dimension(350, 100));
        imagePanel.add(mainTitle, java.awt.BorderLayout.PAGE_START);

        btnPanel.setBackground(new java.awt.Color(27, 0, 82));

        homeBtn1.setBackground(new java.awt.Color(99, 0, 244));
        homeBtn1.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        homeBtn1.setForeground(new java.awt.Color(255, 255, 255));
        homeBtn1.setText("Place Order");
        homeBtn1.setBorderPainted(false);
        homeBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        homeBtn1.setFocusable(false);
        homeBtn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        homeBtn1.setMargin(new java.awt.Insets(10, 14, 2, 14));
        homeBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtn1ActionPerformed(evt);
            }
        });

        homeBtn2.setBackground(new java.awt.Color(99, 0, 244));
        homeBtn2.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        homeBtn2.setForeground(new java.awt.Color(255, 255, 255));
        homeBtn2.setText("Search");
        homeBtn2.setBorderPainted(false);
        homeBtn2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        homeBtn2.setFocusable(false);
        homeBtn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        homeBtn2.setMargin(new java.awt.Insets(10, 14, 2, 14));
        homeBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtn2ActionPerformed(evt);
            }
        });

        homeBtn3.setBackground(new java.awt.Color(99, 0, 244));
        homeBtn3.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        homeBtn3.setForeground(new java.awt.Color(255, 255, 255));
        homeBtn3.setText("View Orders");
        homeBtn3.setBorderPainted(false);
        homeBtn3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        homeBtn3.setFocusable(false);
        homeBtn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        homeBtn3.setMargin(new java.awt.Insets(10, 14, 2, 14));
        homeBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtn3ActionPerformed(evt);
            }
        });

        homeBtn4.setBackground(new java.awt.Color(99, 0, 244));
        homeBtn4.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        homeBtn4.setForeground(new java.awt.Color(255, 255, 255));
        homeBtn4.setText("Update Order Details");
        homeBtn4.setBorderPainted(false);
        homeBtn4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        homeBtn4.setFocusable(false);
        homeBtn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        homeBtn4.setMargin(new java.awt.Insets(10, 14, 2, 14));
        homeBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtn4ActionPerformed(evt);
            }
        });

        homeBtn5.setBackground(new java.awt.Color(99, 0, 244));
        homeBtn5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        homeBtn5.setForeground(new java.awt.Color(255, 255, 255));
        homeBtn5.setText("Exit");
        homeBtn5.setBorderPainted(false);
        homeBtn5.setFocusPainted(false);
        homeBtn5.setFocusable(false);
        homeBtn5.setMargin(new java.awt.Insets(10, 0, 0, 0));
        homeBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtn5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btnPanelLayout = new javax.swing.GroupLayout(btnPanel);
        btnPanel.setLayout(btnPanelLayout);
        btnPanelLayout.setHorizontalGroup(
            btnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeBtn5, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(homeBtn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeBtn2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeBtn3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeBtn4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );
        btnPanelLayout.setVerticalGroup(
            btnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(homeBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(homeBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(homeBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(homeBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(homeBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtn2ActionPerformed
        dispose();
        new SearchPage(b1).setVisible(true);
    }//GEN-LAST:event_homeBtn2ActionPerformed

    private void homeBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtn1ActionPerformed
        dispose();
        new PlaceOrderPage(b1).setVisible(true);
    }//GEN-LAST:event_homeBtn1ActionPerformed

    private void homeBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtn5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_homeBtn5ActionPerformed

    private void homeBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtn3ActionPerformed
        dispose();
        new ViewOrdersPage(b1).setVisible(true);
    }//GEN-LAST:event_homeBtn3ActionPerformed

    private void homeBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtn4ActionPerformed
        dispose();
        new UpdateOrderDetailsPage(b1).setVisible(true);
    }//GEN-LAST:event_homeBtn4ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(BurgerShopMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BurgerShopMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BurgerShopMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BurgerShopMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BurgerCollection b1 = new BurgerCollection();
                new BurgerShopMainFrame(b1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnPanel;
    private javax.swing.JButton homeBtn1;
    private javax.swing.JButton homeBtn2;
    private javax.swing.JButton homeBtn3;
    private javax.swing.JButton homeBtn4;
    private javax.swing.JButton homeBtn5;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel mainTitle;
    // End of variables declaration//GEN-END:variables
}
