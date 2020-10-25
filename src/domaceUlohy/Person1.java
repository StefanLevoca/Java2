package domaceUlohy;

//TASK 1.1
public class Person1 {
    private AddressOfPerson addressOfPerson;
    private String name;
    private String surname;

    private Person1(String name, String surname, AddressOfPerson addressOfPerson) {
        this.name = name;
        this.surname = surname;
        this.addressOfPerson = addressOfPerson;
    }

    @Override
    public String toString() {
        return "Person1{" +
                " name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", addressOfPerson=" + addressOfPerson +
                '}';
    }

    public void changeAddressOfPerson(AddressOfPerson addressOfPerson) {
        this.addressOfPerson = addressOfPerson;
    }

    static class AddressOfPerson {

        String address;

        public AddressOfPerson(String address) {
            this.address = address;
        }

        @Override
        public String toString() {
            return "AddressOfPerson{" +
                    "address='" + address + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        System.out.println("TASK1.1");
        Person1 person1 = new Person1("Stefan", "Levoca", new AddressOfPerson("Komarno"));
        System.out.println(person1.toString());
        System.out.println("--------------------------");
        person1.changeAddressOfPerson(new AddressOfPerson("Bratislava"));
        System.out.println(person1.toString());
    }
}