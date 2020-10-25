package domaceUlohy;

//TASK 1.2
public class AddressOfPerson {

    private String address;

    public AddressOfPerson(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "AddressOfPerson{" +
                "address='" + address + '\'' +
                '}';
    }
}