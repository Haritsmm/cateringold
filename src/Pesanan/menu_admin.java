/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pesanan;

import java.awt.Toolkit;

public class menu_admin extends javax.swing.JFrame {

    /**
     * Creates new form menu_admin
     */
    public menu_admin() {
        initComponents();
        icon();
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
        jLabel1 = new javax.swing.JLabel();
        btnkembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(934, 637));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setText("DASHBOARD ADMIN");

        data_costumer.setBackground(new java.awt.Color(0, 204, 204));
        data_costumer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        data_costumer.setForeground(new java.awt.Color(255, 255, 255));
        data_costumer.setText("DATA COSTUMER");
        data_costumer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data_costumerActionPerformed(evt);
            }
        });

        salary_admin.setBackground(new java.awt.Color(0, 204, 204));
        salary_admin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        salary_admin.setForeground(new java.awt.Color(255, 255, 255));
        salary_admin.setText("GAJI");
        salary_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salary_adminActionPerformed(evt);
            }
        });

        database_admin.setBackground(new java.awt.Color(0, 204, 204));
        database_admin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        database_admin.setForeground(new java.awt.Color(255, 255, 255));
        database_admin.setText("DATABASE ADM");
        database_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                database_adminActionPerformed(evt);
            }
        });

        btnkembali.setBackground(new java.awt.Color(255, 0, 0));
        btnkembali.setForeground(new java.awt.Color(255, 255, 255));
        btnkembali.setText("KEMBALI ➥");
        btnkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkembaliActionPerformed(evt);
            }
        });

        database_order.setBackground(new java.awt.Color(0, 204, 204));
        database_order.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        database_order.setForeground(new java.awt.Color(255, 255, 255));
        database_order.setText("DATA ORDER");
        database_order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                database_orderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(data_costumer)
                        .addGap(45, 45, 45)
                        .addComponent(database_order, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(database_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(337, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnkembali, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(salary_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnkembali)))
                .addGap(160, 160, 160)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(data_costumer, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salary_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(database_order, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(database_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(238, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(934, 637));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void data_costumerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data_costumerActionPerformed
        // TODO add your handling code here:
        database_costumer database_costumer = new database_costumer();
        database_costumer.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_data_costumerActionPerformed

    private void salary_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salary_adminActionPerformed
        // TODO add your handling code here:
        admin_salary admin_salary = new admin_salary();
        admin_salary.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_salary_adminActionPerformed

    private void database_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_database_adminActionPerformed
        // TODO add your handling code here:
        database_admin database_admin = new database_admin();
        database_admin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_database_adminActionPerformed

    private void btnkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkembaliActionPerformed
        // TODO add your handling code here:
        login_admin login_admin = new login_admin();
        login_admin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnkembaliActionPerformed

    private void database_orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_database_orderActionPerformed
        // TODO add your handling code here:
        database_order database_order = new database_order();
        database_order.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_database_orderActionPerformed

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
            java.util.logging.Logger.getLogger(menu_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnkembali;
    public static final javax.swing.JButton data_costumer = new javax.swing.JButton();
    public static final javax.swing.JButton database_admin = new javax.swing.JButton();
    public static final javax.swing.JButton database_order = new javax.swing.JButton();
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public static final javax.swing.JButton salary_admin = new javax.swing.JButton();
    // End of variables declaration//GEN-END:variables

    private void icon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
}
}
