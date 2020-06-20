package model;

import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class bantuan {
    private static String id, jmlhUang;
    
    dbconnect koneksi = new dbconnect();
    boolean queryResult;
  
    public boolean addUkm(String jmlhUang){
        boolean hasil = true;
        System.out.println("add user terpanggil");
        koneksi.connect();
        try {
            System.out.println("masuk");
            Statement stmt = koneksi.con.createStatement();
            queryResult = stmt.executeUpdate(String.format(
                    "insert into dataukm (jumlahUang, idPengguna, idPengajuan) values('%s', '%s', '%s')", 
                    jmlhUang, dataAkun.getId(), pengajuan.getId())) > 0;
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
        bantuan.id = id;
    }

    public static String getJmlhUang() {
        return jmlhUang;
    }

    public static void setJmlhUang(String jmlhUang) {
        bantuan.jmlhUang = jmlhUang;
    }
    
}
