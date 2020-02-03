public class People {
    private String name;
    private String lastName;
    private Address address;
    private String officeAreaCode;
    private String officeNumber;

    public String getTelephoneNumber() {
        return "The telephone number is :" + this.officeAreaCode + this.officeNumber;
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