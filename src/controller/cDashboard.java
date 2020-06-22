/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.bantuan;
import model.dataAkun;
import model.lapora;
import model.pengajuan;
import model.ukm;
import view.awal;
import view.dashboard;
import view.profil;
import view.ajukan;
import view.ajukanlama;
import view.beriP;
import view.lapTampil;
import view.laporan;
import javax.swing.table.DefaultTableModel;
import model.dbconnect;

public class cDashboard {
    dashboard view;
//    ukm ukmModel = new ukm();
//    pengajuan ajuanModel = new pengajuan();
    dbconnect koneksi = new dbconnect();
    private final DefaultTableModel model;
    
    public cDashboard(dashboard view){
        this.view = view;
        this.view.setVisible(true);
        this.view.klikLogout(new tmblLogout());
        this.view.klikProfil(new tmblProfil());
        this.view.klikAjukan(new tmblAjukan());
        this.view.klikBeri(new tmblBeri());
        this.view.klikLaporan(new tmblLaporan());
        view.getNama().setText(dataAkun.getNamaRek());
        view.getJmlh().setText(pengajuan.getJmlhPinjam());
        view.getNorek().setText(dataAkun.getNoRek());
        view.getTerkumpul().setText(String.valueOf(bantuan.getJmlhUang()));
//        ukmModel.ukmDB(dataAkun.getId());
//        ajuanModel.pengajuanDB(dataAkun.getId());
        System.out.println(dataAkun.getId());
        System.out.println(pengajuan.getPembuat());
        
        model = new DefaultTableModel ();
        view.getPengajuan().setModel(model);
        model.addColumn("ID");
        model.addColumn("Nama Usaha");
        model.addColumn("Jenis Usaha");
        model.addColumn("Jumlah Pengajuan Pinjaman (Rp)");
        model.addColumn("Status");
        getData();
    }
    
    public void getData(){
        koneksi.connect();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        try{
            Statement stmt = koneksi.con.createStatement();
            String sql     = "Select * from datapengajuan as p join dataukm as du on p.idPengguna=du.idPengguna";
            ResultSet rs   = stmt.executeQuery(sql);
            while(rs.next ()){
                ukm.setThnBerdiri(rs.getString("tahunBerdiri"));
                ukm.setNamaUsaha(rs.getString("namaUsaha"));
                Object[ ] obj = new Object[5];
                obj[0] = rs.getString("idPengajuan");
                obj[1] = rs.getString("namaUsaha");
                obj[2] = rs.getString("jenisUsaha");
                obj[3] = rs.getString("jumlahPinjaman");
                obj[4] = rs.getString("statusVerif");
                pengajuan.setPembuat(rs.getString("idPengguna"));
                pengajuan.setStatus(rs.getString("statusVerif"));
//                System.out.println(pengajuan.getStatus());
                if (pengajuan.getStatus().equals("Terverifikasi")) {
                    if (!pengajuan.getPembuat().equals(dataAkun.getId())) {
                        model.addRow(obj);
                    }
                } else {
                    System.out.println("Tidak ada");
                }
                
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage() );
        }
    } 

    
    private class tmblLaporan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (lapora.getIdPengajuan() == null) {
//                controller.cLaporan laporan = new controller.cLaporan(new laporan());
                    controller.cLaporan laporan = new controller.cLaporan(new laporan());
                view.setVisible(false);
            } else {
                controller.cLapTampil tampil = new controller.cLapTampil(new lapTampil());
                view.setVisible(false);
            }
            
        }
    }
    
    private class tmblProfil implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            controller.cProfil profil = new controller.cProfil(new profil());
            view.setVisible(false);
        }
    }        
    
    private class tmblAjukan implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            if (pengajuan.getPembuat()==null) {
                controller.cAjukan ajukan = new controller.cAjukan(new ajukan());
                view.setVisible(false);
//                System.out.println("masok pak");
            } else {
                controller.cAjuLama ajukanlama = new controller.cAjuLama(new ajukanlama());
                view.setVisible(false);
//                System.out.println("masok else ");
            }
        }
    }
    
    private class tmblBeri implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            controller.cBeri beri = new controller.cBeri(new beriP());
            view.setVisible(false);
        }
    }

    private class tmblLogout implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            controller.cAwal awal = new controller.cAwal(new awal());
            view.setVisible(false);
        }
    }

    
}
