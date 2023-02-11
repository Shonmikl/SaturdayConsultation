package saturday.patterns.decorator;

public class CheesePizza implements Pizza {
    Pizza pizza;

    public CheesePizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String makePizza() {
        return pizza.makePizza() + " cheese";
    }
}

class DoughPizza implements Pizza {

    @Override
    public String makePizza() {
        return "dough";
    }
}

class Pepperoni implements Pizza {
    Pizza pizza;

    public Pepperoni(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String makePizza() {
        return pizza.makePizza() + " pepperoni";
    }
}

interface Pizza {
    String makePizza();
}

