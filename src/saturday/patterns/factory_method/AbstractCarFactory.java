package saturday.patterns.factory_method;

public abstract class AbstractCarFactory {
    public void createCar() {
        Car car = getCar();
        car.drive();
    }
    abstract Car getCar();
}