package sk.jaro.utils;

import sk.jaro.simpleormframework.anotacie.Id;
import sk.jaro.simpleormframework.anotacie.Stlpec;
import sk.jaro.simpleormframework.anotacie.Tabulka;

import java.util.Date;

/**
 * Táto trieda predstavuje Osobu. <br>
 */
@Tabulka("Osoba")
public class Osoba implements Comparable<Osoba>{

    @Id
    @Stlpec("ID")
    private Long id;

    @Stlpec("MENO")
    private String meno;

    @Stlpec("PRIEZVISKO")
    private String priezvisko;
    private int vek;
    private Date datumNarodenia;

    public Date getDatumNarodenia() {
        return datumNarodenia;
    }

    public Osoba() {
    }

    public void setDatumNarodenia(Date datumNarodenia) {
        this.datumNarodenia = datumNarodenia;
    }

    /**
     * wfwefew fwe fwe dfsdf sd {@link String}  fwe fwef we fwef ew we
     *
     * @author fsdf
     * @param meno
     * @param priezvisko
     * @param vek
     *
     */
    public Osoba(String meno, String priezvisko, int vek) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.vek = vek;
    }

    /**
     *
     * @return
     */
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

    @Override
    public String toString() {
        return "Osoba{" +
                "meno='" + meno + '\'' +
                ", priezvisko='" + priezvisko + '\'' +
                ", vek=" + vek +
                '}';
    }

    @Override
    public int compareTo(Osoba o) {
        int porovnaniePriezvisk = o.getPriezvisko().compareTo(this.getPriezvisko());
        return porovnaniePriezvisk !=0 ? porovnaniePriezvisk : o.getMeno().compareTo(this.getMeno());
    }
}
