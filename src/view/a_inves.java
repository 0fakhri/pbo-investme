/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionListener;

/**
 *
 * @author user
 */
public class a_inves extends javax.swing.JFrame {

    /**
     * Creates new form a_inves
     */
    public a_inves() {
        initComponents();
    }
    
    public void klikInves(ActionListener action){
        btnPinjam.addActionListener(action);
    }
    
    public void klikHome(ActionListener action){
        btnDashboardAdmin.addActionListener(action);
    }
    
    public void klikLogout(ActionListener action){
        btnLogout.addActionListener(action);
    }
    
    public void klikPinjam(ActionListener action){
        btnPinjam.addActionListener(action);
    }
    
    public void klikProfil(ActionListener action){
        btnProfil.addActionListener(action);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnPinjam = new javax.swing.JButton();
        btnInves = new javax.swing.JButton();
        btnDashboardAdmin = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnProfil = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(119, 173, 209));

        btnPinjam.setBackground(new java.awt.Color(119, 173, 209));
        btnPinjam.setFont(new java.awt.Font("Microsoft YaHei", 1, 11)); // NOI18N
        btnPinjam.setForeground(new java.awt.Color(255, 255, 255));
        btnPinjam.setText("Pinjaman  >");
        btnPinjam.setToolTipText("");
        btnPinjam.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(133, 193, 233), 2, true));
        btnPinjam.setContentAreaFilled(false);
        btnPinjam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPinjam.setOpaque(true);
        btnPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPinjamActionPerformed(evt);
            }
        });

        btnInves.setBackground(new java.awt.Color(133, 193, 233));
        btnInves.setFont(new java.awt.Font("Microsoft YaHei", 1, 11)); // NOI18N
        btnInves.setForeground(new java.awt.Color(255, 255, 255));
        btnInves.setText("Investasi     >");
        btnInves.setToolTipText("");
        btnInves.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(133, 193, 233), 2, true));
        btnInves.setContentAreaFilled(false);
        btnInves.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInves.setOpaque(true);
        btnInves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvesActionPerformed(evt);
            }
        });

        btnDashboardAdmin.setBackground(new java.awt.Color(133, 193, 233));
        btnDashboardAdmin.setFont(new java.awt.Font("Microsoft YaHei", 1, 11)); // NOI18N
        btnDashboardAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnDashboardAdmin.setText("Dasboard   >");
        btnDashboardAdmin.setToolTipText("");
        btnDashboardAdmin.setActionCommand("Home                    >");
        btnDashboardAdmin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(133, 193, 233), 2, true));
        btnDashboardAdmin.setContentAreaFilled(false);
        btnDashboardAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDashboardAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboardAdminActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(255, 51, 51));
        btnLogout.setFont(new java.awt.Font("Microsoft YaHei", 1, 11)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Keluar");
        btnLogout.setToolTipText("");
        btnLogout.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(251, 175, 100), 3, true));
        btnLogout.setBorderPainted(false);
        btnLogout.setContentAreaFilled(false);
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.setOpaque(true);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnProfil.setBackground(new java.awt.Color(133, 193, 233));
        btnProfil.setFont(new java.awt.Font("Microsoft YaHei", 1, 11)); // NOI18N
        btnProfil.setForeground(new java.awt.Color(255, 255, 255));
        btnProfil.setText("Profil");
        btnProfil.setToolTipText("");
        btnProfil.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(251, 175, 100), 3, true));
        btnProfil.setBorderPainted(false);
        btnProfil.setContentAreaFilled(false);
        btnProfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProfil.setOpaque(true);
        btnProfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDashboardAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnPinjam, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(btnInves, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btnProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(btnDashboardAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInves, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, -1));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1.", "PT. Makmur Jaya", "Rp. 10.000.000,-"},
                {"2.", "PT. Aladin", "Rp. 5.000.000,-"},
                {"3.", "UD. Barokah", "Rp. 10.000.000,-"},
                {"4.", "PT. Ulala", "Rp. 7.000.000,-"}
            },
            new String [] {
                "No.", "Nama Usaha", "Pinjaman"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 95, 600, 110));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/bis.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 830, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPinjamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPinjamActionPerformed

    private void btnInvesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInvesActionPerformed

    private void btnDashboardAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDashboardAdminActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed

    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnProfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProfilActionPerformed

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
            java.util.logging.Logger.getLogger(a_inves.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(a_inves.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(a_inves.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(a_inves.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new a_inves().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDashboardAdmin;
    private javax.swing.JButton btnInves;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPinjam;
    private javax.swing.JButton btnProfil;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
