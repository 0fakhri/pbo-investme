/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.dataAkun;
import model.ukm;
import view.aUkm;
import view.a_inves;
import view.a_pinjamanPB1;
import view.awal;
import view.dashboardAdmin;

/**
 *
 * @author user
 */
public class cAUkm {
    aUkm view;
    ukm ukm = new ukm();
    
    public cAUkm (aUkm view) {
        this.view = view;
        this.view.setVisible(true);
        this.view.klikLogout(new tmblLogout());
        this.view.klikPinjam(new tmblPinjam());
        this.view.klikInves(new tmblInves());
        this.view.klikHome(new tmblHome());
        this.view.klikSimpan(new tmblSimpan());
        this.view.klikTampil(new tmblTampil());
        tampilData();
    }
    
    public void tampilData(){
        System.out.println("");
        view.getUsaha().setText(ukm.getNamaUsaha());
        view.getThn().setText(ukm.getThnBerdiri());
        view.getProposal().setText(ukm.getProposal());
        view.getJnsUsaha().setText(ukm.getJnsUsaha());
        view.getStatus().setSelectedItem(ukm.getStatus());
    }
    
    private class tmblTampil implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("dw");
            try {
                System.out.println("dsw");
                ukm.tampilProposalAd(dataAkun.getId());
            } catch (FileNotFoundException ex) {
                Logger.getLogger(cLapTampil.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
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
    
    private class tmblSimpan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            ukm.verif((String) view.getStatus().getSelectedItem());
            JOptionPane.showMessageDialog(null,"Berhasil verifikasi");
            controller.cAUkm ukm = new controller.cAUkm(new aUkm());
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
}
