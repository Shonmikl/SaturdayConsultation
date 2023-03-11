package saturday.patterns.prototype;

public class Address implements Cloneable {
    String street;
    int number;

    public Address(String street, int number) {
        System.out.println("Constructor: String street, int number");
        this.street = street;
        this.number = number;
    }

    public Address(Address address) {
        System.out.println("Constructor: Address address");
        this.street = address.street;
        this.number = address.number;
    }

    @Override
    public Address clone() {
        try {
            Address clone = (Address) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}