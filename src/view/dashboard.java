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
public class dashboard extends javax.swing.JFrame {

    /**
     * Creates new form dashboard
     */
    public dashboard() {
        initComponents();
    }
    
    public void klikLogout(ActionListener action){
        btnLogout.addActionListener(action);
    }
    
    public void klikProfil(ActionListener action){
        btnProfil.addActionListener(action);
    }
    
    public void klikAjukan(ActionListener action){
        btnAjukan.addActionListener(action);
    }
    
    public void klikBeri(ActionListener action){
        btnBeri.addActionListener(action);
    }
    
    public void klikLaporan(ActionListener action){
        btnLapPenyumbang.addActionListener(action);
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
        jPanel2 = new javax.swing.JPanel();
        btnAjukan = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnProfil = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        btnLapPeminjam = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnBeri = new javax.swing.JButton();
        btnLogout1 = new javax.swing.JButton();
        btnProfil1 = new javax.swing.JButton();
        btnHome1 = new javax.swing.JButton();
        btnLapPenyumbang = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Beranda");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jPanel2.setBackground(new java.awt.Color(119, 173, 209));

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

        btnHome.setBackground(new java.awt.Color(133, 193, 233));
        btnHome.setFont(new java.awt.Font("Microsoft YaHei", 1, 11)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setText("Beranda                 >");
        btnHome.setToolTipText("");
        btnHome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(133, 193, 233), 2, true));
        btnHome.setContentAreaFilled(false);
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome.setOpaque(true);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnLapPeminjam.setBackground(new java.awt.Color(119, 173, 209));
        btnLapPeminjam.setFont(new java.awt.Font("Microsoft YaHei", 1, 11)); // NOI18N
        btnLapPeminjam.setForeground(new java.awt.Color(255, 255, 255));
        btnLapPeminjam.setText("Laporan                >");
        btnLapPeminjam.setToolTipText("");
        btnLapPeminjam.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(133, 193, 233), 2, true));
        btnLapPeminjam.setContentAreaFilled(false);
        btnLapPeminjam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLapPeminjam.setOpaque(true);

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
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnAjukan, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnLapPeminjam, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(btnLapPeminjam, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 540));

        jPanel3.setBackground(new java.awt.Color(119, 173, 209));

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

        btnLogout1.setBackground(new java.awt.Color(255, 51, 51));
        btnLogout1.setFont(new java.awt.Font("Microsoft YaHei", 1, 11)); // NOI18N
        btnLogout1.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout1.setText("Keluar");
        btnLogout1.setToolTipText("");
        btnLogout1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(251, 175, 100), 3, true));
        btnLogout1.setBorderPainted(false);
        btnLogout1.setContentAreaFilled(false);
        btnLogout1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout1.setOpaque(true);
        btnLogout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout1ActionPerformed(evt);
            }
        });

        btnProfil1.setBackground(new java.awt.Color(133, 193, 233));
        btnProfil1.setFont(new java.awt.Font("Microsoft YaHei", 1, 11)); // NOI18N
        btnProfil1.setForeground(new java.awt.Color(255, 255, 255));
        btnProfil1.setText("Profil");
        btnProfil1.setToolTipText("");
        btnProfil1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(251, 175, 100), 3, true));
        btnProfil1.setBorderPainted(false);
        btnProfil1.setContentAreaFilled(false);
        btnProfil1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProfil1.setOpaque(true);
        btnProfil1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfil1ActionPerformed(evt);
            }
        });

        btnHome1.setBackground(new java.awt.Color(133, 193, 233));
        btnHome1.setFont(new java.awt.Font("Microsoft YaHei", 1, 11)); // NOI18N
        btnHome1.setForeground(new java.awt.Color(255, 255, 255));
        btnHome1.setText("Beranda                 >");
        btnHome1.setToolTipText("");
        btnHome1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(133, 193, 233), 2, true));
        btnHome1.setContentAreaFilled(false);
        btnHome1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome1.setOpaque(true);
        btnHome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHome1ActionPerformed(evt);
            }
        });

        btnLapPenyumbang.setBackground(new java.awt.Color(119, 173, 209));
        btnLapPenyumbang.setFont(new java.awt.Font("Microsoft YaHei", 1, 11)); // NOI18N
        btnLapPenyumbang.setForeground(new java.awt.Color(255, 255, 255));
        btnLapPenyumbang.setText("Laporan                >");
        btnLapPenyumbang.setToolTipText("");
        btnLapPenyumbang.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(133, 193, 233), 2, true));
        btnLapPenyumbang.setContentAreaFilled(false);
        btnLapPenyumbang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLapPenyumbang.setOpaque(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnProfil1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnHome1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnLapPenyumbang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBeri, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btnProfil1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(btnHome1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBeri, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLapPenyumbang, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(btnLogout1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel3.setText("Top Up Saldo Anda");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel4.setText("Uang dapat dicarikan");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel5.setText("Keuntungan investasi");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Rp. 175.000.-");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 150, 30));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("Rp. 100.000.-");
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 150, 30));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setText("Rp. 75.000.-");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 150, 30));

        jButton2.setBackground(new java.awt.Color(102, 102, 255));
        jButton2.setFont(new java.awt.Font("Roboto Light", 1, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cairkan");
        jButton2.setContentAreaFilled(false);
        jButton2.setOpaque(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 90, 30));

        jLabel7.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel7.setText("Total Uang");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, -1));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"PT. Aman", "Rp. 10.000.000,-", "Rp.50.000.-", "Sedang Berlangsung"},
                {"UD. Sentosa", "Rp. 1.000.000,-", "Rp. 1.000.000.-", "Sudah Berakhir"},
                {"PT. Uwu", "Rp. 3.000.000,-", "Rp. 69.000,-", "Dibatalkan"}
            },
            new String [] {
                "Nama Usaha", "Total Pinjaman", "Pinjaman Terkumpul", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setToolTipText("");
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, -1, 80));

        jLabel6.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel6.setText("Pengumpulan modal pinjaman sedang berlangsung");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel8.setText("Informasi Saldo Anda");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        jLabel9.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel9.setText("Nomer Transfer");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        jLabel10.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel10.setText("Atas Nama");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        jTextField4.setBackground(new java.awt.Color(204, 204, 204));
        jTextField4.setText("1780050034700");
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 150, 30));

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(204, 204, 204));
        jTextField5.setText("Budi Santoso");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 150, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/bis.jpg"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAjukanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjukanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAjukanActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed

    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnProfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProfilActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHomeActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void btnBeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBeriActionPerformed

    private void btnLogout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogout1ActionPerformed

    private void btnProfil1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfil1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProfil1ActionPerformed

    private void btnHome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome1ActionPerformed

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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjukan;
    private javax.swing.JButton btnBeri;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnHome1;
    private javax.swing.JButton btnLapPeminjam;
    private javax.swing.JButton btnLapPenyumbang;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnLogout1;
    private javax.swing.JButton btnProfil;
    private javax.swing.JButton btnProfil1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
