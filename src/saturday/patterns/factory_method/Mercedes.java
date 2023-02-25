package saturday.patterns.factory_method;

public class Mercedes implements Car {

    @Override
    public void drive() {
        System.out.println("Mercedes");
    }
}