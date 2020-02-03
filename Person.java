public class People {
    private String name;
    private String lastName;
    private Address address;

    private TelephoneNumber tel;

    public People(String name, String lastName, Address address, TelephoneNumber tel) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.tel = tel;
    }

    public String getTelephoneNumber() {
        return tel.getTelephoneNumber();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}