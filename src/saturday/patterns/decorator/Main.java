package saturday.patterns.decorator;

public class Main {
    public static void main(String[] args) {
        Pizza cheesePizza = new CheesePizza(new DoughPizza());
        System.out.println(cheesePizza.makePizza());

        Pizza pepperoniPizza = new Pepperoni(cheesePizza);
        System.out.println(pepperoniPizza.makePizza());
    }
}