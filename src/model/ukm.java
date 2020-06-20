/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author user
 */
public class ukm {
    private static String id, namaUsaha, thnBerdiri, jnsUsaha, keuangan, proposal, status;
    String sql;
    dbconnect koneksi = new dbconnect();
    boolean queryResult;
    
    public void ukmDB(String id){
        koneksi.connect();
        try {
            System.out.println(" ukmdb");
            Statement stmt = koneksi.con.createStatement();
            sql = "SELECT * FROM dataukm";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println("while");
                setId(rs.getString(1));
                setNamaUsaha(rs.getString(2));
                setThnBerdiri(rs.getString(3));
                setJnsUsaha(rs.getString(4));
                setKeuangan(rs.getString(5));
                setProposal(rs.getString(6));
                setStatus(rs.getString(8));
                System.out.println("model"+getNamaUsaha());
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
  
    public boolean addUkm(String namaUsaha, String thnBerdiri, String jnsUsaha, String keuangan, String proposal){
        boolean hasil = true;
        System.out.println("add user terpanggil");
        koneksi.connect();
        try {
            System.out.println("masuk");
            Statement stmt = koneksi.con.createStatement();
            queryResult = stmt.executeUpdate(String.format(
                    "insert into dataukm (namaUsaha, tahunBerdiri, jenisUsaha, riwayatKeuangan, proposalUsaha, idPengguna) values('%s', '%s', '%s', '%s', '%s', '%s')", 
                    namaUsaha, thnBerdiri, jnsUsaha, keuangan, proposal, dataAkun.getId())) > 0;
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
            hasil = false;
        }
        return hasil;
    }
    
    public boolean ubahUkm(String namaUsaha, String thnBerdiri, String jnsUsaha, String keuangan, String proposal){
        koneksi.connect();
        try {
            System.out.println("masuk ubah");
            Statement stmt = koneksi.con.createStatement();
            queryResult = stmt.executeUpdate(String.format(
                    "UPDATE `dataUkm` SET `namaUsaha`='%s',`tahunBerdiri`='%s',`jenisUsaha`='%s',`riwayatKeuangan`='%s',`proposalUsaha`='%s' WHERE idUkm='%s'", 
                    namaUsaha, thnBerdiri, jnsUsaha, keuangan, proposal, ukm.getId())) > 0;
            System.out.println(queryResult);
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
            queryResult = false;
        }
        ukmDB(ukm.getId());
        return queryResult;
    }

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        ukm.id = id;
    }

    public static String getNamaUsaha() {
        return namaUsaha;
    }

    public static void setNamaUsaha(String namaUsaha) {
        ukm.namaUsaha = namaUsaha;
    }

    public static String getThnBerdiri() {
        return thnBerdiri;
    }

    public static void setThnBerdiri(String thnBerdiri) {
        ukm.thnBerdiri = thnBerdiri;
    }

    public static String getJnsUsaha() {
        return jnsUsaha;
    }

    public static void setJnsUsaha(String jnsUsaha) {
        ukm.jnsUsaha = jnsUsaha;
    }

    public static String getKeuangan() {
        return keuangan;
    }

    public static void setKeuangan(String keuangan) {
        ukm.keuangan = keuangan;
    }

    public static String getProposal() {
        return proposal;
    }

    public static void setProposal(String proposal) {
        ukm.proposal = proposal;
    }

    public static String getStatus() {
        return status;
    }

    public static void setStatus(String status) {
        ukm.status = status;
    }
    
}
