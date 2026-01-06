package class2.shallowCopy;

public class User {
    private String name;
    private Address address;

    User(String name, String address, String phone) {
        this.name = name;
        this.address = new Address(address, phone);
    }

    public Address getAddress() {
        return address;
    }

    public String getName() {
                return name;
    }

    public void copy(User rhs) {
        this.name = rhs.name;
        this.address = rhs.address;
    }
}