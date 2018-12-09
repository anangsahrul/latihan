package com.example.anangdae.latihan.pojo;

import android.graphics.Bitmap;

import java.util.Date;

public class History {

    private String namaHotel;
    private String promoHotel;
    private long hargaHotel;
    private Date tanggalHotel;
    private String lamaInap;
    private Bitmap gambarkamar;

    public String getNamaHotel() {
        return namaHotel;
    }

    public void setNamaHotel(String namaHotel) {
        this.namaHotel = namaHotel;
    }

    public String getPromoHotel() {
        return promoHotel;
    }

    public void setPromoHotel(String promoHotel) {
        this.promoHotel = promoHotel;
    }

    public long getHargaHotel() {
        return hargaHotel;
    }

    public void setHargaHotel(long hargaHotel) {
        this.hargaHotel = hargaHotel;
    }

    public Date getTanggalHotel() {
        return tanggalHotel;
    }

    public void setTanggalHotel(Date tanggalHotel) {
        this.tanggalHotel = tanggalHotel;
    }

    public String getLamaInap() {
        return lamaInap;
    }

    public void setLamaInap(String lamaInap) {
        this.lamaInap = lamaInap;
    }

    public Bitmap getGambarkamar() {
        return gambarkamar;
    }

    public void setGambarkamar(Bitmap gambarkamar) {
        this.gambarkamar = gambarkamar;
    }
}
