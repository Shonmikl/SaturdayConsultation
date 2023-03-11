package saturday.patterns.prototype;

public class Person implements Cloneable{
    String name;
    int age;
    final Address address;

    public Person(String name, int age, Address address) {
        System.out.println("Constructor: [String name, int age, Address address]");
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person(Person person) {
        System.out.println("Constructor: [Person person]");
        this.name = person.name;
        this.age = person.age;
        this.address = person.address;
    }
}