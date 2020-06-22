package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.bantuan;
import model.dataAkun;
import model.dbconnect;
import model.pengajuan;
import model.ukm;
import view.aUkm;
import view.a_inves;
import view.a_pinjamanPB1;
import view.awal;
import view.dashboardAdmin;
import view.profilAdmin;


public class cProfilAdmin {
    profilAdmin view;
    
    dbconnect koneksi = new dbconnect();    
    
    public cProfilAdmin (profilAdmin view) {
        this.view = view;
        this.view.setVisible(true);
        this.view.klikLogout(new tmblLogout());
        this.view.klikPinjam(new tmblPinjam());
        this.view.klikInves(new tmblInves());
        this.view.klikHome(new tmblHome());
        getData();
    }
    
    public void getData(){
        koneksi.connect();
        view.getUsername().setText(dataAkun.getUsername());
        view.getNama().setText(dataAkun.getNamauser());
        view.getPassw().setText(dataAkun.getPassword());
        view.getJnsKel().setSelectedItem(dataAkun.getJenisKelamin());
        view.getNoTelp().setText(dataAkun.getNoTelp());
        view.getEmail().setText(dataAkun.getEmail());
    } 
    
    private class tmblHome implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            controller.cDashboardAdmin home = new controller.cDashboardAdmin(new dashboardAdmin());
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
    
    private class tmblPinjam implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            controller.cPinjamPB a_pinjamanPB1 = new controller.cPinjamPB(new a_pinjamanPB1());
            view.setVisible(false);
        }
    }
    
    private class tmblInves implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            controller.cInves inves = new controller.cInves(new a_inves());
            view.setVisible(false);
        }
    }
    
                
//    coming soon kurang ini aja
//    private class tmblProfil implements ActionListener {
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            controller.cProfilAdmin pAdmin = new controller.cProfilAdmin(new profilAdmin());
//            view.setVisible(false);
//        }
//    }
}
