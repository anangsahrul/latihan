package com.example.anangdae.latihan.pojo;

import android.graphics.Bitmap;

import java.util.Date;


public class Hotel {
    public Bitmap getGambar_hotel() {
        return gambar_hotel;
    }

    public String getPromo_terbatas() {
        return promo_terbatas;
    }

    public long getHarga() {
        return harga;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public String getWaktu_nginap() {
        return waktu_nginap;
    }

    public void setGambar_hotel(Bitmap gambar_hotel) {
        this.gambar_hotel = gambar_hotel;
    }

    public void setPromo_terbatas(String promo_terbatas) {
        this.promo_terbatas = promo_terbatas;
    }

    public void setHarga(long harga) {
        this.harga = harga;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public void setWaktu_nginap(String waktu_nginap) {
        this.waktu_nginap = waktu_nginap;
    }
    public String getNama_hotel() {
        return nama_hotel;
    }

    public void setNama_hotel(String nama_hotel) {
        this.nama_hotel = nama_hotel;
    }

    private Bitmap gambar_hotel;
    private String promo_terbatas;
    private long harga;
    private Date tanggal;
    private String waktu_nginap;
    private String nama_hotel;



}
