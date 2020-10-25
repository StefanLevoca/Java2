package sk.jaro.objects;

import java.io.Serializable;

public class Osoba implements Serializable{

    private static final long serialVersionUID = 1L;

    private String meno;
    private String priezvisko;
    transient private int vek;

    public Osoba(String meno, String priezvisko, int vek) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.vek = vek;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    public static void vypis(){
        System.out.println("ahoj som staticka");
    }

}
