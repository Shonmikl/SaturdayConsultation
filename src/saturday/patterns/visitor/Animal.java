package saturday.patterns.visitor;

public interface Animal {
    default void accept(AnimalVisitor animalVisitor) {

    }
}

interface AnimalVisitor {
    void visit(Dog animal);
    void visit(Cat animal);
}