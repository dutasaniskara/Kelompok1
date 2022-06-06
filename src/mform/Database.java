/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mform;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import mform.entity.BadanHukum;
import mform.entity.Company;
import mform.entity.KIP;
import mform.form.CompanyForm;

/**
 *
 * @author duta
 */
public class Database implements Serializable{
    public static Database instance;
    
    private final String DB_TYPE = "mysql";
    private final String DB_HOST = "localhost";
    private final String DB_PORT = "3306";
    private final String DB_NAME = "dpp";
    private final String DB_USER = "root";
    private final String DB_PASS = "";
     
    private Database() {
        
    }
    
    public static synchronized Database getInstance() {
        if(instance == null) {
            instance = new Database();
        }
        return instance;
    }
    
    public void insertCompany(CompanyForm companyform, Company company, KIP kip, BadanHukum badanhukum) throws SQLException{
        Connection conn = getConnection();
        try{
            String sql="INSERT INTO perusahaan VALUES(?,?,?,?,?,?,?,?,?,?, ?,?,?,?,?,?,?,?,?,?, ?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, companyform.getNamaProv());
            pstmt.setString(2, companyform.getNamaKab());
            pstmt.setInt(3, companyform.getPeriodeData());
            pstmt.setInt(4, company.getNo());
            pstmt.setString(5, companyform.getKodeProv());
            pstmt.setString(6, companyform.getKodeKab());
            pstmt.setString(7, kip.getKodeKec());
            pstmt.setString(8, kip.getKodeKJU());
            pstmt.setInt(9, kip.getNoUrutKab());
            pstmt.setString(10, company.getNamaPerusahaan());    
            pstmt.setString(11, company.getAlamatPerusahaan());  
            pstmt.setString(12, company.getNoTelp());  
            pstmt.setString(13, company.getNoFax());  
            pstmt.setInt(14, badanhukum.getKode());  
            pstmt.setInt(15, company.isKonfirm());  
            pstmt.setInt(16, company.getStatus());  
            pstmt.setString(17, company.getTanamanPangan());  
            pstmt.setString(18, company.getHoltikultura());  
            pstmt.setString(19, company.getPerkebunan());    
            pstmt.setString(20, company.getPeternakan());  
            pstmt.setString(21, company.getKehutanan());  
            pstmt.setString(22, company.getPerikanan());  
            pstmt.setString(23, company.getInputUsahaUtama());     
            pstmt.executeUpdate(); 

        } catch(SQLException ex) {
            throw ex;
        } finally{
            if(conn!=null) {
                conn.close();
            }        
        }
    }
    
//    public List<Responden> getListResponden() throws SQLException{
//        List<Responden> rpdList = new ArrayList<>();
//        Connection conn = getConnection();
//        try{
//            String sql = "SELECT * FROM responden";
//            Statement stmt = conn.createStatement();
//            ResultSet rs = stmt.executeQuery(sql);
//            while(rs.next()) {
//                Responden rpd = new Responden();
//                rpd.setProvinsi(rs.getString("provinsi"));
//                rpd.setKabupaten_kota(rs.getString("kabupaten_kota"));
//                rpd.setKecamatan(rs.getString("kecamatan"));
//                rpd.setKelurahan_desa(rs.getString("kelurahan_desa"));
//                rpd.setNama_usaha(rs.getString("nama_usaha"));
//                rpd.setAlamat(rs.getString("alamat"));
//                rpd.setNama_penjawab(rs.getString("nama_penjawab"));
//                rpd.setJabatan(rs.getString("jabatan"));
//                rpd.setNomor_telepon(rs.getString("nomor_telepon"));
//                rpd.setEmail(rs.getString("email"));
//                rpdList.add(rpd);
//            }
//        }catch(SQLException ex) {
//            throw ex;
//        } finally {
//            if(conn!=null) {
//                conn.close();
//            }
//        }
//        
//        return rpdList;
//    }
    
    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:"+DB_TYPE+"://"+DB_HOST+":"+DB_PORT+
                "/"+DB_NAME,DB_USER,DB_PASS);
    }
}