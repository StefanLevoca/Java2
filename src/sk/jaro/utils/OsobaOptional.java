package sk.jaro.utils;

import java.util.Optional;

public class OsobaOptional implements Comparable<OsobaOptional> {
    /**
     * privatre meno
     */
    private String meno;
    private Optional<String> priezvisko;
    private int vek;

    /**
     * wfwefew fwe fwe dfsdf sd {@link String}  fwe fwef we fwef ew we
     *
     * @author fsdf
     * @param meno
     * @param priezvisko
     * @param vek
     *
     */
    public OsobaOptional(String meno, String priezvisko, int vek) {
        this.meno = meno;
        this.priezvisko = Optional.ofNullable(priezvisko);
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

    public Optional<String> getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(Optional<String> priezvisko) {
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
    public int compareTo(OsobaOptional o) {
        int porovnaniePriezvisk = o.getPriezvisko().orElse("").compareTo(this.getPriezvisko().orElse(""));
        return porovnaniePriezvisk !=0 ? porovnaniePriezvisk : o.getMeno().compareTo(this.getMeno());
    }
}
