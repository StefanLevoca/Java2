package domaceUlohy;

public class Osoba {

    private String surname;
    private String lastname;

    public Osoba(String surname, String lastname) {
        this.surname = surname;
        this.lastname = lastname;
    }

    public void displayName() {
        System.out.printf("Ahoj, volám sa %s %s. %n", this.surname, this.lastname);
    }

    @Override
    public String toString() {
        return surname + " " + lastname;
    }
}
