package domaceUlohy;

/**
 * Trieda uchovavajuca informacie o kontakte na osobu
 */
public class Contact {

    private String name;
    private String phoneNumber;
    private String mobileNumber;
    private String email;

    /**
     * Meno
     * @return meno osoby
     */
    public String getName() {
        return name;
    }

    /**
     *  Telefonne cislo
     * @return telefonne cislo osoby
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     *  Mobilne cislo
     * @return mobilne cislo osoby
     */
    public String getMobileNumber() {
        return mobileNumber;
    }

    /**
     *  Email
     * @return email osoby
     */
    public String getEmail() {
        return email;
    }

    /**
     * Konstruktor osoby
     * @param name meno,
     * @param phoneNumber telefonne cislo,
     * @param mobileNumber mobilne cislo,
     * @param email email.
     */
    public Contact(String name, String phoneNumber, String mobileNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.mobileNumber = mobileNumber;
        this.email = email;
    }

    /**
     * Zaznamy o osobe
     * @return vypis zaznamov o osobe
     */
    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
