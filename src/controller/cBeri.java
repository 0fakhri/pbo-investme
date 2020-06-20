/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.dataAkun;
import model.pengajuan;
import view.ajukan;
import view.ajukanlama;
import view.awal;
import view.beriP;
import view.beriPrincian;
import view.dashboard;
import view.profil;

/**
 *
 * @author user
 */
public class cBeri{
    beriP view;
    public cBeri(beriP view){
        this.view = view;
        this.view.setVisible(true);
        this.view.klikLogout(new tmblLogout());
        this.view.klikDashboard(new tmblDashboard());
        this.view.klikProfil(new tmblProfil());
        this.view.klikAjukan(new tmblAjukan());
        this.view.klikBantu(new tmblBantuRinci());
    }

    private  class tmblBantuRinci implements ActionListener {

        public tmblBantuRinci() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            controller.cBeriRinci beri = new controller.cBeriRinci(new beriPrincian());
            view.setVisible(false);
        }
    }
    
    private class tmblDashboard implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            controller.cDashboard dashboard = new controller.cDashboard(new dashboard());
            view.setVisible(false);
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
            if (pengajuan.getPembuat().equals(dataAkun.getId())) {
                controller.cAjuLama ajukanlama = new controller.cAjuLama(new ajukanlama());
                view.setVisible(false);
            } else {
                controller.cAjukan ajukan = new controller.cAjukan(new ajukan());
                view.setVisible(false);
            }
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
