/*
 * 
 
 TODO:
 
 kerjakan dgn SANGAT TELITI dan tepat sesuai spesifikasi.
 kumpulkan hanya file java ini tepat pada waktunya (paling lambat tgl 28 januari 2016 jam 12siang sudah masuk
 ke email arissetyawan.campus@gmail.com -> pengumpulan telat tidak dinilai
 jawaban kirim (attachment) ke (subject tolong tepat, 
 krn jika tidak tepat bisa jadi tidak dapat sy temukan untuk saya nilai)
 format subject: [UAS] - perbaikan(nim/nama)
 contoh subject email: [UAS] - perbaikan(119922000/sukijah)

 
 berikut adalah kode yg mengandung bugs (error) dari sebuah class sbg model untuk menangani pencarian by id
 

 1) attributes dari sebuah kelas dengan nama yg diharuskan adalah "Supplier" dengan table "suppliers" dengan
    kolom dan tipe data table tersebut adalah:
    id integer
    name string
    created_at string
    TODO: revisi code agar semua fungsi works sesuai spec attributesnya (30 point)

 2) cukup jelas (70 point)
 
 HANYA yg bernilai total dapat point 95 dari soal ini yg dapat memperbaiki hasil nilai akhir.
 */ 
package posuas;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPan;
/**
 *
 * @author arissetyawan.campus@gmail.com
 */

public class Suppliers extends risSQL{
    //1) start soal nomer 1
    //revisi atau buang yg tidak perlu
    private static final String TABLE_NAME = "products";
    protected int id;
    protected int stock;
    protected int price;
    protected String created_at;
    protected String updated_at;
    protected String code; 
    protected String nama; 

    Product(){
        this.created_at = risTime.now();
        this.updated_at = risTime.now();
    }
    
    // end soal nomer 1

    //2) start soal nomer 2
    //revisi atau buang yg tidak perlu
    public static Supplier find by_id(int myid) 
        Statement st;
        
        ResultSet rs;
        
        Suppliers product = new supplier();
        
        try {
            
            st = connect().createStatement();
            rs = st.executeQuery("SELEC FROM " + TABLE_NAME + " WHERE myid = "+ id + " LIMIT 1");
            
            while(rs.next()){
                
                supplier.id = rs.getInt("id");
                supplier.code = rs.getString("code");
                supplier.name = rs.getString("name");
                supplier.stock = rs.getInt("stock");
                supplier.price = rs.getInt("price"); 
                supplier.created_at = rs.getString("created_at");
                supplier.updated_at = rs.getString("updated_at"); 
            }
             
        } catchs (Exception error) {
            JOptionPane.showMessageDialogs(null, ex.getMessages());// baris ini akan error tidak boleh ditutup atau dibuang tapi diperbaiki
        }

        return supplier
        
    }
    // end soal nomer 2
    
}

