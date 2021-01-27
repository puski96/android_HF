package com.example.pizzasfeladat;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Pizza implements Serializable {
    private String nev;
    private String leiras;
    private Integer ar;
    private int image;
    private String gomba;
    private String kolbasz;
    private String sonka;
    private int gombaAr;
    private int sonkaAr;
    private int kolbaszAr;
    private String kicsi;
    private String kozepes;
    private String nagy;
    private int kicsiAr;
    private int kozepesAr;
    private int nagyAr;


    public Pizza(String nev, String leiras, Integer ar, int image, String gomba, String kolbasz, String sonka, int gombaAr, int sonkaAr, int kolbaszAr, String kicsi, String kozepes, String nagy, int kicsiAr, int kozepesAr, int nagyAr) {
        this.nev = nev;
        this.leiras = leiras;
        this.ar = ar;
        this.image = image;
        this.gomba = gomba;
        this.kolbasz = kolbasz;
        this.sonka = sonka;
        this.gombaAr = gombaAr;
        this.sonkaAr = sonkaAr;
        this.kolbaszAr = kolbaszAr;
        this.kicsi = kicsi;
        this.kozepes = kozepes;
        this.nagy = nagy;
        this.kicsiAr = kicsiAr;
        this.kozepesAr = kozepesAr;
        this.nagyAr = nagyAr;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getLeiras() {
        return leiras;
    }

    public void setLeiras(String leiras) {
        this.leiras = leiras;
    }

    public Integer getAr() {
        return ar;
    }

    public void setAr(Integer ar) {
        this.ar = ar;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getGomba() {
        return gomba;
    }

    public void setGomba(String gomba) {
        this.gomba = gomba;
    }

    public String getKolbasz() {
        return kolbasz;
    }

    public void setKolbasz(String kolbasz) {
        this.kolbasz = kolbasz;
    }

    public String getSonka() {
        return sonka;
    }

    public void setSonka(String sonka) {
        this.sonka = sonka;
    }

    public int getGombaAr() {
        return gombaAr;
    }

    public void setGombaAr(int gombaAr) {
        this.gombaAr = gombaAr;
    }

    public int getSonkaAr() {
        return sonkaAr;
    }

    public void setSonkaAr(int sonkaAr) {
        this.sonkaAr = sonkaAr;
    }

    public int getKolbaszAr() {
        return kolbaszAr;
    }

    public void setKolbaszAr(int kolbaszAr) {
        this.kolbaszAr = kolbaszAr;
    }

    public String getKicsi() {
        return kicsi;
    }

    public void setKicsi(String kicsi) {
        this.kicsi = kicsi;
    }

    public String getKozepes() {
        return kozepes;
    }

    public void setKozepes(String kozepes) {
        this.kozepes = kozepes;
    }

    public String getNagy() {
        return nagy;
    }

    public void setNagy(String nagy) {
        this.nagy = nagy;
    }

    public int getKicsiAr() {
        return kicsiAr;
    }

    public void setKicsiAr(int kicsiAr) {
        this.kicsiAr = kicsiAr;
    }

    public int getKozepesAr() {
        return kozepesAr;
    }

    public void setKozepesAr(int kozepesAr) {
        this.kozepesAr = kozepesAr;
    }

    public int getNagyAr() {
        return nagyAr;
    }

    public void setNagyAr(int nagyAr) {
        this.nagyAr = nagyAr;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "nev='" + nev + '\'' +
                ", leiras='" + leiras + '\'' +
                ", ar=" + ar +
                ", image=" + image +
                ", gomba='" + gomba + '\'' +
                ", kolbasz='" + kolbasz + '\'' +
                ", sonka='" + sonka + '\'' +
                ", gombaAr=" + gombaAr +
                ", sonkaAr=" + sonkaAr +
                ", kolbaszAr=" + kolbaszAr +
                ", kicsi='" + kicsi + '\'' +
                ", kozepes='" + kozepes + '\'' +
                ", nagy='" + nagy + '\'' +
                ", kicsiAr=" + kicsiAr +
                ", kozepesAr=" + kozepesAr +
                ", nagyAr=" + nagyAr +
                '}';
    }

    public static List<Pizza> getPizza(){
        List<Pizza> pizzak=new ArrayList<>();
        pizzak.add(new Pizza("Cannibal","finom",18,R.drawable.pizza1,"gomba","kolbasz","sonka",2,3,4,"kicsi","kozepes","nagy",15,18,22));
        pizzak.add(new Pizza("Regina","finom",20,R.drawable.pizza2,"gomba","kolbasz","sonka",2,3,4,"kicsi","kozepes","nagy",18,20,23));
        pizzak.add(new Pizza("Prosciuto","finom",22,R.drawable.pizza3,"gomba","kolbasz","sonka",2,3,4,"kicsi","kozepes","nagy",20,22,25));
        return pizzak;

    }

}
