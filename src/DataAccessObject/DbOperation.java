/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccessObject;

import javax.swing.JOptionPane;
import java.sql.*;
import java.util.ArrayList;
import model.*;

/**
 *
 * @author SNSV
 */
public class DbOperation {
    public static void setDataOrDelete(String Query, String msg){
        try{
            Connection con = koneksi.getCon();
            Statement st = con.createStatement();
            st.executeUpdate(Query);
            if(!msg.equals(""))
                JOptionPane.showMessageDialog(null, msg);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e, "Pesan", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static ResultSet getData(String query){
        try{
            Connection con = koneksi.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            return rs;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e, "Pesan", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public ArrayList<Produk> lihatDaftarMenu()  {
            String query = "SELECT * FROM menu";
            ArrayList<Produk> listProduk = new ArrayList<>();
            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/restoran", "root", "");
                PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                try (ResultSet rs = preparedStatement.executeQuery()) {
                    while (rs.next()) {
                        String id_menu = rs.getString("id_menu");
                        String nama = rs.getString("nama");
                        String kategori = rs.getString("kategori");
                        String harga = rs.getString("harga");
                        
                        Produk produk = new Produk(id_menu, nama, kategori, harga);
                        listProduk.add(produk);
                    };
                }
                
                return listProduk;
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }
    
    public ArrayList<Transaksi> riwayatAdmin()  {
            String query = "SELECT transaksi.id_transaksi, pesan.id_menu, transaksi.nama FROM transaksi JOIN pesan ON transaksi.nama = pesan.nama;";
            ArrayList<Transaksi> riwayatAdmin = new ArrayList<>();
            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/restoran", "root", "");
                PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                try (ResultSet rs = preparedStatement.executeQuery()) {
                    while (rs.next()) {
                        String id_transaksi = rs.getString("id_transaksi");
                        String id_menu = rs.getString("id_menu");
                        String nama = rs.getString("nama");
                        
                        Transaksi trx = new Transaksi(id_transaksi, id_menu, nama);
                        riwayatAdmin.add(trx);
                    };
                }
                
                return riwayatAdmin;
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }
    
    public ArrayList<Transaksi> riwayatUser()  {
            String query = "SELECT * FROM pesan;";
            ArrayList<Transaksi> riwayatUser = new ArrayList<>();
            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/restoran", "root", "");
                PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                try (ResultSet rs = preparedStatement.executeQuery()) {
                    while (rs.next()) {
                        String id_pesan = rs.getString("id_pesan");
                        String id_menu = rs.getString("id_menu");
                        String nama = rs.getString("nama");
                        int harga = rs.getInt("harga");
                        int JumlahPesanan = rs.getInt("JumlahPesanan");
                        String TotalHarga = rs.getString("TotalHarga");
                        
                        Transaksi trx = new Transaksi(id_pesan, id_menu, nama, harga, JumlahPesanan, TotalHarga);
                        riwayatUser.add(trx);
                    };
                }
                
                return riwayatUser;
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }

}
