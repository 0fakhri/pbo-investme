package model;

import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class laporan {
    private static String id, jnsPengeluaran, uraian, foto;
    
    dbconnect koneksi = new dbconnect();
    boolean queryResult;
  
    public boolean addUkm(String jnsPengeluaran, String uraian, String foto){
        boolean hasil = true;
        System.out.println("add user terpanggil");
        koneksi.connect();
        try {
            System.out.println("masuk");
            Statement stmt = koneksi.con.createStatement();
            queryResult = stmt.executeUpdate(String.format(
                    "insert into dataukm (jenisPengeluaran, uraian, foto, idPengguna, idPengajuan, idBantuan) values('%s', '%s', '%s', '%s', '%s', '%s')", 
                    jnsPengeluaran, uraian, foto, dataAkun.getId(), pengajuan.getId(), bantuan.getId())) > 0;
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
            hasil = false;
        }
        return hasil;
    }

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        laporan.id = id;
    }
 
    public static String getJnsPengeluaran() {
        return jnsPengeluaran;
    }

    public static void setJnsPengeluaran(String jnsPengeluaran) {
        laporan.jnsPengeluaran = jnsPengeluaran;
    }

    public static String getUraian() {
        return uraian;
    }

    public static void setUraian(String uraian) {
        laporan.uraian = uraian;
    }

    public static String getFoto() {
        return foto;
    }

    public static void setFoto(String foto) {
        laporan.foto = foto;
    }
    
}
