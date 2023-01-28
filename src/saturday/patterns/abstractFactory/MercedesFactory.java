package saturday.patterns.abstractFactory;

public class MercedesFactory implements AbstractFactory {
    @Override
    public Car getCar() {
        return new MercedesCar();
    }

    @Override
    public Bike getBike() {
        return null;
    }
}
