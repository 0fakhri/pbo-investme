/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Lenovo
 */
public class profillanjutan extends javax.swing.JFrame {
    String filename;
    /**
     * Creates new form profillanjutan
     */
    public profillanjutan() {
        initComponents();
    }

    public void klikLogout(ActionListener action){
        btnLogout.addActionListener(action);
    }
    
    public void klikDashboard(ActionListener action){
        btnHome.addActionListener(action);
    }
    
    public void klikAjukan(ActionListener action){
        btnAjukan.addActionListener(action);
    }
    
    public void klikBeri(ActionListener action){
        btnBeri.addActionListener(action);
    }
    
    public void klikProfil(ActionListener action){
        btnProfil.addActionListener(action);
    }
    
    public void klikSimpan(ActionListener action){
        btnSimpan.addActionListener(action);
    }
    
    public void klikLaporan(ActionListener action){
        btnLapor.addActionListener(action);
    }
    
    public String getFilename() {
        return filename;
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
        btnBeri = new javax.swing.JButton();
        btnAjukan = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnProfil = new javax.swing.JButton();
        btnLapor = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jenisUsaha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        thnDiri = new javax.swing.JComboBox<>();
        btnSimpan = new javax.swing.JButton();
        lbl = new javax.swing.JTextField();
        up = new javax.swing.JButton();
        usaha = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(119, 173, 209));

        btnBeri.setBackground(new java.awt.Color(119, 173, 209));
        btnBeri.setFont(new java.awt.Font("Microsoft YaHei", 1, 11)); // NOI18N
        btnBeri.setForeground(new java.awt.Color(255, 255, 255));
        btnBeri.setText("Beri Pinjaman       >");
        btnBeri.setToolTipText("");
        btnBeri.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(133, 193, 233), 2, true));
        btnBeri.setContentAreaFilled(false);
        btnBeri.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBeri.setOpaque(true);
        btnBeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeriActionPerformed(evt);
            }
        });

        btnAjukan.setBackground(new java.awt.Color(119, 173, 209));
        btnAjukan.setFont(new java.awt.Font("Microsoft YaHei", 1, 11)); // NOI18N
        btnAjukan.setForeground(new java.awt.Color(255, 255, 255));
        btnAjukan.setText("Ajukan Pinjaman  >");
        btnAjukan.setToolTipText("");
        btnAjukan.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(133, 193, 233), 2, true));
        btnAjukan.setContentAreaFilled(false);
        btnAjukan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAjukan.setOpaque(true);
        btnAjukan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjukanActionPerformed(evt);
            }
        });

        btnHome.setBackground(new java.awt.Color(133, 193, 233));
        btnHome.setFont(new java.awt.Font("Microsoft YaHei", 1, 11)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setText("Dasboard                >");
        btnHome.setToolTipText("");
        btnHome.setActionCommand("Home                    >");
        btnHome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(133, 193, 233), 2, true));
        btnHome.setContentAreaFilled(false);
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
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

        btnLapor.setBackground(new java.awt.Color(119, 173, 209));
        btnLapor.setFont(new java.awt.Font("Microsoft YaHei", 1, 11)); // NOI18N
        btnLapor.setForeground(new java.awt.Color(255, 255, 255));
        btnLapor.setText("Laporan                >");
        btnLapor.setToolTipText("");
        btnLapor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(133, 193, 233), 2, true));
        btnLapor.setContentAreaFilled(false);
        btnLapor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLapor.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnLapor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBeri, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(btnAjukan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btnProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAjukan, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBeri, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLapor, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Data UKM");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 21, -1, -1));

        jLabel11.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel11.setText("Nama Usaha");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 76, -1, -1));

        jenisUsaha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenisUsahaActionPerformed(evt);
            }
        });
        getContentPane().add(jenisUsaha, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 260, 30));

        jLabel4.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel4.setText("Jenis Usaha");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        thnDiri.setEditable(true);
        thnDiri.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));
        thnDiri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thnDiriActionPerformed(evt);
            }
        });
        getContentPane().add(thnDiri, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 70, 30));

        btnSimpan.setBackground(new java.awt.Color(102, 102, 255));
        btnSimpan.setFont(new java.awt.Font("Roboto Light", 1, 13)); // NOI18N
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setText("Simpan Perubahan");
        btnSimpan.setContentAreaFilled(false);
        btnSimpan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSimpan.setOpaque(true);
        getContentPane().add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 260, 30));
        getContentPane().add(lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 150, 30));

        up.setBackground(new java.awt.Color(102, 102, 255));
        up.setFont(new java.awt.Font("Roboto Light", 1, 13)); // NOI18N
        up.setForeground(new java.awt.Color(255, 255, 255));
        up.setText("Unggah file");
        up.setContentAreaFilled(false);
        up.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        up.setOpaque(true);
        up.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                upMouseClicked(evt);
            }
        });
        up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upActionPerformed(evt);
            }
        });
        getContentPane().add(up, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 110, 30));

        usaha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usahaActionPerformed(evt);
            }
        });
        getContentPane().add(usaha, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 97, 250, 30));

        jLabel6.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel6.setText("Tahun Berdiri");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 137, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel7.setText("Proposal Usaha & Riwayat Keuangan 3 Bulan Terakhir");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/bis.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBeriActionPerformed

    private void btnAjukanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjukanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAjukanActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed

    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnProfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProfilActionPerformed

    private void jenisUsahaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenisUsahaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jenisUsahaActionPerformed

    private void thnDiriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thnDiriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_thnDiriActionPerformed

    private void upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upActionPerformed

    private void usahaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usahaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usahaActionPerformed

    private void upMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upMouseClicked
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("pdf", "pdf");
        chooser.setDialogTitle("Pilih file laporan pertanggung jawaban dana (PDF)");
        chooser.setFileFilter(filter);
        chooser.showOpenDialog(null);
        File select = chooser.getSelectedFile();
        filename = select.getAbsolutePath();
        try{
            lbl.setText(filename);
            System.out.println(filename);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_upMouseClicked

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
            java.util.logging.Logger.getLogger(profillanjutan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(profillanjutan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(profillanjutan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(profillanjutan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new profillanjutan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjukan;
    private javax.swing.JButton btnBeri;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLapor;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnProfil;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jenisUsaha;
    private javax.swing.JTextField lbl;
    private javax.swing.JComboBox<String> thnDiri;
    private javax.swing.JButton up;
    private javax.swing.JTextField usaha;
    // End of variables declaration//GEN-END:variables

    public JTextField getJenisUsaha() {
        return jenisUsaha;
    }

    public JTextField getKeuangan() {
        return lbl;
    }

    public JComboBox<String> getThnDiri() {
        return thnDiri;
    }

    public JTextField getUsaha() {
        return usaha;
    }

}
