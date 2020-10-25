package sk.jaro.utils;

import sk.jaro.anotacie.Vyrobca;
import sk.jaro.simpleormframework.anotacie.Id;
import sk.jaro.simpleormframework.anotacie.Stlpec;
import sk.jaro.simpleormframework.anotacie.Tabulka;

@Vyrobca(nazov = "BMW")
@Vyrobca(nazov = "RENAULT")
@Tabulka("Car")
public class Auto {

    @Id
    @Stlpec("ID")
    private Long id;

    @Stlpec("NAME")
    private String nazov;

    @Stlpec("DOORS")
    private Integer pocetDveri;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public int getPocetDveri() {
        return pocetDveri;
    }

    public void setPocetDveri(int pocetDveri) {
        this.pocetDveri = pocetDveri;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", nazov='" + nazov + '\'' +
                ", pocetDveri=" + pocetDveri +
                '}';
    }
}
