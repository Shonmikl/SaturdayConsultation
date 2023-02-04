package saturday.patterns.builder;

public class Main {
    public static void main(String[] args) {
        Person person = new PersonBuilder()
                .setName("Pavel")
                .setAge(33)
                .build();
        System.out.println(person.toString());
    }
}
