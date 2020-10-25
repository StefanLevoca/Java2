package domaceUlohy;

//Task 1.2
public class Person2 {
    private AddressOfPerson addressOfPerson;
    private String name;
    private String surname;

    private Person2(String name, String surname, AddressOfPerson addressOfPerson) {
        this.name = name;
        this.surname = surname;
        this.addressOfPerson = addressOfPerson;
    }

    @Override
    public String toString() {
        return "Person2{" +
                " name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", addressOfPerson=" + addressOfPerson +
                '}';
    }

    private void changeAddressOfPerson(AddressOfPerson addressOfPerson) {
        this.addressOfPerson = addressOfPerson;
    }

    public static void main(String[] args) {
        System.out.println("TASK1.2");
        Person2 person2 = new Person2("Stefan", "Levoca", new AddressOfPerson("Komarno"));
        System.out.println(person2.toString());
        System.out.println("--------------------------");
        person2.changeAddressOfPerson(new AddressOfPerson("Bratislava"));
        System.out.println(person2.toString());
    }
}