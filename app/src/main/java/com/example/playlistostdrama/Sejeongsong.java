package com.example.playlistostdrama;

public class Sejeongsong {
    private String id;
    private String lagu;
    private String tahun;
    private String nama;
    private String penyanyi;
    private String aktor;
    private String lirik;
    private int gambar;

    public Sejeongsong(String id, String lagu, String tahun, String nama, String penyanyi, String aktor, String lirik, int gambar) {
        this.id = id;
        this.lagu = lagu;
        this.tahun = tahun;
        this.nama = nama;
        this.penyanyi = penyanyi;
        this.aktor = aktor;
        this.lirik = lirik;
        this.gambar = gambar;
    }

    public String getId() {
        return lagu;
    }

    public String getLagu() {
        return lagu;
    }

    public String getNama() {
        return nama;
    }

    public String getTahun() {
        return tahun;
    }

    public String getPenyanyi() {
        return penyanyi;
    }

    public String getAktor() {
        return aktor;
    }

    public String getLirik() {
        return lirik;
    }

    public int getGambar(){
        return gambar;
    }


}
