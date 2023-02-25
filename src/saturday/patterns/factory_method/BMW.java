package saturday.patterns.factory_method;

public class BMW implements Car {

    @Override
    public void drive() {
        System.out.println("BMW");
    }
}