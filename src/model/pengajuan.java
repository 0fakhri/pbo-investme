
package model;

import com.mysql.cj.jdbc.Blob;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.Statement;

public class pengajuan {
    private static String id, jmlhPinjam, wktPelunasan, wktCicilan, jaminan, buktiKepemilikan, alasanPeminjaman, status, pembuat, idSementara, jmlh, idCek;

    public static String getIdCek() {
        return idCek;
    }

    public static void setIdCek(String idCek) {
        pengajuan.idCek = idCek;
    }
    dbconnect koneksi = new dbconnect();
    boolean queryResult; 
    
    public void jmlh(){
        koneksi.connect();
        try {
            Statement stmt = koneksi.con.createStatement();
            ResultSet rs = stmt.executeQuery(String.format(
                    "SELECT count(*) FROM dataPengajuan"));
            while (rs.next()) {                
                setJmlh(rs.getString("count(*)"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void pengajuanDB(String id){
        koneksi.connect();
        try {
//            System.out.println("masuk ajuan");
            Statement stmt = koneksi.con.createStatement();
            ResultSet rs = stmt.executeQuery(String.format(
                    "SELECT * FROM dataPengajuan where idPengguna='%s'", dataAkun.getId()));
            while (rs.next()) {
//                System.out.println("while");
                setId(rs.getString(1));
                setJmlhPinjam(rs.getString(2));
                setWktPelunasan(rs.getString(3));
                setWktCicilan(rs.getString(4));
                setJaminan(rs.getString(5));
                setBuktiKepemilikan(rs.getString(6));
                setPembuat(rs.getString(7));
                setAlasanPeminjaman(rs.getString(8));
                setStatus(rs.getString(9));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public boolean addPengajuan(String jmlhPinjam, String  wktPelunasan, String  wktCicilan, String  jaminan, String filename, String alasanPeminjaman) throws FileNotFoundException{
        koneksi.connect();
        try {
            System.out.println(filename);
            System.out.println(dataAkun.getId());
            System.out.println(pengajuan.getId());
            String sql = "insert into dataPengajuan (jumlahPinjaman, waktuPelunasan, waktuCicilan, jaminan, buktiKepemilikan, alasanPeminjaman, idPengguna) VALUES (?, ?, ?, ?, ?, ?, ?)";
               PreparedStatement ps = koneksi.con.prepareStatement(sql);
               InputStream is = new FileInputStream(new File(filename));
               ps.setBlob(5, is);
               ps.setString(1, jmlhPinjam);
               ps.setString(2, wktPelunasan);
               ps.setString(3, wktCicilan);
               ps.setString(4, jaminan);
               ps.setString(6, alasanPeminjaman);
               ps.setString(7, dataAkun.getId());
               ps.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
            queryResult = false;
        }
        pengajuanDB(dataAkun.getId());
        return queryResult;
    }
    
    public void pengajuanAd(String id){
        koneksi.connect();
//        System.out.println("idnec"+dataAkun.getId());
        try {
//            System.out.println(" ukmdb");
            Statement stmt = koneksi.con.createStatement();
            ResultSet rs = stmt.executeQuery(String.format(
                    "SELECT dp.idPengajuan, du.idUkm, du.namaUsaha, du.tahunBerdiri, du.jenisUsaha,dp.jumlahPinjaman, dp.waktuPelunasan, dp.waktuCicilan, dp.jaminan, dp.idPengguna, dp.alasanPeminjaman, dp.statusVerif FROM datapengajuan AS dp JOIN dataukm as du ON dp.idPengguna=du.idPengguna where idPengajuan='%s'", getIdCek()));
//            System.out.println("ukkk");
            
            while (rs.next()) {
                System.out.println("while");
                ukm.setNamaUsaha(rs.getString("du.namaUsaha"));
                ukm.setJnsUsaha(rs.getString("du.jenisUsaha"));
                ukm.setThnBerdiri(rs.getString("du.tahunBerdiri"));
                setId(rs.getString("dp.idPengajuan"));
                setJmlhPinjam(rs.getString("dp.jumlahPinjaman"));
                setWktPelunasan(rs.getString("dp.waktuPelunasan"));
                setWktCicilan(rs.getString("dp.waktuCicilan"));
                setJaminan(rs.getString("dp.jaminan"));
                setAlasanPeminjaman("dp.alasanPeminjaman");
                setStatus(rs.getString("dp.statusVerif"));
//                System.out.println("model"+getNamaUsaha());
            }
        } catch (SQLException e) {
//            System.out.println("hmm");
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void tampilBukti(String id) throws FileNotFoundException{
        koneksi.connect();
//        System.out.println("idnec"+dataAkun.getId());
        try {
//            System.out.println(" ukmdb");
            Statement stmt = koneksi.con.createStatement();
            ResultSet rs = stmt.executeQuery(String.format(
                    "SELECT buktiKepemilikan FROM dataPengajuan where idPengajuan='%s'", getIdCek()));
//            System.out.println("ukkk");
            while (rs.next()) {
//                setIdPengajuan(rs.getString("idPengajuan"));
                String filename = "Bukti kepemilikan "+ukm.getNamaUsaha()+".pdf";
                Blob blob = (Blob) rs.getBlob("buktiKepemilikan");
                InputStream is = blob.getBinaryStream();
                FileOutputStream fos = new FileOutputStream("C:\\Users\\user\\Downloads"+ "\\" + filename);
                int b = 0;
                while ((b = is.read()) != -1){
                    fos.write(b); 
                }
            }
        } 
        catch (IOException e){
            e.getMessage (); e.printStackTrace(); 
            System.out.println(e); 
        } 
        catch (SQLException e){
            e.getMessage (); e.printStackTrace(); 
            System.out.println(e); 
            }
    }
    
    public boolean verif(String Status, String id){
        koneksi.connect();
        try {
            System.out.println("masuk ubah");
            Statement stmt = koneksi.con.createStatement();
            queryResult = stmt.executeUpdate(String.format(
                    "UPDATE dataPengajuan SET statusVerif='%s' WHERE dataPengajuan.idPengajuan='%s'", 
                    Status, id)) > 0;
            setStatus(Status);
            System.out.println(queryResult);
        } catch (SQLException e) {
            System.out.println("catch");
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
            queryResult = false;
        }
        pengajuanDB(pengajuan.getId());
        return queryResult;
    }
    
//    boolean hasil = true;
//        System.out.println("add user terpanggil");
//        koneksi.connect();
//        try {
////            System.out.println("masuk");
//            Statement stmt = koneksi.con.createStatement();
//            queryResult = stmt.executeUpdate(String.format(
//                    "insert into dataPengajuan (jumlahPinjaman, waktuPelunasan, waktuCicilan, jaminan, buktiKepemilikan, alasanPeminjaman, idPengguna) values('%s', '%s', '%s', '%s', '%s', '%s', %s)", 
//                    jmlhPinjam, wktPelunasan, wktCicilan, jaminan, buktiKepemilikan, alasanPeminjaman, dataAkun.getId())) > 0;
//        } catch (SQLException e) {
//            System.out.println(e);
//            JOptionPane.showMessageDialog(null, e);
//            hasil = false;
//        }
//        pengajuanDB(dataAkun.getId());
//        return hasil;
    
//    public void pengajuanAd(String id){
//        koneksi.connect();
////        System.out.println("idnec"+dataAkun.getId());
//        try {
////            System.out.println(" ukmdb");
//            Statement stmt = koneksi.con.createStatement();
//            ResultSet rs = stmt.executeQuery(String.format(
//                    "SELECT `idUkm`, `namaUsaha`, `tahunBerdiri`, `jenisUsaha`, `idPengguna`, `statusVerif` FROM `dataUkm` where idUkm='%s'", getIdCek()));
////            System.out.println("ukkk");
//            
//            while (rs.next()) {
//                System.out.println("while");
//                setId(rs.getString("idUkm"));
//                setNamaUsaha(rs.getString("namaUsaha"));
//                setThnBerdiri(rs.getString("tahunBerdiri"));
//                setJnsUsaha(rs.getString("jenisUsaha"));
////                setKeuangan(rs.getString(5));
//                setIdPengguna(rs.getString("idPengguna"));
//                setStatus(rs.getString("statusVerif"));
////                System.out.println("model"+getNamaUsaha());
//            }
//        } catch (SQLException e) {
////            System.out.println("hmm");
//            JOptionPane.showMessageDialog(null, e);
//        }
//    }

    public static String getPembuat() {
        return pembuat;
    }

    public static void setPembuat(String pembuat) {
        pengajuan.pembuat = pembuat;
    }

    public static String getStatus() {
        return status;
    }

    public static void setStatus(String status) {
        pengajuan.status = status;
    }

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        pengajuan.id = id;
    }

    public static String getJmlhPinjam() {
        return jmlhPinjam;
    }

    public static void setJmlhPinjam(String jmlhPinjam) {
        pengajuan.jmlhPinjam = jmlhPinjam;
    }

    public static String getWktPelunasan() {
        return wktPelunasan;
    }

    public static void setWktPelunasan(String wktPelunasan) {
        pengajuan.wktPelunasan = wktPelunasan;
    }

    public static String getWktCicilan() {
        return wktCicilan;
    }

    public static void setWktCicilan(String wktCicilan) {
        pengajuan.wktCicilan = wktCicilan;
    }

    public static String getJaminan() {
        return jaminan;
    }

    public static void setJaminan(String jaminan) {
        pengajuan.jaminan = jaminan;
    }

    public static String getBuktiKepemilikan() {
        return buktiKepemilikan;
    }

    public static void setBuktiKepemilikan(String buktiKepemilikan) {
        pengajuan.buktiKepemilikan = buktiKepemilikan;
    }

    public static String getAlasanPeminjaman() {
        return alasanPeminjaman;
    }

    public static void setAlasanPeminjaman(String alasanPeminjaman) {
        pengajuan.alasanPeminjaman = alasanPeminjaman;
    }

    public static String getIdSementara() {
        return idSementara;
    }

    public static void setIdSementara(String idSementara) {
        pengajuan.idSementara = idSementara;
    }
    
    public static String getJmlh() {
        return jmlh;
    }

    public static void setJmlh(String jmlh) {
        pengajuan.jmlh = jmlh;
    }
}
