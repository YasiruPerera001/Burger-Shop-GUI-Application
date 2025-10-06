package burgershopapplication;

import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import javax.swing.border.*;

public class CanceledOrdersPage extends javax.swing.JFrame {

    private BurgerCollection b1;
    private boolean allSetClicked = false;
    private DefaultTableModel dtm;
    private Burger[] temp;

    public CanceledOrdersPage(BurgerCollection b1) {
        initComponents();
        setSize(800, 500);
        setLocationRelativeTo(null);
        this.b1 = b1;

        String[] columnsName = {"Order Id", "Customer Id", "Name", "Order QTY", "Total"};
        temp = new Burger[b1.getBurgersArray().length];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = b1.getBurgersArray()[i];
        }

        Object[][] rowData = new Object[b1.getBurgersArray().length][5];
        for (int i = 0; i < rowData.length; i++) {
            for (int j = 0; j < 5; j++) {
                switch (j) {
                    case 0:
                        rowData[i][j] = temp[i].getOrderID();
                        //System.out.println(rowData[i][j]);
                        break;
                    case 1:
                        rowData[i][j] = temp[i].getCustomerID();
                        //System.out.println(rowData[i][j]);
                        break;
                    case 2:
                        rowData[i][j] = temp[i].getName();
                        //System.out.println(rowData[i][j]);
                        break;
                    case 3:
                        rowData[i][j] = temp[i].getQuantity();
                        //System.out.println(rowData[i][j]);
                        break;
                    case 4:
                        rowData[i][j] = temp[i].getTotal();
                        //System.out.println(rowData[i][j]);
                        break;
                }
            }
        }

        dtm = new DefaultTableModel(columnsName, 0);

        for (int i = 0; i < rowData.length; i++) {
            if (temp[i].getStatus() == Burger.CANCEL) {
                dtm.addRow(rowData[i]);
            }
        }

        tblDetails = new JTable(dtm);
        tblDetails.getTableHeader().setBackground(Color.BLUE);
        tblDetails.setOpaque(true);

        tablePane.getViewport().setBackground(new Color(27, 0, 82));
        tablePane.setBorder(BorderFactory.createEmptyBorder());
        tablePane.setViewportView(tblDetails);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        banner = new javax.swing.JLabel();
        tablePane = new javax.swing.JScrollPane();
        tblDetails = new javax.swing.JTable();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();

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
        banner.setText("Canceled Orders");
        banner.setOpaque(true);
        banner.setPreferredSize(new java.awt.Dimension(800, 80));

        tablePane.setBackground(new java.awt.Color(27, 0, 82));
        tablePane.setFocusable(false);

        tblDetails.setBackground(new java.awt.Color(255, 255, 255));
        tblDetails.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        tblDetails.setForeground(new java.awt.Color(0, 0, 0));
        tblDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblDetails.setRowMargin(10);
        tblDetails.setShowGrid(true);
        tblDetails.getTableHeader().setResizingAllowed(false);
        tblDetails.getTableHeader().setReorderingAllowed(false);
        tablePane.setViewportView(tblDetails);

        btn1.setBackground(new java.awt.Color(99, 0, 244));
        btn1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("Go Back To Main menu");
        btn1.setFocusable(false);
        btn1.setMargin(new java.awt.Insets(8, 14, 2, 14));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(99, 0, 244));
        btn2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("Go Back");
        btn2.setBorderPainted(false);
        btn2.setFocusable(false);
        btn2.setMargin(new java.awt.Insets(8, 14, 2, 14));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(banner, javax.swing.GroupLayout.DEFAULT_SIZE, 835, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(tablePane, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(36, 36, 36)
                .addComponent(tablePane, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(118, Short.MAX_VALUE))
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

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        dispose();
        new ViewOrdersPage(b1).setVisible(true);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        dispose();
        new BurgerShopMainFrame(b1).setVisible(true);
    }//GEN-LAST:event_btn1ActionPerformed

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
            java.util.logging.Logger.getLogger(CanceledOrdersPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CanceledOrdersPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CanceledOrdersPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CanceledOrdersPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BurgerCollection b1 = new BurgerCollection();
                new CanceledOrdersPage(b1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel banner;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JScrollPane tablePane;
    private javax.swing.JTable tblDetails;
    // End of variables declaration//GEN-END:variables
}
