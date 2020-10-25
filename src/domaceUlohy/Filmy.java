package domaceUlohy;

import sk.jaro.simpleormframework.anotacie.Id;
import sk.jaro.simpleormframework.anotacie.Stlpec;

import java.util.Date;

public class Filmy extends Media implements Comparable<Filmy> {

    @Id
    @Stlpec("ID")
    private Long id;

    @Stlpec("NAZOV")
    private String nazov;

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    @Stlpec("DATUM VYDANIA")
    private Date datumVydania;

    public Date getDatumVydania() {
        return datumVydania;
    }

    public void setDatumVydania(Date datumVydania) {
        this.datumVydania = datumVydania;
    }

    public Filmy() {
    }

    public Filmy(String nazov) {
        this.nazov = nazov;
    }

    @Override
    public String toString() {
        return "Filmy{" +
                "nazov='" + nazov + '\'' +
                             '}';
    }

    @Override
    public int compareTo(Filmy o) {
        return o.getNazov().compareTo(this.getNazov());
    }
}