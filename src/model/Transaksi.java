/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author kurohana
 */
public class Transaksi {
    public String id_transaksi, id_menu, nama;
    public String id_pesan, TotalHarga;
    public int harga, JumlahPesanan;
    
    public Transaksi(String id_transaksi, String id_menu, String nama){
        this.id_transaksi = id_transaksi;
        this.id_menu = id_menu;
        this.nama = nama;
    }
    
    public Transaksi(String id_pesan, String id_menu, String nama, int harga, int JumlahPesanan, String TotalHarga){
        this.id_pesan = id_pesan;
        this.id_menu = id_menu;
        this.nama = nama;
        this.harga = harga;
        this.JumlahPesanan = JumlahPesanan;
        this.TotalHarga = TotalHarga;
    }
}
