package domaceUlohy;

import sk.jaro.simpleormframework.anotacie.Id;
import sk.jaro.simpleormframework.anotacie.Stlpec;

import java.util.Date;

public class CD extends Media implements Comparable<CD> {

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

    public CD() {
    }

    public CD(String nazov) {
        this.nazov = nazov;
    }

    @Override
    public String toString() {
        return "CD{" +
                "nazov='" + nazov + '\'' +
                               '}';
    }

    @Override
    public int compareTo(CD o) {
        return o.getNazov().compareTo(this.getNazov());
    }
}
