package saturday.patterns.prototype;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Kollontay", 15);
        Person person = new Person("Mike", 38, address);

        Person person2 = new Person(person);
        System.out.println("---------------------------------");

        System.out.println(person2 == person);
        System.out.println(person2.name == person.name);
        System.out.println(person2.address.street == person.address.street);
        System.out.println("---------------------------------");

        person.name = "test name";
        System.out.println(person2.name);
        System.out.println("-->> " + person2.name == person.name);

        person.address.street = "test street";
        System.out.println(person2.address.street);

    }
}
