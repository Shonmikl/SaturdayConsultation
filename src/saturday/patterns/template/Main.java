package saturday.patterns.template;

public class Main {
    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        coffee.makeBeverage();
        System.out.println("***********************************");

        Beverage tea = new Tea();
        tea.makeBeverage();
    }
}