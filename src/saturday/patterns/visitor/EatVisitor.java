package saturday.patterns.visitor;

public class EatVisitor implements AnimalVisitor{
    @Override
    public void visit(Dog dog) {
        System.out.println("Meat");
    }

    @Override
    public void visit(Cat cat) {
        System.out.println("Fish");
    }
}

class SoundVisitor implements AnimalVisitor {

    @Override
    public void visit(Dog dog) {
        System.out.println("BOW");
    }

    @Override
    public void visit(Cat cat) {
        System.out.println("MEOW");
    }
}