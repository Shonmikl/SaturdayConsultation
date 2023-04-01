package saturday.patterns.visitor;

public class Main {
    public static void main(String[] args) {
        //Animal animal = new Dog();
        Animal animal = new Cat();

        animal.accept(new SoundVisitor());
        animal.accept(new EatVisitor());
    }
}