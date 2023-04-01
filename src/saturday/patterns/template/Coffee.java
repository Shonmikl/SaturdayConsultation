package saturday.patterns.template;

public class Coffee extends Beverage{
    @Override
    void addBeverage() {
        System.out.println("Making coffee");
    }

    @Override
    void addCondiment() {
        System.out.println("Adding milk");
    }

    @Override
    void addSmth() {
        System.out.println("Add smth for coffee");
    }
}

class Tea extends Beverage {

    @Override
    void addBeverage() {
        System.out.println("Making tea");
    }

    @Override
    void addCondiment() {
        System.out.println("Adding lemon");
    }

    @Override
    void addSmth() {
        System.out.println("Add smth for tea");
    }
}
