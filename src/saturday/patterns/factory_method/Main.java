package saturday.patterns.factory_method;

public class Main {
    public static void main(String[] args) {
        AbstractCarFactory mercedesFactory = new MercedesFactory();
        mercedesFactory.createCar();
    }
}