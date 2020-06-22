/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class profilAdmin extends javax.swing.JFrame {

    /**
     * Creates new form profilAdmin
     */
    public profilAdmin() {
        initComponents();
    }
    
    public void klikLogout(ActionListener action){
        btnLogout.addActionListener(action);
    }
    
    public void klikPinjam(ActionListener action){
        btnPinjam.addActionListener(action);
    }
    
    public void klikInves(ActionListener action){
        btnInves.addActionListener(action);
    }
    
    public void klikProfil(ActionListener action){
        btnProfil.addActionListener(action);
    }
    
    public void klikHome(ActionListener action){
        home.addActionListener(action);
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
        email = new javax.swing.JTextField();
        jnsKel = new javax.swing.JComboBox<>();
        username = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        noTelp = new javax.swing.JTextField();
        passw = new javax.swing.JPasswordField();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnInves = new javax.swing.JButton();
        home = new javax.swing.JButton();
        btnPinjam = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnProfil = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Profil");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 250, 30));

        jnsKel.setEditable(true);
        jnsKel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-laki", "Perempuan" }));
        jnsKel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnsKelActionPerformed(evt);
            }
        });
        jPanel1.add(jnsKel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 90, 30));

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 250, 30));

        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });
        jPanel1.add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 250, 30));

        jLabel4.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel4.setText("Email");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel5.setText("Username");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, -1, -1));

        jLabel9.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel9.setText("Jenis Kelamin");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        jLabel11.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel11.setText("Nama Pengguna");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, -1));

        btnSimpan.setBackground(new java.awt.Color(102, 102, 255));
        btnSimpan.setFont(new java.awt.Font("Roboto Light", 1, 13)); // NOI18N
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setText("Simpan Perubahan");
        btnSimpan.setContentAreaFilled(false);
        btnSimpan.setOpaque(true);
        jPanel1.add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 250, 30));

        jLabel14.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel14.setText("No Telp");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        noTelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noTelpActionPerformed(evt);
            }
        });
        jPanel1.add(noTelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 140, 30));

        passw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwActionPerformed(evt);
            }
        });
        jPanel1.add(passw, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 250, 30));

        jLabel15.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel15.setText("Kata Sandi");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, -1, -1));

        jPanel2.setBackground(new java.awt.Color(119, 173, 209));

        btnInves.setBackground(new java.awt.Color(119, 173, 209));
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

        home.setBackground(new java.awt.Color(133, 193, 233));
        home.setFont(new java.awt.Font("Microsoft YaHei", 1, 11)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setText("Dasboard   >");
        home.setToolTipText("");
        home.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(133, 193, 233), 2, true));
        home.setContentAreaFilled(false);
        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home.setOpaque(true);
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        btnPinjam.setBackground(new java.awt.Color(133, 193, 233));
        btnPinjam.setFont(new java.awt.Font("Microsoft YaHei", 1, 11)); // NOI18N
        btnPinjam.setForeground(new java.awt.Color(255, 255, 255));
        btnPinjam.setText("Pinjaman  >");
        btnPinjam.setToolTipText("");
        btnPinjam.setActionCommand("Home                    >");
        btnPinjam.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(133, 193, 233), 2, true));
        btnPinjam.setContentAreaFilled(false);
        btnPinjam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPinjamActionPerformed(evt);
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
                    .addComponent(btnPinjam, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnInves, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(home, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btnProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInves, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/bis.jpg"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void jnsKelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnsKelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jnsKelActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void noTelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noTelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noTelpActionPerformed

    private void passwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwActionPerformed

    private void btnInvesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInvesActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeActionPerformed

    private void btnPinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPinjamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPinjamActionPerformed

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
            java.util.logging.Logger.getLogger(profilAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(profilAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(profilAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(profilAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new profilAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInves;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPinjam;
    private javax.swing.JButton btnProfil;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JTextField email;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> jnsKel;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField noTelp;
    private javax.swing.JPasswordField passw;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

    public JComboBox<String> getJnsKel() {
        return jnsKel;
    }

    public JTextField getNama() {
        return nama;
    }

    public JTextField getNoTelp() {
        return noTelp;
    }

    public JPasswordField getPassw() {
        return passw;
    }

    public JTextField getUsername() {
        return username;
    }

    public JTextField getEmail() {
        return email;
    }

    
}